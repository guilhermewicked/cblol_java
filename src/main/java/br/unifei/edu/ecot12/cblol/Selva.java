package br.unifei.edu.ecot12.cblol;

public class Selva extends Jogador {
	private int monstrosEpicos;
	Selva(){};
	Selva(String nome, String nickname, String nacionalidade, Time t){
		this.setNome(nome);
		this.setNickname(nickname);
		this.setNacionalidade(nacionalidade);
		this.setTime(t);
	}
	public int getMonstrosEpicos() {
		return monstrosEpicos;
	}

	public void setMonstrosEpicos(int monstrosEpicos) {
		this.monstrosEpicos = monstrosEpicos;
	}

	public float atualizaScore() {
	      return 10*getMonstrosEpicos()/6;
	}
	
}
