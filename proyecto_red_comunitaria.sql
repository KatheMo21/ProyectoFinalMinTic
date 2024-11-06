-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-11-2024 a las 18:31:15
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto_red_comunitaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `emprendedor`
--

CREATE TABLE `emprendedor` (
  `id_emprendedor` int(10) NOT NULL,
  `id_pais_nacimiento` int(10) DEFAULT NULL,
  `id_usuario` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `edad` varchar(100) NOT NULL,
  `genero` varchar(100) NOT NULL,
  `profesion` varchar(100) NOT NULL,
  `anio_nacimiento` varchar(100) NOT NULL,
  `mes_nacimiento` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `emprendedor`
--

INSERT INTO `emprendedor` (`id_emprendedor`, `id_pais_nacimiento`, `id_usuario`, `nombre`, `apellido`, `edad`, `genero`, `profesion`, `anio_nacimiento`, `mes_nacimiento`) VALUES
(2, 1, 5, 'Katherin', 'Monroy', '27', 'Femenino', 'Administradora de Empresa', '1997', '04');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gestiondeinformacion`
--

CREATE TABLE `gestiondeinformacion` (
  `id_gestion` int(10) NOT NULL,
  `id_proyecto` int(11) DEFAULT NULL,
  `fecha_generacion` varchar(100) NOT NULL,
  `id_emprendedor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `gestiondeinformacion`
--

INSERT INTO `gestiondeinformacion` (`id_gestion`, `id_proyecto`, `fecha_generacion`, `id_emprendedor`) VALUES
(1, 2, '2024-11-06', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pais`
--

CREATE TABLE `pais` (
  `id_pais` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `estado` varchar(100) NOT NULL,
  `poblacion` double NOT NULL,
  `ciudad` varchar(100) NOT NULL,
  `region` varchar(100) NOT NULL,
  `latitud` varchar(100) NOT NULL,
  `longitud` varchar(100) NOT NULL,
  `calificacion_riesgo` varchar(10) NOT NULL,
  `tasa_impuesto` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pais`
--

INSERT INTO `pais` (`id_pais`, `nombre`, `estado`, `poblacion`, `ciudad`, `region`, `latitud`, `longitud`, `calificacion_riesgo`, `tasa_impuesto`) VALUES
(1, 'Colombia', 'Caldas', 40000, 'Manizales', 'Norte', '13', '28', 'AAAA', 13),
(2, 'Portugal', 'Local', 1200000, 'Lisboa', 'Norte', '15', '26', 'BBB-', 15);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyecto`
--

CREATE TABLE `proyecto` (
  `id_proyecto` int(10) NOT NULL,
  `id_emprendedor` int(10) DEFAULT NULL,
  `id_pais_creacion` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `sector_industrial` varchar(100) NOT NULL,
  `avaluo_proyecto` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proyecto`
--

INSERT INTO `proyecto` (`id_proyecto`, `id_emprendedor`, `id_pais_creacion`, `nombre`, `sector_industrial`, `avaluo_proyecto`) VALUES
(2, 2, 1, 'Intensionadamente', 'Manufactura y Bisutería', 5000000);

--
-- Disparadores `proyecto`
--
DELIMITER $$
CREATE TRIGGER `INSERTA_GESTION` AFTER INSERT ON `proyecto` FOR EACH ROW BEGIN
	SET @fecha=CONVERT(CURRENT_DATE(), CHAR);
	INSERT INTO gestiondeinformacion (id_proyecto,fecha_generacion,id_emprendedor)
    VALUES (NEW.id_proyecto,@fecha,NEW.id_emprendedor);
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(10) NOT NULL,
  `nombre_usuario` varchar(100) NOT NULL,
  `contrasenia` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `nombre_usuario`, `contrasenia`) VALUES
(5, 'kathe12', 'Kathe3455'),
(6, 'lfalzateo', 'Alzate95');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `emprendedor`
--
ALTER TABLE `emprendedor`
  ADD PRIMARY KEY (`id_emprendedor`),
  ADD KEY `id_pais` (`id_pais_nacimiento`),
  ADD KEY `fk_id_usuario` (`id_usuario`);

--
-- Indices de la tabla `gestiondeinformacion`
--
ALTER TABLE `gestiondeinformacion`
  ADD PRIMARY KEY (`id_gestion`),
  ADD KEY `id_proyecto` (`id_proyecto`),
  ADD KEY `fk_id_emprendedor` (`id_emprendedor`);

--
-- Indices de la tabla `pais`
--
ALTER TABLE `pais`
  ADD PRIMARY KEY (`id_pais`);

--
-- Indices de la tabla `proyecto`
--
ALTER TABLE `proyecto`
  ADD PRIMARY KEY (`id_proyecto`),
  ADD KEY `id_emprendedor` (`id_emprendedor`),
  ADD KEY `fk_id_pais_creacion` (`id_pais_creacion`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `emprendedor`
--
ALTER TABLE `emprendedor`
  MODIFY `id_emprendedor` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `gestiondeinformacion`
--
ALTER TABLE `gestiondeinformacion`
  MODIFY `id_gestion` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `pais`
--
ALTER TABLE `pais`
  MODIFY `id_pais` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `proyecto`
--
ALTER TABLE `proyecto`
  MODIFY `id_proyecto` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `emprendedor`
--
ALTER TABLE `emprendedor`
  ADD CONSTRAINT `emprendedor_ibfk_1` FOREIGN KEY (`id_pais_nacimiento`) REFERENCES `pais` (`id_pais`),
  ADD CONSTRAINT `fk_id_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`);

--
-- Filtros para la tabla `gestiondeinformacion`
--
ALTER TABLE `gestiondeinformacion`
  ADD CONSTRAINT `fk_id_emprendedor` FOREIGN KEY (`id_emprendedor`) REFERENCES `emprendedor` (`id_emprendedor`),
  ADD CONSTRAINT `gestiondeinformacion_ibfk_2` FOREIGN KEY (`id_proyecto`) REFERENCES `proyecto` (`id_proyecto`);

--
-- Filtros para la tabla `proyecto`
--
ALTER TABLE `proyecto`
  ADD CONSTRAINT `fk_id_pais_creacion` FOREIGN KEY (`id_pais_creacion`) REFERENCES `pais` (`id_pais`),
  ADD CONSTRAINT `proyecto_ibfk_1` FOREIGN KEY (`id_emprendedor`) REFERENCES `emprendedor` (`id_emprendedor`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
