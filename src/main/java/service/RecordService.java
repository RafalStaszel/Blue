package service;

import model.Record;



public interface RecordService {

    public Iterable<Record> findAll();
    public Record findOne(int id);
    public void save(Record record);
    public void delate(int id);
}
