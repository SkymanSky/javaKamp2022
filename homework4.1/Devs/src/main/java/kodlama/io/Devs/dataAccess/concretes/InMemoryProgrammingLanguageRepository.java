package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
	List<ProgrammingLanguage> programmingLanguages;

	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages= new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"C Sharp"));
		programmingLanguages.add(new ProgrammingLanguage(2,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		 
		return programmingLanguages;
	}

	@Override
	public void add(ProgrammingLanguage language) {
		programmingLanguages.add(language);
		
	}

	@Override
	public void delete(ProgrammingLanguage language) {
		programmingLanguages.remove(language.getId());
		
	}

	@Override
	public void update(ProgrammingLanguage language) {
		programmingLanguages.set(language.getId()-1, language);
		
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		
		return programmingLanguages.get(id-1);
	}

	
}
