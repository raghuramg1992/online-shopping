package net.grr.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import net.grr.shoppingbackend.dao.CategoryDAO;
import net.grr.shoppingbackend.dto.Category;

public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories=new ArrayList();
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
		// TODO Auto-generated method stub
		return null;
	}

}
