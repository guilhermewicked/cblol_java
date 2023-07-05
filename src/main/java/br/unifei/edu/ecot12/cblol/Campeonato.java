package br.unifei.edu.ecot12.cblol;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Campeonato {
	private List<Time> times = new ArrayList<Time>();
	private List<Partida> jogos = new ArrayList<Partida>();
	private Boolean emTemporada = false;
	private Liga liga;
	
	//Campeonato(){}
	
	Campeonato(Liga l){
		this.setLiga(l);
	}
	public void iniciaTemporada() {
			emTemporada = true;
	
	}
	public void finalizaTemporada() {
		emTemporada = false;
	}

	public List<Time> getTimes() {
		return times;
	}

	public void setTimes(List<Time> times) {
		this.times = times;
	}

	public Boolean getEmTemporada() {
		return emTemporada;
	}

	public void setEmTemporada(Boolean emTemporada) {
		this.emTemporada = emTemporada;
	}

	public void addTime(Time t) {
		this.times.add(t);
		
	}
	public List<Partida> getJogos() {
		return jogos;
	}
	public void setJogos(List<Partida> jogos) {
		this.jogos = jogos;
	}
	public void addJogos(Partida jogo) {
		this.jogos.add(jogo);
	}
	
	public Liga getLiga() {
		return liga;
	}
	public void setLiga(Liga liga) {
		this.liga = liga;
	}
	
	
}
