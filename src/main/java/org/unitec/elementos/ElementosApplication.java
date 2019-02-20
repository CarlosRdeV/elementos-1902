package org.unitec.elementos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosApplication implements CommandLineRunner{

    @Autowired
    RepoUsuario repoU;
    
	public static void main(String[] args) {
		SpringApplication.run(ElementosApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        //Aqui iran todas nuestras pruebas, sin necesidad de interfaz de usuario UI
        repoU.save(new Usuario(1, "CarlosRdeV"));
    }

}

