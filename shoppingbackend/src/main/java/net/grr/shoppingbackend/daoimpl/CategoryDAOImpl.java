package net.grr.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.grr.shoppingbackend.dao.CategoryDAO;
import net.grr.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories=new ArrayList<>();
	static {
		Category category= new Category();
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is TV desc");
		category.setImageURL("Cat_1.png");
		
		categories.add(category);
		//adding second category
		category= new Category();
		
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is Mobile desc");
		category.setImageURL("Cat_2.png");
		
		categories.add(category);
		
		//adding third category
				category= new Category();
				
				category.setId(3);
				category.setName("Laptop");
				category.setDescription("This is laptop desc");
				category.setImageURL("Cat_3.png");
				
				categories.add(category);
	}
	@Override
	public List<Category> list() {
		// retur the categories
		return categories;
	}
	@Override
	public Category get(int id) {
		//enhanced for loop
		for(Category category:categories) {
			
			if(category.getId() == id) return category;
		}
			
		return null;
	}

}
