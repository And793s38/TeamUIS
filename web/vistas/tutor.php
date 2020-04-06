<?php
include "../DAO/Metodos.php";
session_start();
$obj = new Metodos();
if(isset($_SESSION['ip'])){
    function get_real_ip()
    {

        if (isset($_SERVER["HTTP_CLIENT_IP"])) {
            return $_SERVER["HTTP_CLIENT_IP"];
        } elseif (isset($_SERVER["HTTP_X_FORWARDED_FOR"])) {
            return $_SERVER["HTTP_X_FORWARDED_FOR"];
        } elseif (isset($_SERVER["HTTP_X_FORWARDED"])) {
            return $_SERVER["HTTP_X_FORWARDED"];
        } elseif (isset($_SERVER["HTTP_FORWARDED_FOR"])) {
            return $_SERVER["HTTP_FORWARDED_FOR"];
        } elseif (isset($_SERVER["HTTP_FORWARDED"])) {
            return $_SERVER["HTTP_FORWARDED"];
        } else {
            return $_SERVER["REMOTE_ADDR"];
        }
    }
    $ip = get_real_ip();
    $_SESSION['ip'] = $ip;

}
?>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Tutor</title>
    <link rel="stylesheet" href="../static/css/bootstrap.min.css">
    <link rel="stylesheet" href="../static/css/general.css">
    <script src="../static/js/jquery-2.2.4.min.js"></script>
    <script src="../static/js/bootstrap.min.js"></script>
    <script src="../static/js/valida.js"></script>
    
</head>
<body>
    <header class="logo">
        <img src="../static/img/logo.png" alt="logo" height="100px">
    </header>
    
    <section class="entrarC">
        <div class="row justify-content-md-center">
            <h2 class="titulo">Tutor <?php echo $_SESSION['usuario'] ?></h2>
        </div>
        <div class="row justify-content-md-center cartas">
            <div class="col-sm-5 ">
                <div class="card cartaTutor">
                    <div class="card-header">
                        Crear Grupos
                    </div>
                    <div class="card-body">
                        <h5 class="card-title">Creación de un nuevo grupo</h5><br>
                        <div class="txtb grupo">
                            <span for="nombre">Nombre del grupo</span><br>
                            <input type="text" name="nombre" id="nombre" onchange="compruebaD()" value="">
                        </div>

                        <div class="txtb grupo">
                            <span for="descripcion">Descripción</span><br>
                            <textarea name="descripcion" id="descripcion" onchange="compruebaD()" value=""></textarea>
                            
                        </div>
                        <div class="txtb grupo">
                            <span for="materia">Materia</span><br>
                            <select name="materia" id="materia">
                                <?php
                                $list = $obj->materias();
                                foreach($list as $row){
                                    echo "<option value='$row[0]'>$row[1]</option>";
                                }
                                ?>
                            </select>
                            
                        </div>
                        <button id="Rgrupo" class="btn btn-block btn-outline-success" disabled>Crear Grupo</button>
                        <p id="informacion"></p>
                    </div>
                </div>
            </div>
            <div class="col-sm-5" id="tablaGrupos">
                <div class="card cartaTutor ">
                    <div class="card-header">
                        Grupos asignados
                    </div>
                    <div class="card-body table-responsive">
                        
                        <table class="table table-hover table-bordered  table-striped">
                            <caption><h5 class="card-title">Listado de grupos a cargo</h5></caption>
                            <thead>
                                <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">NOMBRE</th>
                                    <th scope="col">MATERIA</th>
                                    <th scope="col">DESCRIPCION</th>
                                </tr>
                            </thead>
                            <tbody>
                                <?php
                                $list = $obj->gruposTutor($_SESSION['ip']);
                                $cont = 1;
                                foreach($list as $row){
                                    echo '<tr>';
                                    echo '<th scope="row">'.$cont.'</th>';
                                    echo '<td>'.$row[0].'</td>';
                                    echo '<td>'.$row[1].'</td>';
                                    echo '<td>'.$row[2].'</td>';
                                    echo '</tr>';
                                    $cont = $cont +1;
                                }
                                ?>
                                
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        <div class="row justify-content-md-center cartas">
            <div class="col-sm-4">
                <a class="btn btn-block btn-outline-success" href="./entrar.php">
                    Regresar
                </a>
            </div>
        </div>
        
    </section>
</body>
<script>
        $(document).on("ready", function() {
            enviarDatos();
            document.getElementById('RGrupo').disabled = true;
        });
        function enviarDatos() {
            $("#Rgrupo").on("click", function(e) {
                e.preventDefault();
                var materia = document.getElementById('materia').value;
                var nombre = document.getElementById('nombre').value;
                var descripcion = document.getElementById('descripcion').value;
                var parametros = {
                    "materia": materia,
                    "nombre": nombre,
                    "descripcion": descripcion
                };
                $.ajax({
                    "method": "POST",
                    "url": "../DAO/creaGrupo.php",
                    "data": parametros
                }).done(function(info) {
                    $("#nombre").val("");
                    $("#descripcion").val("");
                    $("#informacion").html(info);
                    $("#tablaGrupos").load("tablaGrupo.php")
                    .error(function() { alert("Error"); });
                });
            });
        }
        

    </script>
</html>