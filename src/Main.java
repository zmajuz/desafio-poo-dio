import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developes");
        bootcamp.setDescricao("Descricao Bootecamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJulia = new Dev();
        devJulia.setNome("Julia");
        devJulia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devJulia.getConteudoInscritos());

        devJulia.progredir();
        devJulia.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devJulia.getConteudoInscritos());
        System.out.println("Conteudos Concluidos" + devJulia.getConteudoConcluido());
        System.out.println("XP:" + devJulia.calcularTotalXp());

        System.out.println("--------");

        Dev devMateus = new Dev();
        devMateus.setNome("Mateus");
        devMateus.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devMateus.getConteudoInscritos());
        devMateus.progredir();
        devMateus.progredir();
        devMateus.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devMateus.getConteudoInscritos());
        System.out.println("Conteudos Concluidos" + devMateus.getConteudoConcluido());
        System.out.println("XP:" + devMateus.calcularTotalXp());

    }
}