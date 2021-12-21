package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;


@Service
public class ProductService {


    @Autowired
    ProductRepository productrepo;

    @Autowired
    public ProductService(ProductRepository productRepo){
        this.productrepo = productRepo;
    }

    public List<Product> getAllProducts(){
        return productrepo.findAll();
    }

    public List<Product> getProductsCheaperThan(double price) throws DataAccessException{
        return productrepo.findByPriceLessThan(price).get();
    }

    public ProductType getProductType(String typeName) throws DataAccessException{
        return productrepo.findProductTypeByName(typeName);
    }

    public List<ProductType> getAllProductTypes() throws DataAccessException{
        return productrepo.findAllProductTypes();
    }

    public Product save(Product p){
        return null;       
    }

    
}
