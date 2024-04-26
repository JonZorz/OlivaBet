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
    $nombreusuarioweb = $_GET["nombreUsuarioWeb"];
    $contrasenausuarioweb = $_GET["contrasenaUsuarioWeb"];
    $correoelectronicousuarioweb = $_GET["correoelectronicoUsuarioWeb"];
    $id_usuario = $_GET["id_Usuario"];
    $id_usuario++;

    // Preparar la consulta SQL para la inserción
    $sql = "INSERT INTO usuariosweb ( nombreUsuarioWeb, contrasenaUsuarioWeb, correoelectronicoUsuarioWeb,id_Usuario)
            VALUES ( '$nombreusuarioweb', '$contrasenausuarioweb', '$correoelectronicousuarioweb','$id_usuario')";

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