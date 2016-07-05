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

            <%
            int level=(Integer)session.getAttribute("level");
            String name=(String)session.getAttribute("name");
              %>
          <div class="top">
              <div class="timetext">当前时间:</div>
              <div class="time"  id="time"></div>
              <div class="tishi">
                  <span class="a">下午好,${name},欢迎您！</span>
                 <a href="outlogin"><input type="submit" value="注销"></a>
              </div>
              <div class="biaoti">

              <label class="c">全球幸福集团内部系统</label>
                  <div class="b">In the future, you will appreciate the struggle of you now.</div>
              </div>
          
          </div>
     <div class="left">
         <div class="left-gongneng">
         <% if(level==1){ %>
             <label>员工功能模块</label>
             <%}else if(level==2){ %>
             <label>店长功能模块</label>
             <%}else if(level==3){ %>
                                                      区域经理功能模块
             <%}%>
         </div>
         <div class="panel-group" id="accordion">
             <div class="panel panel-default">
                 <div class="panel-heading">
                     <h4 class="panel-title">
                         <a data-toggle="collapse" data-parent="#accordion"
                            href="#collapseOne">
                            <% if(level==1){ %>
             <label>员工系统</label>
             <%}else if(level==2){ %>
             <label>店长系统</label>
             <%}else if(level==3){ %>
                                                      区域经理系统
             <%}%>
                         </a>
                     </h4>
                 </div>
                 <div id="collapseOne" class="panel-collapse collapse in">
                     <div class="panel-body">
                     <% if(level==1){ %>
                       <a href="uppwd">修改密码</a><br>
                       <a href="addkanfang">看房</a>
             <%}else if(level==2){ %>
             <a>${name}</a><br>
             <a href="uppwd">修改密码</a><br>
             <%}else if(level==3){ %>
               <a>${name}</a>
             <a href="uppwd">修改密码</a><br>
             <%}%>
                    
                     </div>
                 </div>
             </div>
             <div class="panel panel-default">
                 <div class="panel-heading">
                     <h4 class="panel-title">
                         <a data-toggle="collapse" data-parent="#accordion"
                            href="#collapseTwo">
                        <% if(level==1){ %>
             客户管理
             <%}else if(level==2){ %>
             员工管理
             <%}else if(level==3){ %>
    店长管理                                                 
             <%}%>
                         </a>
                     </h4>
                 </div>
                 <div id="collapseTwo" class="panel-collapse collapse">
                     <div class="panel-body">
                         
                         <% if(level==1){ %>
             <a href="addclient">添加客户</a><br>
           <a href="upclient">修改客户信息</a>
             <%}else if(level==2){ %>
             <a href="addaccouty">添加员工</a><br>
           <a href="upaccouty">修改员工信息</a>
             <%}else if(level==3){ %>
              <a href="addaccoutd">添加店长</a><br>
           <a href="upaccoutd">修改店长信息</a>                                   
             <%}%>
                     </div>
                 </div>
             </div>
             <div class="panel panel-default">
                 <div class="panel-heading">
                     <h4 class="panel-title">
                         <a data-toggle="collapse" data-parent="#accordion"
                            href="#collapseThree">
                         <% if(level==1){ %>
             房源管理
             <%}else if(level==2){ %>
            业绩
              <%}else if(level==3){ %>
    店铺管理                                                 
             <%}%>
                                                  
             
                         </a>
                     </h4>
                 </div>
                 <div id="collapseThree" class="panel-collapse collapse">
                     <div class="panel-body">
                         
                         <% if(level==1){ %>
             <a href="addhouse">添加房源</a><br>
             <a href="uphouse">修改房源信息</a>
             <%}else if(level==2){ %>
            <a>店铺业绩</a><br>
            <a>员工业绩</a>
             <%}else if(level==3){ %>
            <a href="addstore">添加店铺</a><br>
            <a href="upstore">修改店铺信息</a>                                           
             <%}%>
                     </div>
                 </div>
             </div>
             <div class="panel panel-default">
                 <div class="panel-heading">
                     <h4 class="panel-title">
                         <a data-toggle="collapse" data-parent="#accordion"
                            href="#collapseFour">
                            <% if(level==1){ %>
            业绩查询
             <%}%>
                          
                         </a>
                     </h4>
                 </div>
                 <div id="collapseFour" class="panel-collapse collapse">
                     <div class="panel-body">
                         
                                    <% if(level==1){ %>
        <a href="#">房源</a><br>
                         <a href="#">看房</a><br>
                         <a href="#">合同</a><br>
             <%}%>
                     </div>
                 </div>
             </div>
         </div>

     </div>
         <div id="right" class="right" >
         <% if(level==1){ %>
                 <form>
                     <form>
                         <div class="a">
                             <label>户型:</label>
                             <select>
                                 <option>三室两厅</option>
                                 <option>两室一厅</option>
                                 <option>一室一厅</option>
                                 <option>三室一厅</option>
                             </select>
                             <label class="b">设施:</label>
                             <select class="b">
                                 <option>带家电</option>
                                 <option>不带家电</option>
                             </select>
                             <label class="c">区域:</label>
                             <select class="c">
                                 <option>雨花区</option>
                                 <option>开福区</option>
                                 <option>天心区</option>
                                 <option>岳麓区</option>
                             </select>
                             <label class="d">地址:</label>
                             <select class="d">
                                 <option>香樟路</option>
                                 <option>林科大</option>
                                 <option>左加糖</option>
                                 <option>中医院</option>
                             </select>
                             <label class="e">楼层:</label>
                             <select class="e">
                                 <option>一楼</option>
                                 <option>二楼</option>
                                 <option>三楼</option>
                                 <option>四楼</option>
                                 <option>五楼</option>
                                 <option>六楼</option>
                                 <option>七楼</option>
                                 <option>八楼</option>
                             </select>
                             <label class="f">价格:</label>
                             <select class="f">
                                 <option>500-1000元</option>
                                 <option>800-1200元</option>
                                 <option>1200-1800元</option>
                                 <option>1500-2200元</option>
                             </select>
                             <input class="g" type="button" value="搜索">
                         </div>
                     </form>
                     </form>
                <div class="right-b">
                      <a id="zengjia" href="javascript:void(0);"><input  class="d" type="button" value="增加+"></a>

                </div>
             <div class="right-c">
                 <div class="right-c-a">
                 <ul>
                     <li>市区</li>
                     <li>区域</li>
                     <li>地址</li>
                     <li>户型</li>
                     <li>价格</li>
                     <li>状态</li>
                     <li>设施</li>
                     <li>创建时间</li>
                     <li>操作</li>
                 </ul>
                     </div>
                 <div class="right-c-b">
                     <ul>
                         <li>长沙</li>
                         <li>雨花区</li>
                         <li>香樟路</li>
                         <li>一室一厅</li>
                         <li>600元</li>
                         <li>代出租</li>
                         <li>家电齐全</li>
                         <li>2016-5-2</li>
                         <li><a onclick="show_confirm()" href="javascript:void(0);">删除</a>丨<a href="guanliyuan.html">修改</a></li>
                     </ul>
                 </div>

             </div>
             <%} %>
             </div>
              
        <div class="footer">Copyright(C)@该网站所有解释权归幸福集团所有 All Rights Reserved</div>
</div>
      <script src="js/jquery.js" type="text/javascript"></script>
      <script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>