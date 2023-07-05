package br.unifei.edu.ecot12.cblol;

public class Suporte extends Jogador {
	private float placarVisao;
	Suporte(){};
	Suporte(String nome, String nickname, String nacionalidade, Time t){
		this.setNome(nome);
		this.setNickname(nickname);
		this.setNacionalidade(nacionalidade);
		this.setTime(t);
	}
	public float getPlacarVisao() {
		return placarVisao;
	}

	public void setPlacarVisao(float placarVisao) {
		this.placarVisao = placarVisao;
	}
	public float atualizaScore() {
	      return 10*getPlacarVisao()/80;
	}

}
