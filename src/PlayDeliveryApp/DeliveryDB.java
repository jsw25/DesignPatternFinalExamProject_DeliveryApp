package PlayDeliveryApp;

import DeliveryFoodStore.*;

import java.util.*;

public class DeliveryDB {
    private HashMap<String, Vector<String>> userDeliveryInformation = null;// <필드> 받을 정보 기록할 자료 구조 또는 클래스 생성
    private HashMap<String, Vector<BurgerTypeStore>> deliveryFoodTypeStoreInformation = null;

    private HashMap<String, Vector<String>> orderInformation = null; // <필드> 서버의 이용자(고객) 데이터 베이스
    private DeliveryFoodTypeStore deliveryFoodTypeStore = null;
    private String [] userPrivacyInformation = new String[10];

    String typeStore = null; // DeliveryFoodTypeStore의 자식 클래스인 BurgerTypeStore
    BurgerTypeStore [] deliveryFoodTypeStoreList = {new 롯데리아Store(), new 맘스터치Store(), new 버거킹Store()};;

    // 솔직히 공통적으로 통일시키고 싶다.
    public static final int USERNAME = 0, USERLOCATION = 1,
                            USERPhoneNumber = 2, USERAGE = 3; //그외..
    // private static final int  = 8; //이렇게 해서 유저 정보룰 같이 쓰고 저장하는 형식으로 사용하고 싶었다.



    public DeliveryDB(){
        this.userDeliveryInformation = new HashMap<>();// 서버의 이용자(고객) 데이터 베이스 setting
        this.orderInformation = new HashMap<>();// 받을 정보 기록할 자료 구조 또는 클래스 생성
        this.deliveryFoodTypeStoreInformation = new HashMap<>();
        typeStore = "BurgerTypeStore"; // 그냥 초기화
        init();
    }
    private void init(){
        initCustomerDeliveryInformation();
        initDeliveryFoodTypeStoreList();

    }

    private void initCustomerDeliveryInformation(){

        // 정보 초기화 -> DeliveryApp에서 대놓고 사용할 것이다.
        // 일단 1단계 딱 정해진 상태로 진행
        Vector<String> deliveryInformation = new Vector<>();
        userPrivacyInformation[USERNAME] = "정성욱";
        userPrivacyInformation[USERLOCATION] = "서울특별시 강남구 테헤란로 ~~";
        userPrivacyInformation[USERPhoneNumber] = "010-1234-1234";
        //.. 나머지 회원가입때했던 것들..

        deliveryInformation.add(userPrivacyInformation[USERNAME]);
        deliveryInformation.add(userPrivacyInformation[USERLOCATION]);
        deliveryInformation.add(userPrivacyInformation[USERPhoneNumber]);
        userDeliveryInformation.put(userPrivacyInformation[USERNAME],deliveryInformation);
    }
    //set~도 존재 가능

    private void initDeliveryFoodTypeStoreList(){
        // 정보 초기화 -> DeliveryApp에서 대놓고 사용할 것이다.
        // 두개 초기화 한것 typeStore와 deliveryFoodTypeStoreList이다. //BurgerTypeStore [] burgerTypeStore = deliveryFoodTypeStoreList;

        Vector<BurgerTypeStore> burgerTypeStoreList = new Vector<>();

        for (BurgerTypeStore type: deliveryFoodTypeStoreList) {
            burgerTypeStoreList.add(type);
        }

        // 이제
        deliveryFoodTypeStoreInformation.put(typeStore,burgerTypeStoreList);
    }
    //set~도 존재 가능

    public HashMap<String, Vector<String>> getuserDeliveryInformation(){
        return userDeliveryInformation;
    }

    public HashMap<String, Vector<BurgerTypeStore>> getDeliveryFoodTypeStoreList(){
        return deliveryFoodTypeStoreInformation;
    }





}
