package ktv;

public class CommentManageController {

	@Resource
	private CommentManageService comtManageService;

	/**
     * ��� ����Ʈ ��ȸ
     */
	@RequestMapping(value = "/site/comment/selectComtAllList.do")
	public String selectComtAllList(Model model, @ModelAttribute("CommentVO") CommentVO vo, HttpServletRequest request) throws Exception {
		
		//0. ������ �̵��� session�� ���� ��ϰ��� �����Ѵ�.
	   	if(!StringUtils.isEmpty(request.getParameter("SmenuNo")) && !StringUtils.isEmpty(request.getParameter("SnodeNum"))) {
			HttpSession session = request.getSession();
			session.setAttribute("SmenuNo", request.getParameter("SmenuNo"));
			session.setAttribute("SnodeNum", request.getParameter("SnodeNum"));
		}
		
	   	//1. ����¡ó���� �Ѵ�.
	   	PaginationInfo paginationInfo = new PaginationInfo();             //�������� ����¡ ó�� ��� paginationInfo
        paginationInfo.setCurrentPageNo(vo.getPageIndex());               //���� ������ ��ȣ
        paginationInfo.setRecordCountPerPage(vo.getPageUnit());           //�� �������� �Խù� �� ��
        paginationInfo.setPageSize(vo.getPageSize());                     //������ ��Ͽ� �ԽõǴ� ������ �� ��
        
        //������ Index����
        vo.setFirstIndex(paginationInfo.getFirstRecordIndex());           //����¡ SQL�� �������� ���Ǵ� ���� rownum
        vo.setLastIndex(paginationInfo.getLastRecordIndex());             //����¡ SQL�� �������� ���Ǵ� ������ rownum
        vo.setRecordCountPerPage(paginationInfo.getRecordCountPerPage()); //�� �������� �ԽõǴ� �Խù� �� ��
        
        HashMap<String, Object> param = new HashMap<String, Object>();
        
        param.put("firstIndex", paginationInfo.getFirstRecordIndex());
        param.put("lastIndex", paginationInfo.getLastRecordIndex());
        param.put("recordCountPerPage", paginationInfo.getRecordCountPerPage());
        
        //2. �� ��� ����� �Ǽ��� �����´�.
        int totalCnt = comtManageService.selectComtAllListCnt(param);
        paginationInfo.setTotalRecordCount(totalCnt);
	   	
        //3. ��� ����� �����´�.
		List<CommentVO> list = comtManageService.selectComtAllList(vo);
		
		model.addAttribute("comtList", list);                 //��۸��
		model.addAttribute("paginationInfo", paginationInfo); //����¡
		model.addAttribute("totalCnt", totalCnt);             //�� �Ǽ�
		
		return "aradmin/site/commentAllList.page";
	}
	
	/**
     * ��� ����Ʈ ���� �������� �̵�
	 * @return 
     */
	@RequestMapping(value = "/site/comment/selectComtDetail.do")
	public String selectComtListDetail(@ModelAttribute("CommentVO") CommentVO vo, Model model) throws Exception {
		
	    //0. �ش� ��� �� ������ �����´�.
		CommentVO comment = comtManageService.selectComtListDetail(vo);
		
		model.addAttribute("comment", comment);
		
		return "aradmin/site/commentDetail.page";

	}
	
	/**
     * ��� ����Ʈ ���� ó��
	 * @return 
     */
	@RequestMapping(value="/site/comment/updateComtListDetail.do")
	public String updateComtDetail(@ModelAttribute("CommentVO") CommentVO vo, HttpServletRequest request) throws Exception {
		
		//0. �α��� ��ü ����
		ArchiveLoginVO loginVO = (ArchiveLoginVO) EgovUserDetailsHelper.getAuthenticatedUser();
		
		vo.setLastUpdusrId(loginVO.getUserId());  //���� ������ ID ����
		vo.setCmnt(request.getParameter("cmnt")); //������ ��� ����
		
		//1. ��� ���� ó��
		int result = comtManageService.cmntModify(vo);
		
		return "aradmin/site/commentAllList.page";
	}
	
	/**
     * ��� ����Ʈ ���� ó��
	 * @return
     */
	/*@RequestMapping(value="/site/comment/deleteComtListDetail.do")*/
	public String deleteComtDetail(@ModelAttribute("CommentVO") CommentVO vo) throws Exception {
		
		//0. �α��� ��ü ����
		ArchiveLoginVO loginVO = (ArchiveLoginVO) EgovUserDetailsHelper.getAuthenticatedUser();
				
		vo.setLastUpdusrId(loginVO.getUserId());  //���� ������ ID ����
		
		//1. ��� ���� ó��
		int result = comtManageService.cmntDelete(vo);
		
		return "aradmin/site/commentAllList.page";
	}

}
