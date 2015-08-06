package model.ids;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class MaterialDidaticoPKEmbeddable implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "COD_CURSO", nullable = false)
	private String codigoCurso;

	@Column(name = "VERSAO", nullable = false)
	private int versao;

	public MaterialDidaticoPKEmbeddable() {
	}

	public MaterialDidaticoPKEmbeddable(int versao, String codigoCurso) {
		this.versao = versao;
		this.codigoCurso = codigoCurso;
	}

	public String getCodigoCurso() {
		return this.codigoCurso;
	}

	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public int getVersao() {
		return this.versao;
	}

	public void setVersao(int versao) {
		this.versao = versao;
	}

	public int hashCode() {
		int hash = 0;
		hash += (int) versao;
		hash += (this.codigoCurso != null ? this.codigoCurso.hashCode() : 0);
		return hash;
	}

	public boolean equals(Object object) {
		if (!(object instanceof MaterialDidaticoPKEmbeddable)) {
			return false;
		}
		MaterialDidaticoPKEmbeddable other = (MaterialDidaticoPKEmbeddable) object;
		if (this.versao != other.versao)
			return false;
		if (this.codigoCurso != other.codigoCurso
				&& (this.codigoCurso == null || !this.codigoCurso
						.equals(other.codigoCurso)))
			return false;
		return true;
	}
}
