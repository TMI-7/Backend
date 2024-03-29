package tech.csm.productcrud.dao;

import java.util.List;

import tech.csm.productcrud.domain.Product;

public interface ProductDao {

	String addProduct(Product product);

	List<Product> displayAllProducts();

	Product getProductById(Integer id);

	String updateProduct(Product product);

	String deleteProduct(Integer id);

	List<Product> sortByPriceAsc();

	List<Product> sortByPriceDsc();

	List<Product> sortByManufacturingDateDesc();

//	String updateProductById(Product prod, Integer id);
}
