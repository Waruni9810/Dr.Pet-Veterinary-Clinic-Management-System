-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 20, 2024 at 06:00 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dr_pet`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_login`
--

CREATE TABLE `admin_login` (
  `userid` int(100) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin_login`
--

INSERT INTO `admin_login` (`userid`, `username`, `password`) VALUES
(1, 'waruni', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

CREATE TABLE `bill` (
  `biil_no` varchar(10) NOT NULL,
  `date` varchar(10) NOT NULL,
  `total` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`biil_no`, `date`, `total`) VALUES
('1', '2022-12-29', 150),
('2', '2023-01-03', 20);

-- --------------------------------------------------------

--
-- Table structure for table `channel`
--

CREATE TABLE `channel` (
  `channel_no` varchar(10) NOT NULL,
  `dr_name` varchar(255) NOT NULL,
  `pet_name` varchar(255) NOT NULL,
  `room_no` varchar(10) NOT NULL,
  `date` varchar(10) NOT NULL,
  `channel_fee` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `channel`
--

INSERT INTO `channel` (`channel_no`, `dr_name`, `pet_name`, `room_no`, `date`, `channel_fee`) VALUES
('1', 'Suresh', 'Kitti', '3', '2022-12-31', '1500'),
('2', 'Suresh', 'simi', '3', '2023-01-05', '2000');

-- --------------------------------------------------------

--
-- Table structure for table `doctor_record`
--

CREATE TABLE `doctor_record` (
  `d_id` varchar(20) NOT NULL,
  `d_name` varchar(255) NOT NULL,
  `d_gender` varchar(20) NOT NULL,
  `d_NIC` varchar(25) NOT NULL,
  `d_specialization` varchar(255) NOT NULL,
  `d_experience` varchar(20) NOT NULL,
  `d_contact` varchar(10) NOT NULL,
  `d_room` varchar(10) NOT NULL,
  `d_username` varchar(255) NOT NULL,
  `d_password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor_record`
--

INSERT INTO `doctor_record` (`d_id`, `d_name`, `d_gender`, `d_NIC`, `d_specialization`, `d_experience`, `d_contact`, `d_room`, `d_username`, `d_password`) VALUES
('001', 'Waruni', 'Female', '988020753V', 'Dermatology', '4', '0775827929', '4', 'waruni', '1234'),
('002', 'Deshan', 'Male', '9975641234V', 'Oncology', '6', '0775489657', '1', 'deshan', '1234'),
('003', 'Janaka', 'Male', '99956423V', 'Nutrition', '4', '78547895', '2', 'janaka', '1234'),
('004', 'Suresh', 'Male', '9954652', 'Oncology', '3', '077', '3', 'suresh', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `drug_record`
--

CREATE TABLE `drug_record` (
  `id` varchar(15) NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `price` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `drug_record`
--

INSERT INTO `drug_record` (`id`, `name`, `description`, `price`) VALUES
('D1', 'amoxicillin ', 'antibacterial', 10),
('D2', 'clavaseptin ', 'antibiotic', 15),
('D3', 'fenbendazole', 'antiparasite drug', 30),
('D4', 'marbofloxacin', 'antibiotic', 30),
('D5', 'nitenpyram ', 'insecticide', 12);

-- --------------------------------------------------------

--
-- Table structure for table `pet_record`
--

CREATE TABLE `pet_record` (
  `id` varchar(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `category` varchar(30) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `age` varchar(4) NOT NULL,
  `owner_name` varchar(255) NOT NULL,
  `owner_contactno` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pet_record`
--

INSERT INTO `pet_record` (`id`, `name`, `category`, `gender`, `age`, `owner_name`, `owner_contactno`) VALUES
('001', 'Rocky', 'Dog', 'Male', '6', 'Deshan', '077523695'),
('002', 'Woofy', 'Dog', 'Male', '6', 'Waruni', '0775827929'),
('003', 'Kitti', 'Cat', 'Female', '5', 'Jane', '0775684856'),
('004', 'rocky', 'Dog', 'Male', '12', 'asanka', '0114561123'),
('005', 'simi', 'Cat', 'Male', '6', 'adsanka', '115665654'),
('006', 'kkkk', 'Rabbit', 'Female', '6', 'kalmal', '458666');

-- --------------------------------------------------------

--
-- Table structure for table `pharmacist_record`
--

CREATE TABLE `pharmacist_record` (
  `id` varchar(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `gender` varchar(15) NOT NULL,
  `NIC` varchar(20) NOT NULL,
  `contact` varchar(10) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pharmacist_record`
--

INSERT INTO `pharmacist_record` (`id`, `name`, `gender`, `NIC`, `contact`, `username`, `password`) VALUES
('001', 'Waruni', 'Female', '988020753V', '0775827929', 'waruni', '1234'),
('002', 'Deshan', 'Male', '9985262444', '077582663', 'deshan', '1234'),
('003', 'Janaka', 'Male', '99758463155', '071568945', 'janaka', '1234'),
('004', 'Suresh', 'Male', '99456987', '077548', 'suresh', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `prescription`
--

CREATE TABLE `prescription` (
  `pres_id` varchar(10) NOT NULL,
  `channel_no` varchar(10) NOT NULL,
  `pet_name` varchar(255) NOT NULL,
  `date` varchar(15) NOT NULL,
  `desease_type` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `prescription`
--

INSERT INTO `prescription` (`pres_id`, `channel_no`, `pet_name`, `date`, `desease_type`, `description`) VALUES
('1', '1', 'Kitti', '2022-12-31', 'fever', 'amoxilin '),
('2', '2', 'simi', '2023-01-05', 'fever', 'amoxaline \n2 weeks');

-- --------------------------------------------------------

--
-- Table structure for table `receptionist_record`
--

CREATE TABLE `receptionist_record` (
  `r_id` varchar(20) NOT NULL,
  `r_name` varchar(255) NOT NULL,
  `r_gender` varchar(20) NOT NULL,
  `r_NIC` varchar(20) NOT NULL,
  `r_contact` varchar(10) NOT NULL,
  `r_username` varchar(255) NOT NULL,
  `r_password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `receptionist_record`
--

INSERT INTO `receptionist_record` (`r_id`, `r_name`, `r_gender`, `r_NIC`, `r_contact`, `r_username`, `r_password`) VALUES
('001', 'Waruni', 'Female', '988020753V', '0775827929', 'waruni', '1234'),
('002', 'Deshan', 'Male', '99', '55252', 'deshan', '1234'),
('003', 'Janaka', 'Male', '995566', '077', 'janaka', '1234'),
('004', 'Suresh', 'Male', '99756452', '075', 'suresh', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_login`
--
ALTER TABLE `admin_login`
  ADD PRIMARY KEY (`userid`);

--
-- Indexes for table `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`biil_no`);

--
-- Indexes for table `channel`
--
ALTER TABLE `channel`
  ADD PRIMARY KEY (`channel_no`);

--
-- Indexes for table `doctor_record`
--
ALTER TABLE `doctor_record`
  ADD PRIMARY KEY (`d_id`);

--
-- Indexes for table `drug_record`
--
ALTER TABLE `drug_record`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pet_record`
--
ALTER TABLE `pet_record`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pharmacist_record`
--
ALTER TABLE `pharmacist_record`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `prescription`
--
ALTER TABLE `prescription`
  ADD PRIMARY KEY (`pres_id`);

--
-- Indexes for table `receptionist_record`
--
ALTER TABLE `receptionist_record`
  ADD PRIMARY KEY (`r_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_login`
--
ALTER TABLE `admin_login`
  MODIFY `userid` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
