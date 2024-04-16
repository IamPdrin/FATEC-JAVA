package fatec.sp.gov.br.apiEmail.ApiEmail;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import fatec.sp.gov.br.apiEmail.ApiEmail.service.ConsomeApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ApiEmailApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiEmailApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsomeApi lerApi = new ConsomeApi();
		String dados = lerApi.obterDados("https://jsonplaceholder.typicode.com/comments");

		ObjectMapper objMapper = new ObjectMapper();
		JsonNode jsonNode = objMapper.readTree(dados);

		List<JsonNode> jsonList = new ArrayList<>();
		jsonNode.forEach(jsonList::add);

		List<String> emails = jsonList.stream()
				.map(email -> email.get("email")
						.asText())
				.toList();

		emails.forEach(System.out::println);

		System.out.println("\n" + emails.size() + " e-mails foram enviados!");
	}
}
