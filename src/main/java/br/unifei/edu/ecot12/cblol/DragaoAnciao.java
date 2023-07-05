package br.unifei.edu.ecot12.cblol;

public class DragaoAnciao extends Dragao<DragaoAnciao> {
	public DragaoAnciao clonarDragao() {
		DragaoAnciao d = new DragaoAnciao();
		d.setBonus(this.getBonus());
		d.setEfeitoAlma(this.getEfeitoAlma());
		return d;
	}
	public void mudarMapa(Partida p) {}

}
