package com.practice.journalApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practice.journalApp.repository.JournalRepository;
import com.practice.journalApp.service.JournalService;

import com.practice.journalApp.entity.JournalEntry;
@Service
public class JournalService {

    @Autowired
    private JournalRepository journalRepository;

    public List<JournalEntry> getAllJournals() {
        return journalRepository.findAll();
    }

    public JournalEntry getJournalById(int myId) {
        return journalRepository.findById(myId).orElse(null);
    }

    public void addJournal(JournalEntry journal) {
        journalRepository.save(journal);
    }

    public boolean updateJournal(int id, JournalEntry updatedJournal) {
        if (journalRepository.existsById(id)) {
            journalRepository.save(updatedJournal);
            return true;
        }
        return false;
    }

    public boolean deleteJournal(int id) {
        if (journalRepository.existsById(id)) {
            journalRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

