package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
//Dao = Data Access Object
	
	public void add(Product product) {
		//Sadece DB erişim kodları buraya yazılır --> 'SQL'
		System.out.println("JBDC ile veritabanına eklendi"); 
	}
}

//Hibernate