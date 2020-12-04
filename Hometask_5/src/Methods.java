public class Methods {
    private Calculations cal;

    public Methods(Calculations cal) {
        this.cal = cal;
    }

    public void methodConcurrency(){
        long startTime = System.currentTimeMillis();
        float[] leftPart = new float[ArrayProducer.h];
        float[] rightPart = new float[ArrayProducer.h];


        System.arraycopy(cal.getArray(), 0, leftPart, 0, ArrayProducer.h);
        System.arraycopy(cal.getArray(), ArrayProducer.h, rightPart, 0, ArrayProducer.h);

        new Calculations(leftPart).run();
        new Thread(new Calculations(rightPart)).start();

        System.arraycopy(rightPart, 0, cal.getArray(), 0, ArrayProducer.h);
        System.arraycopy(leftPart, 0, cal.getArray(), ArrayProducer.h, ArrayProducer.h);

        System.out.println("многопоточность :"+(System.currentTimeMillis() - startTime));
//        System.out.println(Arrays.toString(calculations.getArray()));
    }
    public void methodIteration(){
        long startTime = System.currentTimeMillis();
        cal.run();
        System.out.println("итерация :"+(System.currentTimeMillis() - startTime));
//        System.out.println(Arrays.toString(calculations.getArray()));
    }

}
