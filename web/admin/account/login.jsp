<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:admin-master>
    <jsp:body>
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header text-center">Đăng nhập</h1>
            </div>
        </div>
        <div class="panel-body">
            <div class="col-lg-6 col-md-offset-3">
                <form id="loginForm" class="form-horizontal">
                    <div class="form-group">
                            <a href="<c:out value="${loginGoogle}"/>"><button type="button" class="btn btn-primary btn-block" style="width: 100%">Đăng nhập bằng tài khoản google đã được cấp quyền của bạn</button></a>
                    </div>
                </form>
            </div>
        </div>

        <script>
            $("#currentUser").hide();
        </script>
    </jsp:body>
</t:admin-master>
