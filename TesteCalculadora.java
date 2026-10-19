public class TesteCalculadora {
   
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        //Testes rápidos
        calc.calc(2, 3, "+"); // resultado esperado: 5
        calc.calc(10, 4, "-"); // resultado esperado: 6
        calc.calc(3, 5, "*"); // resultado esperado: 15
        calc.calc(8, 2, "/"); // resultado esperado: 4
        calc.calc(8, 0, "/"); // divisão por zero
        calc.calc(5, 5, "x"); // operação inválida

        System.out.println("TESTE RAPIDO PARA VER SE O COMMIT DA BRANCH ESTÁ FUNCIONANDO");

    }
}
