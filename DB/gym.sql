-- MySQL Script generated by MySQL Workbench
-- Tue Aug  1 20:15:50 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Gym
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Gym
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Gym` DEFAULT CHARACTER SET utf8 ;
USE `Gym` ;

-- -----------------------------------------------------
-- Table `Gym`.`Gym`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Gym`.`Gym` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `phone_number` VARCHAR(45) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `address` VARCHAR(200) NOT NULL,
  `web` VARCHAR(100) NOT NULL,
  `cp` CHAR(45) NOT NULL,
  `city` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Gym`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Gym`.`User` (
  `id` INT NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  `last_name` VARCHAR(100) NOT NULL,
  `phone_number` VARCHAR(45) NOT NULL,
  `born_date` DATE NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `address` VARCHAR(200) NOT NULL,
  `cp` VARCHAR(45) NOT NULL,
  `city` VARCHAR(100) NOT NULL,
  `id_gym` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `gym_alumn_fk_idx` (`id_gym` ASC) VISIBLE,
  CONSTRAINT `gym_alumn_fk`
    FOREIGN KEY (`id_gym`)
    REFERENCES `Gym`.`Gym` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Gym`.`Membership`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Gym`.`Membership` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `last_name` VARCHAR(100) NOT NULL,
  `phone_number` VARCHAR(45) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `id_user` INT NOT NULL,
  `Gym_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Membership_User1_idx` (`id_user` ASC) VISIBLE,
  INDEX `fk_Membership_Gym1_idx` (`Gym_id` ASC) VISIBLE,
  CONSTRAINT `fk_Membership_User1`
    FOREIGN KEY (`id_user`)
    REFERENCES `Gym`.`User` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Membership_Gym1`
    FOREIGN KEY (`Gym_id`)
    REFERENCES `Gym`.`Gym` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Gym`.`Employe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Gym`.`Employe` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `last_name` VARCHAR(100) NOT NULL,
  `phone_number` VARCHAR(45) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `id_gym` INT NOT NULL,
  `id_membership` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `gym_fitness_trainer_fk_idx` (`id_gym` ASC) VISIBLE,
  INDEX `fitness_trainer_class_fk_idx` (`id_membership` ASC) VISIBLE,
  CONSTRAINT `gym_fitness_trainer_fk`
    FOREIGN KEY (`id_gym`)
    REFERENCES `Gym`.`Gym` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fitness_trainer_class_fk`
    FOREIGN KEY (`id_membership`)
    REFERENCES `Gym`.`Membership` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Gym`.`Equipment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Gym`.`Equipment` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `product_name` VARCHAR(100) NOT NULL,
  `description` VARCHAR(255) NOT NULL,
  `status` VARCHAR(100) NOT NULL,
  `buy_time` TIMESTAMP(100) NOT NULL,
  `Gym_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_Equipment_Gym1_idx` (`Gym_id` ASC) VISIBLE,
  CONSTRAINT `fk_Equipment_Gym`
    FOREIGN KEY (`Gym_id`)
    REFERENCES `Gym`.`Gym` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
