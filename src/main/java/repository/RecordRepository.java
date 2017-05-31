package repository;

import model.Record;
import org.springframework.data.repository.CrudRepository;


//@Repository
public interface RecordRepository extends CrudRepository<Record, Integer> {
}
