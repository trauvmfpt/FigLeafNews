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
                <form class="input-form" action="/admin/article/edit" method="post" enctype="multipart/form-data">
                    <input type="hidden" name="id" value="${article.id}">
                    <div class="form-group">
                        <label>Tiêu đề tin</label>
                        <input type="text" class="form-control" name="title" value="${article.title}">
                        <p class="alert-danger" style="margin-top: 1%"></p>
                    </div>
                    <div class="form-group">
                        <label>Mô tả</label>
                        <textarea class="form-control" name="description" rows="5" aria-invalid="">${article.description}</textarea>
                    </div>
                    <div class="form-group">
                        <label>Danh mục</label>

                        <select name="categoryId" class="form-control">
                            <option selected disabled>Chọn danh mục tin</option>
                            <c:forEach var="cate" items="${categories}">
                                <c:choose>
                                    <c:when test="${cate.id == article.getCategory().get().getId()}">
                                        <option selected  value="${cate.id}">${cate.name}</option>
                                    </c:when>
                                   <c:otherwise>
                                       <option value="${cate.id}">${cate.name}</option>
                                   </c:otherwise>
                                </c:choose>>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Thumbnail</label>
                        <input  class="form-control" type="file" name="image" id="add_images">
                    </div>
                    <div class="preview_images">
                        <img src="${article.thumbnail}" class="preview_image"/>
                    </div>
                    <div class="form-group">
                        <div class="form-group">
                            <label>Nội dung</label>
                            <textarea name="content" id="editor" placeholder="Write Something..." autofocus >${article.content}</textarea>
                        </div>
                    </div>
                    <div class="form-group" style="text-align: center;">
                        <button type="submit" class="btn btn-primary btn-block">Cập nhật</button>
                        <button type="button" class="btn btn-primary btn-block reset">Viết lại</button>
                    </div>
                </form>
            </div>
        </div>
        <a href="/admin/article/list"><h5>Trở lại danh sách tin</h5></a>
        <script>
            $(function() {
                var imagesPreview = function(input, display_images) {
                    if (input.files) {
                        var filesAmount = input.files.length;
                        for (i = 0; i < filesAmount; i++) {
                            var reader = new FileReader();
                            reader.onload = function(e) {
                                $(".preview_image").attr('src', e.target.result);
                            }
                            reader.readAsDataURL(input.files[i]);
                        }
                    }
                };
                $('#add_images').on('change', function() {
                    $('.preview_images').removeClass("hidden");
                    imagesPreview(this, 'div.preview_images');
                });
            });
        </script>
    </jsp:body>
</t:admin-master>
