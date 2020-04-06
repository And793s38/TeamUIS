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
    <title>Entrar</title>
    <link rel="stylesheet" href="../static/css/bootstrap.min.css">
    <link rel="stylesheet" href="../static/css/general.css">
    <script src="../static/js/jquery-2.2.4.min.js"></script>
    <script src="../static/js/bootstrap.min.js"></script>
    
</head>
<body>
<div class="card cartaTutor ">
    <div class="card-header">
        Grupos asignados
    </div>
    <div class="card-body table-responsive">
        
        <table class="table table-hover table-bordered table-striped">
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
</body>