package br.unifei.edu.ecot12.cblol;

public class DragaoInfernal extends Dragao<DragaoInfernal> {
	public DragaoInfernal clonarDragao() {
		DragaoInfernal d = new DragaoInfernal();
		d.setBonus(this.getBonus());
		d.setEfeitoAlma(this.getEfeitoAlma());
		return d;
	}
	public void mudarMapa(Partida p) {
		p.setTerreno("Secções de paredes da selva reduzidas");
	}
}
