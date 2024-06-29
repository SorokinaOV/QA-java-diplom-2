package api;

import config.Config;
import model.UserLogOutRequest;
import io.restassured.response.Response;
import model.CreatingUser;

public class UserApi extends BaseSteps{
    public static Response create(CreatingUser creatingUser) {
        return getRequestSpec()
                .body(creatingUser)
                .when()
                .post(Config.USER);
    }

    public Response delete(String accestoken) { //Access Token — это строка, которая является альтернативой логину и паролю.
        return getRequestSpec()
                .header("Authorization", accestoken)
                .when()
                .delete(Config.ACTIONS_USER);
    }

    public Response login(CreatingUser creatingUser) {
        return getRequestSpec()
                .body(creatingUser)
                .when()
                .post(Config.LOGIN);
    }

    public Response updateInfoUser(CreatingUser creatingUser, String accestoken) {
        return getRequestSpec()
                .header("Authorization", accestoken)
                .body(creatingUser)
                .when()
                .patch(Config.ACTIONS_USER);
    }

    public Response logOut(UserLogOutRequest userLogOutRequest, String accestoken) {  //выход из системы
        return getRequestSpec()
                .header("Authorization", accestoken)
                .body(userLogOutRequest)
                .when()
                .post(Config.LOGOUT);
    }
}
