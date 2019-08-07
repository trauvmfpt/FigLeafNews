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
                <h1 class="page-header text-center">Soạn bài viết mới</h1>
            </div>
        </div>
        <div class="panel-body">
            <div class="col-lg-6 col-md-offset-3">
                <form id="ArticleForm" action="/admin/article/add" method="post" enctype="multipart/form-data">
                    <div class="form-group">
                        <label>Tiêu đề tin</label>
                        <input type="text" class="form-control" name="title">
                    </div>
                    <div class="form-group">
                        <label>Danh mục</label>
                        <select name="categoryId" class="form-control">
                            <option selected disabled>Chọn danh mục tin</option>
                            <c:forEach var="cate" items="${categories}">
                                <option value="${cate.id}">${cate.name}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <label>Thumbnail</label>
                        <input  class="form-control" type="file" name="image" id="add_images">
                    </div>
                    <div class="preview_images hidden"></div>
                    <div class="form-group">
                        <label>Mô tả</label>
                        <textarea form="ArticleForm" class="form-control" name="description" rows="5"></textarea>
                    </div>
                    <div class="form-group">
                        <div class="form-group">
                            <label>Nội dung</label>
                            <textarea name="content" form="ArticleForm" id="editor" placeholder="Write Something..." autofocus></textarea>
                        </div>
                    </div>
                    <div class="form-group" style="text-align: center;">
                        <button type="submit" class="btn btn-primary btn-block">Đăng</button>
                        <button type="reset" class="btn btn-primary btn-block">Viết lại</button>
                    </div>
                </form>
            </div>
        </div>

        <script>
            $(function() {
                var imagesPreview = function(input, display_images) {
                    if (input.files) {
                        var filesAmount = input.files.length;
                        for (i = 0; i < filesAmount; i++) {
                            var reader = new FileReader();
                            reader.onload = function(e) {
                                $($.parseHTML('<img>')).attr('src', e.target.result).appendTo(display_images);
                                $("img").addClass("preview_image");
                            }
                            reader.readAsDataURL(input.files[i]);
                        }
                    }
                };
                $('#add_images').on('change', function() {
                    $('.preview_images').removeClass("hidden");
                    imagesPreview(this, 'div.preview_images');
                });
                $(":reset").click(function (){
                    $(".preview_images").addClass('hidden');
                    $(".preview_image").remove();
                });
            });
        </script>
    </jsp:body>
</t:admin-master>
