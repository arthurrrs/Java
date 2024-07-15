
package TrabalhoRádio;

    
    public class TesteRadio {
    public static void main(String[] args) {
        RadioDeBolso radio = new RadioDeBolso();

        radio.ligar();
        radio.aumentarVolume();
        radio.sintonizar(98.5);
        radio.play();
    }
}

    

