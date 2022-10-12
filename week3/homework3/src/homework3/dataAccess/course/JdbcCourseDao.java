package homework3.dataAccess.course;

import homework3.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Added to database with Jdbc ");
		
	}

}
