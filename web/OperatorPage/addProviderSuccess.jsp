<%--
  Created by IntelliJ IDEA.
  User: 13742
  Date: 2019/11/30
  Time: 23:40
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
        title: "添加完成",
        text: "提供者记录已经添加至数据库！",
        type: "success",
        showCancelButton: false,
        confirmButtonColor: "#35dd1a",
        confirmButtonText: "确认",
        closeOnConfirm: false
    },function () {
        window.location.href = "${pageContext.servletContext.contextPath}/OperatorPage/operatorPage.jsp";
    });
</script>
</body>
</html>
