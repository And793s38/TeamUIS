<?php
include "./Metodos.php";
session_start();
extract($_POST);
$obj = new Metodos();
$list = $obj->gruposInfo($grupo);
foreach($list as $row){
    echo $row[0];
}
?>