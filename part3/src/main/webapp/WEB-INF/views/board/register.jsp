<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@include file="../includes/header.jsp"%>
<!-- Begin Page Content -->
<div class="container-fluid">
    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Board Register</h1>
    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Board Register</h6>
        </div>
        <div class="card-body">
            <form role="form" action="/board/register" method="post">
                <div class="form-group">
                    <label>Title</label>
                    <input type="text" class="form-control form-control-user" name="title">
                </div>
                <div class="form-group">
                    <label>Text area</label>
                    <textarea class="form-control form-control-user" rows="3" name="content"></textarea>
                </div>
                <div class="form-group">
                    <label>Writer</label>
                    <input type="text" class="form-control form-control-user" name="writer">
                </div>
                <button type="submit" class="btn btn-success">Submit Button</button>
                <button type="reset" class="btn btn-secondary">Reset Button</button>
            </form>
        </div>
    </div>
</div>
<!-- /.container-fluid -->
<%@include file="../includes/footer.jsp"%>