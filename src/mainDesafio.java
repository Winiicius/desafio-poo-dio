import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class mainDesafio {
    public static void main(String[] args){
        
        Curso curso1 = new Curso("Curso Java", "Aprender Java", 20);
        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Mentoria java", LocalDate.now());
        System.out.println(mentoria1);
    }
}
