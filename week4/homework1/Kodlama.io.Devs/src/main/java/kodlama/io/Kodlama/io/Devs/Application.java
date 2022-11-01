package kodlama.io.Kodlama.io.Devs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kodlama.io.Kodlama.io.Devs.business.concretes.ProgrammingLanguageManager;
import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
