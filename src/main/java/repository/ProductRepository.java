package repository;

import model.Product;
import org.springframework.data.repository.CrudRepository;


//@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
