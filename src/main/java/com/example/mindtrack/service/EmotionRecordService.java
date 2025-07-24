package com.example.mindtrack.service;

import com.example.mindtrack.model.EmotionRecord;
import com.example.mindtrack.repository.EmotionRecordRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmotionRecordService {
    private final EmotionRecordRepository repository;

    public EmotionRecordService(EmotionRecordRepository repository) {
        this.repository = repository;
    }

    public EmotionRecord saveRecord(EmotionRecord record) {
        return repository.save(record);  // Salva no banco
    }

    public List<EmotionRecord> getAllRecords() {
        return repository.findAll();  // Busca todos registros
    }
}