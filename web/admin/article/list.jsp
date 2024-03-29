<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 8/1/2019
  Time: 6:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:admin-master>
    <jsp:body>
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header text-center">Danh sách tin</h1>
            </div>
        </div>
        <div class="panel-body">
            <div class="alert alert-success hidden">
            </div>
            <a href="/admin/article/add"><h4>Thêm bài viết mới</h4></a>
            <table width="100%" class="table table-hover" id="dataTables-example" style="background-color: white">
                <thead>
                <tr>
<%--                    <th style="text-align: center">ID</th>--%>
                    <th style="text-align: center">Tiêu để</th>
                    <th style="text-align: center">Danh mục</th>
                    <th style="text-align: center">Thumbnail</th>
                    <th style="text-align: center">Mô tả</th>
                    <th style="text-align: center">Thao tác</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="article" items="${articles}">
                    <tr class="odd gradeX row-item" >
<%--                        <td style="text-align: center">--%>
<%--                            12930129301--%>
<%--                        </td>--%>
                        <td style="text-align: center"><a target="_blank" href="/post/${article.url}">${article.title}</a></td>
                        <td style="text-align: center">${article.getCategory().get().getName()}</td>
                        <td style="text-align: center">
                            <img src="${article.thumbnail}" style="width: 200px;"/>
                        </td>
                        <td style="text-align: center">${article.description}</td>
                        <td class="black-icon" style="text-align: center">
                            <a href="/admin/article/edit?id=${article.id}" class="fa fa-pencil btn-quick-edit mr-2"></a>
                            <a href="#" id="" class="fa fa-trash mr-2"></a>
                        </td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </div>
    </jsp:body>
</t:admin-master>
