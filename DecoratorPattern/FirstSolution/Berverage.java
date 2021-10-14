package DecoratorPattern.FirstSolution;

public abstract class Berverage {
    public String description = "";
    private boolean milk = false;
    private boolean soy = false;
    private boolean mocha = false;
    private boolean whip = false;

    public String getDescription() {
        return description;
    }

    public double cost() {
        double condimentCost = 0.0;
        if(hasMilk()) {
            condimentCost += 0.9;
        }
        if(hasSoy()) {
            condimentCost += 0.7;
        }
        if(hasMocha()) {
            condimentCost += 1.2;
        }
        if(hasWhip()) {
            condimentCost += 0.5;
        }
        return condimentCost;
    };

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk() {
        milk = true;
        System.out.println("adding Milk ... ");
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy() {
        soy = true;
        System.out.println("adding Soy ... ");
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha() {
        mocha = true;
        System.out.println("adding Mocha ... ");
    }

    public boolean hasWhip() {
        return whip;
    }

    public void setWhip() {
        whip = true;
        System.out.println("adding Whip ... ");
    }
}
