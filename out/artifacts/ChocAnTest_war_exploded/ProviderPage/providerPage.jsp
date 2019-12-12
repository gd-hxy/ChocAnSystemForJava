<%--
  Created by IntelliJ IDEA.
  User: 13742
  Date: 2019/11/29
  Time: 12:53
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
    <h2>ChocAn提供者中心</h2>
    <ol class="breadcrumb">
      <li>
        <a href="index.html">主页</a>
      </li>
      <li>
        <strong>提供者页面</strong>
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
        <h2 class="font-bold">欢迎您${UserNow.getProviderName()}</h2>

        <div class="error-desc">
          请选择您的操作：
          <br/><a href="${pageContext.servletContext.contextPath}/ProviderPage/providerDetails.jsp" class="btn btn-primary m-t">查看个人信息</a>
          <br/><a href="#" class="btn btn-primary m-t" data-toggle="modal" data-target="#service">开始服务</a>
          <br/><a href="#" class="btn btn-primary m-t" data-toggle="modal" data-target="#index">提供者目录</a>
        </div>
      </div>
    </div>
  </div>
</div>

<%--service modal--%>
<div class="modal inmodal" id="service" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content animated bounceInRight">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">关闭</span>
        </button>
        <h4 class="modal-title">读取界面</h4>
        <small class="font-bold">若磁卡读取器出现故障，可以在下方手动输入会员编号。</small>
      </div>
      <form class="form-group" action="MemberValidatedAction.action" method="post">
      <div class="modal-body">
          <label>会员编号</label>
          <input type="number" name="member_id" placeholder="请输入会员号" class="form-control">
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>
        <button type="submit" class="btn btn-primary">提交</button>
      </div>
    </form>
    </div>
  </div>
</div>
<%--index modal--%>
<div class="modal inmodal" id="index" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content animated bounceInRight">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">关闭</span>
        </button>
        <h4 class="modal-title">确认界面</h4>
        <small class="font-bold">请确认下方为您的提供者编号。</small>
      </div>
      <form class="form-group" action="ApplyForProviderIndexAction.action" method="post">
        <div class="modal-body">
          <label>提供者编号</label>
          <input type="number" name="member_id" placeholder="请输入会员号" class="form-control" value="${UserNow.getProviderId()}">
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-white" data-dismiss="modal">关闭</button>
          <button type="submit" class="btn btn-primary">提交</button>
        </div>
      </form>
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
