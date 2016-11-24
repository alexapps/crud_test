
CREATE DATABASE `test` ;

USE `test`;

/*Table structure for table `User` */

DROP TABLE IF EXISTS `User`;

CREATE TABLE `User` (
  `id` int(8) NOT NULL  AUTO_INCREMENT,
  `name` varchar(25) NULL,
  `age` int NULL,
  `isAdmin` bit(1) NULL,
   `createdDate` TIMESTAMP(6) NULL,
  PRIMARY KEY (`id`)  
  ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `User` */

insert  into `User`(`name`,`age`,`isAdmin`,`createdDate`) values
('Atelier graphique',20,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Signal Gift Stores',21,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Australian Collectors Co.',22,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('La Rochelle Gifts',23,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Baane Mini Imports',24,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Mini Gifts',25,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Havel & Zbyszek Co',26,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Blauer See Auto Co.',27,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Mini Wheels Co.',28,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Land of Toys Inc.',29,true ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Euro+ Shopping',30,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Volvo Model Replicas, Co',31,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Danish Wholesale',32,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Saveley & Henriot, Co.',33,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Dragon Souveniers',34,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Muscle Machine Inc',35,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Diecast Classics Inc.',36,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Technics Stores Inc.',37,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Handji Gifts& Co',38,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d')),
('Herkku Gifts',39,false ,STR_TO_DATE('2013-02-12','%Y-%m-%d'));
