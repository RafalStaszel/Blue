package repository;

import model.Record;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Rafał on 2017-05-28.
 */
public interface RecordJpaRepository extends JpaRepository <Record, Integer>{
}
