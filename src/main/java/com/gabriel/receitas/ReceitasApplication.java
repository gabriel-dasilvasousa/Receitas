package com.gabriel.receitas;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gabriel.receitas.entities.Receita;
import com.gabriel.receitas.repositories.ReceitaRepository;

@SpringBootApplication
public class ReceitasApplication implements CommandLineRunner {

	@Autowired
	ReceitaRepository receitaRepo;

	public static void main(String[] args) {
		SpringApplication.run(ReceitasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Receita r1 = new Receita(null, "Bolo", "https://images.unsplash.com/photo-1497730620907-6a4cf807bb94?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", 60, 10,
				"2 xícaras (chá) de açúcar 3 xícaras (chá) de farinha de trigo 4 colheres (sopa) de margarina 3 ovos 1 e 1/2 xícara (chá) de leite 1 colher (sopa) bem cheia de fermento em pó",
				"Bata as claras em neve e reserve. Misture as gemas, a margarina e o açúcar até obter uma massa homogênea. Acrescente o leite e a farinha de trigo aos poucos, sem parar de bater. Por último, adicione as claras em neve e o fermento. Despeje a massa em uma forma grande de furo central untada e enfarinhada. Asse em forno médio 180 °C, preaquecido, por aproximadamente 40 minutos ou ao furar o bolo com um garfo, este saia limpo.", 
				"Lanche");
		
		Receita r2 = new Receita(null, "Bolo", "https://images.unsplash.com/photo-1497730620907-6a4cf807bb94?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", 60, 10,
				"2 xícaras (chá) de açúcar 3 xícaras (chá) de farinha de trigo 4 colheres (sopa) de margarina 3 ovos 1 e 1/2 xícara (chá) de leite 1 colher (sopa) bem cheia de fermento em pó",
				"Bata as claras em neve e reserve. Misture as gemas, a margarina e o açúcar até obter uma massa homogênea. Acrescente o leite e a farinha de trigo aos poucos, sem parar de bater. Por último, adicione as claras em neve e o fermento. Despeje a massa em uma forma grande de furo central untada e enfarinhada. Asse em forno médio 180 °C, preaquecido, por aproximadamente 40 minutos ou ao furar o bolo com um garfo, este saia limpo.", 
				"Lanche");
		
		Receita r3 = new Receita(null, "Feijao", "https://images.unsplash.com/photo-1497730620907-6a4cf807bb94?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", 60, 10,
				"2 xícaras (chá) de açúcar 3 xícaras (chá) de farinha de trigo 4 colheres (sopa) de margarina 3 ovos 1 e 1/2 xícara (chá) de leite 1 colher (sopa) bem cheia de fermento em pó",
				"Bata as claras em neve e reserve. Misture as gemas, a margarina e o açúcar até obter uma massa homogênea. Acrescente o leite e a farinha de trigo aos poucos, sem parar de bater. Por último, adicione as claras em neve e o fermento. Despeje a massa em uma forma grande de furo central untada e enfarinhada. Asse em forno médio 180 °C, preaquecido, por aproximadamente 40 minutos ou ao furar o bolo com um garfo, este saia limpo.", 
				"Lanche");
		
		Receita r4 = new Receita(null, "Lasagna", "https://images.unsplash.com/photo-1497730620907-6a4cf807bb94?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60", 60, 10,
				"2 xícaras (chá) de açúcar 3 xícaras (chá) de farinha de trigo 4 colheres (sopa) de margarina 3 ovos 1 e 1/2 xícara (chá) de leite 1 colher (sopa) bem cheia de fermento em pó",
				"Bata as claras em neve e reserve. Misture as gemas, a margarina e o açúcar até obter uma massa homogênea. Acrescente o leite e a farinha de trigo aos poucos, sem parar de bater. Por último, adicione as claras em neve e o fermento. Despeje a massa em uma forma grande de furo central untada e enfarinhada. Asse em forno médio 180 °C, preaquecido, por aproximadamente 40 minutos ou ao furar o bolo com um garfo, este saia limpo.", 
				"Lanche");
		
		receitaRepo.saveAll(Arrays.asList(r1,r2,r3,r4));
		
	}

}
