<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>后台</title>
       <link href="css/bootstrap.min.css" type="text/css" rel="stylesheet" />
       <link rel="stylesheet" href="css/guanliyuan.css" type="text/css">
    <script language=JavaScript  src ='js/jquery.js'></script>
    <script language=JavaScript  src ='js/denglu.js'></script>

    <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="HandheldFriendly" content="true">
</head>
<body  onload="startTime()" >
<div class="quanbu">

          <div class="top">
              <div class="timetext">当前时间:</div>
              <div class="time"  id="time"></div>
              <div class="tishi">
                  <span class="a">下午好,${a.name},欢迎您！</span>
                 <a href="outlogin"><input type="submit" value="注销"></a>
              </div>
              <div class="biaoti">

              <label class="c">全球幸福集团内部系统</label>
                  <div class="b">In the future, you will appreciate the struggle of you now.</div>
              </div>
          
          </div>
     <div class="left">
         <div class="left-gongneng">
             <label>功能模块</label>
         </div>
         <div class="panel-group" id="accordion">
             <div class="panel panel-default">
                 <div class="panel-heading">
                     <h4 class="panel-title">
                         <a data-toggle="collapse" data-parent="#accordion"
                            href="#collapseOne">
                            集团-系统区域经理
                         </a>
                     </h4>
                 </div>
                 <div id="collapseOne" class="panel-collapse collapse in">
                     <div class="panel-body">
                       <a>${a.name }</a>
                     </div>
                 </div>
             </div>
             <div class="panel panel-default">
                 <div class="panel-heading">
                     <h4 class="panel-title">
                         <a data-toggle="collapse" data-parent="#accordion"
                            href="#collapseTwo">
                         添加店长
                         </a>
                     </h4>
                 </div>
                 <div id="collapseTwo" class="panel-collapse collapse">
                     <div class="panel-body">
                         <a href="#">添加店长+</a>
                     </div>
                 </div>
             </div>
             <div class="panel panel-default">
                 <div class="panel-heading">
                     <h4 class="panel-title">
                         <a data-toggle="collapse" data-parent="#accordion"
                            href="#collapseThree">
                            编辑店长
                         </a>
                     </h4>
                 </div>
                 <div id="collapseThree" class="panel-collapse collapse">
                     <div class="panel-body">
                          
                         <a href="#">编辑店长信息</a>
                     </div>
                 </div>
             </div>
             <div class="panel panel-default">
                 <div class="panel-heading">
                     <h4 class="panel-title">
                         <a data-toggle="collapse" data-parent="#accordion"
                            href="#collapseFour">
                             系统设置-修改密码
                         </a>
                     </h4>
                 </div>
                 <div id="collapseFour" class="panel-collapse collapse">
                     <div class="panel-body">
                         <a href="uppwd">修改密码</a><br>
                     </div>
                 </div>
             </div>
         </div>

     </div>
         <div id="right" class="right" >
    <form action="upaccout2" method="post">
       账号:<input type="text" name="accout"/><br>
       密码:<input type="password" name="password"/><br>
      联系电话:<input type="text" name="phone"/><br>
      身份证号码:<input type="text" name="idcard"/><br>
      店铺:<input type="text" name="store"/><br>
       等级:<select name="level">
               <option value="1">店铺员工</option>
               <option value="2">店长</option>
               <option value="3">区域经理</option>
           </select><br>
       状态:<input type="text" name="state" />(0 离职   1 在职)<br>
  <input type="submit" value="修改"/>
   </form>  
         </div>

        <div class="footer">Copyright(C)@该网站所有解释权归幸福集团所有 All Rights Reserved</div>
</div>
      <script src="js/jquery.js" type="text/javascript"></script>
      <script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>