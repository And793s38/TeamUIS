	<?php
    include './DAO/conexionDB.php';
    session_start();
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
    $cnx = new conexionDB();
    $conn = $cnx->getConexion();
    $query = "select count(codigoE) from Estudiante where codigoE='$ip'";
    $list = [];
    foreach ($conn->query($query) as $row){
        $list[] = $row;
    }
    foreach($list as $row){
        $con1 = $row[0];
    }
    $query = "select count(codigoT) from Tutor where codigoT='$ip'";
    $list = [];
    foreach ($conn->query($query) as $row){
        $list[] = $row;
    }
    foreach($list as $row){
        $con2 = $row[0];
    }
    if(($con1!=0) || ($con2!=0)){
        $query = "select nombre from Estudiante where codigoE='$ip'";
        foreach ($conn->query($query) as $row){
            $list[] = $row;
        }
        foreach($list as $row){
            $nom = $row[0];
        }
        $_SESSION['usuario'] = $nom;
        header("location:./vistas/entrar.php");
    }
    else{
        header("location:./vistas/registro.php");
    }
    ?>