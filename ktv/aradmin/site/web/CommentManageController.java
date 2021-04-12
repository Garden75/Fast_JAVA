package ktv;

public class CommentManageController {

	@Resource
	private CommentManageService comtManageService;

	/**
     * 댓글 리스트 조회
     */
	@RequestMapping(value = "/site/comment/selectComtAllList.do")
	public String selectComtAllList(Model model, @ModelAttribute("CommentVO") CommentVO vo, HttpServletRequest request) throws Exception {
		
		//0. 페이지 이동시 session에 현재 목록값을 저장한다.
	   	if(!StringUtils.isEmpty(request.getParameter("SmenuNo")) && !StringUtils.isEmpty(request.getParameter("SnodeNum"))) {
			HttpSession session = request.getSession();
			session.setAttribute("SmenuNo", request.getParameter("SmenuNo"));
			session.setAttribute("SnodeNum", request.getParameter("SnodeNum"));
		}
		
	   	//1. 페이징처리를 한다.
	   	PaginationInfo paginationInfo = new PaginationInfo();             //전자정부 페이징 처리 기법 paginationInfo
        paginationInfo.setCurrentPageNo(vo.getPageIndex());               //현재 페이지 번호
        paginationInfo.setRecordCountPerPage(vo.getPageUnit());           //한 페이지당 게시물 건 수
        paginationInfo.setPageSize(vo.getPageSize());                     //페이지 목록에 게시되는 페이지 건 수
        
        //페이지 Index저장
        vo.setFirstIndex(paginationInfo.getFirstRecordIndex());           //페이징 SQL의 조건절에 사용되는 시작 rownum
        vo.setLastIndex(paginationInfo.getLastRecordIndex());             //페이징 SQL의 조건절에 사용되는 마지막 rownum
        vo.setRecordCountPerPage(paginationInfo.getRecordCountPerPage()); //한 페이지당 게시되는 게시물 건 수
        
        HashMap<String, Object> param = new HashMap<String, Object>();
        
        param.put("firstIndex", paginationInfo.getFirstRecordIndex());
        param.put("lastIndex", paginationInfo.getLastRecordIndex());
        param.put("recordCountPerPage", paginationInfo.getRecordCountPerPage());
        
        //2. 총 댓글 목록의 건수를 가져온다.
        int totalCnt = comtManageService.selectComtAllListCnt(param);
        paginationInfo.setTotalRecordCount(totalCnt);
	   	
        //3. 댓글 목록을 가져온다.
		List<CommentVO> list = comtManageService.selectComtAllList(vo);
		
		model.addAttribute("comtList", list);                 //댓글목록
		model.addAttribute("paginationInfo", paginationInfo); //페이징
		model.addAttribute("totalCnt", totalCnt);             //총 건수
		
		return "aradmin/site/commentAllList.page";
	}
	
	/**
     * 댓글 리스트 수정 페이지로 이동
	 * @return 
     */
	@RequestMapping(value = "/site/comment/selectComtDetail.do")
	public String selectComtListDetail(@ModelAttribute("CommentVO") CommentVO vo, Model model) throws Exception {
		
	    //0. 해당 댓글 상세 정보를 가져온다.
		CommentVO comment = comtManageService.selectComtListDetail(vo);
		
		model.addAttribute("comment", comment);
		
		return "aradmin/site/commentDetail.page";

	}
	
	/**
     * 댓글 리스트 수정 처리
	 * @return 
     */
	@RequestMapping(value="/site/comment/updateComtListDetail.do")
	public String updateComtDetail(@ModelAttribute("CommentVO") CommentVO vo, HttpServletRequest request) throws Exception {
		
		//0. 로그인 객체 선언
		ArchiveLoginVO loginVO = (ArchiveLoginVO) EgovUserDetailsHelper.getAuthenticatedUser();
		
		vo.setLastUpdusrId(loginVO.getUserId());  //최종 수정자 ID 설정
		vo.setCmnt(request.getParameter("cmnt")); //수정된 댓글 설정
		
		//1. 댓글 수정 처리
		int result = comtManageService.cmntModify(vo);
		
		return "aradmin/site/commentAllList.page";
	}
	
	/**
     * 댓글 리스트 삭제 처리
	 * @return
     */
	/*@RequestMapping(value="/site/comment/deleteComtListDetail.do")*/
	public String deleteComtDetail(@ModelAttribute("CommentVO") CommentVO vo) throws Exception {
		
		//0. 로그인 객체 선언
		ArchiveLoginVO loginVO = (ArchiveLoginVO) EgovUserDetailsHelper.getAuthenticatedUser();
				
		vo.setLastUpdusrId(loginVO.getUserId());  //최종 수정자 ID 설정
		
		//1. 댓글 삭제 처리
		int result = comtManageService.cmntDelete(vo);
		
		return "aradmin/site/commentAllList.page";
	}

}
