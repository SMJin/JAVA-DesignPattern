package DeliveryApp;

import DeliveryApp.ingredients.chicken.hasBone.Bone;
import DeliveryApp.ingredients.chicken.hasBone.HasBone;
import DeliveryApp.ingredients.chicken.sauce.HoneyCombo;
import DeliveryApp.ingredients.chicken.sauce.Sauce;

public class Kyochon extends AbstractChickenFactory{
    @Override
    public Sauce selectSauce() {
        return new HoneyCombo();
    }

    @Override
    public HasBone selectBone() {
        return new Bone();
    }
}
