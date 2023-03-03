import java.time.LocalDate;

import br.com.dio.desafio.dominio.*;

public class mainDesafio {
    public static void main(String[] args){ 
        
        Curso cursoJava = new Curso("Curso Java", "Aprender Java", 20);
        Curso cursoPython = new Curso("Curso Python", "Aprender Python", 15);

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Mentoria java", LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp("Dio Bootcamp", "Aprendendo Java", 30);
        Bootcamp bootcampPython = new Bootcamp("Dio Bootcamp", "Aprendendo Python", 25);

        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(mentoria1);
        bootcampPython.getConteudos().add(cursoPython);

        Dev dev1 = new Dev("Winicius");
        Dev dev2 = new Dev("Marcos");
        
        dev1.inscreverBootcamp(bootcampPython);
        dev1.progredir();
        
        dev1.inscreverBootcamp(bootcampJava);
        System.out.println("XP Winicius: " + dev1.calcularTotalXP());

        dev2.inscreverBootcamp(bootcampPython);
        System.out.println("XP Marcos: " + dev2.calcularTotalXP());



    }
}
