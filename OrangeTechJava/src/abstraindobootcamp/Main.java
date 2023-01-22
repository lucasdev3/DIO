package abstraindobootcamp;

import java.time.LocalDate;
import abstraindobootcamp.dominio.Bootcamp;
import abstraindobootcamp.dominio.Curso;
import abstraindobootcamp.dominio.Dev;
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

//    System.out.println(curso1);
//    System.out.println(curso2);
//    System.out.println(mentoria);
    
    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);
    
    Dev devLucas = new Dev();
    devLucas.setNome("Lucas");
    devLucas.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos antes do progresso Lucas" + devLucas.getConteudosInscritos());
    devLucas.progredir();
    devLucas.progredir();
    devLucas.progredir();
    System.out.println("Conteudos inscritos apos o progresso Lucas" + devLucas.getConteudosInscritos());
    System.out.println("Conteudos concluidos Lucas" + devLucas.getConteudosConcluidos());
    System.out.println("--------------");
    
    Dev devCamila = new Dev();
    devCamila.setNome("Camila");
    devCamila.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos inscritos antes do progresso Camila" + devCamila.getConteudosInscritos());
    devCamila.progredir();
    System.out.println("Conteudos inscritos apos o progresso Camila" + devCamila.getConteudosInscritos());
    System.out.println("Conteudos concluidos Camila" + devLucas.getConteudosConcluidos());
    
  }

}
