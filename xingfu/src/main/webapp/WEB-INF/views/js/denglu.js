/**
 * Created by Administrator on 2016/6/25.
 */
  //表单验证
  function checkName() {
    $user_name=document.getElementById("User_Name").value;
    $user_pwd=document.getElementById("User_Pwd").value;

    if($user_name==""){
      alert("账号不能为空!");
        return false;
    }
    if($user_pwd==""){
        alert("密码不能为空！");
        return false;
    }
       return true;
}
//获取系统时间
function startTime() {
    var today=new Date();
    var h=today.getHours();
    var m=today.getMinutes();
    var s=today.getSeconds();
    m=checkTime(m);
    s=checkTime(s);
    document.getElementById('time').innerHTML=h+":"+m+":"+s;
    t=setTimeout('startTime()',500);
}
function checkTime(i)
{
    if (i<10)
    {i="0" + i}
    return i;
}

//ge ren zi liao
$(function(){
    $('#ziliao').click(function(){
        $.ajax({
            url:"liwen.html",
            dataType:"html",
            type:"get",
            success:function(result){
             $("#right").html(result);
            }
        });
    });

});

//zeng jia shu ju
$(function(){
    $("#zengjia").click(function(){//点击增加
        $.ajax({
            url:"addfangyuan.html",//请求地址
            dataType:"html",//请求类型
            type:"get",//请求方式
            success:function(result){//定义一个参数
                $("#right").html(result);//right里的内容用html(result)替换
            }
        });
    });
});

//shan chu
function show_confirm(){
   var r = confirm("确定删除数据？");
    if(r==true){
        alert("删除成功!")
    }
    else{
        alert("没有删除任何数据");
    }
}



