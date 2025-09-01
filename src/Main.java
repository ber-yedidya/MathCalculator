public class Main {
    public static void main(String[] args) {

    }
    public static void squareCalculator(int side){
        System.out.println("area" + Math.pow(side,2));
        System.out.println("perimeter" + (side * 4));
    }
    public static void rectangleCalculator(int side1, int side2){
        System.out.println("area" + (side1 * side2));
        System.out.println("perimeter" + (2 * (side1 +side2)));
    }
}