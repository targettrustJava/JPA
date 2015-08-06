package com.targettrust.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 * Classe de exemplo do Curso de Fundamentos Java
 * 
 * @author Cássio Trindade
 * @since Maio/2014
 * 
 */
@Entity
@Table(name="ANIMAIS")
public class Animal {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ANIMAL")
	private long id;
	
	@Enumerated(EnumType.STRING)
	private Especie especie;
	
	@Column( name="APELIDOS", nullable=false, length=100, updatable=true  )
	private String apelido;
	@Column( name="PESO", nullable=false, length=5, updatable=true  )
	private Float peso;
	@Column( name="ALTURA", nullable=false, length=5, updatable=true  )
	private Integer altura;
	@Column( name="STATUS_VIVO", nullable=false, length=1, updatable=true  )
	private boolean vivo;
	//Calculo do índice de massa corporal do animal
	@Transient
	private Integer imc;
	
	public Animal() {
	}

	/**
	 * @param parametroApelido
	 * @param parametroPeso
	 * @param parametroAltura
	 * @param parametroVivo
	 * @param parametroEspecie
	 * @throws ValidacaoException
	 */
	public Animal(String parametroApelido, float parametroPeso,
			int parametroAltura, boolean parametroVivo, Especie parametroEspecie)
			throws Exception {
		this.apelido = parametroApelido;
		this.setPeso(parametroPeso);
		this.setAltura(parametroAltura);
		this.vivo = parametroVivo;
		this.especie = parametroEspecie;
	}

	/**
	 * @return the apelido
	 */
	public String getApelido() {
		return this.apelido;
	}

	/**
	 * @return the peso
	 */
	public float getPeso() {
		return this.peso;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return this.altura;
	}

	/**
	 * @return the vivo
	 */
	public boolean isVivo() {
		return this.vivo;
	}

	/**
	 * @param parametroApelido
	 *            the apelido to set
	 */
	public void setApelido(String parametroApelido) {
		this.apelido = parametroApelido;
	}

	/**
	 * @param parametroPeso
	 *            the peso to set
	 */
	public void setPeso(float parametroPeso) throws Exception {
		if (parametroPeso < 0 || parametroPeso > 200)
			throw new Exception(
					"Peso Invalido tem que estar entre 1 e 200kg");
		this.peso = parametroPeso;

	}

	/**
	 * @param parametroAltura
	 *            the altura to set
	 * @throws Exception
	 */
	public void setAltura(int parametroAltura) throws Exception {
		if (parametroAltura < 0)
			throw new Exception(
					"Altura Invalido, tem que ser maior que 0cm");
		this.altura = parametroAltura;

	}

	/**
	 * @param parametroVivo
	 *            the vivo to set
	 */
	public void setVivo(boolean parametroVivo) {
		this.vivo = parametroVivo;
	}

	/**
	 * @return the especie
	 */
	public Especie getEspecie() {
		return especie;
	}

	/**
	 * @param parametroEspecie
	 *            the especie to set
	 */
	public void setEspecie(Especie parametroEspecie) {
		this.especie = parametroEspecie;
	}
	
	public float getImc(){
		return this.getPeso() / this.getAltura();
	}

}
