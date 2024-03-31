package exercicios;

import com.sun.tools.javac.Main;

/* Não preciso explicar de novo que isso aqui é uma classe né? ksksksks*/
public class ex4 {

    /* Antes de prosseguir, vou dar o CONTEXTO...

    A questão pede que seja feito uma contagem até o valor que o usuario definiu, mas é claro que, fiz isso
    utilizando conceito do POO básico, ja que o tema da explicação é essa...*/

    /* criei um campo que armazena um valor do tipo inteiro*/
    int valor;

    /* Abaixo você está presenciando a construção do uso de métodos getter e setter... Ela permite um encapsulamento adequado dos dados,
    permitindo que o campo "valor" seja acessado e modificado de forma controlada por outras classes. */

    /* SET < SETAR
       GET < PUXAR

       EXEMPLO: setValor: 60.
       system.out.println(getValor) >> 60 ( basicamente só fiz puxar o que setei!)*/
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    /* ========================================= */

    /* Construtor do ex4 assim como eu fiz nas outras classes!
    Note que inicialicei o campo "valor" com o valor de 50 (MESMO ESQUEMA DO SET / GETER DA EXPLICAÇÃO ACIMA) */
    public ex4() {
        this.valor = 50;
    }
}

