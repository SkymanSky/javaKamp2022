package kodlamaIo.business;


import java.util.ArrayList;
import java.util.List;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.CourseDao;
import kodlamaIo.entites.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {

		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses=new ArrayList<Course>();
	}

	public void add(Course course) throws Exception {
		if (course.getPrice() == 0 || course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı sıfıra eşit ya da küçük olamaz");
		}
		
		for (Course course1 : courses) {
			if(course1.getName().equals(course.getName())){
				System.out.println(course1.getName());
				throw new Exception("Aynı isimli birden fazla kurs olamaz.");
			}
		}
		
		

		// CourseDao courseDao = new HibernateCourseDao();
		courseDao.add(course);
		courses.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

}
