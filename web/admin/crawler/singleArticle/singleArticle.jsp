<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 8/7/2019
  Time: 3:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:admin-master>
    <jsp:body>
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header text-center">Crawler bài viết</h1>
            </div>
        </div>
        <div class="panel-body">
            <div class="col-lg-6 col-md-offset-3">
                <form action="/admin/crawler/singleArticle" method="post" enctype="application/x-www-form-urlencoded">

                    <div class="form-group">
                        <label>Đường dẫn trang</label>
                        <input type="text" class="form-control" name="url">
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
                        <label>Image selector</label>
                        <input class="form-control" placeholder="take the first img if multil choose" name="imageSelector" />
                    </div>
                    <div class="form-group">
                        <label>Author selector</label>
                        <input class="form-control" placeholder="nên để trống" name="authorSelector" />
                    </div>
                    <div class="form-group" style="text-align: center;">
                        <button type="submit" class="btn btn-primary btn-block">Thực hiện</button>
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
