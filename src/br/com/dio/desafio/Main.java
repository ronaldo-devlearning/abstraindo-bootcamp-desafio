package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso Javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Dev devFulano = new Dev();
        devFulano.setNome("Fulano");
        devFulano.inscreverBootcamp(bootcamp);
        devFulano.progredir();
        devFulano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Fulano: " + devFulano.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Fulano: " + devFulano.getConteudosConcluidos());
        System.out.println("XP: " + devFulano.calcularTotalXp());

        System.out.println("----------");

        Dev devSicrano = new Dev();
        devSicrano.setNome("Sicrano");
        devSicrano.inscreverBootcamp(bootcamp);
        devSicrano.progredir();
        devSicrano.progredir();
        devSicrano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Sicrano: " + devSicrano.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Sicrano: " + devSicrano.getConteudosConcluidos());
        System.out.println("XP: " + devSicrano.calcularTotalXp());
    }

}
