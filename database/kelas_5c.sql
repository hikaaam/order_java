-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 12, 2018 at 04:19 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kelas_5c`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `no` int(10) NOT NULL,
  `nama_barang` varchar(30) NOT NULL,
  `id_product` int(10) NOT NULL,
  `harga` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`no`, `nama_barang`, `id_product`, `harga`) VALUES
(1, 'coca_cola', 1, 10000),
(2, 'wafer tango', 2, 5000),
(3, 'indomie', 3, 2500),
(4, 'kacang garuda', 4, 8000);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `no` int(10) NOT NULL,
  `user_id` varchar(10) NOT NULL,
  `product_id` varchar(15) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `nama_user` varchar(30) NOT NULL,
  `price` int(30) NOT NULL,
  `qty` varchar(40) NOT NULL,
  `order_id` int(20) NOT NULL,
  `address` varchar(60) NOT NULL,
  `tanggal` date NOT NULL,
  `status` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`no`, `user_id`, `product_id`, `nama`, `nama_user`, `price`, `qty`, `order_id`, `address`, `tanggal`, `status`) VALUES
(3, '22', '1', 'coca cola', 'spiderman', 10000, '7', 100518221, 'tegal Jl patimura no 77', '2018-10-05', 2),
(4, '23', '1', 'coca cola', 'thor', 10000, '10 ', 101018223, 'Yggdrasil asgard, Jl hellheim no 57', '2018-10-10', 1),
(6, '22', '4', 'kacang garuda', 'spiderman', 8000, '20', 100518221, 'tegal Jl patimura no 77', '2018-10-05', 2),
(7, '23', '3', 'indomie', 'thor', 2500, '100', 101018223, 'Yggdrasil asgard, Jl hellheim no 57', '2018-10-10', 1);

-- --------------------------------------------------------

--
-- Table structure for table `orders2`
--

CREATE TABLE `orders2` (
  `product_id` int(10) NOT NULL,
  `order_id` int(20) NOT NULL,
  `nama_user` varchar(33) NOT NULL,
  `user_id` int(11) NOT NULL,
  `address` varchar(50) NOT NULL,
  `total` int(80) NOT NULL,
  `tanggal` date NOT NULL,
  `status` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders2`
--

INSERT INTO `orders2` (`product_id`, `order_id`, `nama_user`, `user_id`, `address`, `total`, `tanggal`, `status`) VALUES
(1, 100518221, 'spiderman', 22, 'tegal Jl patimura no 77', 230000, '2018-10-05', 2),
(2, 101018223, 'thor', 23, 'Yggdrasil asgard, Jl hellheim no 57', 350000, '2018-10-10', 1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `no` int(10) NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `password`, `no`, `name`) VALUES
('admin', 'admin', 1, 'admin tampan'),
('user1', 'user1', 22, 'spiderman'),
('user2', 'user2', 23, 'thor');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`no`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`no`),
  ADD KEY `status` (`status`);

--
-- Indexes for table `orders2`
--
ALTER TABLE `orders2`
  ADD PRIMARY KEY (`product_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `barang`
--
ALTER TABLE `barang`
  MODIFY `no` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `no` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `orders2`
--
ALTER TABLE `orders2`
  MODIFY `product_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
