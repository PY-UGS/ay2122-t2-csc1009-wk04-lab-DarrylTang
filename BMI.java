public class BMI {
    private double weight;
    private double height;

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public void printBMI() {
        double BMI = 703 * (this.weight / Math.pow(height, 2));
        System.out.println("Your BMI is "+ BMI);

        if (BMI < 18.5) {
            System.out.println("You are underweight");
        } else if ( BMI >= 18.5 && BMI < 25.0) {
            System.out.println("You are normal");
        } else if ( BMI >= 25.0 && BMI < 30.0 ){
            System.out.println("You are overweight");
        } else if ( BMI >= 30.0 ) {
            System.out.println("You are obese!");
        }

    }
}
