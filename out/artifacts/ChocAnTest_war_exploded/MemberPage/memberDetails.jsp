<%--
  Created by IntelliJ IDEA.
  User: 13742
  Date: 2019/11/28
  Time: 20:12
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
  <link href="${pageContext.servletContext.contextPath}/assets/css/font-awesome.css?v=4.4.0" rel="stylesheet">

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
        <a href="memberPage.jsp">会员页面</a>
      </li>
      <li>
        <strong>会员信息</strong>
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
    <div class="col-sm-12 offset-sm-0">
      <div class="col-sm-4 col-sm-offset-4 panel panel-info" style="padding: 0">
        <div class="panel-heading">
          <h3 class="panel-title">用户信息</h3>
        </div>
        <div class="panel-body">
          <ul>
            <li>用户id: ${UserNow.getMemberId()}</li>
            <li>用户名： ${UserNow.getMemberName()}</li>
            <li>用户密码： ${UserNow.getMemberPass()}</li>
            <li>所在国家： ${UserNow.getMemberCountry()}</li>
            <li>所在城市： ${UserNow.getMemberCity()}</li>
            <li>详细地址： ${UserNow.getMemberAddress()}</li>
            <li>用户ZIP码： ${UserNow.getMemberZip()}</li>
            <li>用户当前状态： ${UserNow.getMemberState()}</li>
            <li>用户余额： ${UserNow.getMemberFee()}</li>
          </ul>
        </div>
      </div>
    </div>
    <a href="memberPage.jsp" class="col-sm-2 col-sm-offset-5 btn btn-primary m-t">返回</a>
  </div>
</div>

<!-- 全局js -->
<script src="${pageContext.servletContext.contextPath}/assets/js/jquery.min.js?v=2.1.4"></script>
<script src="${pageContext.servletContext.contextPath}/assets/js/bootstrap.min.js?v=3.3.6"></script>

<!-- 自定义js -->
<script src="${pageContext.servletContext.contextPath}/assets/js/content.js?v=1.0.0"></script>




</body>

</html>
