package homework3.dataAccess.educator;

import homework3.entities.Educator;

public class HibernateEducatorDao implements EducatorDao{

	@Override
	public void add(Educator educator) {
		System.out.println("Added to database with Hibernate ");
		
	}

}
