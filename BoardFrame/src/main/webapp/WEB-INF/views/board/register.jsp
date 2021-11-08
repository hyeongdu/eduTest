<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@include file="../includes/header.jsp" %>

            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Register</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                        <div class="panel-heading">
                            Register
                        </div>
                        <!-- /.panel-heading -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            <div class="row">
                <div class="col-lg-6">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           List page
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                      		<form role="form" action="/board/register" method="post">
                      			<div class="form-group">
                      				<label>Title</label> <input class="form-control" name="title">
                      			</div>
                      			<div class="form-group">
                      				<label>Text area</label> <textarea class="form-control" rows="3" name="content"></textarea>
                      			</div>
                      			<div class="form-group">
                      				<label>Writer</label> <textarea class="form-control" rows="3" name="writer"></textarea>
                      			</div>
                      			<button type="submit" class="btn btn-default"> Submit Button</button>
                      			<button type="reset" class="btn btn-default"> Reset Button</button>
                      		</form>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-6 -->
            <!-- /.row -->
            
             
<%@include file="../includes/footer.jsp" %>