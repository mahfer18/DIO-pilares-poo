import desafio.bootcamp.dominio.Bootcamp;
import desafio.bootcamp.dominio.Curso;
import desafio.bootcamp.dominio.Dev;
import desafio.bootcamp.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição Curso Python");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

       /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Maria Fernanda");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria Fernanda: "+ dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Concluidos Maria Fernanda: "+ dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());
        System.out.println("------------------------------------------------------------------");
        System.out.println("Conteúdos Inscritos Maria Fernanda: "+ dev1.getConteudosInscritos());
        System.out.println("==================================================================");

        Dev dev2= new Dev();
        dev2.setNome("Joao");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joao: "+ dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos Concluidos Joao: "+ dev2.getConteudosConcluidos());
        System.out.println("XP: "+dev2.calcularTotalXp());
        System.out.println("------------------------------------------------------------------");
        System.out.println("Conteúdos Inscritos Joao: "+ dev2.getConteudosInscritos());
        System.out.println("==================================================================");



    }
}
