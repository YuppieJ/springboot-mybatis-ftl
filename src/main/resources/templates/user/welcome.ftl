<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<script src="../../js/Jquery3.3.1.js"></script>
<script>
    /*function updateMyInfo() {

        $.get("/user/findUserById?id=${user.id}", function (data) {

        });
    }*/
</script>
<body>
    欢迎您：${user.username}<br>
    修改我的信息：<a href="/user/findUserById?id=${user.id}">修改信息</a>
    <#--<input type="button" value="修改信息" onclick="updateMyInfo()">-->
    <a href="/user/userList">查看用户列表</a>
</body>
</html>