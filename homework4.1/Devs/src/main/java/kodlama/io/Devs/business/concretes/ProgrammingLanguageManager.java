package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository languageRepository;

	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return languageRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguage language) throws Exception {

		List<ProgrammingLanguage> existingProgrammingLanguages;
		existingProgrammingLanguages = languageRepository.getAll();

		for (ProgrammingLanguage programmingLanguage : existingProgrammingLanguages) {

			if (language.getName().equals(programmingLanguage.getName())) {

				throw new Exception("Bu dil var.");
			}
		}

		if (language.getName().isEmpty()) {
			throw new Exception("Dil boş geçilemez.");
		} else {
			languageRepository.add(language);
		}

	}

	@Override
	public void delete(ProgrammingLanguage language) {
		languageRepository.delete(language);

	}

	@Override
	public void update(ProgrammingLanguage language) {
		if (language.getName() != "") {
			languageRepository.update(language);
		}

	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return languageRepository.getById(id);

	}

}
