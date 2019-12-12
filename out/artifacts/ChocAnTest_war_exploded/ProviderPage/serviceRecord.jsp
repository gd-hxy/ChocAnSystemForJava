<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: 13742
  Date: 2019/11/29
  Time: 16:52
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
  <link href="${pageContext.servletContext.contextPath}/assets/css/sweetAlert.css" rel="stylesheet">
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
        <strong>服务记录</strong>
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
          <h5>服务记录</h5>
        </div>
        <div class="ibox-content">
          <div class="alert alert-info">
            会员状态Validated。
          </div>
          <div id="warning" class="alert alert-warning disabled">
            ${message}
          </div>
          <form role="form" action="ServiceResultAction.action" method="post">
            <div class="form-group">
              <label>当前日期和时间</label>
              <input id="nowTime" type="datetime-local" step="1" name="nowTime" class="form-control">
            </div>
            <div class="form-group">
              <label>服务提供的日期</label>
              <input type="date" name="serviceTime" class="form-control">
            </div>
            <div class="form-group">
              <label>提供者号码</label>
              <input type="number" value="${UserNow.getProviderId()}" name="provider_id" class="form-control">
            </div>
            <div class="form-group">
              <label>会员号码</label>
              <input type="number" value="${member_id}" name="member_id" class="form-control">
            </div>
            <div class="form-group">
              <label>服务代码</label>
              <input type="number" name="service_id" class="form-control">
            </div>
            <div class="form-group">
              <label>注释</label>
              <input type="text" name="comments" class="form-control">
            </div>
            <button type="submit" class="btn btn-primary m-t">提交</button>
            <a class="btn btn-primary m-t" href="providerPage.jsp">返回</a>
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
<script src="${pageContext.servletContext.contextPath}/assets/js/sweetalert.min.js"></script>
<%
  Map sess = ActionContext.getContext().getSession();
  String mess = (String)sess.get("message");
  if (mess != null && mess != "") {
%>
<script>
  $("warning").removeClass('disabled');
</script>
<%
  mess = "";
  sess.put("message", mess);
  }
%>
<script>
  window.onload=function x() {
      var now = new Date();
      var year = now.getFullYear();
      var month = now.getMonth() + 1;
      month = month < 10 ? "0" + month:month;
      var day = now.getDate();
      day = day < 10 ? "0" + day:day;
      var hour = now.getHours();
      var minute = now.getMinutes();
      var second = now.getSeconds();
      $("#nowTime").value = year + "-" + month + "-" + day + "T" + hour + ":" + minute + ":" + second;
  }
</script>
</body>
</html>
