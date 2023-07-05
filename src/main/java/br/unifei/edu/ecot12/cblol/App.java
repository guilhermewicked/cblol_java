package br.unifei.edu.ecot12.cblol;
import java.util.*;

public class App {

	public static void main(String[] args) {
		
		// Primeiro é instanciado o Campeonato, que recebe a liga como parâmetro.
		Campeonato split00 = new Campeonato(new Cblol());
		Campeonato split01 = new Campeonato(new Academy());
		split00.getLiga().getPremiacaoPrim();
		//declaracao dos times
		Time flx = new Time("Fluxo",0,1);
		Time fur = new Time("FURIA Esports", 0, 0);
		Time itz = new Time("INTZ",4,0);
		Time kbm = new Time("Kabum E-sports", 2, 2);
		Time lbr = new Time("Havan Liberty", 0, 0);
		Time los = new Time("Los Grandes",3,0);
		Time lll = new Time("LOUD", 0, 1);
		Time png = new Time("paiN Gaming", 3, 1);
		Time red = new Time("RED Canids", 3, 0);
		Time vks = new Time("Vivo Keyd Stars", 0, 0);
		
		
		
		
		
		
		

		//declaracao de jogadores com base nas rotas
		Topo red0 = new Topo("Guilherme","GUIGO","Brasileiro",red);
		Selva red1 = new Selva("Gabriel", "Aegis", "Brasileiro",red);
		Meio red2 = new Meio("Daniel","Grevthar", "Brasileiro",red);
		Atirador red3 = new Atirador("Alexandre", "Titan","Brasileiro",red);
		Suporte red4 = new Suporte("Gabriel","jojo","Brasileiro",red); 
		
		
		//adicionar os times do campeonato
		split00.addTime(red);
		split00.addTime(png);
		
		//inicia a temporada.
		split00.iniciaTemporada();
		
		
		//adiciona jogadores no elenco
		red.addJogador(red0);
		red.addJogador(red1);
		red.addJogador(red2);
		red.addJogador(red3);
		red.addJogador(red4);
		//escala os jogadores no elenco
		red.escalarTitular(red0);
		red.escalarTitular(red1);
		red.escalarTitular(red2);
		red.escalarTitular(red3);
		red.escalarTitular(red4);
		
		// Instancia um novo treinador para o time.
		red.setTreinador(new Treinador("nome","coelho","Brasileiro",red));
		
		//definicao arbitraria da classificacao dos jogadores feita pelo treinador (seria a análise do treinador)
		red.getTreinador().defineScore(7, 9, 8, 10, 8);
		red.atualizaTFScore(); //atualiza o score
	
		System.out.println("Score do time inserido:"+red.getTfScore());//score do time 
		//media de score feita pelo treinador é armazenada no time
		
		//segundo time
		
		Topo png0 = new Topo("Euiseok","Wizer","Coreano",png);
		Selva png1 = new Selva("Marcos", "carioK", "Brasileiro",png);
		Meio png2 = new Meio("Matheus","dyNquedo", "Brasileiro",png);
		Atirador png3 = new Atirador("Matheus", "Trigo","Brasileiro",png);
		Suporte png4 = new Suporte("Yan","Damage","Brasileiro",png); 
		Meio png5 = new Meio("Gabriel","Kami","Brasileiro",png);
       
		//adiciona jogadores no elenco do time
		png.addJogador(png0);
		png.addJogador(png1);
		png.addJogador(png2);
		png.addJogador(png3);
		png.addJogador(png4);
		
		//escala os jogadores
		png.escalarTitular(png0);
		png.escalarTitular(png1);
		png.escalarTitular(png2);
		png.escalarTitular(png3);
		png.escalarTitular(png4);
		png.escalarTitular(png5);// não é possivel escalar um jogador que não esta no elenco.
		
		
		//cria-se uma nova partida, passando como parametro os times e o campeonato a qual ela pertence.
		//dentro de partid
		Partida p = new Partida(red,png, split00);
		//sao implementadas duas opcoes de acao para realizacao durante uma partida.
        //abaterDragao(int t); que indica que o time t = 0(Azul) ou t = 1(Vermelho) abateu o dragão atual.
		//baterNexus(int t,int dano); que indica que o time t=0 azul ou t=0 vermelho, causou
		//                                                       determinada quantidade de dano no Nexus inimigo.
		//Dentro de uma partida de league of legends, um dos imporantes objetivos de controle são os Dragões Elementais.
		//Toda partida possui uma Alma, que altera caracteristicas do mapa e suas recompensas com base no elemento.
		//Os dois primeiros dragões que nascem no mapa são de Elementos DIFERENTES do elemento da alma, e diferentes entre si.
		//A partir do terceiro dragão, somente nascem dragões com o elemento IGUAL ao elemento da alma.
		//Quando um time abate um total de 4 dragões, são concedidos aos jogadores do respectivo time o Efeito da Alma.
		//Á partir disso, somente nascem no mapa Dragões Anciões.
		
		p.abaterDragao(0); //abate drag 1 / time azul 1
		p.abaterDragao(0); // abate drag 2 / time azul 2
		p.abaterDragao(1); // abate drag 3 / time Vermelho 1
		p.abaterDragao(1); // abate drag 4 / time Vermelho 2
		p.abaterDragao(1); // abate drag 5 / time Vermelho 3
		p.abaterDragao(0); // abate drag 6 / time azul 3
		p.abaterDragao(1); // abate drag 7 / time Vermelho 4 : Time vermelho Conquistou a Alma do Dragão.
		p.abaterDragao(0); // abate drag 8 / time azul 4 : este dragão deve ser Ancião
		
		p.baterNexus(1, 5500);
		
		System.out.println("Dragoes pelo time azul:");
		for(int i=0;i<p.getDragAzul().size();i++) 
			System.out.println("Dragao("+i+"): "+p.getDragAzul().get(i).getClass().getSimpleName());
		System.out.println("\n\n\n\n");
		System.out.println("Dragoes pelo time vermelho:");
		for(int i=0;i<p.getDragVermelho().size();i++) 
			System.out.println("Dragao("+i+"): "+p.getDragVermelho().get(i).getClass().getSimpleName());
	}
	

}
