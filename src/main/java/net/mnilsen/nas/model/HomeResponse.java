package net.mnilsen.nas.model;

/**
 *
 * @author michaeln
 */
public class HomeResponse {
    private final String userName;
    private final String status;

    public HomeResponse(String userName, String status) {
        this.userName = userName;
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "HomeResponse{" + "userName=" + userName + ", status=" + status + '}';
    }
    
    
}
