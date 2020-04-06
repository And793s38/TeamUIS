<?php
include "../DAO/Metodos.php";
session_start();
$obj = new Metodos();
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Entrar</title>
    <link rel="stylesheet" href="../static/css/bootstrap.min.css">
    <link rel="stylesheet" href="../static/css/general.css">
    <script src="../static/js/jquery.min.js"></script>
    <script src="../static/js/bootstrap.min.js"></script>
    
</head>
<body>
    <header class="logo">
        <img src="../static/img/logo.png" alt="logo" height="100px">
    </header>
    
    <section class="entrarC">
        <div class="row justify-content-md-center">
            <h2 class="titulo">Bienvenido <?php echo $_SESSION['usuario'] ?></h2>
        </div>
        <div class="row justify-content-md-center cartas">
            <div class="col-sm-4 ">
                <div class="card img" style="width: 18rem;">
                    <img src="../static/img/tutor.png" class="card-img-top" alt="tutor">
                    <div class="card-body">
                        <h5 class="card-title">ENTRAR COMO TUTOR</h5>
                        <p class="card-text">Podrá crear grupos de estudio donde será tutor además de revisar los grupos de los cuales es tutor</p>
                        <a href="./tutor.php" class="btn btn-outline-success btn-block ir">Ingresar</a>
                    </div>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="card img" style="width: 18rem;">
                    <img src="../static/img/estudiante.png" class="card-img-top" alt="tutor">
                    <div class="card-body">
                        <h5 class="card-title">ENTRAR COMO ESTUDIANTE</h5>
                        <p class="card-text">Podrá escoger grupos de estudio de sus materias</p>
                        <a href="./estudiante.php" class="btn btn-outline-success btn-block ir">Ingresar</a>
                    </div>
                </div>
            </div>
            </div>
        </div>
        
    </section>
</body>
</html>