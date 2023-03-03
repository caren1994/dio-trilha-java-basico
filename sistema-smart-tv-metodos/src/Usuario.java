public class Usuario {
    public static void main(String[] args) throws Exception {//metodo que executa nossa aplicação

        SmartTv smartTv= new SmartTv();

        System.out.print("canal atual"+smartTv.canal);
        smartTv.mudarCanal(25);
        System.out.print("novo canal"+smartTv.canal);
        smartTv.aumentarCanal();
        System.out.print("atualizando canal"+smartTv.canal);
        smartTv.diminuirCanal();
        System.out.print("canal final"+smartTv.canal);


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.print("volume atual :"+smartTv.volume);

        System.out.print("TV LIGADA?" +smartTv.ligada);
        System.out.print("CANAL ATUAL?" +smartTv.canal);
        System.out.print("VOLUME ATUAL?" +smartTv.volume);


        smartTv.ligar();
        System.out.print("novo status -> TV LIGADA?" +smartTv.ligada);
        smartTv.desligar();
        System.out.print("novo status -> TV LIGADA?" +smartTv.ligada);

    }
}
