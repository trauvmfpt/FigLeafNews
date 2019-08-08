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
                <h1 class="page-header text-center">Thêm bài viết từ nguồn</h1>
            </div>
        </div>
        <div class="panel-body">
            <div class="col-lg-6 col-md-offset-3">
                <form id="sourceForm" class="input-form">
                    <div class="form-group">
                        <label>Đường dẫn nguồn</label>
                        <input type="text" class="form-control" name=url>
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
                        <button type="button" class="btn btn-primary btn-block" id="btn_preview">Preview</button>
                        <button type="button" class="btn btn-primary btn-block reset">Viết lại</button>
                    </div>
                </form>
            </div>
        </div>

        <div class="modal fade" id="previewModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Preview</h5>
                    </div>
                    <div class="modal-body">
                        <h3 id="title"></h3>
                        <hr>
                        <div id="description"></div>
                        <hr>
                        <div id="content"></div>
                        <hr>
                        <div id="author"></div>
                        <input type="hidden" id="categoryId"/>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal" >Close</button>
                        <button type="button" class="btn btn-primary" id="btn_save">Save</button>
                    </div>
                </div>
            </div>
        </div>

        <script>
            $("#btn_preview").click(function () {
                var selector = {
                    "url" : $("#sourceForm").find('input[name="url"]').val(),
                    "titleSelector" : $("#sourceForm").find('input[name="titleSelector"]').val(),
                    "descriptionSelector" : $("#sourceForm").find('input[name="descriptionSelector"]').val(),
                    "contentSelector" : $("#sourceForm").find('input[name="contentSelector"]').val(),
                    "authorSelector" : $("#sourceForm").find('input[name="authorSelector"]').val()
                };
                $.ajax({
                    method: 'POST',
                    accepts: 'application/json',
                    contentType: 'application/json',
                    url: "http://localhost:8080/admin/source/specific-source",
                    data: JSON.stringify(selector),
                    success: function (result) {
                        $("#title").text(result.title);
                        $("#description").text(result.description);
                        $("#content").html(result.content);
                        $("#author").text(result.author);
                        $("#categoryId").text(result.categoryId);
                        $("#previewModal").modal("show");
                    },
                    error: function (xhr, textStatus, errorThrown) {
                        alert("error");
                    }
                });
            })

            $("#btn_save").click(function () {
                var article = {
                    "title" : $("#title").text(),
                    "description" : $("#description").text(),
                    "content" : $("#content").html(),
                    "author" : $("#author").text(),
                    "categoryId" : $("#categoryId").val()
                };
                $.ajax({
                    method: 'POST',
                    accepts: 'application/json',
                    contentType: 'application/json',
                    url: "/admin/source/save-specific-source",
                    data: JSON.stringify(article),
                    success: function (result) {
                        $('#previewModal').modal('hide');
                        sweetAlert("Lưu bài viết thành công!");
                    },
                    error: function (xhr, textStatus, errorThrown) {
                        alert("error");
                    }
                });
            })
        </script>
    </jsp:body>
</t:admin-master>
