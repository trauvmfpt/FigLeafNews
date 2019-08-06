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
<<<<<<< HEAD
                <h1 class="page-header text-center">Thêm nguồn tin mới</h1>
=======
                <h1 class="page-header text-center">Thêm nguồn bài viết</h1>
>>>>>>> 09505d8532c591af036ed9fc40a57a1a2f899a78
            </div>
        </div>
        <div class="panel-body">
            <div class="col-lg-6 col-md-offset-3">
<<<<<<< HEAD
                <form action="/admin/article/add" method="post" enctype="multipart/form-data">
                    <div class="form-group">
                        <label>Tên nguồn</label>
                        <input type="text" class="form-control" name="name">
                    </div>
                    <div class="form-group">
                        <label>Url</label>
                        <input type="text" class="form-control" name="url">
                    </div>
                    <div class="form-group">
                        <label>Article Title Selector</label>
                        <input type="text" class="form-control" name="titleSelector">
                    </div>
                    <div class="form-group">
                        <label>Article Description Selector</label>
                        <input type="text" class="form-control" name="descriptionSelector">
                    </div>
                    <div class="form-group">
                        <label>Article Content Selector</label>
                        <input type="text" class="form-control" name="content Selector">
                    </div>
                    <div class="form-group">
                        <label>Article Author Selector</label>
                        <input type="text" class="form-control" name="authorSelector">
                    </div>
                    <div class="form-group">
                        <label>Thumbnail</label>
                        <input class="form-control" type="file" name="image" id="add_images">
                    </div>
                    <div class="preview_images hidden"></div>
=======
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
>>>>>>> 09505d8532c591af036ed9fc40a57a1a2f899a78
                    <div class="form-group" style="text-align: center;">
                        <button type="submit" class="btn btn-primary btn-block">Đăng</button>
                        <button type="reset" class="btn btn-primary btn-block">Viết lại</button>
                    </div>
                </form>
            </div>
        </div>
<<<<<<< HEAD

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
=======
    </jsp:body>
</t:admin-master>
>>>>>>> 09505d8532c591af036ed9fc40a57a1a2f899a78
