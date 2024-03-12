package herancav1;

public class HerancaV1 {

    public static void main(String[] args) {
        Carro c1 = new Carro("Toro");  
        Carro c2 = new Carro("HRV");  
        CarroCombate c3 = new CarroCombate("Uno",100);  
        CarroCombate c4 = new CarroCombate("Palio",50);  
        
        c3.atirar();
        c3.atirar();
        c3.atirar();
        c3.atirar();
        
        c4.sofrerDano(30);
        c1.sofrerDano(1);
        c2.sofrerDano(1);
        
        
        c1.setLigado(true);
        c1.info();
        c2.info();
        c3.info();
        c4.info();
    }
    
}
