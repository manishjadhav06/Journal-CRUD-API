package com.practice.journalApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.journalApp.entity.JournalEntry;
import com.practice.journalApp.service.JournalService;

@RestController
@RequestMapping("/journal")
public class JournalEntryCtrl {
	
	@Autowired
	private JournalService journalService;
	
	@GetMapping
	public List<JournalEntry> getAll(){
		System.out.println("Fetching all entries");
		return journalService.getAllJournals();

	}
	
	@PostMapping
	public boolean createEntry(@RequestBody JournalEntry myEntry) {
		journalService.addJournal(myEntry);
		return true;
	}
	
	@GetMapping("/id/{myId}")
	public JournalEntry searchById(@PathVariable int myId) {
		return journalService.getJournalById(myId);
	}
	
	@DeleteMapping("/id/{myId}")
	public boolean deleteById(@PathVariable int myId) {
		return journalService.deleteJournal(myId);
	}
	
	@PutMapping("/id/{myId}")
	public boolean updateById(@PathVariable int myId, @RequestBody JournalEntry myEntry) {
		return journalService.updateJournal(myId, myEntry);
	}
	
}
