package br.unifei.edu.ecot12.cblol;

public class DragaoHextech extends Dragao<DragaoHextech> {
	public DragaoHextech clonarDragao() {
		DragaoHextech d = new DragaoHextech();
		d.setBonus(this.getBonus());
		d.setEfeitoAlma(this.getEfeitoAlma());
		return d;
	}
	public void mudarMapa(Partida p) {
		p.setTerreno("Presen�a de portais que interligam regi�es da selva e rotas");
	}

}
