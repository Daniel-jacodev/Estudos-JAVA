public class SmartTv {
    boolean status =  false;
    int canal = 1;
    int volume = 25;
    

    public void ligar(){
        status= true;
        System.out.println("A TV está ligada!");
    }
    public void desligar(){
        status = false;
        System.out.println("A TV está ligada!");
    }
    public void aumentarVolume(){
        if (status == true){
            volume++;
            System.out.println("O volume agora é " + volume);
        }else{
            System.out.println("A tv está desligada, não é possível");
        }
    }
    public void diminuirVolume(){
        if (status == true){
            volume--;
            System.out.println("O volume agora é " + volume);
        }else{
            System.out.println("A tv está desligada, não é possível");
        }
    }
}
