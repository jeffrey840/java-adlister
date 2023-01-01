<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing game</title>
</head>
<body>
<h1>Guess The Correct Number</h1>
<form method="post">
    <div>
        <h2>Choose a number between 1 and 3</h2>
        <ol>
            <li><input type="radio" name="guess" value="1"></li>
            <li><input type="radio" name="guess" value="2"></li>
            <li><input type="radio" name="guess" value="3"></li>
        </ol>
    </div>
    <button>Submit</button>
</form>
</body>
</html>
