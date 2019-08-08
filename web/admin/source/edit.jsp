<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 8/1/2019
  Time: 6:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:admin-master>
    <jsp:body>
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header text-center">Thêm nguồn bài viết</h1>
            </div>
        </div>
        <div class="panel-body">
            <div class="col-lg-6 col-md-offset-3">
                <form action="/admin/source/edit" method="post" enctype="application/x-www-form-urlencoded" class="input-form">
                    <input type="hidden" name="id" value="${source.id}">
                    <div class="form-group">
                        <label>Tên nguồn</label>
                        <input value="${source.sourceName}" type="text" class="form-control" name="name">
                    </div>
                    <div class="form-group">
                        <label>Đường dẫn nguồn</label>
                        <input value="${source.url}" type="text" class="form-control" name="url">
                    </div>
                    <div class="form-group">
                        <label>Link selector</label>
                        <input value="${source.linkSelector}" class="form-control" name="linkSelector" />
                    </div>
                    <div class="form-group">
                        <label>Thumbnail selector</label>
                        <input value="${source.thumbnailSelector}" class="form-control" name="thumbnailSelector" />
                    </div>
                    <div class="form-group">
                        <label>Link limit</label>
                        <input value="${source.linkLimit}" class="form-control" name="linkLimit" />
                    </div>
                    <div class="form-group">
                        <label>Title selector</label>
                        <input value="${source.titleSelector}" class="form-control" name="titleSelector" />
                    </div>
                    <div class="form-group">
                        <label>Description selector</label>
                        <input value="${source.descriptionSelector}" class="form-control" name="descriptionSelector" />
                    </div>
                    <div class="form-group">
                        <label>Content selector</label>
                        <input value="${source.contentSelector}" class="form-control" name="contentSelector" />
                    </div>
                    <div class="form-group">
                        <label>Danh mục</label>
                        <select name="categoryId" class="form-control">
                            <option selected disabled>Chọn danh mục tin</option>
                            <c:forEach var="cate" items="${categories}">
                                <c:choose>
                                    <c:when test="${cate.id == source.getCategory().get().getId()}">
                                        <option selected value="${cate.id}">${cate.name}</option>
                                    </c:when>
                                </c:choose>
                                <option value="${cate.id}">${cate.name}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Author selector</label>
                        <input class="form-control" name="authorSelector" value="${source.authorSelector}"/>
                    </div>
                    <div class="form-group" style="text-align: center;">
                        <button type="submit" class="btn btn-primary btn-block">Đăng</button>
                        <button type="button" class="btn btn-primary btn-block reset">Viết lại</button>
                    </div>
                </form>
            </div>
        </div>
        <a href="/admin/source/list"><h5>Trở lại danh sách nguồn tin</h5></a>
    </jsp:body>
</t:admin-master>


