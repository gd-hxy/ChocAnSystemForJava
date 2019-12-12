<%--
  Created by IntelliJ IDEA.
  User: 13742
  Date: 2019/11/30
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>提供者目录</title>
  <meta name="keywords" content="">
  <meta name="description" content="">

  <link href="${pageContext.servletContext.contextPath}/assets/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/assets/css/font-awesome.css?v=4.4.0" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/assets/css/dataTables.bootstrap.css" rel="stylesheet">
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
        <strong>提供者目录</strong>
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
      <div class="ibox float-e-margins">
        <div class="ibox-title">
          <h5>提供者目录</h5>
        </div>
        <div class="ibox-content">
          <table class="table table-striped table-bordered table-hover dataTables-example">
            <thead>
            <tr>
              <th>服务代码</th>
              <th>服务名称</th>
              <th>服务费用</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${lists}" var="list" varStatus="status">
              <tr>
                <td>${list.getServiceId()}</td>
                <td>${list.getServiceName()}</td>
                <td>${list.getServiceFee()}</td>
              </tr>
            </c:forEach>
            </tbody>
          </table>

        </div>
      </div>
    </div>
  </div>
  <a href="${pageContext.servletContext.contextPath}/ProviderPage/providerPage.jsp" class="col-sm-2 col-sm-offset-5 btn btn-primary m-t">返回</a>
</div>

<!-- 全局js -->
<script src="${pageContext.servletContext.contextPath}/assets/js/jquery.min.js?v=2.1.4"></script>
<script src="${pageContext.servletContext.contextPath}/assets/js/bootstrap.min.js?v=3.3.6"></script>

<!-- 自定义js -->
<script src="${pageContext.servletContext.contextPath}/assets/js/content.js?v=1.0.0"></script>
<script src="${pageContext.servletContext.contextPath}/assets/js/jquery.jeditable.js"></script>

<!-- Data Tables -->
<script src="${pageContext.servletContext.contextPath}/assets/js/jquery.dataTables.js"></script>
<script src="${pageContext.servletContext.contextPath}/assets/js/dataTables.bootstrap.js"></script>



</body>

</html>
