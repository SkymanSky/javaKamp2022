package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("api/programminglanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService languageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService languageService) {
		 
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(){
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(ProgrammingLanguage language) throws Exception{
		languageService.add(language);
	}
	
	@PostMapping("/delete")
	public void delete(ProgrammingLanguage language) {
		languageService.delete(language);
	}
	
	@PostMapping("/update")
	public void update(ProgrammingLanguage language) {
		languageService.update(language);
	}
	
	@GetMapping("/getById")
	public ProgrammingLanguage getById(int id) {
		return languageService.getById(id);
	}
}
