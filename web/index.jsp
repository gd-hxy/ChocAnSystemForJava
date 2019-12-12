<%--
  Created by IntelliJ IDEA.
  User: 13742
  Date: 2019/11/26
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title> - 登录</title>
  <meta name="keywords" content="">
  <meta name="description" content="">

  <link href="${pageContext.servletContext.contextPath}/assets/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/assets/css/animate.css" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/assets/css/style.css?v=4.1.0" rel="stylesheet">
  <!--[if lt IE 9]>
  <meta http-equiv="refresh" content="0;ie.html" />
  <![endif]-->
  <script>if(window.top !== window.self){ window.top.location = window.location;}</script>
</head>

<body class="gray-bg">

<div class="middle-box text-center loginscreen  animated fadeInDown">
  <div>
    <div>

      <h1 class="logo-name">h</h1>

    </div>
    <h3>欢迎使用ChocAn系统</h3>

    <form class="m-t" role="form" action="LoginAction.action" method="post">
      <div class="form-group">
        <select name="userType" class="form-control">
          <option>请选择</option>
          <option value="管理员">管理员</option>
          <option value="操作员">操作员</option>
          <option value="提供者">提供者</option>
          <option value="会员">会员</option>
        </select>
      </div>
      <div class="form-group">
        <input type="text" name="userName" class="form-control" placeholder="用户名" required="">
      </div>
      <div class="form-group">
        <input type="password" name="userPass" class="form-control" placeholder="密码" required="">
      </div>
      <button type="submit" class="btn btn-primary block full-width m-b">登 录</button>


      <p class="text-muted text-center"> <a href="login.html#"><small>忘记密码了？</small></a> | <a href="register.html">注册一个新账号</a>
      </p>

    </form>
  </div>
</div>

<!-- 全局js -->
<script src="${pageContext.servletContext.contextPath}/assets/js/jquery.min.js?v=2.1.4"></script>
<script src="${pageContext.servletContext.contextPath}/assets/js/bootstrap.min.js?v=3.3.6"></script>




</body>

</html>
