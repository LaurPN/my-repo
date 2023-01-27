package lab2_homework_problem_2;

public class Minibus extends Vehicle{
    public Minibus(double basePrice, String name, String country) {
        super(basePrice, name, country);
    }

    @Override
    public double computeVAT() {
        return 19*this.getBasePrice()/100;
    }

    @Override
    public double computeRoadTax() {
        return 3*this.getBasePrice()/100;
    }

    @Override
    public double computeCustomTax() {
        if (!this.getCountry().equals("Romania".toLowerCase())){
            return this.getBasePrice()*10/100;
        }
        return 0;
    }

    @Override
    public double computeTotalTax() {
        return this.getBasePrice() + computeVAT() + computeRoadTax() + computeCustomTax();
    }
}
