<?php
include '../DAO/conexionDB.php';
class Metodos
{
    public function compruebaIPE()
    {
        $cnx = new conexionDB();
        $conn = $cnx->getConexion();
        $query = "select * from Estudiante";
        $list = [];
        foreach ($conn->query($query) as $row){
            $list[] = $row;
        }

        return $list;
    }
    public function insertE($cod,$nom,$carre,$tel){
        $cnx = new conexionDB();
        $conn = $cnx->getConexion();
        $query = "insert into Estudiante(codigoE,nombre,carrera,telefono) values('$cod','$nom','$carre','$tel')";
        echo $query;
        $conn->query($query);
    }
    public function insertT($cod,$nom,$carre,$tel){
        $cnx = new conexionDB();
        $conn = $cnx->getConexion();
        $query = "insert into Tutor(codigoT,nombre,carrera,telefono) values('$cod','$nom','$carre','$tel')";
        $conn->query($query);
    }
    public function insertG($codG,$codT,$codM,$des,$nom){
        $cnx = new conexionDB();
        $conn = $cnx->getConexion();
        $query = "insert into Grupo(codigoG,codigoT,codigoM,descripcion,nombre) values('$codG','$codT','$codM','$des','$nom')";
        $conn->query($query);
    }
    public function insertGE($cod,$codE,$codG){
        $cnx = new conexionDB();
        $conn = $cnx->getConexion();
        $query = "insert into Grupos_Estudiantes(codigo,codigoE,codigoG) values('$cod','$codE','$codG')";
        $conn->query($query);
    }
    public function materias(){
        $cnx = new conexionDB();
        $conn = $cnx->getConexion();
        $query = "select * from Materia";
        $list = [];
        foreach ($conn->query($query) as $row){
            $list[] = $row;
        }
        return $list;
    }
    public function codGrupo(){
        $cnx = new conexionDB();
        $conn = $cnx->getConexion();
        $query = "select count(codigoG) from Grupo";
        $list = [];
        foreach ($conn->query($query) as $row){
            $list[] = $row;
        }
        foreach($list as $row){
            $codigo = $row[0] + 1;
        }
        return $codigo;
    }
    public function codGrupoE(){
        $cnx = new conexionDB();
        $conn = $cnx->getConexion();
        $query = "select count(codigoG) from Grupos_Estudiantes";
        $list = [];
        foreach ($conn->query($query) as $row){
            $list[] = $row;
        }
        foreach($list as $row){
            $codigo = $row[0] + 1;
        }
        return $codigo;
    }
    public function gruposTutor($id){
        $cnx = new conexionDB();
        $conn = $cnx->getConexion();
        $query = "select a.nombre,(select b.nombre from Materia as b where b.codigoM = a.codigoM),a.descripcion from Grupo as a where a.codigoT = '$id'";
        $list = [];
        foreach ($conn->query($query) as $row){
            $list[] = $row;
        }
        return $list;
    }
    public function gruposM($materia){
        $cnx = new conexionDB();
        $conn = $cnx->getConexion();
        $query = "select codigoG,nombre from Grupo where codigoM='$materia'";
        $list = [];
        foreach ($conn->query($query) as $row){
            $list[] = $row;
        }
        return $list;
    }
    public function gruposInfo($grupo){
        $cnx = new conexionDB();
        $conn = $cnx->getConexion();
        $query = "select a.descripcion,(select b.nombre from Tutor as b where b.codigoT = a.codigoT) from Grupo as a where a.codigoG='$grupo'";
        $list = [];
        foreach ($conn->query($query) as $row){
            $list[] = $row;
        }
        return $list;
    }
    public function gruposEstudio($id){
        $cnx = new conexionDB();
        $conn = $cnx->getConexion();
        $query = "select (select b.nombre from Grupo as b where b.codigoG = a.codigoG),(select (select c.nombre from Materia as c where c.codigoM = d.codigoM) from Grupo as d where d.codigoG=a.codigoG),(select b.descripcion from Grupo as b where b.codigoG=a.codigoG),(select (select c.nombre from Tutor as c where c.codigoT = d.codigoT) from Grupo as d where d.codigoG=a.codigoG) from Grupos_Estudiantes as a where a.codigoE='$id'";
        $list = [];
        foreach ($conn->query($query) as $row){
            $list[] = $row;
        }
        return $list;
    }
    
}
