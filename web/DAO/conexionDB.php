<?php
/**
 * Description of conexionDB
 *
 * @author Uribe
 */
class conexionDB {
public function getConexion(){
    try {
        $conn = new PDO("mysql:host=sql207.tonohost.com;dbname=ottos_25464508_teamuis","ottos_25464508","01111998");
        return $conn;
    } catch (Exception $exc) {
        echo $exc->getTraceAsString();
        return FALSE;
    }             
    }
    

    
}
