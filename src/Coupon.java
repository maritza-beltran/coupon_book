import java.util.Date;

public class Coupon {
    private Date dateAccessed;
    private Date dateRequested;
    private String couponType;
    private Integer quantity;
    private Boolean used;
    private Integer daysUntilUse; //the purpose of this parameter is to ensure that the difference between the date
    //accessed and data requested meet the minimum days notice if the owner has specified one for that coupon


    static void useCoupon(String couponType){
        //when used, decrease the quantity of that coupon type
    }

    static void notifyOwner(){
        //when user uses a coupon, owner should be notified of it's usage
    }

    static void notifyUser(){
        //method to notify the user that owner
        //has either accepted or denied their request
    }

    static void denyRequest(){
        //owner chooses to deny request of coupon use
    }

    static void setDate(Date requestedDate){
        //this is the date the user will set as the requested coupon usage date
    }

    public static void main(String[] args){

    }

}
