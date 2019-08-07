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
                <h1 class="page-header text-center">Danh sách nguồn bài viết</h1>
            </div>
        </div>
        <div class="panel-body">
            <div class="alert alert-success hidden">
            </div>
            <table width="100%" class="table table-hover" id="dataTables-example" style="background-color: white">
                <thead>
                <tr>
                    <th style="text-align: center">ID</th>
                    <th style="text-align: center">Tên Nguồn</th>
                    <th style="text-align: center">URL</th>
                    <th style="text-align: center">Limit</th>
                    <th style="text-align: center">Article Link Selector</th>
                    <th style="text-align: center">Article Title Selector</th>
                    <th style="text-align: center">Article Description Selector</th>
                    <th style="text-align: center">Article Content Selector</th>
                    <th style="text-align: center">Article Author Selector</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="se" items="${sources}">
                    <tr class="odd gradeX row-item" id="row-item-{{$item->id}}">
                        <td style="text-align: center">
                            ${se.id}
                        </td>
                        <td style="text-align: center">${se.sourceName}</td>
                        <td style="text-align: center">${se.url}</td>
                        <td style="text-align: center">${se.linkLimit}</td>
                        <td style="text-align: center">${se.linkSelector}</td>
                        <td style="text-align: center">${se.titleSelector}</td>
                        <td style="text-align: center">${se.descriptionSelector}</td>
                        <td style="text-align: center">${se.contentSelector}</td>
                        <td style="text-align: center">${se.authorSelector}</td>
                        <td class="black-icon" style="text-align: center">
                            <a href="/admin/source/edit?id=${se.id}" class="fa fa-pencil btn-quick-edit mr-2"></a>
                            <a href="#" id="{{$item -> id}}" class="fa fa-trash mr-2"></a>
                        </td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </div>
    </jsp:body>
</t:admin-master>

