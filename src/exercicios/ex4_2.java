package exercicios;

/* A classe ex4_2 estende a classe ex4, demonstrando o conceito de herança como ja falei... */
public class ex4_2 extends ex4{

    /* OPA, sem desespero!!!*/

    public ex4_2() {
        super();
    }

    /* Criei o método contagem(), Realiza uma contagem a partir de zero até o valor atual do campo "valor" (QUESTÃO DE CELSO),
    imprimindo cada número da contagem na saída padrão (50).*/

    /* Percebeu algo familiar? exatamente, fiz o mesmo esquema que a classe ex3_2 (classe filho) da classe ex3*/
    /* (VÁ PARA CLASSE EX4_2) */
    public void contagem(){
        for (int i = 0; i <= valor; i++){
            System.out.println("Contagem de: " + i + " até " + valor);

        }
    }
}


