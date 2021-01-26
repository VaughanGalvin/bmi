public class BmiService {
    public double calculate (int weight, double height) {
        double index = weight / (height * height) * 10000;

        return index;

    }

}
