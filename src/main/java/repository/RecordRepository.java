package repository;

import model.Record;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Rafał on 2017-05-27.
 */
public interface RecordRepository extends CrudRepository <Record, Integer> {

    Record findById(int d);


}
