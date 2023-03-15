-- phpMyAdmin SQL Dump
-- version 4.9.7
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : lun. 06 mars 2023 à 01:47
-- Version du serveur :  8.0.32
-- Version de PHP : 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gestionstock`
--

-- --------------------------------------------------------

--
-- Structure de la table `batch_article`
--

DROP TABLE IF EXISTS `batch_article`;
CREATE TABLE IF NOT EXISTS `batch_article` (
  `barcode` int NOT NULL AUTO_INCREMENT,
  `article_name` varchar(255) DEFAULT NULL,
  `price` float NOT NULL,
  `ref_article_barcode` int NOT NULL,
  PRIMARY KEY (`barcode`),
  KEY `FKac498s1bnf8k557fss2yf70gs` (`ref_article_barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Structure de la table `brand`
--

DROP TABLE IF EXISTS `brand`;
CREATE TABLE IF NOT EXISTS `brand` (
  `brand` varchar(255) NOT NULL,
  PRIMARY KEY (`brand`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `brand`
--

INSERT INTO `brand` (`brand`) VALUES
('Cristaline');

-- --------------------------------------------------------

--
-- Structure de la table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `category` varchar(255) NOT NULL,
  PRIMARY KEY (`category`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `category`
--

INSERT INTO `category` (`category`) VALUES
('Alimentaire');

-- --------------------------------------------------------

--
-- Structure de la table `group_article`
--

DROP TABLE IF EXISTS `group_article`;
CREATE TABLE IF NOT EXISTS `group_article` (
  `group_article` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  PRIMARY KEY (`group_article`),
  KEY `FKq3qdp7jhki00ym7bt9on7fyuq` (`category`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `group_article`
--

INSERT INTO `group_article` (`group_article`, `category`) VALUES
('Boisson', 'Alimentaire');

-- --------------------------------------------------------

--
-- Structure de la table `under_group_article`
--

DROP TABLE IF EXISTS `under_group_article`;
CREATE TABLE IF NOT EXISTS `under_group_article` (
  `under_group_article` varchar(255) NOT NULL,
  `group_article` varchar(255) NOT NULL,
  PRIMARY KEY (`under_group_article`),
  KEY `FKl9cpladobbh5k3fu6mqttjpda` (`group_article`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `under_group_article`
--

INSERT INTO `under_group_article` (`under_group_article`, `group_article`) VALUES
('Eau', 'Boisson');

-- --------------------------------------------------------

--
-- Structure de la table `unite`
--

DROP TABLE IF EXISTS `unite`;
CREATE TABLE IF NOT EXISTS `unite` (
  `unite` varchar(255) NOT NULL,
  PRIMARY KEY (`unite`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `unite`
--

INSERT INTO `unite` (`unite`) VALUES
('Litre');

-- --------------------------------------------------------

--
-- Structure de la table `unit_article`
--

DROP TABLE IF EXISTS `unit_article`;
CREATE TABLE IF NOT EXISTS `unit_article` (
  `barcode` int NOT NULL AUTO_INCREMENT,
  `article_name` varchar(255) DEFAULT NULL,
  `price` float NOT NULL,
  `qte_unite` float NOT NULL,
  `stock` int NOT NULL,
  `brand` varchar(255) NOT NULL,
  `under_group` varchar(255) NOT NULL,
  `unite` varchar(255) NOT NULL,
  PRIMARY KEY (`barcode`),
  KEY `FKdpa0m7d0ug9p3h4rg7jwybqqn` (`brand`),
  KEY `FKuw0fus07qvbc4tc5rj1ow0wv` (`under_group`),
  KEY `FKfmenacr9r1xo8503ayq52ecpw` (`unite`)
) ENGINE=InnoDB AUTO_INCREMENT=5037 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `unit_article`
--

INSERT INTO `unit_article` (`barcode`, `article_name`, `price`, `qte_unite`, `stock`, `brand`, `under_group`, `unite`) VALUES
(5024, 'Eau Crista', 5, 1.5, 100, 'Cristaline', 'Eau', 'Litre'),
(5025, 'Eau Crista', 5, 1.5, 100, 'Cristaline', 'Eau', 'Litre'),
(5026, 'Eau Crista', 5, 1.5, 100, 'Cristaline', 'Eau', 'Litre'),
(5027, 'Eau Crista', 5, 1.5, 100, 'Cristaline', 'Eau', 'Litre'),
(5028, 'Eau Crista', 5, 1.5, 100, 'Cristaline', 'Eau', 'Litre'),
(5029, 'Eau Crista', 5, 1.5, 100, 'Cristaline', 'Eau', 'Litre'),
(5030, 'Eau Crista', 5, 1.5, 100, 'Cristaline', 'Eau', 'Litre'),
(5031, 'Eau Crista', 5, 1.5, 100, 'Cristaline', 'Eau', 'Litre'),
(5032, 'Eau Crista', 5, 1.5, 100, 'Cristaline', 'Eau', 'Litre'),
(5033, 'Test', 1.5, 1.5, 100, 'Cristaline', 'Eau', 'Litre'),
(5034, 'Test', 1, 1, 1, 'Cristaline', 'Eau', 'Litre'),
(5035, 'Test2', 1.2, 1.5, 1000, 'Cristaline', 'Eau', 'Litre');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `batch_article`
--
ALTER TABLE `batch_article`
  ADD CONSTRAINT `FKac498s1bnf8k557fss2yf70gs` FOREIGN KEY (`ref_article_barcode`) REFERENCES `unit_article` (`barcode`);

--
-- Contraintes pour la table `group_article`
--
ALTER TABLE `group_article`
  ADD CONSTRAINT `FKq3qdp7jhki00ym7bt9on7fyuq` FOREIGN KEY (`category`) REFERENCES `category` (`category`);

--
-- Contraintes pour la table `under_group_article`
--
ALTER TABLE `under_group_article`
  ADD CONSTRAINT `FKl9cpladobbh5k3fu6mqttjpda` FOREIGN KEY (`group_article`) REFERENCES `group_article` (`group_article`);

--
-- Contraintes pour la table `unit_article`
--
ALTER TABLE `unit_article`
  ADD CONSTRAINT `FKdpa0m7d0ug9p3h4rg7jwybqqn` FOREIGN KEY (`brand`) REFERENCES `brand` (`brand`),
  ADD CONSTRAINT `FKfmenacr9r1xo8503ayq52ecpw` FOREIGN KEY (`unite`) REFERENCES `unite` (`unite`),
  ADD CONSTRAINT `FKuw0fus07qvbc4tc5rj1ow0wv` FOREIGN KEY (`under_group`) REFERENCES `under_group_article` (`under_group_article`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
