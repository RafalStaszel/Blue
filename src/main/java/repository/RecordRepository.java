package repository;

import model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Rafał on 2017-05-27.
 */
@Repository
public interface RecordRepository extends JpaRepository<Record, Integer> {




}
