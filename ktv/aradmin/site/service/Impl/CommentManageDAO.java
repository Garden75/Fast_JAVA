package ktv;

@Repository("CommentManageDAO")
public class CommentManageDAO extends EgovComAbstractDAO {

		//��۸�� ��ȸ
		public List<CommentVO> selectComtAllList(CommentVO vo) throws Exception {
			return selectList("aradmin.cmnt.selectComtAllList", vo);
		}
		
		//�ش� ���� ��� ��(����������)
		public CommentVO selectComtListDetail(CommentVO vo) throws Exception {
			return selectOne("aradmin.cmnt.selectComtListDetail", vo);
		}
		
		//�ش� ���� ��� ����
		public int updateComtList(CommentVO vo) throws Exception {
			return insert("aradmin.cmnt.updateComtList", vo); 
		}
		
		//�ش� ���� ��� ����
		public int deleteComtList(CommentVO vo) throws Exception {
			return insert("aradmin.cmnt.deleteComtList", vo);
		}
		
		//��۸�� �Ǽ� ��ȸ
		public int selectComtAllListCnt(HashMap<String, Object> param) throws Exception {
			return selectOne("aradmin.cmnt.selectComtAllListCnt", param);
		}

}
