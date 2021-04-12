<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<script>
$(document).ready(function(){

//검색어 입력 후 enter key 누르면 검색 시작 제이쿼리
$("#searchWrd").keyup(function(e){if(e.keyCode == 13)  fn_list(); });

});

//검색조건 목록조회
function fn_list(pageIndex) {
	var searchType = $("#searchType").val();
	var searchWrd = $("#searchWrd").val();
	
	$("[name=searchType]", "#detailForm").val(searchType);
	$("[name=searchWrd]", "#detailForm").val(searchWrd);
	$("input[name=pageIndex}", "#detailForm").val(pageIndex);
	
	$("#detailForm").attr("action", "<c:url value='/site/comment/selectComtAllList.do'/>");
	$("#detailForm").submit();
}

//페이징
function fn_selectCmntListIndex(pageIndex) {
	var form = document.getElementById("detailForm");
	var searchType = $("#searchType").val();
	var searchWrd = $("#searchWrd").val();
	
	$("[name=searchType]", "#detailForm").val(searchType);
	$("[name=searchWrd]", "#detailForm").val(searchWrd);
	
	form.pageIndex.value = pageIndex;
	form.action="<c:url value='/site/comment/selectComtAllList.do'/>";
	form.method="post";
	form.submit();
}

//수정페이지로 이동
function fn_Detail(contId, cmntNo) {
	var form = document.getElementById("detailForm");
	
	$("[name=contId]", "#detailForm").val(contId);
	$("[name=cmntNo]", "#detailForm").val(cmntNo);
	
	form.pageIndex.value = "1";
    form.action = "/site/comment/selectComtDetail.do";
    form.method = "post";
    form.submit();
}

//검색어 입력 후 enter key 누르면 검색 시작
function enterkey() {
    if (window.event.keyCode == 13) {
    	fn_list();
    }
}
</script>
<div class="scontents">
		<form id="detailForm" name="detailForm" action="/site/comment/selectComtAllList.do" method="POST">
			<input type="hidden" id="cmntNo" name="cmntNo"/>
			<input type="hidden" id="cmnt" name="cmnt" value="${CommentVO.cmnt}"/>
			<input type="hidden" id="useAt" name="useAt" value="${CommentVO.useAt}"/>
			<input type="hidden" id="contId" name="contId"/>
			<input type="hidden" id="wrterId" name="wrterId" value="${CommentVO.wrterId}"/>
			<input type="hidden" id="wrterNm" name="wrterNm" value="${CommentVO.wrterNm}"/>
			<input type="hidden" id="frstRegisterId" name="frstRegisterId" value="${CommentVO.frstRegisterId}"/>
			<input type="hidden" id="frstRegistPnttm" name="frstRegistPnttm" value="${CommentVO.frstRegistPnttm}"/>
			<input type="hidden" id="lastUpdusrId" name="lastUpdusrId" value="${CommentVO.lastUpdusrId}"/>
			<input type="hidden" id="lastUpdtPnttm" name="lastUpdtPnttm" value="${CommentVO.lastUpdtPnttm}"/>
			<input type="hidden" id="title" name="title" value="${CommentVO.title}"/>
			<input type="hidden" id="cmntType" name="cmntType" value="${CommentVO.cmntType}"/>
			<input type="hidden" name="pageIndex" value="<c:out value='${CommentVO.pageIndex}'/>"/>
			<input type="hidden" id="searchType" name="searchType"/>
			<input type="hidden" id="searchWrd" name="searchWrd"/>
	
	
			<div class="scontents_fix">
				<h2 class="tit">
					<span>게시판댓글관리</span>
				</h2>
			</div>
			<div class="scontents_flex">
				<div class="dev_contents">
					<div class="info_box01 mgb30">
						<ul class="info_msg01 txt_primary">
							<li>게시판 댓글 관리 화면입니다.</li>
						</ul>
					</div>
					<!-- 검색어 입력 부분 -->
					<div class="board_search">
						<div class="search_area">
							<div class="select_normal wid100">
								<select id="searchType" name="searchType">
									<option value="title" <c:if test="${CommentVO.searchType eq 'title' or CommentVO.searchType eq ''}">selected</c:if>>게시판명</option>
									<option value="comment" <c:if test="${CommentVO.searchType eq 'comment' or CommentVO.searchType eq ''}">selected</c:if>>댓글</option>
									<option value="writer" <c:if test="${CommentVO.searchType eq 'writer' or CommentVO.searchType eq ''}">selected</c:if>>작성자</option>
								</select> <label for="search_type" class="blind">검색구분선택</label>
							</div>
		
							<div class="inputxt_normal search">
								<input type="text" class="wid200" id="searchWrd" name="searchWrd" onkeypress="if( event.keyCode==13 ){fn_list(1);}" value="${CommentVO.searchWrd}" />
								<label for="search_key" class="blind">검색어입력</label>
		
								<button class="btn_search" onclick="fn_list(1);">
									<i class="fal fa-search"><span class="blind">검색</span></i>
								</button>
							</div>
						</div>
					</div><!-- //board_search -->
					
					<!-- 테이블-->
					<div class="table-cont">
						<table class="dataTable cell-border hover no-footer" style="width:100%;" role="grid">
							<!-- thead -->
							<thead>
							<tr role="row">
								<th class="sorting_disabled tcenter" style="width:10%;">번호</th>
								<th class="sorting_disabled tcenter" style="width:30%;">게시글 제목</th>
								<th class="sorting_disabled tcenter" style="width:40%;">댓글</th>
								<th class="sorting_disabled tcenter" style="width:10%;">작성자</th>
								<th class="sorting_disabled tcenter" style="width:10%;">작성일</th>
							</tr>
							</thead>
							<!-- tbody -->
							<tbody>
								<c:forEach var="list" items="${comtList}">
								<tr class="odd" role="row" onclick="fn_Detail('${list.contId}', '${list.cmntNo}')" style="cursor:hand; cursor:pointer;">
									<td class="tcenter">${(totalCnt +1) - list.rnum}</td>
									<td>${list.title}</td>
									<td>${list.cmnt}</td>
									<td class="tcenter">${list.wrterNm}</td>
									<td class="tcenter"><fmt:formatDate id="frstRegistPnttm" value="${list.frstRegistPnttm}" pattern="yyyy-MM-dd "/></td>
								</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
								
					<!-- paging_ty1 -->
			        <c:if test="${ !empty comtList }">
			        <div class="paging_ty1">
			            <ui:pagination paginationInfo="${paginationInfo}" type="image" jsFunction="fn_selectCmntListIndex"/>
			        </div>
			        </c:if>
				</div>
			</div>
	</form>
</div>
