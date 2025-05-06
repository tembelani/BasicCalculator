import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        BasicCalculator calculator = new BasicCalculator();
        
        System.out.println("You're now using the Basic Calculator!");
        System.out.println("----------------------------");
    
        // Get first & second number from user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        calculator.setFirstNumber(num1);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        calculator.setSecondNumber(num2);
        
        // Perform calculations
        System.out.println("\nSelect an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");

        int choice = scanner.nextInt();
        double result = 0;
        

        try{
            switch(choice) {
                case 1: // Addition
                result = calculator.add();
                break;
            
                case 2: // Subtraction
                result = calculator.subtract();
                break;

                case 3: // Multiplication
                result = calculator.multiply();
                break;

                case 4: // Division
                    try{
                        result = calculator.divide();

                    }
                    catch (ArithmeticException e){  
                        System.out.println("\nError: " + e.getMessage());
                        return;
                    }
                    break;
                
                default:
                System.out.println("Invalid choice! Please select a valid operation.");
                
                return;
            }

            System.out.println("Result: " + result);

        }
        finally{
            // Close the scanner to prevent resource leaks
            scanner.close();

        }
    }
}
