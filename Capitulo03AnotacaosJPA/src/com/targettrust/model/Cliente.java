package com.targettrust.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;


@Entity 
@Table( name="CLIENTES", uniqueConstraints=@UniqueConstraint(columnNames={"cpf"}))
// nome da entity que corresponde a tabela no banco.
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	// Define a chave primaria
	@GeneratedValue(strategy = GenerationType.AUTO)
	/*
	 * Define uma estrat�gia para atribuir um valor exclusivo para seus campos
	 * de id automaticamente. Os tipos de estrat�gias dispon�veis s�o IDENTITY,
	 * SEQUENCE, TABLE, and AUTO. A estrat�gia padr�o � AUTO, cuja aplica��o �
	 * deixada ao fornecedor do JPA para implementar.
	 */
	/*
	 * @Version: Define um campo de vers�o em uma entidade. JPA utiliza um campo
	 * vers�o para detectar modifica��es simult�neas para um dados armazenam o
	 * registro. Quando o tempo de execu��o do JPA detecta m�ltiplas tentativas
	 * de modificar simultaneamente o mesmo registro, ele lan�a uma exce��o ao
	 * tentar confirmar a �ltima transa��o. Isso evita que voc� Sobrescrever a
	 * confirma��o anterior com dados desatualizados.
	 */
	private int codigo;

	/*
	 * Define os da coluna no banco
	 * nullable: Se a coluna de banco de dados � anul�vel.
	 */
	@Column(name = "CPF", nullable = false)
	private long cpf;

	@Column(name = "PRIMEIRO_NOME", nullable = false, length = 50)
	private String primeiroNome;

	@Column(name = "ULTIMO_NOME", length = 50)
	private String ultimoNome;

	// Quando n�o definimos @Column � o pr�prio atributo o nome
	private String rua;

	@Column(name = "NUMERO", nullable = false)
	private String numero;

	@Column(name = "CIDADE")
	private String cidade;

	@Column(name = "CEP", nullable = false)
	private String cep;

	// @Temporal define que o campo ser� do tipo data
	@Column(name = "DATA_ATUALIZACAO")
	@Temporal(TemporalType.DATE)
	private Date dataAtualizacao;

	@OneToOne	
	@Basic(fetch = FetchType.LAZY)
	private Animal animal;

	//@Enumerated define se o dado sera gravado em numero o seu valor corespondente a enumerado.
	@Column(name = "TIPO_CLIENTE")
	@Enumerated(EnumType.STRING)
	private TipoCliente tipoCliente;
	
	public Cliente() {	}
	
	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

}
