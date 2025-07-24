package com.example.mindtrack.repository;

import com.example.mindtrack.model.EmotionRecord;
import com.sun.jdi.InterfaceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmotionRecordRepository extends JpaRepository<EmotionRecord, Long> {
    // Herda métodos como save(), findAll(), deleteById()
}
