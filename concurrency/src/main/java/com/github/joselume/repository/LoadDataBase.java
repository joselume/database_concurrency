package com.github.joselume.repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.joselume.model.Item;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDataBase {
	@Bean
	CommandLineRunner initDataBase (ItemRepository itemRepository) {
		return args -> {
			log.info("Preloading " + itemRepository.save(new Item("pencil", 1)));
			log.info("Preloading " + itemRepository.save(new Item("notebook", 5)));					
		};
	}
}
