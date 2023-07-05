package br.unifei.edu.ecot12.cblol;

public abstract class Jogador extends Competidor {
	private float abates, mortes, assistencias, kda;
	private void atualizaKDA() {
		this.kda = abates+assistencias/mortes;
	}
	

}
