public class prog7a {

public static void main(String[] args) {
try {
int a = 10 / 0; // Error: Division by zero
} catch (ArithmeticException e) {
System.out.println("Cannot divide by zero"+ e.getMessage());
} finally {
System.out.println("This block always executes");
}
}
}