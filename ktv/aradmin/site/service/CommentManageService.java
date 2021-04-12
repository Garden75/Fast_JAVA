package ktv;

import java.util.HashMap;
import java.util.List;

public class CommentManageService {

	public List<CommentVO> selectComtAllList(CommentVO vo) throws Exception;
	
	public CommentVO selectComtListDetail(CommentVO vo) throws Exception;
	
	public int cmntModify(CommentVO vo) throws Exception;
	
	public int cmntDelete(CommentVO vo) throws Exception;
	
	public int selectComtAllListCnt(HashMap<String, Object> param) throws Exception;

}
