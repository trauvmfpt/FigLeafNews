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
                    <th style="text-align: center">Nguồn</th>
                    <th style="text-align: center">Danh mục</th>
                    <th style="text-align: center">Thumbnail</th>
                    <th style="text-align: center">Tiêu đề</th>
                    <th style="text-align: center">Thao tác</th>
                </tr>
                </thead>
                <tbody>
                <tr class="odd gradeX row-item" id="row-item-{{$item->id}}">
                    <td style="text-align: center">
                        12930129301
                    </td>
                    <td style="text-align: center">VnExpress</td>
                    <td style="text-align: center">Giải trí</td>
                    <td style="text-align: center">
                        <img src="https://images3.alphacoders.com/785/thumb-1920-785576.png" style="width: 200px;"/>
                    </td>
                    <td style="text-align: center">Game mới Nier Automata</td>
                    <td class="black-icon" style="text-align: center">
                        <a href="#" class="fa fa-pencil btn-quick-edit mr-2"></a>
                        <a href="#" id="{{$item -> id}}" class="fa fa-trash mr-2"></a>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </jsp:body>
</t:admin-master>