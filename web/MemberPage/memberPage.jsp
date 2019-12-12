<%--
  Created by IntelliJ IDEA.
  User: 13742
  Date: 2019/11/28
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">


  <title> - 空白页</title>
  <meta name="keywords" content="">
  <meta name="description" content="">

  <link href="${pageContext.servletContext.contextPath}/assets/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/assets/css/animate.css" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/assets/css/style.css?v=4.1.0" rel="stylesheet">

</head>

<body class="gray-bg">
<div class="row wrapper border-bottom white-bg page-heading">
  <div class="col-sm-4">
    <h2>ChocAn会员中心</h2>
    <ol class="breadcrumb">
      <li>
        <a href="../index.jsp">主页</a>
      </li>
      <li>
        <strong>会员页面</strong>
      </li>
    </ol>
  </div>
  <div class="col-sm-8">
    <div class="title-action">
      <a href="empty_page.html" class="btn btn-primary">活动区域</a>
    </div>
  </div>
</div>

<div class="wrapper wrapper-content">
  <div class="row">
    <div class="col-sm-12">
      <div class="middle-box text-center animated fadeInRightBig">
        <h2 class="font-bold">欢迎您${UserNow.getMemberName()}</h2>

        <div class="error-desc">
          请选择您的操作：
          <br/><a href="${pageContext.servletContext.contextPath}/MemberPage/memberDetails.jsp" class="btn btn-primary m-t">查看个人信息</a>
          <br/><a href="${pageContext.servletContext.contextPath}/MemberPage/payForFee.jsp" class="btn btn-primary m-t">缴纳会员费</a>
        </div>
      </div>
    </div>
  </div>
</div>

<!-- 全局js -->
<script src="${pageContext.servletContext.contextPath}/assets/js/jquery.min.js?v=2.1.4"></script>
<script src="${pageContext.servletContext.contextPath}/assets/js/bootstrap.min.js?v=3.3.6"></script>

<!-- 自定义js -->
<script src="${pageContext.servletContext.contextPath}/assets/js/content.js?v=1.0.0"></script>




</body>

</html>
