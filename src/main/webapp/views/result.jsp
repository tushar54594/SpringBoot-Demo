<%@page language="java" %>

<html>
    <body>
        <h2>Result is : <%= session.getAttribute("result") %> use this with session only. If using model, then no need of it.</h2>
        <h2>Result is : ${result} </h2>
        <h2> ${alien} </h2>
        <h2> Welcome to the ${course} </h2>
    </body>
</html>