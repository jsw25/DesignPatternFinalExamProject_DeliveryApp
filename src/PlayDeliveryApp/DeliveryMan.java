package PlayDeliveryApp;

import Vehicle.Vehicle;

import java.util.HashMap;


public class DeliveryMan {
    private HashMap<String, String> customerDeliveryInformation;
    private HashMap<String, String> orderInformation;
    private Vehicle vehicle;

    public DeliveryMan(HashMap<String, String> orderInformation, HashMap<String, String> customerDeliveryInformation){
        this.customerDeliveryInformation = customerDeliveryInformation;
        this.orderInformation = orderInformation;
    }

    public void rideVehicle(Vehicle vehicle){ // 우선 visit등...에서 선택한다.
        this.vehicle = vehicle;
        vehicle.ride();
    }
    // 주문을 받고.. takeOrders() => 여기서 지점과 시간대 입력을 받는다..
    // 이동하고 방문하고.. visitBurgerStore()
    // 받고 고객에게 이동하자!  deliverToCustomer()
}
