package exercicios;

public class ex2 {

    /* Aqui usei o mesmo esquema da classe EX1... Mas o diferencial dela é:*/
    /* Vamos supor que, eu quero que na questão 2, invés de imprimir a tabuada de um número ja SETADO, quero que ele
    faça um número que eu mesmo digite, logo criei um construtor da própria classe ex2 e simplesmente decretei dentro dela
    um "INT VALOR", para que sempre que eu chamar essa CLASSE, na classe PRINCIPAL, eu sempre tenha que digitar algum valor*/

    public ex2(int valor) {
        for (int i = 1; i<=100; i++){
            System.out.println(valor + " x " + i + " = " + valor*i);
        }
    }
}
