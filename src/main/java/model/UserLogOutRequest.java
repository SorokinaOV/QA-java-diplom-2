package model;

public class UserLogOutRequest {
    private String token;

    public UserLogOutRequest(String token) {
        this.token = token;
    }

    public UserLogOutRequest() {
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
