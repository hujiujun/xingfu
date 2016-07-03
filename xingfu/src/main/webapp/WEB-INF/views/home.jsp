 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <script language=JavaScript  src ='../js/denglu.js'></script>
    <link rel="stylesheet" href="../css/denglu.css" type="text/css">
</head>
<body style= "overflow-x: hidden">
         <div class="top">
             <div class="biaoti">
             <p class="p">幸福集团内部系统登陆页面</p>
             </div>
     <form name="myForm" action="account"  method="post">
         <div class="zhiwei">
         <label style="color:red">请问你是?</label>
           <select name="level">
               <option value="0">店铺员工</option>
               <option value="1">店长</option>
               <option value="2">区域经理</option>
               <option value="3">管理员</option>
           </select>
         </div>
             
     <div class="zhanghao">
             <label>账号:</label>
               <input class="a"  type="text" name="name" id="User_Name" placeholder="请输入账号"/>
      </div>
      <div class="mima">
            <label>密码:</label>
               <input class="b" type="password" name="password" id="User_Pwd" placeholder="请输入密码"/>
      </div>
             <div class="danxuan">
                 <input type="checkbox"/>
                 <label>是否记住密码?</label>
             </div>
         <div class="tijiao">
             <input class="t" type="submit" value="登陆">
         </div>

     </form>
             </div>
</body>
</html>