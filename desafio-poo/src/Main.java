import desafio_dominio.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devPatricia = new Dev("Patrícia",0d);
        //devPatricia.setNome("Patrícia Nunes");
        devPatricia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Patrícia: " + devPatricia.getConteudosInscritos());
        devPatricia.progredir();
        devPatricia.progredir();
        devPatricia.progredir();
        System.out.println("----");
        System.out.println("Conteúdos inscritos Patrícia: " + devPatricia.getConteudosInscritos());
        System.out.println("----");
        System.out.println("Conteúdos concluídos Patrícia: " + devPatricia.getConteudosConcluidos());
        System.out.println("----");
        devPatricia.setPositionXp(devPatricia.calcularTotalXP());
        System.out.println(devPatricia.getPositionXp());


        System.out.println();
        System.out.println("///////////////////////////////////////////////////////");
        System.out.println();

        Dev devCamila = new Dev("Camila",0d);
        //devCamila.setNome("Camila Cavalcante");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("----");
        devCamila.progredir();
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("----");
        System.out.println("Conteúdos concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("----");
        System.out.println("XP: " + devCamila.calcularTotalXP());

        System.out.println("////////////////////////////////////////");
        System.out.println("Tentativas com conllection");

        Map<String, Dev> meuComparator = new HashMap<>(){{
            put("First", new Dev("Patrícia",210d));
            put("Second", new Dev("Camila",80d));
        }};

        System.out.println("Imprima do menor para o maior : ) "); /// Estudando para melhorar conhecimento de collection

        Set<Map.Entry<String,Dev>> comparador = new TreeSet<>(new ComparatorXp());
        comparador.addAll(meuComparator.entrySet());
        for (Map.Entry<String, Dev> rank : comparador){
            System.out.println(rank.getKey() + " - " + rank.getValue().getNome() + " - " + rank.getValue().getPositionXp());
        }
    }
}