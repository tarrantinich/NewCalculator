public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        //считаем через target
        Calculator.Formula formula = target.newFormula();
        Calculator.Operation operation = Calculator.Operation.SUM;
        formula.addOperand(arg0);
        formula.addOperand(arg1);
        formula.calculate(operation);
        double tempResult = formula.result;
        int result = (int) tempResult;
        return result;
    }

    @Override
    public int mult(int arg0, int arg1) {
        //считаем через target
        Calculator.Formula formula = target.newFormula();
        Calculator.Operation operation = Calculator.Operation.MULT;
        formula.addOperand(arg0);
        formula.addOperand(arg1);
        formula.calculate(operation);
        double tempResult = formula.result;
        int result = (int) tempResult;
        return result;
    }

    @Override
    public int pow(int a, int b) {
        //считаем через target
        Calculator.Formula formula = target.newFormula();
        Calculator.Operation operation = Calculator.Operation.POW;
        formula.addOperand(a);
        formula.addOperand(b);
        formula.calculate(operation);
        double tempResult = formula.result;
        int result = (int) tempResult;
        return result;
    }
}