package herancav1;

public class CarroCombate extends Carro {
    
    private final int MAX_ARM = 100;
    private final int MIN_ARM = 0;
    private int qtdArmamento;
    
    public CarroCombate(String nome, int Blindagem) {
        super(nome);
        setArmamento(true);
        setBlindagem(Blindagem);
        this.qtdArmamento = 100;
    }

    public void setQtdArmamento(int qtdArmamento) {
        this.qtdArmamento += qtdArmamento;
        if(qtdArmamento > MAX_ARM){
            qtdArmamento=MAX_ARM;
        }
        if(qtdArmamento < MIN_ARM){
            qtdArmamento=MIN_ARM;
        }
    }

    public int getQtdArmamento() {
        return this.qtdArmamento;
    }
    
    public void atirar(){
        if(this.qtdArmamento > MIN_ARM){
            setQtdArmamento(-1);
        }else{
            System.out.println("Sem municao");
        }
    }
    
    public void info(){
        super.info();
        System.out.println("Quantidade de armamento: "+this.qtdArmamento);
    }
    
}
