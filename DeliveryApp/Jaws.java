package DeliveryApp;

import DeliveryApp.ingredients.Cheese;
import DeliveryApp.ingredients.NoCheese;
import DeliveryApp.ingredients.Tteokbokki.RiceCake.RiceCake;
import DeliveryApp.ingredients.Tteokbokki.RiceCake.RicePlaster;
import DeliveryApp.ingredients.Tteokbokki.hotGrade.HotGrade;
import DeliveryApp.ingredients.Tteokbokki.hotGrade.SweetSpicy;

public class Jaws extends AbstractTteokbokkiFactory{
    @Override
    public HotGrade selectHotGrade() {
        return new SweetSpicy();
    }

    @Override
    public RiceCake selectRiceCake() {
        return new RicePlaster();
    }

    @Override
    public Cheese selectCheese() {
        return new NoCheese();
    }
}
