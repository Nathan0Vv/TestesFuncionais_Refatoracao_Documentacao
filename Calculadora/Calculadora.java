/**
 * <p>Projeto Calculadora</p>
 *  
 * <p>Esta classe fornece as operações matemáticas como soma, subtração multiplicação e divisão, 
 * além de um método principal que seleciona a operação desejada com base em um operador informado pelo usuário.</p>
 * <p>Esse projeto é utilizado pare demonstrar:</p>
 * <ul>
 *      <li>Técnicas de revisão estática (caixa branca)</li>
 *      <li>Técnicas de revisão (caixa branca)</li>
 *      <li>Aplicação de refatoração em código Java</li>
 *      <li>Documentação com Javadoc</li>
 * </ul>
 * <p>Após a refatoração, os métodos desta classe são <strong>métodos puros</strong>, sem efeitos colaterais, permitindo legibilidade e facilitando testes unitários.</p>
 * 
 * @author Nathan Vieira
 * @version 1.0
 */

public class Calculadora {
    
    /** Armazena o resultado da última operação válida. */
    public int r = 0;

    /**  
     * Soma dois números inteiros.
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da soma de {@code a} e {@code b} 
    */
    public int somar (int a, int b){
        return a + b;
    }

    /**  
     * Subtrai dois números inteiros.
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da subtração de {@code a} e {@code b} 
    */
    public int subtrair (int a, int b){
        return a - b;
    }

    /**  
     * Multiplica dois números inteiros.
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da multiplicação de {@code a} e {@code b} 
    */
    public int multiplicar (int a, int b){
        return a * b;
    }

    /**  
     * Divide dois números inteiros.
     * 
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da divisão de {@code a} e {@code b} 
    */
    public int dividir (int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * <p>Executa a operação matemática solicitada com base no operador informado.</p>
     *
     * <p>Operadores aceito:</p>
     * <ul>
     *      <li>"+" para somas;</li>
     *      <li>"-" para subtrações;</li>
     *      <li>"*" para multiplicações;</li>
     *      <li>"/" para divisões.</li>
     * </ul>
     * 
     * <p>Para qualquer operador inválido resulta em exceção.</p>
     * 
     * @param a primeiro número
     * @param b segundo número
     * @param op operador (+, -, *, /)
     * @return o resultado da operação corresponde ao operador informado
     * 
     * @throws IllegalArgumentException se o operador não for um símbolo válido
     */
    public int calc(int a, int b, String op){
        return switch (op) {
            case "+" -> somar (a, b);
            case "-" -> subtrair (a, b);
            case "*" -> multiplicar (a, b);
            case "/" -> dividir (a, b);
            default -> throw new IllegalArgumentException("Operador inválido " + op);
        };

    }
}