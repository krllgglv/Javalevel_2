import java.util.Arrays;

public class ArrayProducer {
    static final int size = 10000000;
    static final int h = size / 2;
     private float[] arr = new float[size];
     private final float val = 1.0f;


    public float[] getArrOfOne() {
        Arrays.fill(arr,val);
        return arr;
    }


}
