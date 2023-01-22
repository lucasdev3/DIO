package abstraindobootcamp;

import java.time.LocalDate;
import abstraindobootcamp.dominio.Curso;
import abstraindobootcamp.dominio.Mentoria;

public class Main {

  public static void main(String[] args) {
    
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso de Java");
    curso1.setDescricao("descrição curso java");
    curso1.setCargaHoraria(8);
    
    Curso curso2 = new Curso();
    curso2.setTitulo("Curso de Javascript");
    curso2.setDescricao("descrição curso Javascript");
    curso2.setCargaHoraria(4);
    
    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria Java");
    mentoria.setDescricao("Descricao mentoria Java");
    mentoria.setData(LocalDate.now());
    
    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);
  }

}
