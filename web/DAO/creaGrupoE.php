<?php
include "./Metodos.php";
session_start();
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
extract($_POST);
$obj = new Metodos();
$cod = $obj->codGrupoE();
$obj->insertGE($cod,$_SESSION['ip'],$grupo);
echo "Grupo ingresado satisfactoriamente";

?>