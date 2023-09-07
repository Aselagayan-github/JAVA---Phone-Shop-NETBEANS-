-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 21, 2022 at 12:32 PM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `registation_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

DROP TABLE IF EXISTS `register`;
CREATE TABLE IF NOT EXISTS `register` (
  `U_name` varchar(100) NOT NULL,
  `id` int(10) NOT NULL,
  `Telephone` varchar(100) NOT NULL,
  `user_type` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `Conform_password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`U_name`, `id`, `Telephone`, `user_type`, `password`, `Conform_password`) VALUES
('boralu', 4567254, '5677754543', 'Maneger', '2222', '2222'),
('galayann', 345567, '345522322', 'Cashier', '4444', '4444'),
('gayan', 200444445, '234567899', 'MANEGER', '24', '24'),
('supun', 45672, '56777545', 'Cashier', '9999', '9999'),
('scubee', 345662, '34566778', 'MANEGER', '1212', '1212'),
('asela', 3456777, '34566678', 'Cashier', '2222', '2222');

-- --------------------------------------------------------

--
-- Table structure for table `storem`
--

DROP TABLE IF EXISTS `storem`;
CREATE TABLE IF NOT EXISTS `storem` (
  `id` int(90) NOT NULL,
  `brand` varchar(255) NOT NULL,
  `name` varchar(150) NOT NULL,
  `catagory` varchar(80) NOT NULL,
  `price` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `storem`
--

INSERT INTO `storem` (`id`, `brand`, `name`, `catagory`, `price`) VALUES
(4, 'Samsung', 'j4', 'Tab', '47000'),
(2, 'Samsung', 'j5', 'Samart Phone', '20000'),
(3, 'Apple', '5s', 'Samart Phone', '24000'),
(5, 'Apple', '6s+', 'Tab', '45000'),
(50, 'Huvawe', 'y6 prime', 'Samart Phone', '20000'),
(60, 'Nokia', 'x136', 'Tab', '300000'),
(61, 'Nokia', '1100', 'Button Phone', '6000'),
(70, 'Sony', 'xp456', 'Tab', '56000'),
(80, 'Micromax', 'e12', 'Button Phone', '2000'),
(100, 'Vivo', 'v18', 'Samart Phone', '40000');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
