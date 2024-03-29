<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 8/1/2019
  Time: 6:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<t:admin-master>
    <jsp:body>
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header text-center">Thêm danh mục mới</h1>
            </div>
        </div>
        <div class="panel-body">
            <div class="col-lg-6 col-md-offset-3">
                <form action="/admin/category/add" class="input-form" method="post" enctype="application/x-www-form-urlencoded">
                    <div class="form-group">
                        <label>Tên danh mục</label>
                        <input type="text" class="form-control" name="name">
                    </div>
                    <div class="form-group">
                        <label>Mô tả</label>
                        <input type="text" class="form-control" name="description">
                    </div>
                    <div class="form-group" style="text-align: center;">
                        <button type="submit" class="btn btn-primary btn-block">Đăng</button>
                        <button type="button" class="btn btn-primary btn-block reset">Viết lại</button>
                    </div>
                </form>
            </div>
        </div>
        <a href="/admin/category/list"><h5>Trở lại danh sách danh mục</h5></a>
    </jsp:body>
</t:admin-master>
