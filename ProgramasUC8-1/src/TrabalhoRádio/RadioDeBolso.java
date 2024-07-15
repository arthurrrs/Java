
package TrabalhoRádio;

    public class RadioDeBolso {
    private boolean ligadoDesligado;
    private String banda;
    private final double faixaMinimaFM = 87.0;
    private final double faixaMaximaFM = 108.0;
    private final double faixaMinimaAM = 520.0;
    private final double faixaMaximaAM = 1710.0;

    //Construtores
    public RadioDeBolso() {
        this(false, false, 0, 87.0, "FM");
    }

    public RadioDeBolso(boolean ligadoDesligado, boolean tocarMusica, int volume, double estacaoAtual, String banda) {
        this.ligadoDesligado = ligadoDesligado;
        this.banda = banda;
    }
   

    //Métodos
    public void ligar() {
        ligadoDesligado = true;
    }

    public void desligar() {
        ligadoDesligado = false;
    }

    //implemente os demais métodos, seguindo a lógica descrita

    public void sintonizar(double frequencia) {
        if (ligadoDesligado) {
            if (banda.equals("FM") && frequencia >= faixaMinimaFM && frequencia <= faixaMaximaFM) {
            } else if (banda.equals("AM") && frequencia >= faixaMinimaAM && frequencia <= faixaMaximaAM) {
            } else {
                System.out.println("Frequência fora da faixa da banda atual.");
            }
        } else {
            System.out.println("O rádio está desligado.");
        }
    }

    void aumentarVolume() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void play() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}





