<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="entity.Category" %>
<%@ page import="java.util.List" %>
<%@ page import="entity.Article" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 8/1/2019
  Time: 6:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<%
    Article article = (Article) request.getAttribute("article");
%>

<t:admin-master>
    <jsp:body>
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header text-center">Soạn bài viết mới</h1>
            </div>
        </div>
        <div class="panel-body">
            <div class="col-lg-6 col-md-offset-3">
                <form action="/admin/article/edit" method="post" enctype="multipart/form-data">
                    <div class="form-group">
                        <label>Tiêu đề tin</label>
                        <input type="text" class="form-control" name="name" value="${article.title}">
                        <p class="alert-danger" style="margin-top: 1%"></p>
                    </div>
                    <div class="form-group">
                        <label>Mô tả</label>
                        <textarea class="form-control" name="description" rows="5" aria-invalid="${article.description}"></textarea>
                    </div>
                    <div class="form-group">
                        <div class="form-group">
                            <label>Nội dung</label>
                            <textarea id="editor" placeholder="Write Something..." autofocus ${article.content}></textarea>
                        </div>
                    </div>
                    <div class="preview_images hidden"></div>
                    <div class="form-group" style="text-align: center;">
                        <button type="submit" class="btn btn-primary btn-block">Đăng</button>
                        <button type="reset" class="btn btn-primary btn-block">Viết lại</button>
                    </div>
                </form>
            </div>
        </div>
    </jsp:body>
</t:admin-master>
