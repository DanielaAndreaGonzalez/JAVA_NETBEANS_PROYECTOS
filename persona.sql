CREATE DATABASE  IF NOT EXISTS `persona` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `persona`;
-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: persona
-- ------------------------------------------------------
-- Server version	5.6.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ciudad`
--

DROP TABLE IF EXISTS `ciudad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ciudad` (
  `id` int(11) NOT NULL,
  `descrip` varchar(20) DEFAULT NULL,
  `depto` int(11) DEFAULT NULL,
  `nombre` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `depto` (`depto`),
  CONSTRAINT `ciudad_ibfk_1` FOREIGN KEY (`depto`) REFERENCES `dpto` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ciudad`
--

LOCK TABLES `ciudad` WRITE;
/*!40000 ALTER TABLE `ciudad` DISABLE KEYS */;
INSERT INTO `ciudad` VALUES (1,'Ca',24,'Caicedonia'),(2,'Ne',13,'Neiva'),(3,'Se',24,'Sevilla'),(4,'Ma',6,'Manizales'),(5,'Me',1,'Medellin'),(6,'Za',24,'Zarzal');
/*!40000 ALTER TABLE `ciudad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `datosacademicos`
--

DROP TABLE IF EXISTS `datosacademicos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `datosacademicos` (
  `id` int(11) NOT NULL,
  `titulo` varchar(30) DEFAULT NULL,
  `fechatitulo` date DEFAULT NULL,
  `institucion` int(11) DEFAULT NULL,
  `tiempoduracion` int(11) DEFAULT NULL,
  `tipotitulo` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `institucion` (`institucion`),
  KEY `tipotitulo` (`tipotitulo`),
  CONSTRAINT `datosacademicos_ibfk_1` FOREIGN KEY (`institucion`) REFERENCES `institucion` (`id`),
  CONSTRAINT `datosacademicos_ibfk_2` FOREIGN KEY (`tipotitulo`) REFERENCES `titulo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datosacademicos`
--

LOCK TABLES `datosacademicos` WRITE;
/*!40000 ALTER TABLE `datosacademicos` DISABLE KEYS */;
INSERT INTO `datosacademicos` VALUES (1003818316,'Bachiller Tecnico en Sist.Agro','2016-11-02',3,6,2),(1007412059,'Bachiller Academico','2015-11-28',6,6,1),(1113311486,'Bachiller Academico','2012-12-14',4,6,1),(1113311966,'Bachiller Academico','2014-12-04',4,6,1),(1113314038,'Bachiller Academico','2015-12-02',5,6,1),(1113314319,'Bachiller Academico','2016-12-04',7,6,1),(1115189123,'Bachiller Academico','2011-12-03',1,6,1),(1115193806,'Bachiller Academico','2014-12-05',1,6,1),(1115194072,'Bachiller Academico','2014-12-14',2,6,1),(1115194804,'Bachiller Academico','2015-12-04',2,6,1),(1115194822,'Bachiller Tecnico en recursosn','2016-12-02',2,6,2),(1115195022,'Bachiller Academico','2016-12-03',1,6,1),(2147483647,'Bachiller Academico','2015-12-19',1,6,1);
/*!40000 ALTER TABLE `datosacademicos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `datosbasicos`
--

DROP TABLE IF EXISTS `datosbasicos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `datosbasicos` (
  `id` int(11) NOT NULL DEFAULT '0',
  `nombre` varchar(50) DEFAULT NULL,
  `apellido` varchar(50) DEFAULT NULL,
  `fechanaci` date DEFAULT NULL,
  `lugarnaci` int(11) DEFAULT NULL,
  `movil` int(11) DEFAULT NULL,
  `correo` varchar(30) DEFAULT NULL,
  `direccion` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `lugarnaci` (`lugarnaci`),
  CONSTRAINT `datosbasicos_ibfk_1` FOREIGN KEY (`lugarnaci`) REFERENCES `ciudad` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datosbasicos`
--

LOCK TABLES `datosbasicos` WRITE;
/*!40000 ALTER TABLE `datosbasicos` DISABLE KEYS */;
INSERT INTO `datosbasicos` VALUES (1003818316,'Kevin Santiago','Narvaez Vera','2000-05-19',2,2147483647,'narvaez.vera@correounivalle.ed','Calle 51#23-4'),(1007412059,'Karen Dayana','Rendon','1999-11-26',5,2147483647,'rendon@correounivalle.edu.co','Carrera 14#4-47'),(1113311486,'Andres Felipe','Hurtado Lozano','1995-12-03',3,2147483647,'andres.hurtado@correounivalle.','Calle 55#46-34'),(1113311966,'Daniel','Lizarazo Sastoque','1996-07-13',3,2147483647,'daniel.lizarazo@correounivalle','Carrera 57#57-02'),(1113314038,'Jenifer','Sanchez Arango','1999-03-21',3,2147483647,'jenifer.sanchez@correounivalle','Carrera 57#67-21'),(1113314319,'Sebastian','Meneses Rendon','1999-08-16',3,2147483647,'meneses.sebastian@correounival','Calle 11#13-17'),(1115189123,'Natalia','Acevedo Grajales','1992-06-20',4,2147483647,'natalia.acevedo@correounivalle','Calle 17#18-44'),(1115193806,'Aura Liliana','Izquierdo Castillo','1997-11-09',1,2147483647,'aura.izquierdo@correounivalle.','Calle 14#12-50'),(1115194072,'Diego Alexander','Gomez Ramirez','1998-12-02',1,2147483647,'diego.gomez@correounivalle.edu','Calle 8#16-42'),(1115194804,'Lizet Carolina','Gallego','1999-03-25',1,2147483647,'liset.gallego@correounivalle.e','Carrera 16#15-30'),(1115194822,'Alexandra','Piedrahita Cardona','1999-04-04',1,2147483647,'piedrahita.alexandra@correouni','Calle 11-A #5-20'),(1115195022,'Daniela Andrea','Gonzalez Henao','1999-07-24',6,2147483647,'daniela.gonzalez@correounivall','Calle 12#8-37'),(2147483647,'Juan Camilo','Hoyos','1998-08-06',1,2147483647,'juan.henao@correounivalle.edu.','Carrera 16 # 10-54');
/*!40000 ALTER TABLE `datosbasicos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `datoslaboral`
--

DROP TABLE IF EXISTS `datoslaboral`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `datoslaboral` (
  `id` int(11) NOT NULL,
  `cargo` varchar(30) DEFAULT NULL,
  `fechaing` date DEFAULT NULL,
  `fechafin` date DEFAULT NULL,
  `empresa` varchar(30) DEFAULT NULL,
  `motivoreti` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datoslaboral`
--

LOCK TABLES `datoslaboral` WRITE;
/*!40000 ALTER TABLE `datoslaboral` DISABLE KEYS */;
INSERT INTO `datoslaboral` VALUES (1003818316,'null','0000-00-00','0000-00-00','null','null'),(1007412059,'Empleada','2017-12-13','2018-05-20','LA Jarrada','Fin Contrato'),(1113311486,'Operario Aseo','2016-07-01','2016-12-30','Casalimpia SA','Fin contrato'),(1113311966,'null','0000-00-00','0000-00-00','null','null'),(1113314038,'Mesera','2019-03-01','2019-11-08','Producto Jardin','No Aplica'),(1113314319,'null','0000-00-00','0000-00-00','null','null'),(1115189123,'ADministradora','2012-12-31','2015-12-31','Heladeria Caprichos','Viaje'),(1115193806,'Empleada','2017-06-09','2018-03-10','Velones Divinos Arcangeles','Fin Contrato'),(1115194072,'Vendedor','2016-09-01','0000-00-00','La Feria del Calzado','Fin Contrato'),(1115194804,'Empleada','2018-06-02','2019-05-01','Kiosko Vive Digital','Fin Contrato'),(1115194822,'Mesera','2017-04-13','2017-07-28','Panaderia La Feria','Oportu Laboral'),(1115195022,'null','0000-00-00','0000-00-00','null','null'),(2147483647,'Empleado','2015-12-01','2019-11-30','Vidrieria Popular','No Aplica');
/*!40000 ALTER TABLE `datoslaboral` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dpto`
--

DROP TABLE IF EXISTS `dpto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dpto` (
  `id` int(11) NOT NULL,
  `descrip` varchar(20) DEFAULT NULL,
  `pais` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `pais` (`pais`),
  CONSTRAINT `dpto_ibfk_1` FOREIGN KEY (`pais`) REFERENCES `pais` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dpto`
--

LOCK TABLES `dpto` WRITE;
/*!40000 ALTER TABLE `dpto` DISABLE KEYS */;
INSERT INTO `dpto` VALUES (1,'Antioquia',52),(2,'Atlantico',52),(3,'D. C. Santa Fe de Bo',52),(4,'Bolivar',52),(5,'Boyaca',52),(6,'Caldas',52),(7,'Caqueta',52),(8,'Cauca',52),(9,'Cesar',52),(10,'Cordova',52),(11,'Cundinamarca',52),(12,'Choco',52),(13,'Huila',52),(14,'La Guajira',52),(15,'Magdalena',52),(16,'Meta',52),(17,'Nariño',52),(18,'Norte de Santander',52),(19,'Quindio',52),(20,'Risaralda',52),(21,'Santander',52),(22,'Sucre',52),(23,'Tolima',52),(24,'Valle',52),(25,'Arauca',52),(26,'Casanare',52),(27,'Putumayo',52),(28,'San Andres',52),(29,'Amazonas',52),(30,'Guainia',52),(31,'Guaviare',52),(32,'Vaupes',52),(33,'Vichada',52);
/*!40000 ALTER TABLE `dpto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `institucion`
--

DROP TABLE IF EXISTS `institucion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `institucion` (
  `id` int(11) NOT NULL,
  `descrip` varchar(20) DEFAULT NULL,
  `localidad` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `institucion`
--

LOCK TABLES `institucion` WRITE;
/*!40000 ALTER TABLE `institucion` DISABLE KEYS */;
INSERT INTO `institucion` VALUES (1,'Ins. Educ. Normal su','NS'),(2,'Ins. Educ. Bolivaria','B'),(3,'Ins. Educ. Agropecua','AG'),(4,'Ins.Ed General Santa','GS'),(5,'Ins.Ed Liceo Mixto S','LM'),(6,'Ins.Ed Luis Granada ','LG'),(7,'Ins.Ed Heraclio Urib','HU');
/*!40000 ALTER TABLE `institucion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pais`
--

DROP TABLE IF EXISTS `pais`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pais` (
  `id` int(11) NOT NULL,
  `descrip` varchar(20) DEFAULT NULL,
  `nombre` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pais`
--

LOCK TABLES `pais` WRITE;
/*!40000 ALTER TABLE `pais` DISABLE KEYS */;
INSERT INTO `pais` VALUES (1,'AF','Afganistán'),(2,'AX','Islas Gland'),(3,'AL','Albania'),(4,'DE','Alemania'),(5,'AD','Andorra'),(6,'AO','Angola'),(7,'AI','Anguilla'),(8,'AQ','Antártida'),(9,'AG','Antigua y Barbuda'),(10,'AN','Antillas Holandesas'),(11,'SA','Arabia Saudí'),(12,'DZ','Argelia'),(13,'AR','Argentina'),(14,'AM','Armenia'),(15,'AW','Aruba'),(16,'AU','Australia'),(17,'AT','Austria'),(18,'AZ','Azerbaiyán'),(19,'BS','Bahamas'),(20,'BH','Bahréin'),(21,'BD','Bangladesh'),(22,'BB','Barbados'),(23,'BY','Bielorrusia'),(24,'BE','Bélgica'),(25,'BZ','Belice'),(26,'BJ','Benin'),(27,'BM','Bermudas'),(28,'BT','Bhután'),(29,'BO','Bolivia'),(30,'BA','Bosnia y Herzegovina'),(31,'BW','Botsuana'),(32,'BV','Isla Bouvet'),(33,'BR','Brasil'),(34,'BN','Brunéi'),(35,'BG','Bulgaria'),(36,'BF','Burkina Faso'),(37,'BI','Burundi'),(38,'CV','Cabo Verde'),(39,'KY','Islas Caimán'),(40,'KH','Camboya'),(41,'CM','Camerún'),(42,'CA','Canadá'),(43,'CF','República Centroafricana'),(44,'TD','Chad'),(45,'CZ','República Checa'),(46,'CL','Chile'),(47,'CN','China'),(48,'CY','Chipre'),(49,'CX','Isla de Navidad'),(50,'VA','Ciudad del Vaticano'),(51,'CC','Islas Cocos'),(52,'CO','Colombia'),(53,'KM','Comoras'),(54,'CD','República Democrática del Cong'),(55,'CG','Congo'),(56,'CK','Islas Cook'),(57,'KP','Corea del Norte'),(58,'KR','Corea del Sur'),(59,'CI','Costa de Marfil'),(60,'CR','Costa Rica'),(61,'HR','Croacia'),(62,'CU','Cuba'),(63,'DK','Dinamarca'),(64,'DM','Dominica'),(65,'DO','República Dominicana'),(66,'EC','Ecuador'),(67,'EG','Egipto'),(68,'SV','El Salvador'),(69,'AE','Emiratos Árabes Unidos'),(70,'ER','Eritrea'),(71,'SK','Eslovaquia'),(72,'SI','Eslovenia'),(73,'ES','España'),(74,'UM','Islas ultramarinas de Estados '),(75,'US','Estados Unidos'),(76,'EE','Estonia'),(77,'ET','Etiopía'),(78,'FO','Islas Feroe'),(79,'PH','Filipinas'),(80,'FI','Finlandia'),(81,'FJ','Fiyi'),(82,'FR','Francia'),(83,'GA','Gabón'),(84,'GM','Gambia'),(85,'GE','Georgia'),(86,'GS','Islas Georgias del Sur y Sandw'),(87,'GH','Ghana'),(88,'GI','Gibraltar'),(89,'GD','Granada'),(90,'GR','Grecia'),(91,'GL','Groenlandia'),(92,'GP','Guadalupe'),(93,'GU','Guam'),(94,'GT','Guatemala'),(95,'GF','Guayana Francesa'),(96,'GN','Guinea'),(97,'GQ','Guinea Ecuatorial'),(98,'GW','Guinea-Bissau'),(99,'GY','Guyana'),(100,'HT','Haití'),(101,'HM','Islas Heard y McDonald'),(102,'HN','Honduras'),(103,'HK','Hong Kong'),(104,'HU','Hungría'),(105,'IN','India'),(106,'ID','Indonesia'),(107,'IR','Irán'),(108,'IQ','Iraq'),(109,'IE','Irlanda'),(110,'IS','Islandia'),(111,'IL','Israel'),(112,'IT','Italia'),(113,'JM','Jamaica'),(114,'JP','Japón'),(115,'JO','Jordania'),(116,'KZ','Kazajstán'),(117,'KE','Kenia'),(118,'KG','Kirguistán'),(119,'KI','Kiribati'),(120,'KW','Kuwait'),(121,'LA','Laos'),(122,'LS','Lesotho'),(123,'LV','Letonia'),(124,'LB','Líbano'),(125,'LR','Liberia'),(126,'LY','Libia'),(127,'LI','Liechtenstein'),(128,'LT','Lituania'),(129,'LU','Luxemburgo'),(130,'MO','Macao'),(131,'MK','ARY Macedonia'),(132,'MG','Madagascar'),(133,'MY','Malasia'),(134,'MW','Malawi'),(135,'MV','Maldivas'),(136,'ML','Malí'),(137,'MT','Malta'),(138,'FK','Islas Malvinas'),(139,'MP','Islas Marianas del Norte'),(140,'MA','Marruecos'),(141,'MH','Islas Marshall'),(142,'MQ','Martinica'),(143,'MU','Mauricio'),(144,'MR','Mauritania'),(145,'YT','Mayotte'),(146,'MX','México'),(147,'FM','Micronesia'),(148,'MD','Moldavia'),(149,'MC','Mónaco'),(150,'MN','Mongolia'),(151,'MS','Montserrat'),(152,'MZ','Mozambique'),(153,'MM','Myanmar'),(154,'NA','Namibia'),(155,'NR','Nauru'),(156,'NP','Nepal'),(157,'NI','Nicaragua'),(158,'NE','Níger'),(159,'NG','Nigeria'),(160,'NU','Niue'),(161,'NF','Isla Norfolk'),(162,'NO','Noruega'),(163,'NC','Nueva Caledonia'),(164,'NZ','Nueva Zelanda'),(165,'OM','Omán'),(166,'NL','Países Bajos'),(167,'PK','Pakistán'),(168,'PW','Palau'),(169,'PS','Palestina'),(170,'PA','Panamá'),(171,'PG','Papúa Nueva Guinea'),(172,'PY','Paraguay'),(173,'PE','Perú'),(174,'PN','Islas Pitcairn'),(175,'PF','Polinesia Francesa'),(176,'PL','Polonia'),(177,'PT','Portugal'),(178,'PR','Puerto Rico'),(179,'QA','Qatar'),(180,'GB','Reino Unido'),(181,'RE','Reunión'),(182,'RW','Ruanda'),(183,'RO','Rumania'),(184,'RU','Rusia'),(185,'EH','Sahara Occidental'),(186,'SB','Islas Salomón'),(187,'WS','Samoa'),(188,'AS','Samoa Americana'),(189,'KN','San Cristóbal y Nevis'),(190,'SM','San Marino'),(191,'PM','San Pedro y Miquelón'),(192,'VC','San Vicente y las Granadinas'),(193,'SH','Santa Helena'),(194,'LC','Santa Lucía'),(195,'ST','Santo Tomé y Príncipe'),(196,'SN','Senegal'),(197,'CS','Serbia y Montenegro'),(198,'SC','Seychelles'),(199,'SL','Sierra Leona'),(200,'SG','Singapur'),(201,'SY','Siria'),(202,'SO','Somalia'),(203,'LK','Sri Lanka'),(204,'SZ','Suazilandia'),(205,'ZA','Sudáfrica'),(206,'SD','Sudán'),(207,'SE','Suecia'),(208,'CH','Suiza'),(209,'SR','Surinam'),(210,'SJ','Svalbard y Jan Mayen'),(211,'TH','Tailandia'),(212,'TW','Taiwán'),(213,'TZ','Tanzania'),(214,'TJ','Tayikistán'),(215,'IO','Territorio Británico del Océan'),(216,'TF','Territorios Australes Francese'),(217,'TL','Timor Oriental'),(218,'TG','Togo'),(219,'TK','Tokelau'),(220,'TO','Tonga'),(221,'TT','Trinidad y Tobago'),(222,'TN','Túnez'),(223,'TC','Islas Turcas y Caicos'),(224,'TM','Turkmenistán'),(225,'TR','Turquía'),(226,'TV','Tuvalu'),(227,'UA','Ucrania'),(228,'UG','Uganda'),(229,'UY','Uruguay'),(230,'UZ','Uzbekistán'),(231,'VU','Vanuatu'),(232,'VE','Venezuela'),(233,'VN','Vietnam'),(234,'VG','Islas Vírgenes Británicas'),(235,'VI','Islas Vírgenes de los Estados '),(236,'WF','Wallis y Futuna'),(237,'YE','Yemen'),(238,'DJ','Yibuti'),(239,'ZM','Zambia'),(240,'ZW','Zimbabue');
/*!40000 ALTER TABLE `pais` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `titulo`
--

DROP TABLE IF EXISTS `titulo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `titulo` (
  `id` int(11) NOT NULL,
  `descrip` varchar(20) DEFAULT NULL,
  `clasetitulo` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `titulo`
--

LOCK TABLES `titulo` WRITE;
/*!40000 ALTER TABLE `titulo` DISABLE KEYS */;
INSERT INTO `titulo` VALUES (1,'BA','Bachiller Academico'),(2,'Tc','Tecnico'),(3,'Tg','Tecnologo'),(4,'P','Profesional');
/*!40000 ALTER TABLE `titulo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-15 13:03:28
