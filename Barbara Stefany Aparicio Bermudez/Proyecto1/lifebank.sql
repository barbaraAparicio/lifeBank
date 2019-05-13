-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-05-2019 a las 03:26:58
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `lifebank`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `beneficiario`
--

CREATE TABLE `beneficiario` (
  `dui_beneficiario` varchar(9) NOT NULL,
  `nombre_beneficiario` varchar(200) NOT NULL,
  `id_cuenta` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta`
--

CREATE TABLE `cuenta` (
  `id_cuenta` varchar(9) NOT NULL,
  `nombre_usuario` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentaben`
--

CREATE TABLE `cuentaben` (
  `id_cuentaben` varchar(9) NOT NULL,
  `id_beneficiario` varchar(9) NOT NULL,
  `banco` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(11) NOT NULL,
  `nombre_producto` varchar(50) NOT NULL,
  `monto` decimal(20,2) NOT NULL,
  `debt` decimal(20,2) NOT NULL,
  `disponible` decimal(20,2) NOT NULL,
  `limite` decimal(20,2) NOT NULL,
  `interes_acum` decimal(20,2) NOT NULL,
  `interes_tasa` decimal(4,2) NOT NULL,
  `dia_corte` int(11) NOT NULL,
  `id_cuenta` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productoben`
--

CREATE TABLE `productoben` (
  `id_productoben` int(11) NOT NULL,
  `nombre_producto` varchar(50) NOT NULL,
  `monto` decimal(20,2) NOT NULL,
  `dbt` decimal(20,2) NOT NULL,
  `disponible` decimal(20,2) NOT NULL,
  `limite` decimal(20,2) NOT NULL,
  `interes_acum` decimal(20,2) NOT NULL,
  `interes_tasa` decimal(4,2) NOT NULL,
  `dia_corte` int(11) NOT NULL,
  `id_cuentaben` varchar(9) NOT NULL,
  `debt` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transaccion`
--

CREATE TABLE `transaccion` (
  `id_transaccion` varchar(6) NOT NULL,
  `fecha` date NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `monto_tra` decimal(20,2) NOT NULL,
  `id_cuenta` varchar(9) NOT NULL,
  `id_producto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `nombre_cliente` varchar(200) NOT NULL,
  `nombre_usuario` varchar(20) NOT NULL,
  `password` varchar(200) NOT NULL,
  `estado` int(11) NOT NULL,
  `email` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`nombre_cliente`, `nombre_usuario`, `password`, `estado`, `email`) VALUES
('Barbara aparicio', 'barapa', '382e1286606bf81a611aa10b5abc6089933b28bd4d7c26fd526fa89afc4f4a8d47b2aace2f3036eadab746b290ca4fb833c1463775213a6544e612c57c28fe2d', 1, 'barbara@gmail.com'),
('Katherine Cabrera', 'Katy89', 'eb6b80062d94af6a756851efe2fa6d9867821f79cf151e7c040e6db499990ebb00e0703cc766ceefbb1c1e33572aa02ce36672ebf938d6d3c353b28091bcce21', 1, 'Katherine@gmail.com'),
('Mariana Vega', 'life2019', '689b34f16789619081d99a3a29e7db18bde391a85a6bf115b614ef53dea64683d18de063acdf73fad688dcdb64ea0bd8d44014683c24a407738f1204c49322ae', 1, 'vega@gmail.com'),
('Ricardo Bermudez', 'ricBermu', '9e90421c928b6847a6b689701be432b68d49e585c4c71a7bd397c712caf980ae887235841287849c37e22631b4661c1a5a6acd2d10f62d1b7a6c726c10557f61', 1, 'Ricardo@gmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `beneficiario`
--
ALTER TABLE `beneficiario`
  ADD PRIMARY KEY (`dui_beneficiario`),
  ADD KEY `id_cuenta` (`id_cuenta`);

--
-- Indices de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  ADD PRIMARY KEY (`id_cuenta`),
  ADD KEY `nombre_usuario` (`nombre_usuario`);

--
-- Indices de la tabla `cuentaben`
--
ALTER TABLE `cuentaben`
  ADD PRIMARY KEY (`id_cuentaben`),
  ADD KEY `id_beneficiario` (`id_beneficiario`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`),
  ADD KEY `id_cuenta` (`id_cuenta`),
  ADD KEY `nombre_producto` (`nombre_producto`);

--
-- Indices de la tabla `productoben`
--
ALTER TABLE `productoben`
  ADD PRIMARY KEY (`id_productoben`),
  ADD KEY `nombre_producto` (`nombre_producto`),
  ADD KEY `id_cuentaben` (`id_cuentaben`);

--
-- Indices de la tabla `transaccion`
--
ALTER TABLE `transaccion`
  ADD PRIMARY KEY (`id_transaccion`),
  ADD KEY `fecha` (`fecha`),
  ADD KEY `id_cuenta` (`id_cuenta`),
  ADD KEY `id_producto` (`id_producto`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`nombre_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `productoben`
--
ALTER TABLE `productoben`
  MODIFY `id_productoben` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `beneficiario`
--
ALTER TABLE `beneficiario`
  ADD CONSTRAINT `beneficiario_ibfk_1` FOREIGN KEY (`id_cuenta`) REFERENCES `cuenta` (`id_cuenta`);

--
-- Filtros para la tabla `cuenta`
--
ALTER TABLE `cuenta`
  ADD CONSTRAINT `cuenta_ibfk_1` FOREIGN KEY (`nombre_usuario`) REFERENCES `usuario` (`nombre_usuario`);

--
-- Filtros para la tabla `cuentaben`
--
ALTER TABLE `cuentaben`
  ADD CONSTRAINT `cuentaben_ibfk_1` FOREIGN KEY (`id_beneficiario`) REFERENCES `beneficiario` (`dui_beneficiario`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`id_cuenta`) REFERENCES `cuenta` (`id_cuenta`);

--
-- Filtros para la tabla `productoben`
--
ALTER TABLE `productoben`
  ADD CONSTRAINT `productoben_ibfk_1` FOREIGN KEY (`id_cuentaben`) REFERENCES `cuentaben` (`id_cuentaben`);

--
-- Filtros para la tabla `transaccion`
--
ALTER TABLE `transaccion`
  ADD CONSTRAINT `transaccion_ibfk_1` FOREIGN KEY (`id_cuenta`) REFERENCES `cuenta` (`id_cuenta`),
  ADD CONSTRAINT `transaccion_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
