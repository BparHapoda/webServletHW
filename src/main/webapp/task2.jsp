<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>task2</title>
</head>
<style>
    .fon {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
    }

    input {
        height: 80px;
        box-shadow: 7px 6px 9px -1px rgba(25, 21, 198, 0.28);
        width: 500px;
        font-size: 30px;
    }

    #subm {
        font-size: 15px;
    }

    .boldText1 {
        font-size: 30px;
        color: brown;
    }
</style>
<body>
<% if (session.getAttribute("max") == null) {
    session.setAttribute("max", " ");
}
    ;%>
<div class="fon">
    <form action="task2" method="get">
        <p>
            <input type="number" name="a" placeholder="  Введите число а"></p>
        <p><input type="number" name="b" placeholder="  Введите число b"></p>
        <p><input type="number" name="c"  placeholder="  Введите число c"></p>
        <p><input id="subm" type="submit" value="Найти максимум из трех чисел"></p>

        <p class="boldText1">
            <%= session.getAttribute("max")%>
        </p>
    </form>
</div>
</body>
</html>
