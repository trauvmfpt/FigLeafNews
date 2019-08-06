<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>

<mt:master>
    <jsp:attribute name="content">

<!-- ##### Contact Form Area Start ##### -->
<div class="contact-area section-padding-0-80 pt-5">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="contact-title">
                    <h2>Contact us</h2>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-12 col-lg-8">
                <div class="contact-form-area">
                    <form action="#" method="post">
                        <div class="row">
                            <div class="col-12 col-lg-6">
                                <input type="text" class="form-control" id="name" placeholder="Name">
                            </div>
                            <div class="col-12 col-lg-6">
                                <input type="email" class="form-control" id="email" placeholder="E-mail">
                            </div>
                            <div class="col-12">
                                <input type="text" class="form-control" id="subject" placeholder="Subject">
                            </div>
                            <div class="col-12">
                                <textarea name="message" class="form-control" id="message" cols="30" rows="10" placeholder="Message"></textarea>
                            </div>
                            <div class="col-12 text-center">
                                <button class="btn newspaper-btn mt-30 w-100" type="submit">Send Message</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

            <div class="col-12 col-lg-4">
                <!-- Single Contact Information -->
                <div class="single-contact-information mb-30">
                    <h6>Address:</h6>
                    <p>8 Tôn Thất Thuyết</p>
                </div>
                <!-- Single Contact Information -->
                <div class="single-contact-information mb-30">
                    <h6>Phone:</h6>
                    <p>0795332453 <br>0757822112</p>
                </div>
                <!-- Single Contact Information -->
                <div class="single-contact-information mb-30">
                    <h6>Email:</h6>
                    <p>newpaper@gmail.com</p>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- ##### Contact Form Area End ##### -->

    </jsp:attribute>
</mt:master>