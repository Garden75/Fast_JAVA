package ktv;

public class CommentManageSeriveImpl implements CommentManageService{
	
	@Resource(name="CommentManageDAO")
    private CommentManageDAO cmntManageDAO;
	

	@Override
	public List<CommentVO> selectComtAllList(CommentVO vo) throws Exception {
		// TODO Auto-generated method stub
		return cmntManageDAO.selectComtAllList(vo);
	}

	@Override
	public CommentVO selectComtListDetail(CommentVO vo) throws Exception {
		// TODO Auto-generated method stub
		return cmntManageDAO.selectComtListDetail(vo);
	}
	
	@Override
	public int cmntModify(CommentVO vo) throws Exception {
		// TODO Auto-generated method stub
		return cmntManageDAO.updateComtList(vo);
	}

	@Override
	public int cmntDelete(CommentVO vo) throws Exception {
		// TODO Auto-generated method stub
		return cmntManageDAO.updateComtList(vo);
	}

	@Override
	public int selectComtAllListCnt(HashMap<String, Object> param) throws Exception {
		// TODO Auto-generated method stub
		return cmntManageDAO.selectComtAllListCnt(param);
	}


}
