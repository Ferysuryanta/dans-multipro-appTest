-- Database: dans-multipro-test

-- DROP DATABASE IF EXISTS "dans-multipro-test";

CREATE DATABASE "dans-multipro-test"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'English_United States.1252'
    LC_CTYPE = 'English_United States.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(20) DEFAULT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK6dotkott2kjsp8vw4d0m25fb7` (`email`)
);

/*Data for the table `users` */

insert  into `users`(`id`,`name`,`password`,`role`,`email`) values 
(1,'Test','$2a$10$tCWTi55rVE3T9bNVpAPQoONcK6zgb7iMeDgb49imXvTZON5GUo/bG','ROLE_USER','test1@gmail.com'),
(2,'TestApp','$2a$10$utvyhuCpvYqU5do6aXB5U.vtAQLeZf7J/rzu5WKy26an.aW9WwVoW','ROLE_USER','TestApp@gmail.com'),
(3,'TestApp1','$2a$10$xeZNZCwJ3kKKbPaVVnqACePFqZcIRIomKK1B3tK76N26YACTDzEBW','ROLE_USER','TestApp1@gmail.com');

