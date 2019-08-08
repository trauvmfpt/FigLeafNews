<%@ tag language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="content" fragment="true" %>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<html lang="en">

<head>
    <meta charset="utf-8"/>
<%--    <link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">--%>
<%--    <link rel="icon" type="image/png" href="{{asset('img/favicon.ico')}}">--%>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta name="csrf-token" content="{{ csrf_token() }}">
    <title>${title}</title>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no'
          name='viewport'/>
    <!--     Fonts and icons     -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/resources/font/font-awesome/css/font-awesome.min.css"/>
    <!-- CSS Files -->
    <link href="${pageContext.request.contextPath}/admin/resources/css/master-layout-3-css/bootstrap.min.css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/admin/resources/css/master-layout-3-css/light-bootstrap-dashboard.css" rel="stylesheet"/>
    <link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/admin/resources/css/form.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/admin/resources/js/numeral.js"></script>
    <link href="${pageContext.request.contextPath}/admin/resources/css/master-layout-3-css/demo.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/admin/resources/simditor-2.3.23/styles/simditor.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/admin/resources/simditor-2.3.23/site/assets/scripts/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/admin/resources/simditor-2.3.23/site/assets/scripts/module.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/admin/resources/simditor-2.3.23/site/assets/scripts/hotkeys.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/admin/resources/simditor-2.3.23/site/assets/scripts/uploader.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/admin/resources/simditor-2.3.23/lib/simditor.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/jquery.validate.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"></script>

    <link href="${pageContext.request.contextPath}/admin/resources/css/master-layout-3-css/custom-style.css" rel="stylesheet" />


</head>

<body>

<div class="wrapper">
    <div class="sidebar" data-color="orange">

        <div class="sidebar-wrapper">
            <div class="logo">
                <a href="/admin" class="simple-text logo-mini">
                    VTV
                </a>
                <a href="/admin" class="simple-text logo-normal">
                    Vua Tin Vịt
                </a>
            </div>
            <ul class="nav">
                <li class="nav-item @yield('active-dashboard')">
                    <a class="nav-link" href="/admin">
                        <i class="nc-icon nc-chart-pie-35"></i>
                        <p>Trang chủ</p>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="collapse" href="#componentsExamples">
                        <i class="nc-icon nc-app"></i>
                        <p>
                            Quản lý tài khoản
                            <b class="caret"></b>
                        </p>
                    </a>
                    <div class="collapse @yield('show-user')" id="componentsExamples">
                        <ul class="nav">
                            <li class="nav-item @yield('active-list-user')">
                                <a class="nav-link" href="/admin/account">
                                    <span class="sidebar-normal">Danh sách tài khoản</span>
                                </a>
                            </li>
                            <li class="nav-item @yield('active-list-user')">
                                <a class="nav-link" href="/admin/account">
                                    <span class="sidebar-normal">Thêm tài khoản mới</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="collapse" href="#formsExamples">
                        <i class="nc-icon nc-notes"></i>
                        <p>
                            Quản lý nguồn tin
                            <b class="caret"></b>
                        </p>
                    </a>
                    <div class="collapse @yield('show-product')" id="formsExamples">
                        <ul class="nav">
                            <li class="nav-item @yield('active-list-product')">
                                <a class="nav-link" href="/admin/source/list">
                                    <span class="sidebar-normal">Danh sách nguồn tin</span>
                                </a>
                            </li>
                            <li class="nav-item @yield('active-create-product')">
                                <a class="nav-link" href="/admin/source/add">
                                    <span class="sidebar-normal">Thêm nguồn mới</span>
                                </a>
                            </li>
                            <li class="nav-item @yield('active-create-product')">
                                <a class="nav-link" href="/admin/source/specific-source">
                                    <span class="sidebar-normal">Thêm bài từ nguồn</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="collapse" href="#tablesExamples">
                        <i class="nc-icon nc-paper-2"></i>
                        <p>
                            Quản lý danh mục tin
                            <b class="caret"></b>
                        </p>
                    </a>
                    <div class="collapse @yield('show-category')" id="tablesExamples">
                        <ul class="nav">
                            <li class="nav-item @yield('active-list-category')">
                                <a class="nav-link" href="/admin/category/list">
                                    <span class="sidebar-normal">Danh sách danh mục</span>
                                </a>
                            </li>
                            <li class="nav-item @yield('active-create-category')">
                                <a class="nav-link" href="/admin/category/add">
                                    <span class="sidebar-normal">Thêm danh mục mới</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </li>
                <li class="nav-item ">
                    <a class="nav-link" data-toggle="collapse" href="#mapsExamples">
                        <i class="nc-icon nc-pin-3"></i>
                        <p>
                            Quản lý tin
                            <b class="caret"></b>
                        </p>
                    </a>
                    <div class="collapse @yield('show-brand')" id="mapsExamples">
                        <ul class="nav">
                            <li class="nav-item @yield('active-list-brand')">
                                <a class="nav-link" href="/admin/article/list">
                                    <span class="sidebar-normal">Danh sách tin</span>
                                </a>
                            </li>
                            <li class="nav-item @yield('active-create-brand')">
                                <a class="nav-link" href="/admin/article/add">
                                    <span class="sidebar-normal">Soạn tin mới</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </li>
            </ul>
        </div>
    </div>
    <div style="clear: both"></div>
    <div class="main-panel">
        <!-- Navbar -->
        <nav class="navbar navbar-expand-lg ">
            <div class="container-fluid">
                <div class="navbar-wrapper">
                    <div class="navbar-minimize">
                        <button id="minimizeSidebar"
                                class="btn btn-warning btn-fill btn-round btn-icon d-none d-lg-block">
                            <i class="fa fa-ellipsis-v visible-on-sidebar-regular"></i>
                            <i class="fa fa-navicon visible-on-sidebar-mini"></i>
                        </button>
                    </div>
                    <a class="navbar-brand" href="#pablo"> Trang chủ </a>
                </div>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
                        aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-bar burger-lines"></span>
                    <span class="navbar-toggler-bar burger-lines"></span>
                    <span class="navbar-toggler-bar burger-lines"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-end">
                    <h4 id="currentUser">Welcome <c:out value="${currentUser}"/></h4>
                    <ul class="navbar-nav" style="float: right">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="https://example.com" id="navbarDropdownMenuLink"
                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="nc-icon nc-bullet-list-67"></i>
                            </a>
                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownMenuLink">
                                <a href="<c:out value="${logout}"/>" class="dropdown-item text-danger">
                                    <i class="nc-icon nc-button-power"></i> Log out
                                </a>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- End Navbar -->
        <div class="content">
            <div class="container-fluid">
                <jsp:doBody/>
            </div>
        </div>
        <footer class="footer">
            <div class="container">
                <nav>
                    <p class="copyright text-center">
                        ©
                        <script>
                            document.write(new Date().getFullYear())
                        </script>
                        <a href="https://www.creative-tim.com">Creative Phúc bồ</a>, made để qua assignment
                    </p>
                </nav>
            </div>
        </footer>
    </div>
</div>
</body>
<!--   Core JS Files   -->
{{--<script src="${pageContext.request.contextPath}/admin/resources/js/master-layout-2-js/bootstrap.min.js" type="text/javascript"></script>--}}
<script src="${pageContext.request.contextPath}/admin/resources/js/master-layout-3-js/popper.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/admin/resources/js/master-layout-3-js/bootstrap.min.js" type="text/javascript"></script>
<!--  jVector Map  -->
<script src="${pageContext.request.contextPath}/admin/resources/js/master-layout-3-js/jquery-jvectormap.js" type="text/javascript"></script>
<!--  Sweet Alert  -->
<script src="${pageContext.request.contextPath}/admin/resources/js/master-layout-3-js/sweetalert2.min.js" type="text/javascript"></script>
<!--  Sliders  -->
<script src="${pageContext.request.contextPath}/admin/resources/js/master-layout-3-js/nouislider.js" type="text/javascript"></script>
<!--  Bootstrap Select  -->
<script src="${pageContext.request.contextPath}/admin/resources/js/master-layout-3-js/bootstrap-selectpicker.js" type="text/javascript"></script>
<!--  jQueryValidate  -->
<script src="${pageContext.request.contextPath}/admin/resources/js/master-layout-3-js/jquery.validate.min.js" type="text/javascript"></script>
<!--  Bootstrap Table Plugin -->
<script src="${pageContext.request.contextPath}/admin/resources/js/master-layout-3-js/bootstrap-table.js"></script>
<!--  DataTable Plugin -->
<script src="${pageContext.request.contextPath}/admin/resources/js/master-layout-3-js/jquery.dataTables.min.js"></script>
<script src="${pageContext.request.contextPath}/admin/resources/js/master-layout-3-js/jquery.bootstrap-wizard.js"></script>
<script src="${pageContext.request.contextPath}/admin/resources/js/master-layout-3-js/bootstrap-switch.js"></script>
<script src="${pageContext.request.contextPath}/admin/resources/js/master-layout-3-js/bootstrap-tagsinput.js"></script>
<script src="${pageContext.request.contextPath}/admin/resources/js/master-layout-3-js/bootstrap-notify.js"></script>
<!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->
<script src="${pageContext.request.contextPath}/admin/resources/js/master-layout-3-js/light-bootstrap-dashboard.js"
        type="text/javascript"></script>

<script type="text/javascript" src="https://cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/admin/resources/js/master-layout-3-js/common-script.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/admin/resources/js/write-post.js"></script>


<script>
    $(document).ready(function () {
        $('#dataTables-example').DataTable({
            responsive: true,
            pageLength: 50
        });
    });
</script>

<script src="${pageContext.request.contextPath}/admin/resources/js/master-layout-3-js/demo.js"></script>

<script type="text/javascript">
    $(document).ready(function() {
        // Init Wizard
        demo.initLBDWizard();
    });
</script>


</html>