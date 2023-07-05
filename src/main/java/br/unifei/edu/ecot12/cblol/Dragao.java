package br.unifei.edu.ecot12.cblol;

public abstract class Dragao<E extends Dragao<E>> {
	private String nome, bonus, efeitoAlma;
	
	public abstract E clonarDragao();
	public abstract void mudarMapa(Partida p);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBonus() {
		return bonus;
	}
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	public String getEfeitoAlma() {
		return efeitoAlma;
	}
	public void setEfeitoAlma(String efeitoAlma) {
		this.efeitoAlma = efeitoAlma;
	}
	
	
}
