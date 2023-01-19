public class Main {
    public static void main(String[] args) {

        BmiService information = new BmiService();
        BmiService service = new BmiService();

        int weight = 85;
        int height = 2;

        int heightTwo = information.option(height);
        int bmi = service.calculate(weight, heightTwo);

        System.out.println("Индекс массы тела: " + bmi);
    }
}