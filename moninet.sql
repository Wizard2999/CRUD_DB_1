-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-07-2023 a las 19:07:57
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
-- Base de datos: `moninet`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `IdCliete` varchar(4) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Cedula` varchar(10) NOT NULL,
  `Direccion` varchar(40) DEFAULT NULL,
  `Telefono` varchar(12) DEFAULT NULL,
  `Correo` varchar(50) DEFAULT NULL,
  `contrato` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`IdCliete`, `Nombre`, `Cedula`, `Direccion`, `Telefono`, `Correo`, `contrato`) VALUES
('001', 'Fernando', '9584361', 'Lorica', '3244567890', 'ExampleF@gmail.com', ''),
('002', 'Juan', '8964273', 'Moñitos', '3215678909', 'Example2@hotmail.com', ''),
('003', 'Enrique', '3657912', 'Broqueles', '3224576080', 'Lenrique22@gmail.com', ''),
('004', 'Albertoo', ' 5281349', 'San Bernardo', ' 3498764523', ' Malbert@yahoo.com', ''),
('005', 'Manuel', '6928175', 'El Ley', '3456789012', 'Tgirnael32@gmail.com', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contrato`
--

CREATE TABLE `contrato` (
  `IdContrato` varchar(12) NOT NULL,
  `IdPaquete` varchar(20) NOT NULL,
  `Fecha_inicio` varchar(10) DEFAULT NULL,
  `Fecha_finalizacion` varchar(10) DEFAULT NULL,
  `Estadoo` varchar(10) DEFAULT NULL,
  `IdCliete` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `contrato`
--

INSERT INTO `contrato` (`IdContrato`, `IdPaquete`, `Fecha_inicio`, `Fecha_finalizacion`, `Estadoo`, `IdCliete`) VALUES
('254629461', 'Plan alto', '22/11/2022', '', 'Activo', ''),
('315132658', 'Plan alto', '19/12/2022', '8/03/2023', 'Inactivo', ''),
('513949105', 'Plan Ultra', '06/03/2023', '01/06/2023', 'Inactivo', ''),
('550698823', 'Plan basico', '13/12/2022', '', 'Activo', ''),
('87075196', 'Plan basico', '01/01/2023', '', 'Activo', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagos`
--

CREATE TABLE `pagos` (
  `IdPagos` varchar(12) NOT NULL,
  `IdContrato` varchar(12) NOT NULL,
  `Monto` varchar(20) NOT NULL,
  `Fecha_pago` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pagos`
--

INSERT INTO `pagos` (`IdPagos`, `IdContrato`, `Monto`, `Fecha_pago`) VALUES
('1750685623', '550698823', '$67.860,00', '14/06/2023'),
('52410875', '87075196', '$67.860,00', '02/06/2023'),
('581422670', '254629461', '$124.010,00', '12/06/2023');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paquetes_internet`
--

CREATE TABLE `paquetes_internet` (
  `IdPaquete` varchar(20) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Velocidad` varchar(3) NOT NULL,
  `Precio_mensual` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paquetes_internet`
--

INSERT INTO `paquetes_internet` (`IdPaquete`, `Nombre`, `Velocidad`, `Precio_mensual`) VALUES
('1231243592', 'Plan ultra', '012', '$221.590,00'),
('23718339', 'Plan basico', '005', '$67.860,00'),
('71995817', 'Plan alto', '008', '$124.010,00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `soporte_tecnico`
--

CREATE TABLE `soporte_tecnico` (
  `IdTicket` varchar(12) NOT NULL,
  `IdContrato` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `soporte_tecnico`
--

INSERT INTO `soporte_tecnico` (`IdTicket`, `IdContrato`) VALUES
('1574720511', '87075196'),
('505858082', '550698823');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`IdCliete`);

--
-- Indices de la tabla `contrato`
--
ALTER TABLE `contrato`
  ADD PRIMARY KEY (`IdContrato`);

--
-- Indices de la tabla `pagos`
--
ALTER TABLE `pagos`
  ADD PRIMARY KEY (`IdPagos`);

--
-- Indices de la tabla `paquetes_internet`
--
ALTER TABLE `paquetes_internet`
  ADD PRIMARY KEY (`IdPaquete`);

--
-- Indices de la tabla `soporte_tecnico`
--
ALTER TABLE `soporte_tecnico`
  ADD PRIMARY KEY (`IdTicket`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
