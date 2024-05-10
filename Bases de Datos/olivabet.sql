-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-05-2024 a las 17:27:16
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
  `coste` int(11) NOT NULL,
  `saldoMinimo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `maquinas`
--

INSERT INTO `maquinas` (`idMaquina`, `nombreMaquina`, `tematica`, `coste`, `saldoMinimo`) VALUES
(1, 'Slot Frutas', 'Frutas', 350, 350),
(2, 'Slot Animales', 'Animales', 350, 350),
(3, 'Slot Joyas', 'Joyas', 105, 8000),
(4, 'Slot Halloween', 'Halloween', 850, 15000),
(5, 'Slot Navidad', 'Navidad', 850, 15000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL,
  `nombreUsuario` varchar(220) NOT NULL,
  `contrasena` text NOT NULL,
  `correoelectronico` text NOT NULL,
  `puntos` int(11) NOT NULL,
  `fecha_Alta` timestamp NOT NULL DEFAULT current_timestamp(),
  `IP_Registro` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `nombreUsuario`, `contrasena`, `correoelectronico`, `puntos`, `fecha_Alta`, `IP_Registro`) VALUES
(72, 'Cristiano07', 'f7608826f9018f79799bb6bc20cb1b55', 'siusiu@hotmail.com', 77777, '2024-05-09 15:07:07', '156.67.8.2'),
(73, 'DavyJones23', '321ca6c23928968a61578c4396e23a8c', 'piratilla23@gmail.com', 435, '2024-05-09 15:08:09', '123.98.7.5'),
(74, 'LucasVazquez17', 'e99a1cabb25217e9c1c189081f4e2a0b', 'lucass17@hotmail.com', 6788, '2024-05-09 15:11:28', '181.20.23.3'),
(77, 'TomasShelby1800', '9c95eacbed3d8638597aa7aafc089202', 'shelby1@gmail.com', 9999, '2024-05-09 15:17:31', '127.67.43.9'),
(78, 'SaleguiAlejandro23', '30e24872067cfdd0b3c3365f3c822c57', 'rebollo76@gmail.eus', 3211, '2024-05-09 15:19:58', '::1');

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
  ADD PRIMARY KEY (`idMaquina`);

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
  MODIFY `idMaquina` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=79;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
