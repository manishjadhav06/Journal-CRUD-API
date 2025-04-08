package com.practice.journalApp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.journalApp.entity.JournalEntry;

public interface JournalRepository extends JpaRepository<JournalEntry, Integer> {

}
