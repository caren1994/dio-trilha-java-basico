public class Operadores {
  public static void main(String[] args) {

    // String nomeCompleto="caren"+"pontes";
    // System.out.print(nomeCompleto);

    // string concatenação comm números
    // String concatenacao="?";

    // concatenacao=1+1+1+"1";

    // System.out.print(concatenacao);

    // concatenacao=1+"1"+1+1;
    // apartir no caracter de texto ele nao soma mais ele só faz
    // a concatenação mesmo sendo números depois ,ele nao volta a somar

    // System.out.print(concatenacao);

    // concatenacao=1+"1"+1+1+"1";

    // System.out.print(concatenacao);

    // concatenacao="1"+1+1+1;

    // System.out.print(concatenacao);

    // concatenacao="1"+(1+1+1);

    // System.out.print(concatenacao);

    // ternários
    int a, b;
    a = 5;
    b = 6;
    // String resultado="";
    // if(a==b)
    // resultado="verdadeiro";
    // else
    // resultado ="falso";

    // String resultado = a == b ? "verdadeiro" : "falso";
    // observar se é uma expressão boolean retorna true ou false
    // System.out.print(resultado);

    // relacionais
    int numero1 = 1;
    int numero2 = 2;
    boolean simNao = numero1 == numero2;

   // System.out.print("numeroUm é igual a numeroDois?" + simNao);

    simNao = numero1 != numero2;// reatribuindo valor não precisa do tipo boolean antes

   // System.out.print("numeroUm é diferente a numeroDois?" + simNao);

    simNao = numero1 > numero2;// reatribuindo valor não precisa do tipo boolean antes

    //System.out.print("numeroUm é maior a numeroDois?" + simNao);

   // if (numero1 < numero2) {
     // System.out.print("a nossa condição é verdadeira");
    //}


    //lógicos
    boolean condicao1=true;
    boolean condicao2=true;

    if(condicao1 && condicao2){
      System.out.print("as duas condições sao verdadeiras");

    }
    if(condicao1||condicao2){
      System.out.print("uma das condições é verdadeiras");
    }

  }
}
