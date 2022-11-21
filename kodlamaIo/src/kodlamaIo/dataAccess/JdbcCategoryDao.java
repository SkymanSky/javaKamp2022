package kodlamaIo.dataAccess;

 

public class JdbcCategoryDao implements CategoryDao {
	//DataBase erişim kodları.
	@Override
	public void add(kodlamaIo.entites.Category category) {
		System.out.println("Jdbc ile veritabanına kaydedildi.");
		
	}

}
