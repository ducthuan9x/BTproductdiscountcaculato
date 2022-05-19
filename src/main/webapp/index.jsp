<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
html>
<style type="text/css">
    .login {
        height:180px; width:230px;
        margin:0;
        padding:10px;
        border:1px #CCC solid;
    }
    .login input {
        padding:5px; margin:5px
    }
</style>
<body>
<form  method="post" action="/sayhello">
    <div class="login">
        <h2>Login</h2>
        <input type="text" name="sp" size="30"  placeholder="product" />
        <h2>productName</h2>
        <input type="text" name="price" size="30" placeholder="price" />
        <h2>price</h2>
        <input type="text" name="discount" size="30" placeholder="discount"/>
        <h2>discount</h2>
        <button>Stast</button>
    </div>
</form>
</body>
</html>