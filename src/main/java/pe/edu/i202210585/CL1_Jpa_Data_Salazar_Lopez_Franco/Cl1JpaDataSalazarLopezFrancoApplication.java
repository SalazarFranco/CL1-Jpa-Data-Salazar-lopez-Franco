package pe.edu.i202210585.CL1_Jpa_Data_Salazar_Lopez_Franco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.i202210585.CL1_Jpa_Data_Salazar_Lopez_Franco.model.Country;
import pe.edu.i202210585.CL1_Jpa_Data_Salazar_Lopez_Franco.repository.CountryRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Cl1JpaDataSalazarLopezFrancoApplication implements CommandLineRunner {

	@Autowired
	CountryRepository countryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Cl1JpaDataSalazarLopezFrancoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Buscar el país con código "ARG"
		/*Optional<Country> argentina = countryRepository.findById("ARG");
		argentina.ifPresentOrElse(
				Country -> {
					System.out.println("Lenguajes de Argentina:");
					Country.getLanguages().forEach(language -> System.out.println(language.getLanguage()));
				},
				() -> {
					// Si no se encuentra "ARG", buscar "PER"
					Optional<Country> perCountry = countryRepository.findById("PER");
					perCountry.ifPresent(per -> {
						System.out.println("Lenguajes de Perú:");
						per.getLanguages().forEach(lang -> System.out.println(lang.getLanguage()));
					});
				}
		);*/

		// Lista de IDs de los países a eliminar
		List<String> countryIdsToDelete = Arrays.asList("COL", "ARG");

		countryRepository.deleteAllById(countryIdsToDelete);
		System.out.println("Países eliminados con sus ciudades y lenguajes asociados");
	}
}
