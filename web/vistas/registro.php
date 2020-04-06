<?php
session_start();
echo $_SESSION['ip'];
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Registro</title>
    <link rel="stylesheet" href="../static/css/bootstrap.min.css">
    <link rel="stylesheet" href="../static/css/general.css">
    <script src="../static/js/jquery.min.js"></script>
    <script src="../static/js/valida.js"></script>
</head>
<body>
<section>
    <div class="row justify-content-md-center align-items-center">
        <div class="col align-self-center">
            <form action="../DAO/registro.php" class="login-form" method="post">
                <h1 id="iniciar">Registro</h1>

                <div class="txtb">
                    <input type="text" name="nombre" id="nombre" onchange="activaRe()">
                    <span data-placeholder="Nombre"></span>
                </div>

                <div class="txtb">
                    <input type="text" name="carrera" id="carrera" onchange="activaRe()">
                    <span data-placeholder="Carrera"></span>
                </div>
                <div class="txtb">
                    <input type="number" name="telefono" id="telefono" onkeypress="return telefono(event)" onchange="activaRe()">
                    <span data-placeholder="Teléfono"></span>
                </div>
                <input type="submit" class="logbtn" id="entrar" value="Entrar" disabled>
            </form>
        </div>
    </div>
</section>
</body>
<script type="text/javascript">
        $(".txtb input").on("focus", function() {
            $(this).addClass("focus");
        });

        $(".txtb input").on("blur", function() {
            if ($(this).val() == "")
                $(this).removeClass("focus");
        });
    </script>  
</html>