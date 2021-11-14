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
                      		<form role="form" action="/board/register" method="post" id ="test">
                      			<div class="form-group">
                      				<label>Title</label> <input class="form-control" name="title">
                      			</div>
                      			<div class="form-group">
                      				<label>Text area</label> <textarea class="form-control" rows="3" name="content"></textarea>
                      			</div>
                      			<div class="form-group">
                      				<label>Writer</label> <textarea class="form-control" rows="3" name="writer"></textarea>
                      			</div>
                      			<button type="submit" class="btn btn-default test"> Submit Button</button>
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
            
            <script>
            /* 	$(document).ready(function(){
            		$(".test").on("click",function(e){
            			e.preventDefault();
            			var formData1 = $("#test");
            			console.log(formData1.serialize());
            			console.log(formData1.serializeArray());
            			console.log(JSON.stringify(formData1.serializeArray()));
            			
            		});
            	}); */
            </script>
             
<%@include file="../includes/footer.jsp" %>