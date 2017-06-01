package repository;

import model.Product;
import org.springframework.data.repository.CrudRepository;


/**
 * Interface to communicate with DataBase
 * for model.product.
 *
 * @author Rafal Staszel
 */
//need implement service layer
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
