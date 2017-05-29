package service;

import model.Record;

import java.util.List;

/**
 * Created by Rafał on 2017-05-29.
 */
public interface RecordService {

    public List<Record> getAllRecords();
    public Record findOne(int id);
    public void save(Record record);
}
