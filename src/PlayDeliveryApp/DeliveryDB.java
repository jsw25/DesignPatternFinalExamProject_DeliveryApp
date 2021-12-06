package PlayDeliveryApp;

import DeliveryFoodStore.DeliveryFoodTypeStore;

import java.util.*;

public class DeliveryDB {
    private HashMap<String, Vector<String>> customerDeliveryInformation = null;// <필드> 받을 정보 기록할 자료 구조 또는 클래스 생성
    private HashMap<String, Vector<String>> orderInformation = null; // <필드> 서버의 이용자(고객) 데이터 베이스
    private DeliveryFoodTypeStore deliveryFoodTypeStore = null;
    private HashMap<String, Vector<String>> deliveryFoodStoreInformation = null;

    public DeliveryDB(){
        this.customerDeliveryInformation = new HashMap<>();// 서버의 이용자(고객) 데이터 베이스 setting
        this.orderInformation = new HashMap<>();// 받을 정보 기록할 자료 구조 또는 클래스 생성
        this.deliveryFoodStoreInformation = new HashMap<>();
        init();
    }
    private void init(){
        initCustomerDeliveryInformation();
        initDeliveryFoodTypeStoreList();

    }

    HashMap<String, Vector<String>> initCustomerDeliveryInformation(){
        // 정보 초기화 -> DeliveryApp에서 대놓고 사용할 것이다.
        // 일단 1단계 딱 정해진 상태로 진행
        String userName = "정성욱";
        Vector<String> deliveryInformation = new Vector<>(1);
        customerDeliveryInformation.put(userName,deliveryInformation);

        return customerDeliveryInformation;
    }
    //set~도 존재 가능

    HashMap<String, Vector<String>> initDeliveryFoodTypeStoreList(){
        // 정보 초기화 -> DeliveryApp에서 대놓고 사용할 것이다.
        String typeStore = "BurgerTypeStore"; // DeliveryFoodTypeStore의 자식 클래스인 BurgerTypeStore
        Vector<String> burgerTypeStoreList = new Vector<>();
        burgerTypeStoreList.add("")
        customerDeliveryInformation.put(typeStore,burgerTypeStoreList);

    }
    //set~도 존재 가능






}
