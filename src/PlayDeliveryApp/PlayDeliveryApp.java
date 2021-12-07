package PlayDeliveryApp;

//import Vehicle.Car;

import java.util.HashMap;
import java.util.Vector;

import static PlayDeliveryApp.DeliveryDB.*;

public class PlayDeliveryApp {


    public static void main(String[] args) {
        // 앱 객체 생성
        DeliveryApp deliveryApp = new DeliveryApp();
        DeliveryDB deliveryDB = new DeliveryDB();
        DeliveryMan deliveryMan = null;
        HashMap<String, Vector<String>> userDeliveryInformation = deliveryDB.getuserDeliveryInformation();
        if (true){ // 정성욱 확인하는 것
            Vector<String>  = userDeliveryInformation.get("정성욱");
        }

        // 위치 정보 확인하도록함! => DB데이터에서 가져와서
                // userDeliveryInformation.put(userPrivacyInformation[USERNAME],deliveryInformation);
                // userDeliveryInformation는 해당 필드이며 HashMap<String, Vector<String>> 자료형이다.
                // 우선 작성할 수 있도록

//<오류해결 userDeliveryInformation.get(USERNAME)과 userDeliveryInformation.get(USERLOCATION)>
        System.out.println(userDeliveryInformation.get(USERNAME)+"님, " + userDeliveryInformation. + "이 맞습니까? (true / false)");
        // 입력함수
        Boolean isUserLocation = deliveryApp.checkYourLocation();
//<아래 if문 주석대로 내용 처리>
        if (isUserLocation){
            // 만약에 아니라면, 바꿔주도록하고, 위치를 출력해준다.
            // + 변경가능하도록 메소드 추가!
        }

        //BurgerTypeStore를 우선 강제로 접속하게했음 - 잘못눌러도 접속되고, 제대로되어도 접속된다.
                // 앱 객체에서 input을 받는다. 받는 것도 여기서 메소드로 구현해야 한다.
        deliveryApp.inputDeliveryFoodtype();

                // (<<받으면서 같이 적용될지??>> 아니면 입력만 받아서 그대로 사용될지?) - 정하기






        // 라이더 생성하고 라이더에게 정보를 제공한다. (여기서 손님 위치, 메뉴, 가게 지점)
        // 거리나, 혼잡 시간때에 따라서 vehicle을 하게 하고 싶지만, new car()로 설정하자!
        deliveryMan = new DeliveryMan();
        deliveryMan.rideVehicle();

        // 라이더가 지점에 간다.
            // 지점에 가는 메소드를 만든다.

        // 음식을 받는다.

        // 음식을 손님 위치에 배달해준다.


    }

}

/*
//import java.util.HashMap;
* HashMap<String, Boolean> hashMap = new HashMap<String, Boolean>();
            hashMap.put("", Boolean.valueOf("TrUe"));
        boolean a = true;
        Boolean d = hashMap.get("");
        a =  hashMap.get("");
        if (a){
            System.out.println("a =  hashMap.get(\"\"); -> true");
        }
        else{
            System.out.println("a =  hashMap.get(\"\"); -> false");
        }
        // 자동 언박싱
* */
