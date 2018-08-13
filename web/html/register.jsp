<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Novo Usuário</title>
    <link rel="stylesheet" href="/css/style1.css">
</head>
<body>
 <div class="register">


    <form action="/registerUser" method="post">
        <h2>Cadastro</h2><br>
        <input type="text" name="name" id="name" placeholder="Nome"><br><br>
        <input type="email" name="email" id="email" placeholder="E-mail"><br><br>
        <input type="text" name="curse" id="curse" placeholder="Curso"><br><br>
        <input type="text" name="inst" id="inst" placeholder="Instituição"><br><br>
        <input type="password" name="password" id="password" placeholder="Senha"><br><br>
        <input type="password" name="password2" id="password2" placeholder="Confirmar Senha"><br><br>
        <input type="submit" value="Cadastrar" id="submit" >
        <em style="color: red">
            <%if(request.getAttribute ("error2")!=null){%>
                <%= request.getAttribute("error2")%></br>
            <%}%></em>

    </form>
 </div>
</body>
</html>