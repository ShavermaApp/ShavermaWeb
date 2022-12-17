<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>

<form action="/logout" method="post"><input type="hidden" name="_csrf" value="${_csrf.token}" /> <input type="submit" value="Sign out"></form>
<div> <form method="post">
        <div class="form-group">
            <input type="text"  name="name" placeholder="Название шавермы">
        </div>
        <div class="form-group">
            <input type="text" name="discription" placeholder="Описание Шавермы">
        </div>
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button type="submit" class="btn btn-primary">Подтвердить</button>
    </form>
</div>
<div> <h1>Меню</h1></div>
<#list message  as messages>
<div class="card" style="width: 18rem;">
    <div class="card-body">
        <h5 class="card-title">${messages.name!""}</h5>
        <p class="card-text">${messages.discription!""}</p>
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <a href="#" class="btn btn-primary">Заказать</a>
    </div>
</div>
</#list>
</body>
</html>