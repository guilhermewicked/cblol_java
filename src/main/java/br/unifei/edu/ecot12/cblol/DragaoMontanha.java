package br.unifei.edu.ecot12.cblol;

public class DragaoMontanha extends Dragao<DragaoMontanha> {
	public DragaoMontanha clonarDragao() {
		DragaoMontanha d = new DragaoMontanha();
		d.setBonus(this.getBonus());
		d.setEfeitoAlma(this.getEfeitoAlma());
		return d;
	}
	public void mudarMapa(Partida p) {
		p.setTerreno("Paredes adicionais na selva.");
	}

}
