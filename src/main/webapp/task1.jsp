<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link href="http://fonts.googleapis.com/css?family=Merienda+One" rel="stylesheet" type="text/css">
<style>
    h2 {
        font: 400 100px/1.2 'Merienda One', Helvetica, sans-serif;
        color: rgba(0, 0, 0, 0.7);
        text-shadow: 3px 3px 3px #fff;
    }

    #background {
        background-image: url("fon.png");
        background-size: cover;
        width: 100%;
        height: 100%;
        display: flex;
        align-items: center;
        justify-content: center;
        padding-left: 30px;
    }
</style>
<head>
    <title>Task 1</title>
</head>
<body>
<div id="background">
    <h2>${message}</h2>
</div>
</body>
</html>
