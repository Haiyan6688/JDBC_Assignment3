# JDBC_Assignment3

SQL kod:

CREATE TABLE `sqlandjava`.`owners` (
  `owners_id` INT NOT NULL,
  `person_id` VARCHAR(45) NOT NULL,
  `cars_id` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`owners_id`));
  
INSERT INTO `sqlandjava`.`owners` (`owners_id`, `person_id`, `cars_id`) VALUES ('1', '2', '3');
INSERT INTO `sqlandjava`.`owners` (`owners_id`, `person_id`, `cars_id`) VALUES ('2', '1', '4');
INSERT INTO `sqlandjava`.`owners` (`owners_id`, `person_id`, `cars_id`) VALUES ('3', '3', '2');
INSERT INTO `sqlandjava`.`owners` (`owners_id`, `person_id`, `cars_id`) VALUES ('4', '4', '1');

GRANT SELECT ON sqlandjava.owners TO super@localhost;
