<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Task 5</title>

    <style>
        .screen {
            display: flex;
            justify-content: center;
        }

        .window {
            display: block;
            width: 370px;
            height: 540px;
            border: 2px solid blue;
        }

        .tableG {
            margin: 5px;
            height: 70px;
            width: 355px;
            font-size: 60px;
            text-align: right;
            border: 1px solid blue;
        }

        .buttons {
            display: flex;
            flex-direction: row;
            margin: 5px;
            flex-wrap: wrap;
        }

        .but {
            width: 80px;
            height: 80px;
            margin: 5px;
        }

        label {
            font-weight: bold;
            position: relative;
        }
    </style>
</head>
<body>

<div class="screen">
    <div class="window">
        <form action="task5" method="get">
            <input id="tableG" type="text" contenteditable="false"
                   value=<%=session.getAttribute("otvet")%> class="tableG" name="primer"/>

            <div class="buttons">
                <input class="but" type="button" id="c" value="c"/>

                <input class="but" type="button" id="^" value="^"/>

                <input class="but" type="button" id="%" value="%"/>

                <input class="but" type="button" id="/" value="/"/>
                <input class="but" type="button" id="7" value="7"/>
                <input class="but" type="button" id="8" value="8"/>
                <input class="but" type="button" id="9" value="9"/>
                <input class="but" type="button" id="*" value="*"/>
                <input class="but" type="button" id="4" value="4"/>
                <input class="but" type="button" id="5" value="5"/>
                <input class="but" type="button" id="6" value="6"/>
                <input class="but" type="button" id="-" value="-"/>
                <input class="but" type="button" id="1" value="1"/>
                <input class="but" type="button" id="2" value="2"/>
                <input class="but" type="button" id="3" value="3"/>
                <input class="but" type="button" id="+" value="+"/>
                <input class="but" type="button" id="0" value="0"/>
                <input class="but" type="button" id="," value=","/>
                <input class="but" type="button" id="+/-" value="+/-"/>
                <input class="but" type="submit" id="=" value="="/>

            </div>
        </form>
    </div>
</div>

<script src="script.js"></script>

</body>
</html>
