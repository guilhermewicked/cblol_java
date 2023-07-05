package br.unifei.edu.ecot12.cblol;

public class Meio extends Jogador {
	private float danoMagico;
	Meio(){};
	Meio(String nome, String nickname, String nacionalidade,Time t){
		this.setNome(nome);
		this.setNickname(nickname);
		this.setNacionalidade(nacionalidade);
		this.setTime(t);
	}
	public float getDanoMagico() {
		return danoMagico;
	}

	public void setDanoMagico(float danoMagico) {
		this.danoMagico = danoMagico;
	}
	public float atualizaScore() {
	      return 10*getDanoMagico()/50000;
	}

}
