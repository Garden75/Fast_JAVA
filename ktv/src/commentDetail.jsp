<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<script>
// 댓글 textarea 높이 조절(글자 입력할 때)
function xSize(e)
{
    e.style.height = '1px';
    e.style.height = (e.scrollHeight + 12) + 'px';
}

/* ********************************************************
 * 목록이동
 ******************************************************** */
function fn_list(){
	var form = document.getElementById("detailForm");
	form.action = "/site/comment/selectComtAllList.do";
	form.method = "post"
	form.submit();
}
/* ********************************************************
 * 자료삭제화면
 ******************************************************** */
function fn_delete(){
	var form = document.getElementById("detailForm");
	if(confirm("<spring:message code="common.delete.msg" />")){
		form.action = "/site/comment/deleteComtListDetail.do";
		form.method = "post"
		form.submit();
	}
}
/* ********************************************************
 * 수정처리화면
 ******************************************************** */
function fn_update(){
	var form = document.getElementById("detailForm");
	var cmnt = $("#cmnt").val();
	
	// 댓글 유효성 검사
	if(cmnt == ""){
		alert('댓글을 입력하세요.');
		document.detailForm.cmnt.focus();
		return false;
	}
	
	if(confirm("<spring:message code="common.save.msg" />")){
		form.action = "/site/comment/updateComtListDetail.do";
		form.method = "post"
		form.submit();
	}
}
</script>

<!-- scontents -->
<div class="scontents">
	<!-- scontents_fix -->
	<div class="scontents_fix">
		<h2 class="tit"><span>댓글 상세 및 수정 화면 </span></h2>
	</div>
	<div class="scontents_flex">
		<!-- dev_contents -->
		<div class="dev_contents">
			<!-- info_box01 -->
			<div class="info_box01 mgb30">
				<ul class="info_msg01 txt_primary">
					<li>댓글 상세 및 수정 화면입니다.</li>
				</ul>
			</div>
			<form role="form" id="detailForm" name="detailForm" action="/site/comment/updateComtListDetail.do" method="POST">
				<input type="hidden" id="cmntNo" name="cmntNo" value="${CommentVO.cmntNo}"/>
				<input type="hidden" id="useAt" name="useAt" value="${CommentVO.useAt}"/>
				<input type="hidden" id="contId" name="contId" value="${CommentVO.contId}"/>
				<input type="hidden" id="lastUpdusrId" name="lastUpdusrId"/>
				<input type="hidden" id="lastUpdtPnttm" name="lastUpdtPnttm"/>
				<input type="hidden" id="cmntType" name="cmntType" value="${CommentVO.cmntType}"/>
				<input type="hidden" name="pageIndex" value="<c:out value='${CommentVO.pageIndex}'/>"/>
				
				<div class="tbw_normal mgb30">
					<table class="tbw01" summary="">
						<caption></caption>
						<colgroup>
							<col style="width:120px;">
							<col style="width:auto;">
						</colgroup>
						<tbody>
							<tr>
<!-- 게시글 제목 -->					<th scope="row"><span class="tit"><span class="required">*</span>게시글 제목</span></th>
								<td colspan="3">
									<div class="inputxt_normal">
										<input type="text" id="title" name="title" class="wid400" value="${comment.title}" readonly="readonly">
										<label for="title" class="blind">게시글 제목</label>
									</div>
								</td>
							</tr>
							<tr>
<!-- 댓글 -->						<th scope="row"><span class="tit"><span class="required">*</span>댓글</span></th>
								<td colspan="3">
									<div class="inputxt_normal" style="height:auto;">
										<textarea onkeyup="xSize(this)" id="cmnt" name="cmnt" style="width:400px;overflow-y:hidden">${comment.cmnt}</textarea>
										<label for="cmnt" class="blind">댓글</label>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
					<!-- //tbw01 -->
				</div>
			</form>
			<!-- //tbw_normal -->
			<div class="btnarea_right mgt10">
<!-- 수정-->		<a class="btn_normal primary" onclick="fn_update();">
					<span><spring:message code="button.save" /></span>
				</a>
<!-- 삭제 -->		<a class="btn_normal primary" onclick="fn_delete();">
					<span><spring:message code="button.delete" /></span>
				</a>
<!-- 목록 --> 	<a class="btn_normal primary" onclick="fn_list();">
					<span><spring:message code="button.list" /></span>
				</a>
			</div>
		</div>
		<!-- //dev_contents -->
	</div>
	<!-- //contents_flex -->
</div>
