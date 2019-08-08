<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 8/2/2019
  Time: 6:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>

<mt:master>
    <jsp:attribute name="content">

        <div class="featured-post-area">
            <div class="container pt-5">
                <div class="row">
                    <div class="col-12 col-md-6 col-lg-8">
                        <div class="row">
                            <c:forEach var="article" begin="0" end="0" items="${articles}">
                            <div class="col-12 col-lg-7">
                                <div class="single-blog-post featured-post">
                                    <div class="post-thumb">
                                        <a href="/post/<c:out value="${article.url}"/>"><img src="<c:out value="${article.thumbnail}"/>" alt=""></a>
                                    </div>
                                    <div class="post-data">
                                        <a href="/post/<c:out value="${article.url}"/>" class="post-catagory"><c:out
                                                value="${article.category.get().name}"/></a>
                                        <a href="/post/<c:out value="${article.url}"/>" class="post-title">
                                            <h6><c:out value="${article.title}"/></h6>
                                        </a>
                                        <div class="post-meta">
                                            <p class="post-author">By <a href="#"><c:out value="${article.author}"/></a>
                                            </p>
                                            <p class="post-excerp"><c:out value="${article.description}"/></p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            </c:forEach>
                            <div class="col-12 col-lg-5">
                                <c:forEach var="article" begin="1" items="${articles}">
                                <div class="single-blog-post featured-post-2">
                                    <div class="post-thumb">
                                        <a href="/post/<c:out value="${article.url}"/>"><img src="<c:out value="${article.thumbnail}"/>" alt=""></a>
                                    </div>
                                    <div class="post-data">
                                        <a href="/post/<c:out value="${article.url}"/>" class="post-catagory"><c:out
                                                value="${article.category.get().name}"/></a>
                                        <div class="post-meta">
                                            <a href="/post/<c:out value="${article.url}"/>" class="post-title">
                                                <h6><c:out value="${article.title}"/></h6>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                                </c:forEach>
                            </div>
                        </div>
                    </div>

                    <div class="col-12 col-md-6 col-lg-4">
                        <!-- Single Featured Post -->
                        <div class="single-blog-post small-featured-post d-flex">
                            <div class="post-thumb">
                                <a href="#"><img src="/user/img/bg-img/19.jpg" alt=""></a>
                            </div>
                            <div class="post-data">
                                <a href="#" class="post-catagory">Finance</a>
                                <div class="post-meta">
                                    <a href="#" class="post-title">
                                        <h6>Pellentesque mattis arcu massa, nec fringilla turpis eleifend id.</h6>
                                    </a>
                                    <p class="post-date"><span>7:00 AM</span> | <span>April 14</span></p>
                                </div>
                            </div>
                        </div>
                        <!-- Single Featured Post -->
                        <div class="single-blog-post small-featured-post d-flex">
                            <div class="post-thumb">
                                <a href="#"><img src="/user/img/bg-img/20.jpg" alt=""></a>
                            </div>
                            <div class="post-data">
                                <a href="#" class="post-catagory">Politics</a>
                                <div class="post-meta">
                                    <a href="#" class="post-title">
                                        <h6>Sed a elit euismod augue semper congue sit amet ac sapien.</h6>
                                    </a>
                                    <p class="post-date"><span>7:00 AM</span> | <span>April 14</span></p>
                                </div>
                            </div>
                        </div>

                        <!-- Single Featured Post -->
                        <div class="single-blog-post small-featured-post d-flex">
                            <div class="post-thumb">
                                <a href="#"><img src="/user/img/bg-img/21.jpg" alt=""></a>
                            </div>
                            <div class="post-data">
                                <a href="#" class="post-catagory">Health</a>
                                <div class="post-meta">
                                    <a href="#" class="post-title">
                                        <h6>Pellentesque mattis arcu massa, nec fringilla turpis eleifend id.</h6>
                                    </a>
                                    <p class="post-date"><span>7:00 AM</span> | <span>April 14</span></p>
                                </div>
                            </div>
                        </div>

                        <!-- Single Featured Post -->
                        <div class="single-blog-post small-featured-post d-flex">
                            <div class="post-thumb">
                                <a href="#"><img src="/user/img/bg-img/22.jpg" alt=""></a>
                            </div>
                            <div class="post-data">
                                <a href="#" class="post-catagory">Finance</a>
                                <div class="post-meta">
                                    <a href="#" class="post-title">
                                        <h6>Augue semper congue sit amet ac sapien. Fusce consequat.</h6>
                                    </a>
                                    <p class="post-date"><span>7:00 AM</span> | <span>April 14</span></p>
                                </div>
                            </div>
                        </div>

                        <!-- Single Featured Post -->
                        <div class="single-blog-post small-featured-post d-flex">
                            <div class="post-thumb">
                                <a href="#"><img src="/user/img/bg-img/23.jpg" alt=""></a>
                            </div>
                            <div class="post-data">
                                <a href="#" class="post-catagory">Travel</a>
                                <div class="post-meta">
                                    <a href="#" class="post-title">
                                        <h6>Pellentesque mattis arcu massa, nec fringilla turpis eleifend id.</h6>
                                    </a>
                                    <p class="post-date"><span>7:00 AM</span> | <span>April 14</span></p>
                                </div>
                            </div>
                        </div>

                        <!-- Single Featured Post -->
                        <div class="single-blog-post small-featured-post d-flex">
                            <div class="post-thumb">
                                <a href="#"><img src="/user/img/bg-img/24.jpg" alt=""></a>
                            </div>
                            <div class="post-data">
                                <a href="#" class="post-catagory">Politics</a>
                                <div class="post-meta">
                                    <a href="#" class="post-title">
                                        <h6>Augue semper congue sit amet ac sapien. Fusce consequat.</h6>
                                    </a>
                                    <p class="post-date"><span>7:00 AM</span> | <span>April 14</span></p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    <!-- ##### Featured Post Area End ##### -->

    </jsp:attribute>
</mt:master>
