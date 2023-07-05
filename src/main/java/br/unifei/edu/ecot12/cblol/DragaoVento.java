package br.unifei.edu.ecot12.cblol;

public class DragaoVento extends Dragao<DragaoVento> {

	public DragaoVento clonarDragao() {
		DragaoVento d = new DragaoVento();
		d.setBonus(this.getBonus());
		d.setEfeitoAlma(this.getEfeitoAlma());
		return d;
	}
	public void mudarMapa(Partida p) {
		p.setTerreno("Redemoinhos que concedem velocidade de movimento na Selva.");
	}
}
