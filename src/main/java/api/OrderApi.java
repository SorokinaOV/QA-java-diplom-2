package api;

import config.Config;
import model.Order;
import model.CreateOrderRequest;
import io.restassured.response.Response;

import static api.BaseSteps.getRequestSpec;

public class OrderApi {
    public static Response getIngredient(){
        return getRequestSpec()
                .when()
                .get(Config.INGREDIENTS);
    }

    public static Response getOrders(Order order){
        return getRequestSpec()
                .body(order)
                .when()
                .get(Config.ORDER);
    }

    public static Response getOrdersWithToken(CreateOrderRequest orders, String accestoken){
        return getRequestSpec()
                .header("Authorization", accestoken)
                .body(orders)
                .when()
                .get(Config.ORDER);
    }
    public Response getAllOrdersWithToken(String accessToken) {
        return getRequestSpec()
                .header("Authorization", accessToken)
                .when()
                .get(Config.ORDER);
    }

    public Response getAllOrdersWithoutToken() {
        return getRequestSpec()
                .when()
                .get(Config.ORDER);
    }
}
