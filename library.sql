-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 04, 2024 at 06:59 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `id` int(10) NOT NULL,
  `title` varchar(500) NOT NULL,
  `author` varchar(500) NOT NULL,
  `year` varchar(6) NOT NULL,
  `isbn` varchar(20) NOT NULL,
  `pages` varchar(10) NOT NULL,
  `country` varchar(100) NOT NULL,
  `genre` varchar(100) NOT NULL,
  `language` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`id`, `title`, `author`, `year`, `isbn`, `pages`, `country`, `genre`, `language`) VALUES
(2, 'Things Fall Apart', 'Chinua Achebe', '1958', '978-4-8401-4546-6', '209', 'Nigeria', 'Fantasy', 'English'),
(3, 'Fairy tales', 'Hans Christian Andersen', '1836', '978-4-04-066433-0', '784', 'Denmark', 'Fantasy', 'Danish'),
(4, 'The Divine Comedy', 'Dante Alighieri', '2010', '978-4-04-066434-7', '928', 'Italy', 'Comedy', 'Italian'),
(5, 'The Epic Of Gilgamesh', 'Unknown', '1999', '978-4-04-066469-9', '160', 'France', 'Fantasy', 'English'),
(6, 'Pride and Prejudice', 'Jane Austen', '2006', '978-4-04-066080-6', '226', 'United Kingdom', 'Adventure', 'English');

-- --------------------------------------------------------

--
-- Table structure for table `books_seq`
--

CREATE TABLE `books_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `books_seq`
--

INSERT INTO `books_seq` (`next_val`) VALUES
(101);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `books`
--
ALTER TABLE `books`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
