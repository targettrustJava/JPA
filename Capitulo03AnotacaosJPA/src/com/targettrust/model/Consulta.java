package com.targettrust.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Consulta {
	@Id
	 
//  @SequenceGenerator(sequenceName="consulta_seq",name="consulta_generator",initialValue=5,allocationSize=2)
//  @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="consulta_generator")

	@Column(name="ID_CONSULTA")
	
	private long codigo;
	@OneToOne
	private Animal animal;
	
	private Date dataConsulta;
	private Boolean cancelada;
	private Float preco;

	public Consulta() {
	}


	/**
	 * @param parametroAnimal
	 * @param parametroDataConsulta
	 * @param parametroCancelada
	 * @param parametroPreco
	 */
	public Consulta(Animal parametroAnimal, Date parametroDataConsulta,
			Boolean parametroCancelada, Float parametroPreco) {
		this.animal = parametroAnimal;
		this.dataConsulta = parametroDataConsulta;
		this.cancelada = parametroCancelada;
		this.preco = parametroPreco;
	}


	/**
	 * @return the animal
	 */
	public Animal getAnimal() {
		return this.animal;
	}

	/**
	 * @return the dataConsulta
	 */
	public Date getDataConsulta() {
		return this.dataConsulta;
	}

	/**
	 * @return the cancelada
	 */
	public Boolean getCancelada() {
		return this.cancelada;
	}

	/**
	 * @param parametroAnimal
	 *            the animal to set
	 */
	public void setAnimal(Animal parametroAnimal) {
		this.animal = parametroAnimal;
	}

	/**
	 * @param parametroDataConsulta
	 *            the dataConsulta to set
	 */
	public void setDataConsulta(Date parametroDataConsulta) {
		this.dataConsulta = parametroDataConsulta;
	}

	/**
	 * @param parametroCancelada
	 *            the cancelada to set
	 */
	public void setCancelada(Boolean parametroCancelada) {
		this.cancelada = parametroCancelada;
	}

	/**
	 * @return the preco
	 */
	public Float getPreco() {
		return this.preco;
	}

	/**
	 * @param parametroPreco the preco to set
	 */
	public void setPreco(Float parametroPreco) {
		this.preco = parametroPreco;
	}


}
