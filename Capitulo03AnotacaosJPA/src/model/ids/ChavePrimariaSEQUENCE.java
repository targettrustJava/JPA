package model.ids;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/*
 Estratégia:
 IDENTITY: deixa para o banco
 SEQUENCE: cria uma sequência
 TABLE: usa uma tabela auxiliar
 AUTO: o banco de dados determina se é identity, sequence ou table

 */
@Entity
@Table(name = "CHAVES_SEQUENCE")
public class ChavePrimariaSEQUENCE  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(sequenceName = "CHAVES_SEQUENCE_SEQ", name = "sequence")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence" )
	@Column(name = "ID_CHAVE")
	private int codigo;
	
	private String nome;
	
	public ChavePrimariaSEQUENCE() {
	}
	
	public ChavePrimariaSEQUENCE( String nome) {
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
