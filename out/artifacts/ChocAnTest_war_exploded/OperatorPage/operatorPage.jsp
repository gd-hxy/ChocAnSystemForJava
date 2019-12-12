<%--
  Created by IntelliJ IDEA.
  User: 13742
  Date: 2019/11/30
  Time: 21:28
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
    <h2>ChocAn操作员中心</h2>
    <ol class="breadcrumb">
      <li>
        <a href="../index.jsp">主页</a>
      </li>
      <li>
        <strong>操作员页面</strong>
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
      <h2 class="font-bold">欢迎您${UserNow.getOperatorName()}</h2>
      <div class="tabs-container">
        <ul class="nav nav-tabs">
          <li class="active"><a data-toggle="tab" href="#tab-1" aria-expanded="true">会员相关操作</a>
          </li>
          <li class=""><a data-toggle="tab" href="#tab-2" aria-expanded="false">提供者相关操作</a>
          </li>
        </ul>
        <div class="tab-content">
          <div id="tab-1" class="tab-pane active">
            <div class="panel-body">
              <form action="OperateAction!addMember" role="form" method="post">
                <div class="form-group">
                  <label>会员ID</label>
                  <input class="form-control" type="number" name="memberId">
                </div>
                <div class="form-group">
                  <label>会员姓名</label>
                  <input class="form-control" type="text" name="memberName">
                </div>
                <div class="form-group">
                  <label>所在国家</label>
                  <input class="form-control" type="text" name="memberCountry">
                </div>
                <div class="form-group">
                  <label>所在城市</label>
                  <input class="form-control" type="text" name="memberCity">
                </div>
                <div class="form-group">
                  <label>详细地址</label>
                  <input class="form-control" type="text" name="memberAddress">
                </div>
                <div class="form-group">
                  <label>会员ZIP</label>
                  <input class="form-control" type="text" name="memberZip">
                </div>
                <div class="form-group">
                  <label>会员状态</label>
                  <input class="form-control" type="text" name="memberState" value="Validated" readonly="readonly">
                </div>
                <div class="form-group">
                  <label>会员余额</label>
                  <input class="form-control" type="number" step="0.01" name="memberFee" value="0" readonly="readonly">
                </div>
                <div class="form-group">
                  <label>会员密码</label>
                  <input class="form-control" type="text" name="memberPass" value="123456" readonly="readonly">
                </div>
                <button type="submit" class="btn btn-primary m-t">提交</button>
              </form>
              <h5 class="page-header"></h5>
              <form role="form" action="OperateAction!deleteMember" method="post">
                <div class="form-group">
                  <label>会员ID</label>
                  <input class="form-control" type="number" name="memberId_delete">
                </div>
                <button type="submit" class="btn btn-primary m-t">删除</button>
              </form>
            </div>
          </div>
          <div id="tab-2" class="tab-pane">
            <div class="panel-body">
              <form action="OperateAction!addProvider" role="form" method="post">
                <div class="form-group">
                  <label>提供者ID</label>
                  <input class="form-control" type="number" name="providerId">
                </div>
                <div class="form-group">
                  <label>提供者姓名</label>
                  <input class="form-control" type="text" name="providerName">
                </div>
                <div class="form-group">
                  <label>所在国家</label>
                  <input class="form-control" type="text" name="providerCountry">
                </div>
                <div class="form-group">
                  <label>所在城市</label>
                  <input class="form-control" type="text" name="providerCity">
                </div>
                <div class="form-group">
                  <label>详细地址</label>
                  <input class="form-control" type="text" name="providerAddress">
                </div>
                <div class="form-group">
                  <label>提供者ZIP</label>
                  <input class="form-control" type="text" name="providerZip">
                </div>
                <div class="form-group">
                  <label>提供者状态</label>
                  <input class="form-control" type="text" name="providerState" value="Validated" readonly="readonly">
                </div>
                <div class="form-group">
                  <label>提供者密码</label>
                  <input class="form-control" type="text" name="providerPass" value="1122" readonly="readonly">
                </div>
                <button type="submit" class="btn btn-primary m-t">提交</button>
              </form>
              <h5 class="page-header"></h5>
              <form role="form" action="OperateAction!deleteProvider" method="post">
                <div class="form-group">
                  <label>提供者ID</label>
                  <input class="form-control" type="number" name="providerId_delete">
                </div>
                <button type="submit" class="btn btn-primary m-t">删除</button>
              </form>
            </div>
          </div>
        </div>
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
