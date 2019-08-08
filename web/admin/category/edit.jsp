<%@ page import="entity.Category" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 8/1/2019
  Time: 6:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%
    Category category = (Category)request.getAttribute("category");
%>
<t:admin-master>
    <jsp:body>
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header text-center">Chỉnh sửa danh mục</h1>
            </div>
        </div>
        <div class="panel-body">
            <div class="col-lg-6 col-md-offset-3">
                <form id="CategoryForm" class="input-form" action="/admin/category/edit" method="post" enctype="application/x-www-form-urlencoded">
                    <input type="hidden" name="CateId" value="${category.id}">
                    <div class="form-group">
                        <label>Tiêu đề tin</label>
                        <input type="text" class="form-control" name="name" value="${category.name}">
                    </div>
                    <div class="form-group">
                        <label>Mô tả</label>
                        <textarea form="CategoryForm" class="form-control" name="description" rows="5">
                                ${category.description}
                        </textarea>
                    </div>
<%--                    <div class="form-group">--%>
<%--                        <div class="form-group">--%>
<%--                            <label>Ảnh đại diện</label>--%>
<%--                            <input type="text" class="form-control" name="thumbnail">--%>
<%--                            <input type="file" class="form-control" name="thumbnail">--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                    <div class="preview_images hidden"></div>--%>
                    <div class="form-group" style="text-align: center;">
                        <button type="submit" class="btn btn-primary btn-block">Cập nhật</button>
                        <button type="button" class="btn btn-primary btn-block reset">Viết lại</button>
                    </div>
                </form>
            </div>
        </div>
        <a href="/admin/category/list"><h5>Trở lại danh sách danh mục</h5></a>
    </jsp:body>
</t:admin-master>

