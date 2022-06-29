<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<header class="d-flex">
	<form method="post" action="/jspTemplete/test02/detail.jsp">
	<div class="logo col-3 d-flex align-items-center">
		<h1 class="text-success">Melong</h1>
	</div> 
		<div class="search col-9 d-flex align-items-center">
			<div class="input-group mb-3 col-7">
				<input type="text" class="form-control" placeholder="제목을 입력해주세요." name="search">
				<div class="input-group-append">
					<button class="btn btn-success" type="submit">검색</button>
				</div>
			</div>
		</div> 
	</form>
</header>
