package exercicios;

/* ASSIM como foi explicando em aula... Cada nó contém dois elementos principais: um VALOR e um PONTEIRO/REFERÊNCIA
ao próximo nó na sequência (NEXT).*/

/* OBSERVE O VALOR E O PONTEIRO NOS COMENTÁRIOS ABAIXO */

public class IgorNo {

    /* VALOR */
    private int data;

    /* PONTEIRO */
    private IgorNo next;

    /* CONSTRUTOR */
    public IgorNo(int data) {
        this.data = data;
        this.next = null;
    }

    /* Se você pulou as questões de POO, eu havia comentado sobre os métodos getter e setter (CASO queira ler, vá para a classe EX4)...
     a importância deles aqui é que: SÃO utilizados para acessar e modificar o valor do nó e a referência ao próximo nó.*/

    /* OBS::: POR FAVOR, NÃO SE PREOCUPEM EM GRAVAR OS GET, SET E CONSTRUTORES, POIS O JAVA FAZ AUTOMATICAMENTE
    basta clicar com o botão direito -> generate -> Getters/Setters, mesmo esquema para Constructor, o que vai gerar os algoritmos abaixo.*/

    /* GETTERS */
    public IgorNo getNext() {
        return next;
    }

    /* SETTERS */
    public void setNext(IgorNo next) {
        this.next = next;
    }

    /* GETTERS */
    public int getData() {
        return data;
    }

    /* SETTERS */
    public void setData(int data) {
        this.data = data;
    }
}
