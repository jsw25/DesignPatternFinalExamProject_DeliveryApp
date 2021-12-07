package PlayDeliveryApp;



import java.util.Scanner;

/*
    private HashMap<String, String> customerDeliveryInformation;
    private HashMap<String, String> orderInformation;
    --  하나 하나 해야환다면, 그게 필요할 것이다.
    private HashMap<String, String> customerPrivacyInformation;
    private HashMap<String, Vector<String>> deliveryFoodStoreInformation;
* */

public class DeliveryApp {
    //private HashMap<String, String> customerDeliveryInformation = null;// <필드> 받을 정보 기록할 자료 구조 또는 클래스 생성
    //private HashMap<String, String> orderInformation = null; // <필드> 서버의 이용자(고객) 데이터 베이스
    //private DeliveryFoodType deliveryFoodType = null;
    DeliveryDB deliveryDB = null;
    Scanner deliveryTermsInputService = null;// 입력 받기위한 스캐너.. - 창구로 사용된다.


    public DeliveryApp(){

        deliveryDB = new DeliveryDB();
        this.deliveryTermsInputService = new Scanner(System.in);// 창구여는 스캐너 생성!
    }

// 생성되고 계속 관리해야하는 데이터이므로, 필드에 저장함!

    // 음식 종류 - 자식클래스 -> 아마 <abstract class!>
    public String inputDeliveryFoodtype() {
        int index = 1;

        // 배달 가능한 주문 유형을 보여준다.(deliveryFoodtype)
        System.out.println("    <<delivery Food type>>  \n");

        //
            // deliveryDB.getDeliveryFoodTypeStoreList()
        for(String deliveryFoodTypeStore : deliveryDB.getDeliveryFoodTypeStoreList().keySet()){ // key - value에서 key를 가져온다.
            System.out.println(index + "번째 Food Type Store: " + deliveryFoodTypeStore + "\n");
            index++;
        }

        System.out.println(); //deliveryDB에서 가지고 온다.
        System.out.println("------------------------------" + "\n");
            // (deliveryFoodtype)를 입력 받을 것이다.
        String deliveryFoodtype = deliveryTermsInputService.nextLine();
        // 같은 데이터 구조(클래스) 객체 - 1
        //     void나 그냥 혹여나 필요한 상황 대비해서 해당 정보 리턴(데이터 구조 이용해서.)

        // 해당 클래스명가 존재하는지 안하는지로 해보고싶은데.. => 파일로 알수 있기에 일단 pass!
        if (!deliveryFoodtype.equals("BurgerTypeStore")){
            System.out.println("<<공지>> 현재 BurgerTypeStore만 배달 가능합니다.");
            System.out.println("BurgerTypeStore페이지로 이동중...\n");

            deliveryFoodtype = "BurgerTypeStore";
        }
            // 버거 타입으로 데이터를 작성해준다!
            // deliveryFoodtype = new BurgerTypeStore(); 선택해주는 방법외엔 없다..
            //


        return deliveryFoodtype;
    }
    public Boolean checkYourLocation(){
        // location 출력

        // 입력받은 값이 문자열이므로, 문자열을 바로 boolean으로변환했다. true / false로 작업되니..
        return Boolean.valueOf(deliveryTermsInputService.nextLine());
    }



    // 음식 지점 - 한 음식 종류 자식 클래스 -> <일반 클래스!> -> 여기서 알아서 생성해준다.
                // (신경 쓸 필요 x -> 앱과의 관계 command pattern 생각하기도..)
                // template pattern으로 decorater pattern을 적용한다.
        // 같은 데이터 구조(클래스) 객체 - 2
            //     void나 그냥 혹여나 필요한 상황 대비해서 해당 정보 리턴(데이터 구조 이용해서.)
        // 창구인 스캐너 사용


    // 라이더에게 배달 정보 제공
        // 라이더에게 줄 정보



}

/*
* // 뭘 넣을까..?
        // 여기서 시작하는 걸로?
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        System.out.print(answer.getClass().getSimpleName() + " 타입이며, 길이는 " + answer.length());
* */
