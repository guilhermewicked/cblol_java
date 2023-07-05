package br.unifei.edu.ecot12.cblol;

public class Treinador extends Competidor {
private String especialidade;
Treinador(){}
Treinador(String nome, String nickname, String nacionalidade,Time t){
	this.setTime(t);
	this.setNome(nome);
	this.setNickname(nickname);
	this.setNacionalidade(nacionalidade);
}
public void defineScore(float s0,float s1,float s2,float s3,float s4) {
	this.getTime().getTitular().get(0).setScore(s0);
	this.getTime().getTitular().get(1).setScore(s1);
	this.getTime().getTitular().get(2).setScore(s2);
	this.getTime().getTitular().get(3).setScore(s3);
	this.getTime().getTitular().get(4).setScore(s4);
	//atualizaScore();
}
public float atualizaScore(){
	float aux = 0;
	for(int i=0;i<5;i++) {
		aux += (this.getTime().getTitular().get(i).getScore())/5;
	}
	return aux;
 }
public String getEspecialidade() {
	return especialidade;
}
public void setEspecialidade(String especialidade) {
	this.especialidade = especialidade;
}
 
 

 
 
}
