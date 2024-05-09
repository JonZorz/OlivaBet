<?php

// Verificar si se reciben los datos del formulario
if ($_SERVER["REQUEST_METHOD"] == "GET") {
    // Establecer conexión a la base de datos (ajusta los parámetros según tu configuración)
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "olivabet";

    $conn = new mysqli($servername, $username, $password, $dbname);

    // Obtener valores del formulario
    $nombreusuario = $_GET["nombreUsuario"];
    $contrasena = $_GET["contrasena"];
    $correoelectronico = $_GET["correoelectronico"];

    $str = $contrasena;
    $encript =  md5($str);

    $ip = $_SERVER['REMOTE_ADDR'];




    // Preparar la consulta SQL para la inserción
    $sql = "INSERT INTO usuarios (nombreUsuario, contrasena, correoelectronico,IP_Registro)
            VALUES ('$nombreusuario', '$encript', '$correoelectronico',' $ip')";
      
    // Ejecutar la consulta
    if ($conn->query($sql) === TRUE) {
        echo "Registro insertado correctamente";
    } else {
        echo "Error al insertar el registro: " . $conn->error;
    }

    // Cerrar la conexión a la base de datos
    $conn->close();
}
?>