package model.ids;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "MATERIAIS_DIDATICOS")
public class MaterialDidaticoEmbeddable implements Serializable {

	private static final long serialVersionUID = 5L;

	@EmbeddedId
	protected MaterialDidaticoPKEmbeddable pk = new MaterialDidaticoPKEmbeddable();

	private String descricao;

	public MaterialDidaticoPKEmbeddable getPk() {
		return this.pk;
	}

	public void setPk(MaterialDidaticoPKEmbeddable pk) {
		this.pk = pk;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}