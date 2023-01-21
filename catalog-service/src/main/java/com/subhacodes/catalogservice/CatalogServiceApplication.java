package com.subhacodes.catalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CatalogServiceApplication {

	// private static final Logger log = LoggerFactory.getLogger(CatalogServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}

	// @Bean
  // 	public CommandLineRunner demo(ProductRepository repository) {
  //   return (args) -> {
  //     // save a few customers
  //     // repository.save(new Product("P004", "Product4", "Product 4 description"));
  //     // repository.save(new Product("P005", "Product5", "Product 5 description"));
  //     // repository.save(new Product("P006", "Product6", "Product 6 description"));

  //     log.info("Products found with findAll():");
  //     // log.info("-------------------------------");
  //     // for (Product product : repository.findAll()) {
  //     //   log.info(product.toString());
  //     // }
  //     log.info("");
  //     log.info("save to repo");
  //   };
  // }

}
