-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-03-2023 a las 12:48:48
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `booking`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `booking`
--

CREATE TABLE `booking` (
  `IDHABITACION` decimal(3,0) NOT NULL,
  `RESERVA` decimal(3,0) NOT NULL,
  `IDUSUARIO` decimal(3,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `IDHABITACION` decimal(3,0) NOT NULL,
  `NUMERO` decimal(4,0) DEFAULT NULL,
  `DESCRIPCION` varchar(200) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `IDHOTEL` decimal(10,0) DEFAULT NULL,
  `CAPACIDAD` decimal(2,0) DEFAULT NULL,
  `PRECIO` decimal(4,0) DEFAULT NULL,
  `Disponible` varchar(1) COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`IDHABITACION`, `NUMERO`, `DESCRIPCION`, `IDHOTEL`, `CAPACIDAD`, `PRECIO`, `Disponible`) VALUES
('1', '101', 'Habitacion Estandar', '9', '2', '30', 'V'),
('2', '102', 'Habitación Estándar', '9', '3', '35', 'V'),
('3', '799', 'Suite Principal', '9', '2', '120', 'V'),
('4', '103', 'Habitación Estándar', '9', '3', '35', 'F'),
('5', '104', 'Habitación Estándar', '9', '3', '35', 'F'),
('6', '201', 'Habitación con yacusi ', '3', '2', '45', 'V');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hotel`
--

CREATE TABLE `hotel` (
  `IDHOTEL` decimal(3,0) NOT NULL,
  `NOMBRE` varchar(75) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `DESCRIPCION` varchar(200) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `CIUDAD` varchar(50) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `PAIS` varchar(50) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `RATE` decimal(2,0) DEFAULT NULL,
  `Reservas` decimal(10,0) DEFAULT NULL,
  `IMG` mediumtext COLLATE utf8_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `hotel`
--

INSERT INTO `hotel` (`IDHOTEL`, `NOMBRE`, `DESCRIPCION`, `CIUDAD`, `PAIS`, `RATE`, `Reservas`, `IMG`) VALUES
('1', 'Boston', 'Hotel de Zaragoza con mucha antiguedad', 'Zaragoza', 'España', '78', '97', 'https://www.viajeselcorteingles.es/imagenes/hoteles/espana/zaragoza/ca48xcyc/1_x.jpg'),
('2', 'Goya', 'centro de zgz', 'Zaragoza', 'España', '66', '12', 'https://media-cdn.tripadvisor.com/media/photo-s/08/e8/27/11/hotel-goya.jpg'),
('3', 'Hotel Budapest', 'Gran hotel', 'Budapest', 'Hungria', '99', '350', 'https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/gran-hotel-budapest-cartel-1513779850.jpg'),
('4', 'Hotel Fontana', 'Hotel italiano', 'Roma', 'Italia', '89', '124', 'https://media-cdn.tripadvisor.com/media/photo-s/18/7b/c6/44/hotel-fontana.jpg'),
('5', 'Papiro', 'Hotel de Zaragoza con mucha diversion', 'Zaragoza', 'España', '31', '8', 'https://estaticos-cdn.prensaiberica.es/clip/2f56047f-48d6-450e-ba86-672fca1b8afc_16-9-aspect-ratio_default_0.jpg'),
('6', 'Hotel Croissants', 'Hotel en el centro de Paris', 'Paris', 'Francia', '71', '189', 'https://content.r9cdn.net/himg/62/c0/84/ice-85676218-68620422_3XL-430714.jpg'),
('7', 'Leblanc', 'Hotel prestigioso navideño', 'Andorra', 'Andorra', '92', '187', 'https://q-xx.bstatic.com/xdata/images/hotel/max1024x768/413661595.jpg?k=14717efac8e3190c9c2019c829c6e0894e644721a19e949ed9c3dbf0a2e2010f&o='),
('8', 'Hotel Mariusk', 'Hotel de prestigiosa calida en Polonia', 'Varsovia', 'Polonia', '43', '24', 'https://fotos.perfil.com/2013/06/01/trim/1280/720/hotel-viena.jpg'),
('9', 'Gabo Hotel', 'Gabo', 'Gabocity', 'Gabolandia', '99', '760', 'https://www.mundodeportivo.com/files/og_thumbnail/uploads/2018/05/23/60e7400cbed17.jpeg'),
('10', 'Monkey Island', 'Hotel pariadisiaco', 'Maldivas', 'Islas Maldivas', '93', '130', 'https://cnnespanol.cnn.com/wp-content/uploads/2021/06/2F210610151521-splurge-hotel-soneva-jani-super-tease.jpg?quality=100&strip=info'),
('11', 'Plaza Paraiso', 'Hotel de Zaragoza central en plaza paraiso', 'Zaragoza', 'España', '62', '59', 'https://res.cloudinary.com/lastminute/image/upload/c_scale,w_630/q_auto/v1675736397/thbvs7yhukk3rmmurrdg.jpg'),
('12', 'Hotel Heccehomo', 'Hotel muy feo', 'Borja', 'España', '9', '26', 'https://images.trvl-media.com/lodging/1000000/920000/913300/913230/50455e0f_w.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `IDUSUARIO` decimal(3,0) NOT NULL,
  `NOMBRE` varchar(75) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `APELLIDO` varchar(75) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  `CORREA` varchar(100) COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`RESERVA`,`IDHABITACION`),
  ADD KEY `FK_BOOKING_HOTEL` (`IDUSUARIO`),
  ADD KEY `FK_BOOKING_HABITACION` (`IDHABITACION`);

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`IDHABITACION`);

--
-- Indices de la tabla `hotel`
--
ALTER TABLE `hotel`
  ADD PRIMARY KEY (`IDHOTEL`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`IDUSUARIO`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `booking`
--
ALTER TABLE `booking`
  ADD CONSTRAINT `FK_BOOKING_HABITACION` FOREIGN KEY (`IDHABITACION`) REFERENCES `habitacion` (`IDHABITACION`),
  ADD CONSTRAINT `FK_BOOKING_HOTEL` FOREIGN KEY (`IDUSUARIO`) REFERENCES `usuario` (`IDUSUARIO`);

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `FK_HOTEL` FOREIGN KEY (`IDHOTEL`) REFERENCES `hotel` (`IDHOTEL`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
