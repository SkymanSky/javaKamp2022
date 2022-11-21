package kodlamaIo.dataAccess;

import kodlamaIo.entites.Educator;

public class HibernateEducatorDao implements EducatorDao {

	@Override
	public void add(Educator educator) {
		System.out.println("Hibernate ile veri tabanına eklendi.");
		
	}

}
