<?php
// Archivo: olivaInsert.php

// Establecer conexión con la base de datos (reemplaza los valores con los de tu configuración)
$servername = "databaseolivabet.c7eigymywlgc.us-east-1.rds.amazonaws.com";
$username = "crupiermaestro";
$password = "sasamkdojojfaojjokefju9e";
$dbname = "olivabet";

// Crear conexión
$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Error de conexión: " . $conn->connect_error);
}

$nombreUsuario = $_GET['nombreUsuario'];
$contrasena = md5($_GET['contrasena']); // Aquí se encripta la contraseña con md5
$correoelectronico = $_GET['correoelectronico'];
$puntos = 5000;

$ip = $_SERVER['REMOTE_ADDR'];

// Preparar la sentencia SQL para la inserción
$sql = "INSERT INTO usuarios (nombreUsuario, contrasena, correoelectronico, puntos, IP_Registro) 
        VALUES ('$nombreUsuario', '$contrasena', '$correoelectronico', $puntos, '$ip')";


if ($conn->query($sql) === TRUE) {
    echo "Usuario registrado correctamente." . $_SESSION['usuario'] = $nombreUsuario;
} else {
    echo "Error al registrar el usuario: " . $conn->error;
}
header("Location:cuenta.php");

// Cerrar la conexión
$conn->close();
?>
