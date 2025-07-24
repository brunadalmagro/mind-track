package com.example.mindtrack.controller;

import com.example.mindtrack.model.EmotionRecord;
import com.example.mindtrack.service.EmotionRecordService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/records")
public class EmotionRecordController {
    private final EmotionRecordService service;

    public EmotionRecordController(EmotionRecordService service) {
        this.service = service;
    }

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("record", new EmotionRecord());  // Objeto vazio para o formulário
        return "record-form";  // Template: record-form.html
    }

    @PostMapping
    public String saveRecord(@ModelAttribute EmotionRecord record) {
        service.saveRecord(record);  // Salva no banco
        return "redirect:/records/list";  // Redireciona para a lista
    }

    @GetMapping("/list")
    public String listRecords(Model model) {
        model.addAttribute("records", service.getAllRecords());  // Busca todos registros
        return "records-list";  // Template: records-list.html
    }
}