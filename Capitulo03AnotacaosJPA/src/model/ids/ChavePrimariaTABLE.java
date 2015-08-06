package model.ids;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/*
 Estratégia:
 IDENTITY: deixa para o banco
 SEQUENCE: cria uma sequência
 TABLE: usa uma tabela auxiliar
 AUTO: o banco de dados determina se é identity, sequence ou table

 */
@Entity
@Table(name = "CHAVES_TABLE")
public class ChavePrimariaTABLE implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@TableGenerator(name = "tabela",
							      table="GENERATOR_TABLE_CHAVES ", 
							      pkColumnName="KEY",
							      valueColumnName="VALUE",
							      pkColumnValue="ID_CHAVE",
							      allocationSize=10)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "tabela")
	@Column(name = "ID_CHAVE")
	private int codigo;
	
	private String nome;
	public ChavePrimariaTABLE() {
	}
	
	public ChavePrimariaTABLE( String nome) {
		this.nome = nome;
	}


	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
