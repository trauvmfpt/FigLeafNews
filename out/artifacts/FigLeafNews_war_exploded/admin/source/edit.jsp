<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 8/1/2019
  Time: 6:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:admin-master>
    <jsp:body>
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header text-center">Chỉnh sửa nguồn bài viết</h1>
            </div>
        </div>
        <div class="panel-body">
            <div class="col-lg-6 col-md-offset-3">
                <form action="/admin/source/add" method="post" enctype="multipart/form-data">
                    <div class="form-group">
                        <label>Đường dẫn nguồn</label>
                        <input type="text" class="form-control" name=url>
                    </div>
                    <div class="form-group">
                        <label>Link selector</label>
                        <input class="form-control" name="linkSelector" />
                    </div>
                    <div class="form-group">
                        <label>Link limit</label>
                        <input class="form-control" name="linkLimit" />
                    </div>
                    <div class="form-group">
                        <label>Title selector</label>
                        <input class="form-control" name="titleSelector" />
                    </div>
                    <div class="form-group">
                        <label>Description selector</label>
                        <input class="form-control" name="descriptionSelector" />
                    </div>
                    <div class="form-group">
                        <label>Content selector</label>
                        <input class="form-control" name="contentSelector" />
                    </div>
                    <div class="form-group">
                        <label>Author selector</label>
                        <input class="form-control" name="authorSelector" />
                    </div>
                    <div class="form-group" style="text-align: center;">
                        <button type="submit" class="btn btn-primary btn-block">Đăng</button>
                        <button type="reset" class="btn btn-primary btn-block">Viết lại</button>
                    </div>
                </form>
            </div>
        </div>
    </jsp:body>
</t:admin-master>