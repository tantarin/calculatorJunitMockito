

public class Calculator {

    CalculatorService calculatorService;

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    //TODO создать интерфейс CalculatorService и передать в конструктор Calculator
    public int sum(int a, int b) {
        return calculatorService.add(a, b);
    }
}
