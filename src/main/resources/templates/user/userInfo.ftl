<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <form action="/user/updateMyInfo" method="post">
        <input type="hidden" name="id" value="${userById.id}">
        用户名:<input type="text" name="username" value="${userById.username}"><br>
        密&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="text" name="password" value="${userById.password}"><br>
        姓&nbsp;&nbsp;&nbsp;&nbsp;名:<input type="name" name="name" value="${userById.name}"><br>
        家庭地址:<input type="text" name="addr" value="${userById.addr}"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>