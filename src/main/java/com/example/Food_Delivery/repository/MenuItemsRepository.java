package com.example.Food_Delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Food_Delivery.model.MenuItems;

@Repository
public interface MenuItemsRepository extends JpaRepository<MenuItems,Integer>{

}
