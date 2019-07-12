package com.github.joselume.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.joselume.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
