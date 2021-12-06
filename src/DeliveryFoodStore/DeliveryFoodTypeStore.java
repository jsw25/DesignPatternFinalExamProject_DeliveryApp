package DeliveryFoodStore;

import OrderMenuComponent.OrderBurgerMenuComponent;

public abstract class DeliveryFoodTypeStore {
    public abstract OrderBurgerMenuComponent orderBurgerMenu();

    public abstract OrderBurgerMenuComponent orderBurgerMenu(String[] orderDate);
}
