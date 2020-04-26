package questaotres;

public class QuestaoTres {

    
    public static void main(String[] args) {
        	        
    Porta p = new Porta();
    p.cor = "amarela";
    p.cor = "vermelha";
    p.dimensaoX = 10;
    p.dimensaoY = 20;
    p.dimensaoZ = 30;
    p.abre();
    p.fecha();
   
    p.estaAberta();
   
   
    Casa c = new Casa();
   
    Porta porta1 = new Porta();
    Porta porta2 = new Porta();
    Porta porta3 = new Porta();
   
    c.cor = "verde";
   
   c.porta1 = porta1;
   c.porta2 = porta2;
   c.porta3 = porta3;
   
   c.porta1.abre();
   c.porta2.abre();
   c.porta1.fecha();
   c.porta2.fecha();
   c.porta3.abre();
   c.porta1.abre();
   c.porta2.abre();
   
    System.out.println(c.quantasPortasEstaoAbertas());
   
   
   
        Edificio edificio1 = new Edificio();
   
        edificio1.pinta("Branca");
   
        edificio1.portas = new Porta[6];
   
    for (int i = 0; i < edificio1.portas.length; i++) {
        edificio1.adicionaPorta(edificio1.portas[i]);
}
   
   
        System.out.println(edificio1.totalDePortas());
   
   
                Porta porta01 = new Porta();
                Porta porta02 = new Porta();
                Porta porta03 = new Porta();
                Porta porta4  = new Porta();
                Porta porta5  = new Porta();
                Porta porta6  = new Porta();

                edificio1.portas[0] = porta01;
                edificio1.portas[1] = porta02;
                edificio1.portas[2] = porta03;
                edificio1.portas[3] = porta4;
                edificio1.portas[4] = porta5;
                edificio1.portas[5] = porta6;
               
               
                edificio1.portas[0].fecha();
                edificio1.portas[1].abre();
                edificio1.portas[2].abre();
   
    System.out.println( edificio1.quantasPortasEstaoAbertas());
   
   
   
    }
   
   
   
}
   
   


