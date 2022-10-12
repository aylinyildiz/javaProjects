package homework3;

import homework3.business.CategoryManager;
import homework3.business.CourseManager;
import homework3.core.logging.DatabaseLogger;
import homework3.core.logging.Logger;
import homework3.dataAccess.category.HibernateCategoryDao;
import homework3.dataAccess.course.HibernateCourseDao;
import homework3.entities.Category;
import homework3.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		

		Logger[] loggers = {new DatabaseLogger()};	
		
		Category category1 = new Category(1, "React");
		Category category2 = new Category(2, "React");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		
		categoryManager.add(category1);
		categoryManager.add(category2);
		

		
		Course course = new Course(1,"java",10);
		Course course2 = new Course(2, "java", 555);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		
		courseManager.add(course); 
		courseManager.add(course2); 
		
	}

}
