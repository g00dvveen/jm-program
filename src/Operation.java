public class Operation {
    public static void main(String[] args) {

    }

    public static Integer Addition(Integer x, Integer y) {
        return x + y;
    }

    public static Integer Subtraction(Integer x, Integer y) {
        return x - y;
    }

    public static Integer Division(Integer x, Integer y) throws DividedByZeroException {
        if (y == 0) {
            throw new DividedByZeroException("Dividing by zero is not allowed");
        }
        return x / y;
    }

    public static Integer Multiplication(Integer x, Integer y) {
        return x * y;
    }
}
