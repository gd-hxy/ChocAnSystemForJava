<%--
  Created by IntelliJ IDEA.
  User: 13742
  Date: 2019/11/28
  Time: 20:47
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
    <h2>ChocAn会员中心</h2>
    <ol class="breadcrumb">
      <li>
        <a href="../index.jsp">主页</a>
      </li>
      <li>
        <a href="memberPage.jsp">会员页面</a>
      </li>
      <li>
        <strong>缴纳会费</strong>
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
          <h5>缴纳会费</h5>
        </div>
        <div class="ibox-content">
          <div class="alert alert-info">
            您现在的余额为：${UserNow.getMemberFee()}元。
          </div>
          <form role="form" action="PayAction.action" method="post">
            <div class="form-group">
              <label>支付金额</label>
              <input type="number" step="0.01" name="money" class="form-control">
              <button type="submit" class="btn btn-primary m-t">支付</button>
              <a class="btn btn-primary m-t" href="memberPage.jsp">返回</a>
            </div>
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
<script>
  window.onload = function check() {
      var flag = ${flag};
      if(flag == 1){
          swal({
              title: "支付成功",
              text: "请确认您的账户余额",
              type: "success"
          });
          flag = -1;
      } else if(flag == 0){
          swal("支付失败", "支付请求超时！请确认您连上网络", "error");
          var flag = -1;
      }
  }
</script>
</body>
</html>
