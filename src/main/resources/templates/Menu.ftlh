iteration need to be fixed<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<div> <form method="post">
    <input type="text" name = "name" placeholder="Введите название"/>
    <input type="text" name = "discription" placeholder="Введите описание"/>
    <button type="submit">Enter</button>
</form></div>
<div> Меню </div>
<p>
        <#list message  as messages>
           <b>${messages.name}</b>
            <#else >
            No
        </#list>
</p>
</body>
</html>