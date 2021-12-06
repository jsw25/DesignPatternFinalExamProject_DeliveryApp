package DeliveryFoodStore;

import OrderMenuComponent.OrderBurgerMenuComponent;

public class 롯데리아Store extends BurgerTypeStore {
    @Override
    public OrderBurgerMenuComponent createBurgerMenu() { // getInstance()구현
        return ;
    }
}

// /*abstract getInstance(인자를 받는다.)*/ // 리턴 타입 => OrderMenuComponent(데코레이터 최상위 추상클래스)
// 인자를 받아서 이 인자로 조건문 분기하도록한다!
// 대신 예외처리를 꼭해줘야한다!
/*
 * if(){
 *   OrderMenuComponent(데코레이터 최상위 추상클래스) ~~ = new ChickenBurger와 같은 SingleBurger의 자식 클래스(IngrediementsOfBurgerStore를 넣고, 실재로 받을 때는 그 자식클래스를 넣어야함! -> 그러면 해당 재료들로 재구성해서 toString메소드에서 사용하는 내용과 거기서 또 추가적 내용을 붙이거나 다른 메소드를 사용하면 그 내용이 나온다. => pizza에서 받은 기본 재료들에 넣어주는 역할임! 결국은 그것을 prepare()메소들에서 toString()때문에, 실행되고!)
 *
 * }
 * elseif(){}
 * elseif(){}
 * ...
 * ~~를 아마 Template Abstract class 생성하면서 넣어주고,
 * 필드안에 존재하며, return까지 받아줘야할 듯하다!
 * Template Abstract class 생성하면서 넣어주고 => Template Abstract class타입 @@@ = new Template Abstract class 자식 클래스 생성자(~~를 넣어준다.)
 * ~~ = @@@.모든step을 정리한 메소드();
 * return ~~;
 * */
// 이작업이 자식클래스에서 진행되어야한다!
    /* anOperation(인자를 받는다 **라하자){ // 리턴 타입 => OrderMenuComponent(데코레이터 최상위 추상클래스)
        OrderMenuComponent(데코레이터 최상위 추상클래스) ~~ = getInstance(**에 해당되는 인자, 즉 이 함수 내에서는 조건문 분기되는 것인데 버거의 종류이다!)
        <아래메소드는 버거에 해당한다.>
        ~~.해당 준비관련 메소드() -> 일단 준비가 필요하니..
        ~~.요리관련 메소드() ->그리고 요리가 필요!


        또 그러면.. option에서 감튀랑 음료수는 어찌할까? 여기서 또 따로 준비한다.
        <<아니면.. => 데코레이터에서 준비하도록한다..>>

    }

     */