/**This basic calculator program performs 
additon, subtraction, multiplication, and division operations.
*/

public class BasicCalculator {
    // Instance variables to store operands
    private double firstNumber;
    private double secondNumber;
    
    /**constructor to initialize the calculator
     */
    public BasicCalculator() {
        this.firstNumber = 0;
        this.secondNumber = 0;
    }

    /**
     * Following constructors initializes the calculator with two numbers, then performs the operations and throws in an expception if the second number is zero.
     * @param firstNumber the first number for calculations
     * @param secondNumber the second number for calculations
     * @return sum of firstNumber and secondNumber
     * @return difference between firstNumber and secondNumber
     * @return product of firstNumber and secondNumber
     * @return quotient of firstNumber divided by secondNumber
     * @throws ArithmeticException if secondNumber is zero
     */
   
     public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double add() {
        return this.firstNumber + this.secondNumber;
    }

    public double subtract() {
        return this.firstNumber - this.secondNumber;
    }

    public double multiply() {
        return this.firstNumber * this.secondNumber;
    }

    public double divide() {
        if (this.secondNumber == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return this.firstNumber / this.secondNumber;
    }

    //The main method to test the calculator of the program
    //This method creates an instance of the BasicCalculator class, sets the numbers, and performs calculations.
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

        // Handle division by zero exception
         System.out.println("Division: " + calculator.divide());
         calculator.setSecondNumber(0); // Set second number to zero for testing exception
         System.out.println("Attempting division by zero...");
        try {
            System.out.println("Division: " + calculator.divide());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
