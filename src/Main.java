public class Main {
    public static void main(String[] args) {

        double sum = 0;
        double harmonicMean;
        int[] list = {1, 2, 3, 4, 5};

        //harmonic series calculator
        for (double element: list){
            sum += 1/ element;
        }
        
        //harmonic mean formula
        harmonicMean = list.length / sum;

        System.out.println("Harmonic mean of this array is: " + harmonicMean);

    }
}