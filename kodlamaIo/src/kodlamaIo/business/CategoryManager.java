package kodlamaIo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.CategoryDao;
import kodlamaIo.entites.Category;

public class CategoryManager {
	
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;
	
	public CategoryManager(CategoryDao categoryDao,Logger[] loggers ) {
		this.categoryDao= categoryDao;
		this.loggers=loggers;
		this.categories= new ArrayList<Category>();
	}
	
	public void add(Category category) throws Exception {
		for (Category category1 : categories) {
			if(category1.getName().equals(category.getName())){
				System.out.println(category1.getName());
				throw new Exception("Aynı isimli birden fazla kategori olamaz.");
			}
		}
		
		categories.add(category);
		categoryDao.add(category);
		
		for(Logger logger:loggers) {
			logger.log(category.getName());
		}
	}

}
