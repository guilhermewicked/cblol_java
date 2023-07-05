package br.unifei.edu.ecot12.cblol;

public class Atirador extends Jogador {
	private int tropasAbatidas;
	Atirador(){};
	Atirador(String nome, String nickname, String nacionalidade, Time t){
		this.setNome(nome);
		this.setNickname(nickname);
		this.setNacionalidade(nacionalidade);
		this.setTime(t);
	}
	public int getTropasAbatidas() {
		return tropasAbatidas;
	}

	public void setTropasAbatidas(int tropasAbatidas) {
		this.tropasAbatidas = tropasAbatidas;
	}
	public float atualizaScore() {
	      return 10*getTropasAbatidas()/350;
	}

}
