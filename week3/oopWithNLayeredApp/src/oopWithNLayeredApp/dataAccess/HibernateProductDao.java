package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	public void add(Product product) {
		// sadece db erişim kodları yazılır
		System.out.println("Added to database with Hibernate ");
	}
}