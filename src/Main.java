import exercicios.*;

import java.util.Scanner;

/*
    Ola pessoal, me chamo Pedro Igor (estou me apresentando porque não sei se isso vai acabar indo para outras salas :e )
    ======================================

    Esse é um resumo bem BÁSICO de uso de POO e Nós (Lista encadeada)

    - Utilizei as atividades de Celso pra deixar ainda mais dinâmica as questões de POO (Programação orientada a Objetos).

    """"""""""""""""""
    - EM BAIXO DO EX5_2 VOCÊ VERÁ QUE TEM UMA CLASSE CHAMADA IgorNo, QUE SE TRATA DO ASSUNTO DO PROFESSOR IGOR
    JÁ QUE MUITOS TIVERAM DÚVIDAS! SE VOCÊ NÃO QUISER LER AS QUESTÕES DE POO E QUISER PULAR PARA AS QUESTÕES DE IGOR,
    PODE PULAR PARA A LINHA 159!
    """"""""""""""""""


    - Antes que alguns bonitos venham tirar onda, como é o costume de muitos programadores de ego inflado, isso aqui é só
    um conceito BÁSICO destinado a pessoas que estão enfrentando dificuldades na matéria, se você ja possui ""EXPERIENCIA"" na área
    e deseja julgar seus colegas de classe o problema é TODO SEU, cada um aprende no seu próprio RITMO na qual forem melhor para elas,
    e não há necessidade de julgamentos! Lembre-se de que você é a estrela do seu próprio palco; não permita que ninguém menospreze você! :) */

    /* Quaisquer dúvidas, me chama pelo whatsapp: (71) 98441-1665 */

/*
    ATENÇÃO:
    APÓS CONTINUAR DESCENDO E CHEGAR NA QUESTÃO EX1, VÁ PARA CLASSE EX1 PARA EXPLICAÇÃO DE POO
    PARA EX2 - CONSULTAR CLASSE EX2
    PARA EX3 - CONSULTAR CLASSE EX3.... E assim sucessivamente.

    Você irá notar que possuem algumas classes chamada """ex3_2, ex4_2""" e afins, SE TRATA DE OUTRA explicação de POO que é necessário
    muita atenção e acompanhar o ritmo da classe principal!...
 */



/*
    Bom pessoal, começando peloa classe principal do programa, que contém o método MAIN, o "ponto de entrada" da execução.
 */
public class Main {
    public static void main(String[] args) {
        /*
        Este código abaixo representa a criação de um objeto SCANNER, em outras palavras, você vai inserir o "teclado"
        em seu algoritmo.
         */
        Scanner teclado = new Scanner(System.in);

        /*
          Começando com o print contendo uma pergunta, e abaixo chamei o "TECLADO" para dar entrada do usuário e armazenamento em uma variável chamada "nome".
         */
        System.out.println("Ola, qual seu nome");
        String nome = teclado.next();

        /* Saudando o bonitinho do(a) usuário(a) utilizando o nome digitado. */
        System.out.println("Bem vindo Sr. " + nome);

        // ESSA LINHA É SÓ PRA TER divisória para melhorar a legibilidade.
        System.out.println("===================================================");

        // OPÇÕES de questões disponíveis.
        System.out.println("Agora escolha uma questão!");
        System.out.println("1° Questão");
        System.out.println("2° Questão");
        System.out.println("3° Questão");
        System.out.println("4° Questão");
        System.out.println("5° Questão");
        System.out.println("6° Questão");
        System.out.println("7° Questão");
        System.out.println("8° Questão");
        System.out.println("9° Questão");
        System.out.println("10° Questão");
        System.out.println("==============DIGITE O NUMERO DA QUESTÃO==========");

        /* CHAMEI O "TECLADO" novamente, e solícito ao usuário que digite o número da questão que deseja responder, armazenando SEMPRE
        alguma variavel */
        int res = teclado.nextInt();

        /* (O MEU FAVORITO) O "SWITCH" é utilizado para executar diferentes ações com base no valor da variável que criei acima a >> "res".
        conforme você observa abaixo, tem as "CASES 1, 2, 3, 4" e afins, quando o usuario digitar algum dos numeros, ele irá executar a questão
        do numero que você digitou, ou seja, nada de (if == 1, execute questão 1... ) , switch/case facilita muito nesses casos */
        switch (res){

            /* Vamos para a brincadeira >:) ... */
            case 1:

            /* O comando abaixo que você está lendo é uma "INSTÂNCIA" */

            /* ( MAS O QUE É UMA INSTÂNCIA )
            ele nada mais é que um objeto específico criado a partir de uma classe (CONSULTE A CLASSE EX1 PARA CONTINUAR A LEITURA) */

            /* Parabéns, você agora entendeu o básico de POO, que é criar uma função em outra classe e simplesmente
            puxar ela, sem ter que fazer tudo na classe principal (TENTE FAZER AGORA)*/
                ex1 ex1 = new ex1();
                break;


            /* Vamos la... Perceba que aqui fiz a MESMA COISA, criei outra classe chamada ex2, coloquei uma função naquela classe
            e puxei ela para minha classe principal fazendo um construtor dela*/
            case 2:
                /* "TA MAS... PORQUE VOCÊ COLOCOU UM TRÊS ALI >>> ( VÁ PARA A CLASSE EX2 PARA CONTINUAR A LEITURA )*/
                /*Se você usa o Intelij ou ECLIPSE, vai notar que dentro do parentese ja apareceu uma mensagem
                escrita "valor" que é o parametro que decretei la na classe ex2*/
                ex2 ex2 = new ex2(3);
                break;


            case 3:
                /* Antes que você comece a se desesperar porque é da indole de todo programador rsrsrsrsrsrs,
                vou explicar de uma forma que você vá entender essa porr* por bem ou mal..*/

                /* Mesmo esquema, primeiramente criei a classe ex3, coloquei as funções la dentro, e puxei ela pra cá! (CONSULTE A CLASSE EX3 PARA VER O QUE TEM LA)*/

                /* ( TA MAS, PORQUE VOCÊ PUXOU UM "EX3_2" ALI SEU SATANAS ) */
                /* É o seguinte, O POO no GERAL, reside na capacidade de simplesmente modelar o seu algoritmo de forma mais "branda", ela envolve
                encapsulmento, a abstração, a herança e o polimorfismo como princípios fundamentais,
                que ajudam a organizar o código de forma mais eficiente e (( O R I E N T A D A )) a objetos. */

                /* ( AGORA CONSULTE O EX3 para entender o EX3_2 << É OBRIGATÓRIO ANTES DE CONTINUAR A LEITURA )*/
                ex3 ex3 = new ex3();

                /* OBS: Pedro, mas eu ainda não entendi do porquê precisa de tanta coisa para fazer só isso...*/
                /* Quando você pegar projetos mais robustos na programação, você até pode fazer tudo em 2 classes por exemplo*/
                /* MAS a programação hoje é baseada em ORGANIZAÇÃO, quanto mais você deixar o projeto mais limpo e a classe principal
                mais dinâmica, será melhor para evitar quaisquer confusões posteriores, é como se você estivesse a guardar lapis na lapiseira,
                copos na copa, sapatos na sapateira e assim por diante...*/
                ex3_2 ex3_2 = new ex3_2();
                break;
            case 4:
                /* Após a explicação da questão EX3, não irei detalhar aqui >> ( VÁ PARA A CLASSE EX4 para complementar )...*/
                ex4 ex4 = new ex4();
                ex4_2 ex4_2 = new ex4_2();
                /* Mas pedro, se o ex4_2 estende o ex4, por que precisa chamar a varivavel novamente?
                BELA PERGUNTA! Ele é um método que pertence à classe ex4, que é a classe pai de ex4_2,
                mas NÃO É SOBRESCRITO ou redefinido na classe ex4_2.

                POR OUTRO LADOOO, quando você faz ex4_2.contagem(), você está acessando o método contagem()
                diretamente através da classe ex4_2, sem a necessidade de criar uma instância da classe. É crucial isso, pois
                ele é um METODO ESTÁTICO */
                ex4_2.contagem();
                break;

                /* AGORA É COM VOCÊ */
                /* Quero que você basicamente coloque comentários abaixo explicando o que está sendo feito abaixo */

                /* Não tenha medo de errar, tenha medo de não aprender com os erros, ;D */
            case 5:
               ex5 ex5 = new ex5();
               ex5_2 ex5_2 = new ex5_2();
               ex5_2.funcao();
               break;










               /* MATÉRIA DO PROFESSOR IGOR GONZALES */

            /* Deixa eu explicar a vocês o conceito de NÓ na programação (para QUEM JA SABE pode ir para a linha 171) */

            /* O conceito de NÓ na programação consiste em estruturas de dados, como listas encadeadas, árvores, grafos, e afins...
            Um nó é basicamente um elemento individual numa estrutura de dados, que contém dados e uma ou mais referências a
            outros nós. */

            /* EXEMPLO: Cadu fala para Luigi -- Luigi fala para Yago -- Yago para Matheus -- Matheus fica calado -- FIM */

            case 6:

                /* (( VÁ PARA A CLASSE "IgorNo" )) - PARA CONTINUAR A EXPLICAÇÃO ABAIXO */

                /* Como esta dinamica de "instâncias" já foi feito em questões acima...
                caso você faça os algoritmos de Nós em outra classe (só por organização), você SEMPRE precisa criar uma
                ""instância"" que são esses "NEW" (em outras palavras, puxar a outra classe para a sua classe principal)*/

                /* note que possuem numeros que o proprio usuario pode digitar, isto porque, la na classe IgorNo
                foi DECRETADO que ele precisa conter um número do tipo inteiro "public IgorNo(int data)"

                Logo instanciei 5 variaveis e decretei a cada uma delas um número, sendo a última varivel como retornando NULL*/
                IgorNo igorNo1 = new IgorNo(20);
                IgorNo igorNo2 = new IgorNo(30);
                IgorNo igorNo3 = new IgorNo(40);
                IgorNo igorNo4 = new IgorNo(50);
                IgorNo igorNo5 = null;

                /* E como todo NÓ, precisa ter uma conexão, é basicamente o que faremos abaixo*/
                /* Vamos estabelecer as conexões entre os nós*/

                /*Pense em algo do tipo: Igor passou uma carta para 5 jogadores:

                Felipe - 1
                Gabriela - 2
                João - 3
                Malu - 4
                Guilherme - 5 */

                /* Igor falou a seguinte frase:
                "Eu irei falar um segredo para vocês, e devem repassar até o último número/membro"...

                Nesse caso (GUILHERME) - ULTIMO MEMBRO...

                Igor então passa o segredo para Felipe, e acaba chegando em guilherme, mas Guilherme não tem para quem passar, logo é o fim da brincadeira. */

                /*FELIPE (1) PASSANDO PARA GABRIELA (2)*/
                igorNo1.setNext(igorNo2);

                /*GABRIELA (2) PASSANDO PARA JOÃO (3)*/
                igorNo2.setNext(igorNo3);

                /*JOÃO (3) PASSANDO PARA MALU (4)*/
                igorNo3.setNext(igorNo4);

                /*MALU (4) PASSANDO PARA GUILHERME (5)*/
                igorNo4.setNext(igorNo5);


                /*PERCEBA que na linha 185 "IgorNo igorNo5 = null" está decretado como NULL,
                ou seja, ele não deve retornar nada e assim que você executar o programa e escolher a questão
                ele vai imprimir os números que estão digitados no parentese, mas o IgorNo5 ele irá dar uma mensagem de erro.*/
                /* Guilherme não irá passar para mais ninguem, FIM DO EFEITO NÓ */
                igorNo4.setNext(igorNo5);


                /* Lembra do VALOR E PONTEIRO que comentamos ali na classe IgorNo?

                Perceba que abaixo (nas impressões) não usei o IgorNo2, IgorNo3, IgorNo4, apenas utilizei o IgorNo1 porque quando eu adicionei o
                IgorNo1 para o "next" do IgorNo2, o "next" do IgorNo1 ficou referenciando o IgorNo2.
                E quando você vai no IgorNo2 e puxa o "next", ele já está referenciando IgorNo3 e assim por diante...

                Basicamente o funcionamento de uma lista encadeada é essa, onde cada nó possui um ponteiro para o próximo nó na sequência.*/

                /* Mas outra dúvida, por que diabos usa tanto next e no final coloca data? */

                /* Pois cada chamada de getNext() é usada para avançar para o próximo nó na lista.
                Essa "sequência" de chamadas getNext() é literalmente usada para percorrer a lista encadeada e o getData para acessar
                os dados armazenados em cada nó.*/
                System.out.println("Primeiro nó: " + igorNo1.getData()); /* NÓ começou daqui correto, logo só possui um getData*/
                System.out.println("Segundo nó: " + igorNo1.getNext().getData()); /* retorna o segundo nó, usa 1 getNext() */
                System.out.println("Terceiro nó: " + igorNo1.getNext().getNext().getData()); /*retorna o terceiro nó, usa 2 GetNext(). */
                System.out.println("Quarto nó: " + igorNo1.getNext().getNext().getNext().getData()); /* retorna o terceiro nó, usa 3 GetNext() */
                System.out.println("Quinto nó (IRÁ DAR ERRO ja que retorna NULL): " + igorNo1.getNext().getNext().getNext().getNext().getData()); /* NULO, ja que definimos como NULL */

            case 7:
                /* AGORA É COM VOCÊ */

                /* Faça um algoritmo de NÓ igual feito acima, UTILIZE a classe exercicioNo */
                /* La vai ter comentários que irá te ajudar a fazer */

                /* Após finalizar a primeira parte, ja pode fazer essas do comentário abaixo.*/

                /* Agora só faça ir la em cima, ENTENDER e executar da mesma maneira, começando da linha 181 */
                /* DICA: como você usou a classe ExercicioNo, para "instanciar" > exercicioNo (nomequalquer) = new exercicioNo();
                /* boa sorte :) */

                /* Quaisquer dúvidas, me chama pelo whatsapp: (71) 98441-1665 */

            default:
                System.out.println("Opção invalida, tente novamente!");
        }

        }
}