<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" href="css/style1.css">
</head>
<body>
<div class="login">
  <form action="login" method="post">
      <em style="color: red">
          <%if(request.getAttribute ("error")!=null){%>
          <%= request.getAttribute("error")%></br>
          <%}%></em>
        <h2> Login </h2><br>
        <input type="email" name="email" placeholder="E-mail"><br><br>
        <input type="password" name ="password" placeholder="Senha"><br><br>
        <input type="submit" value="Login"><br><br>
        Não Possui conta? <a href="registerUser">Criar conta</a><br>

  </form>
</div>

</body>
</html>