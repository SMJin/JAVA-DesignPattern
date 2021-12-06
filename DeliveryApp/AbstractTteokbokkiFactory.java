package DeliveryApp;

import DeliveryApp.ingredients.Cheese;
import DeliveryApp.ingredients.Tteokbokki.RiceCake.RiceCake;
import DeliveryApp.ingredients.Tteokbokki.hotGrade.HotGrade;

public abstract class AbstractTteokbokkiFactory {
    public abstract HotGrade selectHotGrade();
    public abstract RiceCake selectRiceCake();
    public abstract Cheese selectCheese();
}
