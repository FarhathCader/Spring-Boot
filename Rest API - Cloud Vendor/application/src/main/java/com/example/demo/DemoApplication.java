package com.example.demo;

import com.example.demo.model.StoreInformation;
import com.example.demo.repository.StoreInformationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class  DemoApplication implements CommandLineRunner {

	@Autowired
	StoreInformationRepo storeInformationRepo;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Override
	public void run(String... args) {

		List<StoreInformation> stores = Arrays.asList(
				new StoreInformation("Lulu", "Kochi", "0771577719", "lulu@gmail.com"),
				new StoreInformation("MegaMart", "Mumbai", "0771577720", "lulu@gmail.com"),
				new StoreInformation("HyperCity", "Mumbai", "0771577721", "hypercity@gmail.com"),
				new StoreInformation("HyperCity", "Mumbai_", "077157772112", "hypercity@yahoo.com")

		);

		storeInformationRepo.saveAll(stores);

		List<StoreInformation>  k= storeInformationRepo.findByStoreName("HyperCity");
		k.forEach(System.out::println);

	}

}
