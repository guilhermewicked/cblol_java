package br.unifei.edu.ecot12.cblol;

public class DragaoOceano extends Dragao<DragaoOceano>{
	
	public DragaoOceano clonarDragao() {
		DragaoOceano d = new DragaoOceano();
		d.setBonus(this.getBonus());
		d.setEfeitoAlma(this.getEfeitoAlma());
		return d;
	}
	public void mudarMapa(Partida p) {
		p.setTerreno("Aumento de arbustos e plantas na selva ");
	}
}
