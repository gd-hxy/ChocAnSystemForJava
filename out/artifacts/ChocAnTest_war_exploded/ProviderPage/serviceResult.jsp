<%--
  Created by IntelliJ IDEA.
  User: 13742
  Date: 2019/11/30
  Time: 11:30
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
    <h2>ChocAn提供者中心</h2>
    <ol class="breadcrumb">
      <li>
        <a href="../index.jsp">主页</a>
      </li>
      <li>
        <a href="providerPage.jsp">提供者页面</a>
      </li>
      <li>
        <a href="serviceRecord.jsp">服务记录</a>
      </li>
      <li>
        <strong>服务确认</strong>
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
    <div class="col-sm-6 col-sm-offset-3">
      <div class="ibox float-e-margins">
        <div class="ibox-title">
          <h5>服务确认</h5>
        </div>
        <div class="ibox-content">
          <form action="SaveRecordAction.action" METHOD="post" ROLE="form">
            <strong>当前服务为：</strong><p>${ServiceNow.getServiceName()}</p>
            <strong>价格为：</strong><p>${ServiceNow.getServiceFee()}</p>
            <button type="submit" class="btn btn-primary m-t">确认</button>
            <a class="btn btn-primary m-t" href="${pageContext.servletContext.contextPath}/ProviderPage/serviceRecord.jsp">返回上一步</a>
          </form>
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