package controller;

public class SomaDivFatorial {
    public SomaDivFatorial() {
        super();
    }

    public double FuncSomaFracaoFatorial(int N) {
        /*
           Condição de parada -> Quando N for igual a 1, ele retorna 1 e encerra a pilha
           de chamada de funções, somando 1 na série.
         */
        if (N == 1) {
            return 1;
        }
        double serie = 1 / (double) FuncFatorial(N);
        N -= 1;
        return serie + FuncSomaFracaoFatorial(N);

        /*
           A função FuncSoma é a principal função, onde ele recebe N como parâmetro, que
           é um valor informado pelo usuário. Em seguida, é criado uma varíavel do tipo double
           que recebe uma fração 1 divido pelo número inteiro informado pelo usuário N. Porém,
           este valor, passa pela função Fatorial primeiro, convertido em double, e depois ele
           é utilizado na divisão de 1/N!.
           Em seguida a função retorna essa váriavel somando com a chamada da própria função.
           Assim tendo uma função recursiva que chama um outra pilha, e após todos os calculos,
           ele chega na sua condição de parada.
         */
    }

    public int FuncFatorial(int X) {
        /*
            Quando X (que é N digitado pelo usuário passado como parâmetro) for igual a 1
            ele retorna 1, finalizando assim a pilha de chamada de funções e retornando
            o resultado do fatorial de cada N da outra função acima.
         */
        if (X == 1) {
            return 1;
        }
        return X * FuncFatorial(X - 1);
        /*
            Recebe X como parâmetro que o valor de N da outra função informada pelo usuário,
            e então após ele multiplicar X pela própria função onde X vai diminuíndo a cada chamada
            ele retorna o valor da fatorial de N, que será usuado na soma de séries da função principal
         */
    }
}
