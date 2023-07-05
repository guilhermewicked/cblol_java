package br.unifei.edu.ecot12.cblol;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Time {
	private String nome;
	private int titulos, importacoes;
	private float tfScore;
	private List<Jogador> elenco = new ArrayList<Jogador>();
	private List<Jogador> titular = new ArrayList<Jogador>();
	private List<Jogador> academy = new ArrayList<Jogador>();
	private Treinador treinador = new Treinador();
	private int vitorias = 0;
	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public Treinador getTreinador() {
		return treinador;
	}

	public void setTreinador(Treinador treinador) {
		this.treinador = treinador;
	}

	Time(){}
	
	Time(String nome, int titulos, int importacoes){
		this.setNome(nome);
		this.setTitulos(titulos);
		this.setImportacoes(importacoes);
	}
	
	public Boolean addJogador(Jogador j) {
	this.elenco.add(j);
		return true;
	}
	public Boolean escalarTitular(Jogador j) {
		if(!(this.getElenco().contains(j))) {
			return false;
		}
		if(j instanceof Topo) {
			setTitular(0, j);
			return true;
		}
		if(j instanceof Selva) {
			setTitular(1, j);
			return true;
		}
		if(j instanceof Meio) {
			setTitular(2, j);
			return true;
		}
		if(j instanceof Atirador) {
			setTitular(3, j);
			return true;
		}
		if(j instanceof Suporte) {
			setTitular(4, j);
			return true;
		}
		return null;
	}
	public Boolean escalarAcademy(Jogador j) {
		if(!(this.getElenco().contains(j))) {
			return false;
		}
		if(j instanceof Topo) {
			setAcademy(0, j);
			return true;
		}
		if(j instanceof Selva) {
			setAcademy(1, j);
			return true;
		}
		if(j instanceof Meio) {
			setAcademy(2, j);
			return true;
		}
		if(j instanceof Atirador) {
			setAcademy(3, j);
			return true;
		}
		if(j instanceof Suporte) {
			setAcademy(4, j);
			return true;
		}
		return null;
	}
	public void getTime() {
		System.out.println(getNome());
		System.out.println("Topo: " + titular.get(0).getNome()+" '"+ titular.get(0).getNickname()+"'");
		System.out.println("Selva: " + titular.get(1).getNome()+" '"+ titular.get(1).getNickname()+"'");
		System.out.println("Meio: " + titular.get(2).getNome()+" '"+ titular.get(2).getNickname()+"'");
		System.out.println("Atirador: " + titular.get(3).getNome()+" '"+ titular.get(3).getNickname()+"'");
		System.out.println("Suporte: " + titular.get(4).getNome()+" '"+ titular.get(4).getNickname()+"'");
		System.out.println();
	}

	public void setTitular(int index, Jogador j){
		this.titular.add(index, j);
	}
	public void setAcademy(int index, Jogador j) {
		this.academy.set(index, j);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTitulos() {
		return titulos;
	}

	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}

	public int getImportacoes() {
		return importacoes;
	}

	public void setImportacoes(int importacoes) {
		this.importacoes = importacoes;
	}

	public float getTfScore() {
		this.tfScore = this.treinador.atualizaScore();
		return tfScore;
	}

	public void setTfScore(float tfScore) {
		this.tfScore = tfScore;
	}

	public List<Jogador> getElenco() {
		return elenco;
	}

	public void setElenco(List<Jogador> elenco) {
		this.elenco = elenco;
	}

	public List<Jogador> getTitular() {
		return titular;
	}

	public void setTitular(List<Jogador> titular) {
		this.titular = titular;
	}

	public List<Jogador> getAcademy() {
		return academy;
	}

	public void setAcademy(List<Jogador> academy) {
		this.academy = academy;
	}
	
	
    public void atualizaTFScore() {
    setTfScore(this.getTreinador().atualizaScore());
	}
	
}
