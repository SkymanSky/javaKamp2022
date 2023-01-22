package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage language) throws Exception;
	void delete(ProgrammingLanguage language);
	void update(ProgrammingLanguage language);
	ProgrammingLanguage getById(int id);
}
