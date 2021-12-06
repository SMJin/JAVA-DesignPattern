package DeliveryApp;

import DeliveryApp.ingredients.chicken.hasBone.HasBone;
import DeliveryApp.ingredients.chicken.sauce.Sauce;

public abstract class AbstractChickenFactory {
    public abstract Sauce selectSauce();
    public abstract HasBone selectBone();
}
