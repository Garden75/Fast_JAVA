package ktv;

public class CommentVO {

	import java.sql.Date;

	import org.springframework.format.annotation.DateTimeFormat;

	import kr.go.ktv.aradmin.common.service.ComDefaultVO;

	@SuppressWarnings("serial")
	public class CommentVO extends ComDefaultVO{
		
		private long contId;           //�Խñ۹�ȣ
		private int cmntNo;            //��۹�ȣ
		private String cmnt;           //���
		private String wrterId;        //�ۼ���ID
		private String wrterNm;        //�ۼ���
		private String frstRegisterId; //���ʵ����ID
		
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date frstRegistPnttm;  //���ʵ�Ͻ���
		private String lastUpdusrId;   //����������ID
		
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private Date lastUpdtPnttm;    //������������
		private String useAt;          //��뿩��
		private String title;          //���� �Ǵ� �Խñ� ����
		
		private String cmntType;         //��� ID ������
		
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

