package ma.cigma.pfe.dao;
import ma.cigma.pfe.models.client;
import ma.cigma.pfe.service.iclientservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import
org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component

public class MockClients implements CommandLineRunner {
	private static final Logger logger =
			LoggerFactory.getLogger(MockClients.class);
			@Autowired
			private iclientdao clientRepository;
			@Override
			public void run(String... args) throws Exception {
			client c1 = new client("Omar");
			client c2 = new client("Said");
			client c3 = new client("Ahmed");
			client c4 = new client("Farah");
			clientRepository.save(c1);
			clientRepository.save(c2);
			clientRepository.save(c3);
			clientRepository.save(c4);
			clientRepository.findAll().forEach(c ->
			System.out.println
			(c)
			);
			}

}
