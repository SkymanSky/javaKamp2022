package kodlamaIo;


import kodlamaIo.business.CategoryManager;
import kodlamaIo.business.CourseManager;
import kodlamaIo.business.EducatorManager;
import kodlamaIo.core.logging.DatabaseLogger;
import kodlamaIo.core.logging.FileLogger;
import kodlamaIo.core.logging.Logger;
import kodlamaIo.core.logging.MailLogger;
import kodlamaIo.dataAccess.HibernateCourseDao;
import kodlamaIo.dataAccess.HibernateEducatorDao;
import kodlamaIo.dataAccess.JdbcCategoryDao;
import kodlamaIo.dataAccess.JdbcCourseDao;
import kodlamaIo.entites.Category;
import kodlamaIo.entites.Course;
import kodlamaIo.entites.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course(1,1,1,"Nesne yönelimli programlama",10);
		Course course2 = new Course(1,1,1,"Nesne yönelimli programlama",10);
		Logger[] loggers= {new FileLogger(),new DatabaseLogger(), new MailLogger()};
		
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
		try {
			courseManager.add(course1);
			courseManager.add(course2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Category category1 = new Category(1,"Java");
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category1);
		
		Category category2 = new Category(1,"Csharp");
		categoryManager.add(category2);
		
		Educator educator1= new Educator(1,"Clark","Kent");
		EducatorManager educatorManager = new EducatorManager(new HibernateEducatorDao(), loggers);
		educatorManager.add(educator1);
		

	}

}
