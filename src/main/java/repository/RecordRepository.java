package repository;

import model.Record;
import org.springframework.data.repository.CrudRepository;


/**
 * Interface to communicate with DataBase
 * for model.record.
 *
 * @author Rafal Staszel
 */
//need implement service layer
public interface RecordRepository extends CrudRepository<Record, Integer> {
}
