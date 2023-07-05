package br.unifei.edu.ecot12.cblol;

public class Topo extends Jogador {
	private float danoAutoMitigado;
	Topo(){};
	Topo(String nome, String nickname, String nacionalidade, Time t){
		this.setNome(nome);
		this.setNickname(nickname);
		this.setNacionalidade(nacionalidade);
		this.setTime(t);
	}
	public float getDanoAutoMitigado() {
		return danoAutoMitigado;
	}

	public void setDanoAutoMitigado(float danoAutoMitigado) {
		this.danoAutoMitigado = danoAutoMitigado;
	}
	public float atualizaScore() {
	      return 10*getDanoAutoMitigado()/60000;
	}

}
