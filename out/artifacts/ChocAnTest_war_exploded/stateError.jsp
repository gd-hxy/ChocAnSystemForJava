<%--
  Created by IntelliJ IDEA.
  User: 13742
  Date: 2019/11/29
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">


  <title> - 出错 页面</title>
  <meta name="keywords" content="">
  <meta name="description" content="">

  <link href="${pageContext.servletContext.contextPath}/assets/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">

  <link href="${pageContext.servletContext.contextPath}/assets/css/animate.css" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/assets/css/style.css?v=4.1.0" rel="stylesheet">

</head>

<body class="gray-bg">


<div class="middle-box text-center animated fadeInDown">
  <h1>${state}</h1>
  <h3 class="font-bold">用户已失效！</h3>

  <div class="error-desc">
    抱歉，查询不到此用户~
    <form class="form-inline m-t" role="form">
      <div class="form-group">
        <input type="email" class="form-control" placeholder="请输入您需要查找的内容 …">
      </div>
      <button type="submit" class="btn btn-primary">搜索</button>
    </form>
  </div>
</div>

<!-- 全局js -->
<script src="${pageContext.servletContext.contextPath}/assets/js/jquery.min.js?v=2.1.4"></script>
<script src="${pageContext.servletContext.contextPath}/assets/js/bootstrap.min.js?v=3.3.6"></script>

</body>
</html>
