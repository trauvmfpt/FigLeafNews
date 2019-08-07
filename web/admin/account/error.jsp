<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:admin-master>
    <jsp:body>
        <h2>Bạn chưa đăng nhập hoặc tài khoản của bạn không có quyền truy cập trang này.</h2>
        <h2>Vui lòng bấm vào <a href="/admin/login">đây</a> để đăng nhập</h2>
        <script>
            $("#currentUser").hide();
        </script>
    </jsp:body>
</t:admin-master>
