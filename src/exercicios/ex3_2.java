package exercicios;

/* Abaixo você está lendo uma anotação que é uma demonstração do conceito de "HERANÇA" em POO o "EXTENDS".*/
/* A classe ex3_2 estende a classe ex3, pense em algo do tipo...

    Criei uma classe PAI e uma outra classe MÃE, se eu vou nascer, então eu sou uma extensão dos dois né?
    logo eu vou criar uma classe filho que vai ESTENDER a classe de quem eu quero puxar, cabe você decidir se quer puxar
    seu pai ou sua mãe rsrsrsrs..  OU SEJA... eu não quero tornar minha classe EX3 tão grande, então vou ESTENDER essa classe
    criando outra e fazendo outra função...*/

    /* VAMOS SUPOR QUE EU QUERO PUXAR MEU PAI, o EX3 É O PAI, e esta classe EX3_2 é o filho*/
public class ex3_2 extends ex3 {

    ex3 ex3 = new ex3();

    /*Este construtor chama o construtor da classe PAI, ex3, usando a palavra-chave "super()" < ESSE SUPER É OBRIGATÓRIO
    EM CONSTRUTORES USANDO O EXTENDS... Em seguida, chama o método exibirMensagem(), que pertence à classe ex3 (CLASSE PAI). */
    public ex3_2() {
        super();
        exibirMensagem();
    }

        public void exibirMensagem(){
            System.out.println("Você viu que tem uma classe chamada ex32 ali né, pois é sou eu!!! fui (EXTENDIDO)");
        }
}
