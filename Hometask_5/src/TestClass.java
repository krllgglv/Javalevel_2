public class TestClass {
    public static void main(String[] args) {
        Calculations cal1 = new Calculations(new ArrayProducer().getArrOfOne());
        Methods mt = new Methods(cal1);
        Calculations cal2 = new Calculations(new ArrayProducer().getArrOfOne());
        Methods mt1 = new Methods(cal2);

        mt.methodIteration();
        mt1.methodConcurrency();
    }
}
