package kodlamaIo.dataAccess;

import kodlamaIo.entites.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi.");
		
	}

}
