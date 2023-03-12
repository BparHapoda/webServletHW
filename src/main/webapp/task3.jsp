<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>task3</title>
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

    .inputRadio {
        height: 20px;
        width: 20px;
        box-shadow: none;
    }

    .radioB {
        display: flex;
        justify-content: flex-start;
        align-items: center;
    }

    .radioBlock {
        margin-left: 90px;
    }

    #subm {
        font-size: 15px;
    }

    .boldText1 {
        font-size: 40px;
        color: red;
    }
</style>
<body>
<% if (session.getAttribute("result") == null) {
    session.setAttribute("result", " ");
}
    ;%>
<div class="fon">
    <form action="task3" method="get">
        <p>
            <input type="number" name="a" placeholder="Введите число а"></p>
        <p><input type="number" name="b" placeholder="Введите число b"></p>
        <p><input type="number" name="c" placeholder="Введите число c"></p>

        <div class="radioBlock">
            <p class="radioB">
                <input class="inputRadio" type="radio" value="maxChoice" name="choice" checked="checked"/> Максимальное
                значение
            </p>

            <p class="radioB">
                <input class="inputRadio" type="radio" value="minChoice" name="choice"/>Минимальное значение
            </p>

            <p class="radioB">
                <input class="inputRadio" type="radio" value="averageChoice" name="choice"/>Среднее арифметическое
            </p>
        </div>
        <p><input id="subm" type="submit" value="Вычислить"></p>

        <p class="boldText1">
            <%= session.getAttribute("result")%>
        </p>
    </form>
</div>
</body>
</html>
