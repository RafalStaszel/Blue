package repository;

import model.Record;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
=======
import org.springframework.data.repository.CrudRepository;
>>>>>>> a3b0249a38acf9dd3d2e78d7221525e22584eae0

/**
 * Created by Rafał on 2017-05-27.
 */
<<<<<<< HEAD
//@Repository("recordRepository")
public interface RecordRepository extends JpaRepository<Record, Integer> {

=======
public interface RecordRepository extends CrudRepository <Record, Integer> {

    Record findById(int d);
>>>>>>> a3b0249a38acf9dd3d2e78d7221525e22584eae0


}
