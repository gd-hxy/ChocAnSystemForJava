<%--
  Created by IntelliJ IDEA.
  User: 13742
  Date: 2019/11/30
  Time: 23:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>

  <link href="${pageContext.servletContext.contextPath}/assets/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/assets/css/sweetAlert.css" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/assets/css/animate.css" rel="stylesheet">
  <link href="${pageContext.servletContext.contextPath}/assets/css/style.css?v=4.1.0" rel="stylesheet">
</head>
<body>
<!-- 全局js -->
<script src="${pageContext.servletContext.contextPath}/assets/js/jquery.min.js?v=2.1.4"></script>
<script src="${pageContext.servletContext.contextPath}/assets/js/bootstrap.min.js?v=3.3.6"></script>

<!-- 自定义js -->
<script src="${pageContext.servletContext.contextPath}/assets/js/content.js?v=1.0.0"></script>
<script src="${pageContext.servletContext.contextPath}/assets/js/sweetalert.min.js"></script>
<script>
    swal({
        title: "操作出错",
        text: "改变未能上传至数据库！",
        type: "error",
        showCancelButton: false,
        confirmButtonColor: "#DD6B55",
        confirmButtonText: "返回重试",
        closeOnConfirm: false
    },function () {
        window.history.back();
    });
</script>
</body>
</html>
