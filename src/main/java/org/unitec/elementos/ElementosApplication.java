package org.unitec.elementos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosApplication implements CommandLineRunner {

    @Autowired
    RepoUsuario repoU;

    public static void main(String[] args) {
        SpringApplication.run(ElementosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Aqui iran todas nuestras pruebas, sin necesidad de interfaz de usuario UI, giardar
        //repoU.save(new Usuario(2, "Montserrat"));

        //Buscar todos, usaremos un for mejorado
        // for(Usuario u:repoU.findAll()){
        //   System.out.println(u);
        //}
        //Buscar por ID
        //        System.out.println(repoU.findById(2).get());
        //Actualizar
        //repoU.save(new Usuario(4, "Carlos"));
        //Para probar usamos el siguiente buscar por id
        //System.out.println(repoU.findById(1));
        //borrar{
        //repoU.deleteById(1);
        //for(Usuario u:repoU.findAll()){
        //     System.out.println(u);
        //}
        //Buscar por nombre
        // for(Usuario u:repoU.findByNombre("Carlos")){
        //     System.out.println(u);
        // }
    }

}
