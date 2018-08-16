package net.grr.shoppingbackend.dao;

import java.util.List;

import net.grr.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
