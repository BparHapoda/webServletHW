<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task 4</title>
</head>
<style>
    .area {
        width: 800px;
        height: 300px;
    }

    .screen {
        display: flex;
        flex-direction: column;
        align-items: center;
    }

    input {
        margin: auto;
        text-decoration: none;
        width: 200px;
        height: 50px;
        color: black;
        border-radius: 50%;
        background-color: coral;
        display: flex;
        justify-content: center;
        align-items: center;
        padding: 10px;
        border: 2px solid black;
    }


    input:hover {
        background-color: aliceblue;
    }

    .resText {
        font-size: large;
        width: 600px;
        text-wrap: normal;
        height: 100px;
        font-weight: bold;
    }
</style>
<body>
<%
    if (session.getAttribute("analis") == null) {
        session.setAttribute("analis", " ");
    }
%>
<div class="screen">
    <h1>Введите текст :</h1>
    <form action="task4" method="post">
        <textArea id="textAr" name="textAr" class="area"></textArea>
        <br><br>
        <div class="button">

            <input type="submit" value="АНАЛИЗ ТЕКСТА"/>
        </div>

    </form>
    <br>
    <br>
    <pre class="resText">
        <%= session.getAttribute("analis")%>

    </pre>
</div>
</div>
</body>
</html>
