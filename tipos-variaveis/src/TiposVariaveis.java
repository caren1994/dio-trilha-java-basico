public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // fortemente tipado
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.print(numeroCurto2);
        // variáveis
        int numero = 1;
        numero = 2;
        System.out.print(numero);
        // valor-nunca-podera-mudar? (constantes)
        final double VALOR_DE_PI = 3.14;
        System.out.print(VALOR_DE_PI);

        // String
        String nome = "caren PONTES";
        System.out.print(nome);
    }
}
