import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoum = new Curso();
        cursoum.setTitulo("Fundamentos da Orientação Objetos");
        cursoum.setDescricao("Veremos os principais conceitos e fundamentos da OO");
        cursoum.setCargaHoraria(8);

        Curso cursodois = new Curso();
        cursodois.setTitulo("Spring Boot");
        cursodois.setDescricao("Dando seus primeiros passos no uso deste framework");
        cursodois.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Abstraindo seu Domínio Através da Orientação a Objetos");
        mentoria.setDescricao("Entenda o que é o domínio de uma aplicação e como começar a modelar um domínio em POO");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Neste bootcamp você aprenderá o passo a passo da tecnologia e desenvolverá projetos 100% práticos");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeandro = new Dev();
        devLeandro.setNome("Leandro");
        devLeandro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Leandro:" + devLeandro.getConteudosInscritos());
        devLeandro.progredir();
        devLeandro.progredir();
        devLeandro.progredir();
        System.out.println("--------");
        System.out.println("Conteúdos Inscritos Leandro:" + devLeandro.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Leandro:" + devLeandro.getConteudosConcluidos());
        System.out.println("XP:" + devLeandro.calcularTotalXp());

        System.out.println("-------");

        Dev devJuliana = new Dev();
        devJuliana.setNome("Juliana");
        devJuliana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Juliana:" + devJuliana.getConteudosInscritos());
        devJuliana.progredir();
        devJuliana.progredir();
        System.out.println("--------");
        System.out.println("Conteúdos Inscritos Juliana:" + devJuliana.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Juliana:" + devJuliana.getConteudosConcluidos());
        System.out.println("XP:" + devJuliana.calcularTotalXp());

    }

}