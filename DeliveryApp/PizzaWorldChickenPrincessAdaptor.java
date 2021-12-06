package DeliveryApp;

import DeliveryApp.ingredients.chicken.hasBone.Boneless;
import DeliveryApp.ingredients.chicken.hasBone.HasBone;
import DeliveryApp.ingredients.chicken.sauce.NoSauce;
import DeliveryApp.ingredients.chicken.sauce.Sauce;

public class PizzaWorldChickenPrincessAdaptor extends AbstractChickenFactory {
    PizzaWorldChickenPrincess pwcp;

    public PizzaWorldChickenPrincessAdaptor(PizzaWorldChickenPrincess pwcp) {
        this.pwcp = pwcp;
    }

    @Override
    public Sauce selectSauce() {
        return new NoSauce();
    }

    @Override
    public HasBone selectBone() {
        return new Boneless();
    }
}
