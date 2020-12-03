public class Calculations implements Runnable {
    private float[] array;

    public Calculations(float[] array) {
        this.array = array;
    }

    public float[] getArray() {
        return array;
    }



    private float[] fillArray (float[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return arr;
    }

    @Override
    public void run() {
        fillArray(array);
    }
}
