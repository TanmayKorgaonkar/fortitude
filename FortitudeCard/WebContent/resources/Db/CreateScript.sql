CREATE TABLE `projects` (
  `project_id` varchar(50) NOT NULL,
  `project_name` varchar(100) DEFAULT NULL,
  `project_cost` varchar(20) DEFAULT NULL,
  `project_category` varchar(100) DEFAULT NULL,
  `project_details` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`project_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `transfer` (
  `from_account_id` varchar(45) NOT NULL,
  `to_account_id` varchar(45) NOT NULL,
  `message` varchar(200) NOT NULL,
  `transfer_time` datetime NOT NULL,
  PRIMARY KEY (`from_account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `accounts` (
  `account_id` varchar(45) NOT NULL,
  `account_first_name` varchar(45) NOT NULL,
  `account_last_name` varchar(45) NOT NULL,
  `account_nick_name` varchar(45) NOT NULL,
  `rank` bigint(20) DEFAULT NULL,
  `date_of_birth` date NOT NULL,
  `gender` varchar(1) NOT NULL,
  `mobile_number` varchar(16) NOT NULL,
  `country` varchar(45) NOT NULL,
  `email` varchar(101) NOT NULL,
  `lite_coin_address` varchar(1001) NOT NULL,
  `sponsor_link` varchar(1001) NOT NULL,
  `total_earnings` bigint(20) DEFAULT NULL,
  `account_password` varchar(99) NOT NULL,
  `user_role` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`account_id`,`email`,`account_password`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

