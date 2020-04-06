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
    <title>Estudiante</title>
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
            <h2 class="titulo">Estudiante <?php echo $_SESSION['usuario'] ?></h2>
        </div>
        <div class="row justify-content-md-center cartas">
            <div class="col-sm-5 ">
                <div class="card cartaEstudiante">
                    <div class="card-header">
                        Incluir Grupos
                    </div>
                    <div class="card-body">
                        <h5 class="card-title">Inclusión de grupos de estudio</h5><br>
                        <div class="txtb grupo">
                            <span for="materia">Materia del grupo</span><br>
                            <select name="materia" id="materia">
                                <?php
                                $list = $obj->materias();
                                foreach($list as $row){
                                    echo "<option value='$row[0]'>$row[1]</option>";
                                }
                                ?>
                            </select>
                        </div>
                        <div class="txtb grupo">
                            <span for="grupo">Grupo</span><br>
                            <select name="grupo" id="grupo" onclick="activa()">
                            </select> 
                        </div>
                        <div class="txtb grupo">
                            <span for="tutor">Tutor a cargo</span><br>
                            <input type="text" id="tutor" name="tutor" disabled>
                        </div>
                        <div class="txtb grupo">
                            <span for="descripcion">Descripción</span><br>
                            <textarea id="descripcion" name="descripcion" disabled></textarea>
                        </div>
                        <button disabled id="Rgrupo" class="btn btn-block btn-outline-success">Incluir Grupo</button>
                        <p id="informacion"></p>
                    </div>
                </div>
            </div>
            <div class="col-sm-5" id="tablaGruposE">
                <div class="card cartaEstudiante ">
                    <div class="card-header">
                        Grupos de estudio 
                    </div>
                    <div class="card-body table-responsive">
                        
                        <table class="table table-hover table-bordered  table-striped">
                            <caption><h5 class="card-title">Listado de grupos de estudio</h5></caption>
                            <thead>
                                <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">NOMBRE</th>
                                    <th scope="col">MATERIA</th>
                                    <th scope="col">DESCRIPCION</th>
                                    <th scope="col">TUTOR</th>
                                </tr>
                            </thead>
                            <tbody>
                                <?php
                                $list = $obj->gruposEstudio($_SESSION['ip']);
                                $cont = 1;
                                foreach($list as $row){
                                    echo '<tr>';
                                    echo '<th scope="row">'.$cont.'</th>';
                                    echo '<td>'.$row[0].'</td>';
                                    echo '<td>'.$row[1].'</td>';
                                    echo '<td>'.$row[2].'</td>';
                                    echo '<td>'.$row[3].'</td>';
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
            llenaCombo();
            descripcion();
            tutor();
        });
        function enviarDatos() {
            $("#Rgrupo").on("click", function(e) {
                e.preventDefault();
                var grupo = document.getElementById('grupo').value;
                var parametros = {
                    "grupo": grupo
                };
                $.ajax({
                    "method": "POST",
                    "url": "../DAO/creaGrupoE.php",
                    "data": parametros
                }).done(function(info) {
                    $("#tutor").val("");
                    $("#descripcion").val("");
                    $("#informacion").html(info);
                    $("#tablaGruposE").load("tablaGrupoE.php")
                    .error(function() { alert("Error"); });
                });
            });
        }
        function llenaCombo() {
            $("#materia").on("click", function(e) {
                e.preventDefault();
                var materia = document.getElementById('materia').value;
                var parametros = {
                    "materia": materia
                };
                $.ajax({
                    "method": "POST",
                    "url": "../DAO/obtenerGrupos.php",
                    "data": parametros
                }).done(function(info) {
                    $('#grupo').empty();
		            $('#grupo').html(info);
                });
                
            });
        }
        function tutor() {
            $("#grupo").on("click", function(e) {
                e.preventDefault();
                var grupo = document.getElementById('grupo').value;
                var parametros = {
                    "grupo": grupo
                };
                $.ajax({
                    "method": "POST",
                    "url": "../DAO/obtenerTutor.php",
                    "data": parametros
                }).done(function(info) {
		            $('#tutor').val(info);
                });
            });
        }
        function descripcion() {
            $("#grupo").on("click", function(e) {
                e.preventDefault();
                var grupo = document.getElementById('grupo').value;
                var parametros = {
                    "grupo": grupo
                };
                $.ajax({
                    "method": "POST",
                    "url": "../DAO/obtenerDescripcion.php",
                    "data": parametros
                }).done(function(info) {
		            $('#descripcion').val(info);
                });
            });
        }
        

    </script>
</html>