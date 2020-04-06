<?php
include "./Metodos.php";
session_start();
extract($_POST);
$obj = new Metodos();
$list = $obj->gruposM($materia);
foreach($list as $row){
    echo "<option value='$row[0]'>$row[1]</option>";
}
?>