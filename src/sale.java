import java.util.ArrayList;

public class sale {
    private String saleCode;
    private String saleDate;
    private String clientInfo;
    private String vehicleInfo;
    private String payment;
    private String salePrice;

    private ArrayList<client> client;

    public String getSaleCode() {
        return saleCode;
    }

    public void setSaleCode(String saleCode) {
        this.saleCode = saleCode;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public String getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(String client) {
        this.clientInfo = clientInfo;
    }

    public String getvehicleInfo() {
        return vehicleInfo;
    }

    public void setvehicleInfo(String vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }
}
