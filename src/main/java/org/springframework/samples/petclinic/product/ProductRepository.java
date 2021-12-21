package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;



public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findAll();

    @Query ("SELECT t FROM ProductType t")
    List<ProductType> findAllProductTypes() throws DataAccessException;

    //TODO (Task2) Optional<Authorities> findByUser(@Param("user") User user) throws DataAccessException;

//TODO test6: can I create this method on my own right?
    
    @Query("SELECT t FROM ProductType t WHERE t.name = ?1")
    ProductType findProductTypeByName(String name) throws DataAccessException;

    Optional<List<Product>> findByPriceLessThan(@Param("price") double price) throws DataAccessException;

    Optional<Product> findById(int id);
    Product findByName(String name);
    Product save(Product p);
}
