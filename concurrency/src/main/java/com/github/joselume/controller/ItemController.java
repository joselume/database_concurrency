package com.github.joselume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.joselume.model.Item;
import com.github.joselume.repository.ItemRepository;

@RestController
@RequestMapping("/api")
public class ItemController {
	@Autowired
	ItemRepository itemRepository;
	
	@GetMapping("/item/{itemId}")
	public Item getItem(@PathVariable int itemId) {
		return itemRepository.getOne(itemId);
	}
	
	@PutMapping("/item")
	public void updateItem (@RequestBody Item item) {
		itemRepository.save(item);
	}		
}
