public class Operadores {
  public static void main(String[] args) {
    String nomeCompleto = "LINGUAGEM " + "JAVA";
    String concatenação = "?";
    concatenação = 1 + 1 + 1 + "1";
    System.out.println(concatenação);

    concatenação = 1 + "1" + 1 + 1;
    System.out.println(concatenação);

    concatenação = 1 + "1" + 1 + "1";
    System.out.println(concatenação);

    concatenação = "1" + 1 + 1 + 1;
    System.out.println(concatenação);

    concatenação = "1" + (1 + 1 + 1);
    System.out.println(concatenação);

    // Operadores Unários
    int numero = +5;

    numero = -numero;

    System.out.println(numero);

    numero = numero * -1;
    System.out.println(numero);

    // Repeticão

    int numeros = 5;

    numeros = numeros++;

    System.out.println(numeros);

    System.out.println(++numeros);

    System.out.println(numeros--);

    // Operador Ternário
    int a, b;

    a = 6;
    b = 6;

    String resultado = "";

    // Condicioa=nal If

    if (a == b) {
      resultado = "Verdadeiro";
    } else {
      resultado = "Falso";
    }
    System.out.println(resultado);

    // Condicional Ternária

    resultado = a == b ? "True" : "False";

    System.out.println(resultado);

    // Operadores Relacionais

    int numero1 = 1;
    int numero2 = 2;
    boolean simNao = numero1 == numero2;

    System.out.println("Numero1 é igual a Numero2? " + simNao);

    // Operadore Lógicos

    boolean condicao1 = true;
    boolean condicao2 = true;

    if (condicao1 && condicao2) {
      System.out.println("As duas condições são verdadeiras");
    }

    if (condicao1 || condicao2) {
      System.out.println("Uma das condições é verdadeira");
    }

    System.out.println("Fim");

  }

}
