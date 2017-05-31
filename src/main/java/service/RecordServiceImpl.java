package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.Record;
import repository.RecordRepository;

import java.util.List;


@Service("recordService")
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordRepository recordRepository;

    @Override
    public Iterable<Record> findAll() {
        return recordRepository.findAll();
    }

    @Override
    public Record findOne(int id) {
        return recordRepository.findOne(id);
    }

    @Override
    public void save(Record record) {

    }

    @Override
    public void delate(int id) {

    }


}