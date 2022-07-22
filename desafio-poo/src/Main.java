import desafio_dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Introdução Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Kotlin");
        curso2.setDescricao("Introdução Kotlin");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Spring Boot");
        mentoria1.setDescricao("Apresentação dos recursos do Framework");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devPatricia = new Dev();
        devPatricia.setNome("Patrícia Nunes");
        devPatricia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Patrícia: " + devPatricia.getConteudosInscritos());
        devPatricia.progredir();
        devPatricia.progredir();
        devPatricia.progredir();
        System.out.println("----");
        System.out.println("Conteúdos inscritos Patrícia: " + devPatricia.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Patrícia: " + devPatricia.getConteudosConcluidos());
        System.out.println("XP: " + devPatricia.calcularTotalXP());

        System.out.println();

        Dev devCamila = new Dev();
        devCamila.setNome("Camila Cavalcante");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " + devPatricia.getConteudosInscritos());
        System.out.println("----");
        devCamila.progredir();
        System.out.println("Conteúdos inscritos Camila: " + devPatricia.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Camila: " + devPatricia.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXP());



    }

}
