/**
 * BasicCalculator - A simple calculator that performs addition, subtraction,
 * multiplication, and division operations.
 */
public class BasicCalculator {
    // Instance variables to store operands
    private double firstNumber;
    private double secondNumber;

    /**
     * Constructor to initialize the calculator
     */
    public BasicCalculator() {
        this.firstNumber = 0;
        this.secondNumber = 0;
    }

    /**
     * Sets the first operand
     * @param firstNumber the first number for calculations
     */
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    /**
     * Sets the second operand
     * @param secondNumber the second number for calculations
     */
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    /**
     * Adds two numbers
     * @return sum of firstNumber and secondNumber
     */
    public double add() {
        return this.firstNumber + this.secondNumber;
    }

    /**
     * Subtracts two numbers
     * @return difference between firstNumber and secondNumber
     */
    public double subtract() {
        return this.firstNumber - this.secondNumber;
    }

    /**
     * Multiplies two numbers
     * @return product of firstNumber and secondNumber
     */
    public double multiply() {
        return this.firstNumber * this.secondNumber;
    }

    /**
     * Divides two numbers
     * @return quotient of firstNumber divided by secondNumber
     * @throws ArithmeticException if secondNumber is zero
     */
    public double divide() {
        if (this.secondNumber == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return this.firstNumber / this.secondNumber;
    }

    public static void main(String[] args) {
        // Create calculator instance
        BasicCalculator calculator = new BasicCalculator();
        
        // Set numbers for calculation
        calculator.setFirstNumber(10.5);
        calculator.setSecondNumber(5.2);
        
        // Perform and display calculations
        System.out.println("Basic Calculator Operations:");
        System.out.println("Addition: " + calculator.add());
        System.out.println("Subtraction: " + calculator.subtract());
        System.out.println("Multiplication: " + calculator.multiply());
        
        try {
            System.out.println("Division: " + calculator.divide());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}