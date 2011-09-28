package per.search.persistence;

import java.util.Collection;

import per.search.persistence.model.Product;

public interface ProductsDAO {

	boolean put(String key, Product product);

	Product get(String key);

	Collection<Product> getAll();		
}