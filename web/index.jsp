<%--
  Created by IntelliJ IDEA.
  User: Mikołaj Klonowski
  Date: 2018-07-04
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Kalkulator wag i miar</title>
  </head>
  <body>
  <h1>Przelicznik metryczny</h1>
  <form method="post" action="kalkulator" ><br>
    <input type="text" name="metry" placeholder="metry" ><br>
    <input type="text" name="centymetry" placeholder="centymetry"><br>
    <input type="text" name="milimetry" placeholder="milimetry"><br>
    <input type="submit" value="Przelicz" >
  </form>
  <h1>Przelicznik wag</h1>
  <form method="post" action="kalkulator"><br>

    <input type="text" name="kilogramy" placeholder="kilogramy"><br>
    <input type="text" name="gramy" placeholder="gramy"><br>
    <input type="text" name="miligramy" placeholder="miligramy"><br>
    <input type="submit" value="Przelicz" >
  </form>
  </body>
</html>
