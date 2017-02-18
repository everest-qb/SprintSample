package tw.taichung.spring.test;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import tw.taichung.spring.test.jpa.Abc;

@SpringBootApplication
public class Run {

	private static final Logger log = LoggerFactory.getLogger(Run.class);
	
	public static void main(String[] args) {		
		
		SpringApplication.run(Run.class);		
	}

	@Bean
	public CommandLineRunner demo(AbcRepository repository){
		Random rand = new Random();
		return (arg)->{
			long start =System.nanoTime();
			for (int j = 0; j < 200; j++) {
				new Thread(()->{
					for (int i = 0; i < 20; i++) {
						/*Abc obj = new Abc();
						obj.setName(UUID.randomUUID().toString());
						obj.setNumber(rand.nextInt());
						repository.save(obj);*/
						repository.findOne(rand.nextInt());
					}
					
				}).start();				
			}
			log.info("save:{}",(System.nanoTime()-start));
			
			/*repository.findAll().forEach((abc) -> {
				log.info(abc.toString());
			});*/				
			
		};		
	}
}
