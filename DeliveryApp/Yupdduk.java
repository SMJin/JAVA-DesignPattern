package DeliveryApp;

import DeliveryApp.ingredients.Cheese;
import DeliveryApp.ingredients.MozzarellaCheese;
import DeliveryApp.ingredients.Tteokbokki.RiceCake.RiceCake;
import DeliveryApp.ingredients.Tteokbokki.RiceCake.WheatPlaster;
import DeliveryApp.ingredients.Tteokbokki.hotGrade.HotGrade;
import DeliveryApp.ingredients.Tteokbokki.hotGrade.HotSpicy;

public class Yupdduk extends AbstractTteokbokkiFactory{
    @Override
    public HotGrade selectHotGrade() {
        return new HotSpicy();
    }

    @Override
    public RiceCake selectRiceCake() {
        return new WheatPlaster();
    }

    @Override
    public Cheese selectCheese() {
        return new MozzarellaCheese();
    }
}
