package br.unifei.edu.ecot12.cblol;

import java.util.*;
public abstract class Liga {
private String premiacaoPrim, premiacaoSec, premiacaoTerc;

public String getPremiacaoPrim() {
	return premiacaoPrim;
}

public void setPremiacaoPrim(String premiacaoPrim) {
	this.premiacaoPrim = premiacaoPrim;
}

public String getPremiacaoSec() {
	return premiacaoSec;
}

public void setPremiacaoSec(String premiacaoSec) {
	this.premiacaoSec = premiacaoSec;
}

public String getPremiacaoTerc() {
	return premiacaoTerc;
}

public void setPremiacaoTerc(String premiacaoTerc) {
	this.premiacaoTerc = premiacaoTerc;
}

}
