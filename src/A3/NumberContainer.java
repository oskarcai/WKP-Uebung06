package A3;

public class NumberContainer {
    public Number[] data;

    public NumberContainer(Number[] data) {
        this.data = data;
    }

    public double sum() {
        double sum = 0;

        for (Number number : data) {
            if (number != null) {
                sum += number.doubleValue();
            } else {
                return 0.0; // falls Nullpointer-Exception
            }
        }

        return sum;
    }

    public void set(int index, Number value) {
        data[index] = value;
    }
}
