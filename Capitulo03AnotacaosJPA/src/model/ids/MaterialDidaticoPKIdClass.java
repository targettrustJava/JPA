package model.ids;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class MaterialDidaticoPKIdClass implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="COD_CURSO")
	private String codigoCurso;
	private int versao;

	public MaterialDidaticoPKIdClass() {
	}

	public MaterialDidaticoPKIdClass(int versao, String codigoCurso) {
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
		hash += versao;
		hash += (this.codigoCurso != null ? this.codigoCurso.hashCode() : 0);
		return hash;
	}

	public boolean equals(Object object) {
		if (!(object instanceof MaterialDidaticoPKIdClass)) {
			return false;
		}
		MaterialDidaticoPKIdClass other = (MaterialDidaticoPKIdClass) object;
		if (this.versao != other.versao)
			return false;
		if (this.codigoCurso != other.codigoCurso
				&& (this.codigoCurso == null || !this.codigoCurso
						.equals(other.codigoCurso)))
			return false;
		return true;
	}
}