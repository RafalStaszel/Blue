package repository;

import model.Record;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Rafał on 2017-05-27.
 */
//@Repository("recordRepository")
public interface RecordRepository extends JpaRepository<Record, Integer> {


    Record findById(int d);


}
