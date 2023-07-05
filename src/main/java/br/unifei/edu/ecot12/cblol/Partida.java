package br.unifei.edu.ecot12.cblol;

import java.util.*;
public class Partida {
	

	private List<Time> times = new ArrayList<Time>(2);
	private Vector<Integer> vidaNexus = new Vector<Integer>();
	private String terreno = "padrao";
	private int totalDrag = 0;
	private ArrayList<Dragao> dragAzul= new ArrayList<Dragao>();
	private ArrayList<Dragao> dragVermelho = new ArrayList<Dragao>();
	private Dragao dragAtual;
	private Dragao alma;
	private int almaID;
	private Time vencedor;
	private Campeonato temporada;
	
	public int getAlmaID() {
		return almaID;
	}
	public void setAlmaID(int almaID) {
		this.almaID = almaID;
	}
	public Campeonato getTemporada() {
		return temporada;
	}
	public void setTemporada(Campeonato temporada) {
		this.temporada = temporada;
	}
	
	Partida(Time t1, Time t2, Campeonato temporada){
		//adiciona os times
		addTime(t1);
		addTime(t2);
		//inicia as vidas dos nexus
		vidaNexus.add(0, 5500);
		vidaNexus.add(1, 5500);
		//define a alma da partida e primeiro dragao
		defineAlma();
		dragaoNasce();
		//define temporada e adiciona partida dentro dela.
		this.setTemporada(temporada);
		temporada.addJogos(this);
	}
	public void baterNexus(int time, int dano){
		if(time==0){
			this.vidaNexus.set(0, this.vidaNexus.get(0)-dano);
			if(this.verificaVencedor()) {
			}
		}
		if(time==1) {
			this.vidaNexus.set(1, this.vidaNexus.get(1)-dano);
			if(this.verificaVencedor()) {
				
			}
		}
	}
	void abaterDragao(int time){
		 if(time == 0){
		     Dragao dragAbatido = dragAtual.clonarDragao();
		     
		     dragAzul.add(dragAbatido);
		     
		     if((dragAzul != null)&&(dragVermelho != null)&&(dragAzul.size() == 4)&&(!(dragAtual instanceof  DragaoAnciao))){
		           dragAtual.mudarMapa(this);
		           System.out.println("A Alma do Dragão foi conquistada pelo time Azul e modifica a estrutura do terreno!");
		           dragaoNasce();
		           totalDrag++;
		     }else{
		           dragaoNasce();
		           totalDrag++;
		     }
		 }
		 if(time == 1){
			 Dragao dragAbatido = dragAtual.clonarDragao();
		     dragVermelho.add(dragAbatido);
		     if((dragAzul != null)&&(dragVermelho.size() == 4)&&(!(dragAtual instanceof  DragaoAnciao))){
		           dragAtual.mudarMapa(this);
		           System.out.println("A Alma do Dragão foi conquistada pelo time Vermelho e modifica a estrutura do terreno!");
		           dragaoNasce();
		     }else{
		           dragaoNasce();
		     }
		 }
	}
	public void defineAlma() {
	     Random rnd = new Random(System.currentTimeMillis());
	     int a = rnd.nextInt(5);
	     switch(a){
	        case 0:
	        setAlma(new DragaoOceano());
	        setAlmaID(0);
	        return;
	        case 1:     
	        setAlma(new DragaoVento());
	        setAlmaID(1);
	        return;
	        case 2:
	        setAlma(new DragaoMontanha());
	        setAlmaID(2);
	        return;
	        case 3:
	        setAlma(new DragaoInfernal());
	        setAlmaID(3);
	        return;
	        case 4:
	        setAlma(new DragaoHextech());
	        setAlmaID(4);
	        return;
	}
}
	     
public void dragaoNasce(){
		if( (dragAzul != null)&&(dragVermelho != null) && dragAzul.size()>=4 || dragVermelho.size()>=4){
		    dragAtual = new DragaoAnciao();
		    totalDrag++;
		    return;
		}else{
		  if(totalDrag>2){
		     setDragAtual(alma.clonarDragao());
		     totalDrag++;
		     return;
		  }else{
		   if(totalDrag<3){
		     int x = getAlmaID();
		     while(x == getAlmaID()){
		      Random r = new Random();
			  x = r.nextInt(5);
		      if(x != getAlmaID()){
		        switch(x){
		        case 0:
		            dragAtual = new DragaoOceano();
		            totalDrag++; 
		            return;
		        case 1:
		            dragAtual = new DragaoVento();
		            totalDrag++;
		            return;
		        case 2:
		            dragAtual = new DragaoMontanha();
		            totalDrag++;
		            return;
		        case 3:
		            dragAtual = new DragaoInfernal();
		            totalDrag++;
		            return;
		        case 4:
		            dragAtual = new DragaoHextech();
		            totalDrag++;
		            return;
		        }
		        }
		       }

		     }
		   }
		   }
}
		 

		    



	public Boolean verificaVencedor(){
		if(!(vidaNexus.get(0)>0&&vidaNexus.get(1)>0)) {
		  if(vidaNexus.get(0)<1) {
		     setVencedor(times.get(0));
		     if(temporada.getEmTemporada()){times.get(1).setTitulos(times.get(1).getTitulos()+1);}
		     vencedor.setVitorias(vencedor.getVitorias()+1);
		     System.out.println("O Time Vermelho ganhou a partida!\nTime vencedor:");
		     this.vencedor.getTime();
		     return true;
		  }
		  if(vidaNexus.get(1)<1)
		     setVencedor(times.get(1));
		     if(temporada.getEmTemporada()){times.get(0).setTitulos(times.get(0).getTitulos()+1);}
		     System.out.println("O Time Azul ganhou a partida!\nTime vencedor:");
		     this.vencedor.getTime();
		     return true;
		}else{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	public void addTime(Time t){
		this.times.add(t);
	}
	
	public List<Time> getTimes() {
		return times;
	}
	public void setTimes(List<Time> times) {
		this.times = times;
	}
	public Vector<Integer> getVidaNexus() {
		return vidaNexus;
	}
	public void setVidaNexus(Vector<Integer> vidaNexus) {
		this.vidaNexus = vidaNexus;
	}
	public String getTerreno() {
		return terreno;
	}
	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}
	public int getTotalDrag() {
		return totalDrag;
	}
	public void setTotalDrag(int totalDrag) {
		this.totalDrag = totalDrag;
	}
	public List<Dragao> getDragAzul() {
		return dragAzul;
	}
	public void setDragAzul(ArrayList<Dragao> dragAzul) {
		this.dragAzul = dragAzul;
	}
	public List<Dragao> getDragVermelho() {
		return dragVermelho;
	}
	public void setDragVermelho(ArrayList<Dragao> dragVermelho) {
		this.dragVermelho = dragVermelho;
	}
	public Dragao getDragAtual() {
		return dragAtual;
	}
	public void setDragAtual(Dragao dragAtual) {
		this.dragAtual = dragAtual;
	}
	public Dragao getAlma() {
		return alma;
	}
	public void setAlma(Dragao alma) {
		this.alma = alma;
	}
	public Time getVencedor() {
		return vencedor;
	}
	public void setVencedor(Time vencedor) {
		this.vencedor = vencedor;
	}
	
	
}
