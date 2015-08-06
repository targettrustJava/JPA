package model.ids;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "MATERIAIS_DIDATICOS_IDCLASS")
@IdClass (MaterialDidaticoPKIdClass.class)
public class MaterialDidaticoIdClass implements Serializable {
	
	private static final long serialVersionUID = 5L;
	@Id
	@Column(name="COD_CURSO")
	private String codigoCurso;
	
	@Id
	@Column(name="VERSAO")
	private int versao;
	
	public MaterialDidaticoIdClass() {
	}

	public String getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public int getVersao() {
		return versao;
	}

	public void setVersao(int versao) {
		this.versao = versao;
	}

	
}
