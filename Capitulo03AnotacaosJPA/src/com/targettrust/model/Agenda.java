package com.targettrust.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Agenda {
	@Id 
	@Column(name="ID_AGENDA")
	private long id;
	@OneToMany
	@JoinColumn(name="ID_CONSULTA")
	private Collection<Consulta> consultas;

	
	public Agenda() {
		consultas = new ArrayList<Consulta>();
	}

	public void incluiAgenda(Consulta c) {
		if (consultas.size() < 5){ 
			consultas.add(c);
			System.out.println("Adicionado a Consulta para: " + c.getAnimal().getApelido());
		}
		else System.out.println("**----------Consultas atingiram o limite de 5 datas");
	}
	/**
	 * @return the consultas
	 */
	public Collection<Consulta> getConsultas() {
			return this.consultas;
	}

	/**
	 * @param parametroConsultas
	 *            the consultas to set
	 */
	public void setConsultas(ArrayList<Consulta> parametroConsultas) {
			this.consultas = parametroConsultas;
		
	}
	
	public void listaConsultas() {
		
		StringBuilder sb = new StringBuilder();
		float soma = 0f;
		Animal animal;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		System.out.println("Relat�rio de Consultas_________________________________");
		for (Consulta c : consultas){
			animal = c.getAnimal();
			sb.append(animal.getApelido() + " -- " + animal.getEspecie() + "\n"
					+ "\t Data:" + sdf.format(c.getDataConsulta())+"\n");
			soma += c.getPreco();
		}
		sb.append("\n_________________________________\n");
		sb.append("Total de Consultas:" + consultas.size() +" no valor de: " + soma);
	
		System.out.println(sb);
	}
	
}
