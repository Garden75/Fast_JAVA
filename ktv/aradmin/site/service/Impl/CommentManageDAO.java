package ktv;

@Repository("CommentManageDAO")
public class CommentManageDAO extends EgovComAbstractDAO {

		//댓글목록 조회
		public List<CommentVO> selectComtAllList(CommentVO vo) throws Exception {
			return selectList("aradmin.cmnt.selectComtAllList", vo);
		}
		
		//해당 영상 댓글 상세(수정페이지)
		public CommentVO selectComtListDetail(CommentVO vo) throws Exception {
			return selectOne("aradmin.cmnt.selectComtListDetail", vo);
		}
		
		//해당 영상 댓글 수정
		public int updateComtList(CommentVO vo) throws Exception {
			return insert("aradmin.cmnt.updateComtList", vo); 
		}
		
		//해당 영상 댓글 삭제
		public int deleteComtList(CommentVO vo) throws Exception {
			return insert("aradmin.cmnt.deleteComtList", vo);
		}
		
		//댓글목록 건수 조회
		public int selectComtAllListCnt(HashMap<String, Object> param) throws Exception {
			return selectOne("aradmin.cmnt.selectComtAllListCnt", param);
		}

}
