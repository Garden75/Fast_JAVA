package ktv;

public class CommentVO {

	import java.sql.Date;

	import org.springframework.format.annotation.DateTimeFormat;

	import kr.go.ktv.aradmin.common.service.ComDefaultVO;

	@SuppressWarnings("serial")
	public class CommentVO extends ComDefaultVO{
		
		private long contId;           //게시글번호
		private int cmntNo;            //댓글번호
		private String cmnt;           //댓글
		private String wrterId;        //작성자ID
		private String wrterNm;        //작성자
		private String frstRegisterId; //최초등록자ID
		
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date frstRegistPnttm;  //최초등록시점
		private String lastUpdusrId;   //최종수정자ID
		
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date lastUpdtPnttm;    //최종수정시점
		private String useAt;          //사용여부
		private String title;          //영상 또는 게시글 제목
		
		private String cmntType;         //댓글 ID 구분자
		
		public long getContId() {
			return contId;
		}
		public void setContId(long contId) {
			this.contId = contId;
		}
		public int getCmntNo() {
			return cmntNo;
		}
		public void setCmntNo(int cmntNo) {
			this.cmntNo = cmntNo;
		}
		public String getCmnt() {
			return cmnt;
		}
		public void setCmnt(String cmnt) {
			this.cmnt = cmnt;
		}
		public String getWrterId() {
			return wrterId;
		}
		public void setWrterId(String wrterId) {
			this.wrterId = wrterId;
		}
		public String getWrterNm() {
			return wrterNm;
		}
		public void setWrterNm(String wrterNm) {
			this.wrterNm = wrterNm;
		}
		public String getFrstRegisterId() {
			return frstRegisterId;
		}
		public void setFrstRegisterId(String frstRegisterId) {
			this.frstRegisterId = frstRegisterId;
		}
		public Date getFrstRegistPnttm() {
			return frstRegistPnttm;
		}
		public void setFrstRegistPnttm(Date frstRegistPnttm) {
			this.frstRegistPnttm = frstRegistPnttm;
		}
		public String getLastUpdusrId() {
			return lastUpdusrId;
		}
		public void setLastUpdusrId(String lastUpdusrId) {
			this.lastUpdusrId = lastUpdusrId;
		}
		public Date getLastUpdtPnttm() {
			return lastUpdtPnttm;
		}
		public void setLastUpdtPnttm(Date lastUpdtPnttm) {
			this.lastUpdtPnttm = lastUpdtPnttm;
		}
		public String getUseAt() {
			return useAt;
		}
		public void setUseAt(String useAt) {
			this.useAt = useAt;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getCmntType() {
			return cmntType;
		}
		public void setCmntType(String cmntType) {
			this.cmntType = cmntType;
		}
		
	}

