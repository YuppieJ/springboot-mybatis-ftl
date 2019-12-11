<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>ID</td>
            <td>用户名</td>
            <td>姓名</td>
            <td>地址</td>
        </tr>

        <#list users as user>
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.name}</td>
                <td>${user.addr}</td>
            </tr>
        </#list>
    </table>
</body>
</html>