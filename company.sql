-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 19, 2024 at 10:56 AM
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
-- Database: `company`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `u_id` int(20) NOT NULL,
  `u_fullname` varchar(50) NOT NULL,
  `u_contactnumber` varchar(150) NOT NULL,
  `u_birthday` date NOT NULL,
  `u_gender` varchar(50) NOT NULL,
  `u_address` varchar(50) NOT NULL,
  `u_position` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_status` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`u_id`, `u_fullname`, `u_contactnumber`, `u_birthday`, `u_gender`, `u_address`, `u_position`, `u_username`, `u_password`, `u_status`) VALUES
(3, 'alvin ramos', '09054009658', '2024-04-01', 'Male', 'Cebu', 'Team Leader', 'quby123', '153fa238cec90e5a24b85a79109f91ebe68ca481', 'active'),
(4, 'Juan Cruz', '09054009655', '2024-04-01', 'Male', 'Lipata, cebu', 'Team Member', 'juan123', '5cec175b165e3d5e62c9e13ce848ef6feac81bff', 'active'),
(5, 'Juan Cruz', '09054009699', '2024-05-01', 'Male', 'Lipata, Cebu', 'Team Member', 'juancruz123', '5cec175b165e3d5e62c9e13ce848ef6feac81bff', 'inactive');

-- --------------------------------------------------------

--
-- Table structure for table `task`
--

CREATE TABLE `task` (
  `t_id` int(250) NOT NULL,
  `u_id` int(50) NOT NULL,
  `t_name` varchar(250) NOT NULL,
  `t_deadline` date NOT NULL,
  `t_status` varchar(100) NOT NULL,
  `t_archive` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `task`
--

INSERT INTO `task` (`t_id`, `u_id`, `t_name`, `t_deadline`, `t_status`, `t_archive`) VALUES
(3, 4, 'debug', '2024-05-16', 'FINISHED', 'NO'),
(4, 4, 'repair computer 1', '2024-05-17', 'PENDING', 'NO');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`u_id`);

--
-- Indexes for table `task`
--
ALTER TABLE `task`
  ADD PRIMARY KEY (`t_id`),
  ADD KEY `u_id` (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `task`
--
ALTER TABLE `task`
  MODIFY `t_id` int(250) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `task`
--
ALTER TABLE `task`
  ADD CONSTRAINT `task_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `employee` (`u_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
