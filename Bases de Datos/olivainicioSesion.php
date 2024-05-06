<?php
if ($_SERVER["REQUEST_METHOD"] == "GET") {
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "olivabet";

    $conn = new mysqli($servername, $username, $password, $dbname);

    if ($conn->connect_error) {
        die("Error de conexión: " . $conn->connect_error);
    }

    $nombreusuario = $_GET["nombreUsuario"];
    $contrasena = $_GET["contrasena"];
    $correoelectronico = $_GET["correoelectronico"];

    $encript = md5($contrasena);

    $sql = "SELECT nombreUsuario, contrasena, correoelectronico FROM usuarios WHERE nombreUsuario = '$nombreusuario' AND contrasena = '$encript' AND correoelectronico = '$correoelectronico'";

    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        echo "Felicidades, has iniciado sesión";
    } else {
        echo "Error al iniciar sesión: Usuario, Contraseña o Correo Electrónico incorrectos";
    }

    $conn->close();
}
?>
