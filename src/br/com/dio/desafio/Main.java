package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;


public class Main {

	public static void main(String[] args) {
		//Instanciando Conteudo
		Conteudo conteudo = new Curso();
	
		//Instanciando Curso 1
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Curso de POO em Java");
		curso1.setCargaHoraria(8);
		
		//Instanciando Curso 2
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso de Javascript");
		curso2.setDescricao("Curso modificando o DOM javascript");
		curso2.setCargaHoraria(3);
		
		//Instanciando Mentoria
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Aceleração Java");
		mentoria.setDescricao("Descrição aceleração Java");
		mentoria.setData(LocalDate.now());
		
		//Instanciando um bootcamp
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);//Adicionando os cursos ao bootcamp
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		//Instanciando DevJoao
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos João "+ devJoao.getConteudoInscritos());
		devJoao.progredir();//Concluindo os cursos + Aumentando calcularTotalXP
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos João "+ devJoao.getConteudoInscritos());
		System.out.println("Conteúdos Inscritos João "+ devJoao.getConteudoConcluidos());
		System.out.println("XP:" + devJoao.calcularTotalXp());
		
		System.out.println("---------------------------------------------------------");

		//Instanciando DevJoao
		Dev devAna = new Dev();
		devAna.setNome("João");
		devAna.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos João "+ devAna.getConteudoInscritos());
		devAna.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos João "+ devAna.getConteudoInscritos());
		System.out.println("Conteúdos Inscritos João "+ devAna.getConteudoConcluidos());
		System.out.println("XP:" + devAna.calcularTotalXp());
	}

}
