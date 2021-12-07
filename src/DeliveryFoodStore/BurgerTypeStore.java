package DeliveryFoodStore;

//import OrderMenuComponent.OrderBurgerMenuComponent;
//import TemplatingOrderBurgerMenuComponentSteps.*;

public abstract class BurgerTypeStore extends DeliveryFoodTypeStore {
    protected String burgerTypeStoreName = null;

    public abstract String getBurgerTypeStoreName();

    public abstract void setBurgerTypeStoreName(String burgerTypeStoreName);



    //    OrderBurgerMenuComponent orderBurgerMenuComponent = null;;
//    TemplatingOrderBurgerMenuComponentSteps templatingOrderBurgerMenuComponent;
//    @Override
//    public OrderBurgerMenuComponent orderBurgerMenu(String[] orderDate) {
//
//        if (orderDate[3].equals("맘스터치")){
//            templatingOrderBurgerMenuComponent = new SeasonedPotatoSet();
//        }
//        else if (orderDate[3].equals("버거킹")||orderDate[3].equals("롯데리아")){
//            templatingOrderBurgerMenuComponent = new OriginalPotatoSet();
//        }
//        orderBurgerMenuComponent = templatingOrderBurgerMenuComponent.cookOrderBurgerMenuComponent();
//        return orderBurgerMenuComponent;
//    }
//    public abstract OrderBurgerMenuComponent createBurgerMenu();

}
