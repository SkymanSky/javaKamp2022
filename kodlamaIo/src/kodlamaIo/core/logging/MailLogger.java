package kodlamaIo.core.logging;

public class MailLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Email ile loglandı: "+data);
		
	}

}
