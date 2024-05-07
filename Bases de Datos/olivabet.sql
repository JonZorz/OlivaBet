-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-05-2024 a las 11:54:25
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `olivabet`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `idEmpelado` int(11) NOT NULL,
  `nombreEmpleado` varchar(120) NOT NULL,
  `cargo` varchar(200) NOT NULL,
  `sueldo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `maquinas`
--

CREATE TABLE `maquinas` (
  `idMaquina` int(11) NOT NULL,
  `nombreMaquina` varchar(150) NOT NULL,
  `tematica` varchar(120) NOT NULL,
  `creditosMinimos` int(11) NOT NULL,
  `coste` int(11) NOT NULL,
  `id_Usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rakingusuarios`
--

CREATE TABLE `rakingusuarios` (
  `idusuarioRanking` int(11) NOT NULL,
  `id_Usuario` int(11) NOT NULL,
  `nombreUsuarioRanking` varchar(220) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL,
  `nombreUsuario` varchar(220) NOT NULL,
  `contrasena` text NOT NULL,
  `correoelectronico` text NOT NULL,
  `fecha_Alta` timestamp NOT NULL DEFAULT current_timestamp(),
  `IP_Registro` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `nombreUsuario`, `contrasena`, `correoelectronico`, `fecha_Alta`, `IP_Registro`) VALUES
(38, 'Carlos02', '1b004679a38444ae4b430c7004324ab4', 'carlos02@gmail.com', '2024-05-07 07:35:32', ' 192.168.1.12'),
(39, 'Gerard', 'e2ede96aac3148cf0e1f06bba6b40023', 'gerard@gmail.com', '2024-05-07 07:36:04', ' 192.168.1.12'),
(40, 'Santi', '60795e1235d40cebe8a127c3f71fd8f8', 'santiago@gmail.com', '2024-05-07 07:36:40', ' 192.168.1.12'),
(41, 'Aitor52', '902e3c762f6ae14290a1991f3c0ef66e', 'aitor1952@gmail.com', '2024-05-07 07:37:07', ' 192.168.1.12'),
(42, 'Sofia19', '16c6ec3fcaf21831c84a421b7ab5fac9', 'sofi012@gmail.com', '2024-05-07 07:37:45', ' 192.168.1.12'),
(43, 'Javier', 'd20ca763dbdca166f6810d14870ba55e', 'javitxin@gmail.com', '2024-05-07 07:38:07', ' 192.168.1.12'),
(44, 'Nicolas', '0204773b81142772f41d5a8f47ec53ea', 'nicolass@gmail.com', '2024-05-07 07:38:31', ' 192.168.1.12'),
(45, 'Pedro', '7fc0395f9785e36cdb50e269d109fa32', 'pedro24@gmail.com', '2024-05-07 07:38:50', ' 192.168.1.12'),
(46, 'Andres1', '4300f6cddd45ec5bcdf211dd266772d2', 'andres1@gmail.com', '2024-05-07 07:39:17', ' 192.168.1.12'),
(47, 'Diego', '759e12350fc357e029e2388b4e91cb76', 'diego0@gmail.com', '2024-05-07 07:39:47', ' 192.168.1.12');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`idEmpelado`);

--
-- Indices de la tabla `maquinas`
--
ALTER TABLE `maquinas`
  ADD PRIMARY KEY (`idMaquina`),
  ADD KEY `id_Usuario` (`id_Usuario`);

--
-- Indices de la tabla `rakingusuarios`
--
ALTER TABLE `rakingusuarios`
  ADD PRIMARY KEY (`idusuarioRanking`),
  ADD UNIQUE KEY `id_Usuario` (`id_Usuario`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `idEmpelado` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `maquinas`
--
ALTER TABLE `maquinas`
  MODIFY `idMaquina` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `rakingusuarios`
--
ALTER TABLE `rakingusuarios`
  MODIFY `idusuarioRanking` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `maquinas`
--
ALTER TABLE `maquinas`
  ADD CONSTRAINT `maquinas_ibfk_1` FOREIGN KEY (`id_Usuario`) REFERENCES `usuarios` (`idUsuario`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `rakingusuarios`
--
ALTER TABLE `rakingusuarios`
  ADD CONSTRAINT `rakingusuarios_ibfk_1` FOREIGN KEY (`id_Usuario`) REFERENCES `usuarios` (`idUsuario`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
