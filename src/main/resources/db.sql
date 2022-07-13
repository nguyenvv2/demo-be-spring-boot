use db_test
-- TeamTool.brand definition

CREATE TABLE `brand` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `brand_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- TeamTool.category definition

CREATE TABLE `category` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `cate_code` varchar(20) NOT NULL,
  `cate_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- TeamTool.status definition

CREATE TABLE `status` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `status_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- TeamTool.sub_category definition

CREATE TABLE `sub_category` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `sub_cate_code` varchar(20) DEFAULT NULL,
  `sub_cate_name` varchar(50) DEFAULT NULL,
  `cate_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `sub_category_FK` (`cate_id`),
  CONSTRAINT `sub_category_FK` FOREIGN KEY (`cate_id`) REFERENCES `category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- TeamTool.product definition

CREATE TABLE `product` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `subcate_id` bigint DEFAULT NULL,
  `produce_name` varchar(100) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  `quantity` bigint DEFAULT NULL,
  `sell_price` double DEFAULT NULL,
  `origin_price` double DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `status_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `product_FK` (`status_id`),
  KEY `product_FK_1` (`subcate_id`),
  CONSTRAINT `product_FK` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`),
  CONSTRAINT `product_FK_1` FOREIGN KEY (`subcate_id`) REFERENCES `sub_category` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


-- TeamTool.product_brand definition

CREATE TABLE `product_brand` (
  `product_id` bigint NOT NULL AUTO_INCREMENT,
  `brand_id` bigint NOT NULL,
  KEY `product_brand_FK` (`brand_id`),
  KEY `product_brand_FK_1` (`product_id`),
  CONSTRAINT `product_brand_FK` FOREIGN KEY (`brand_id`) REFERENCES `brand` (`id`),
  CONSTRAINT `product_brand_FK_1` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
