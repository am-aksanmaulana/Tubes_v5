package Adapter;

/**
 * Created by aksanmaulana on 4/4/2018.
 */

public class UserUmkm {

    public String nameUser, genderUser, addressUser, phoneUser, emailUser;
    public String businessTypeUser, businessUser;
    public int imageUser;

    public UserUmkm(String nameUser, String genderUser, String addressUser, String phoneUser, String emailUser, int imageUser,
                    String businessTypeUser, String businessUser) {
        this.nameUser = nameUser;
        this.genderUser = genderUser;
        this.addressUser = addressUser;
        this.phoneUser = phoneUser;
        this.emailUser = emailUser;
        this.imageUser = imageUser;
        this.businessTypeUser = businessTypeUser;
        this.businessUser = businessUser;
    }

    public String getNameUser() {
        return nameUser;
    }
    public int getImageUser() { return imageUser; }
    public String getGenderUser() { return genderUser; }
    public String getAddressUser() { return addressUser; }
    public String getPhoneUser() { return phoneUser; }
    public String getEmailUser() { return emailUser; }
    public String getBusinessTypeUser() { return businessTypeUser; }
    public String getBusinessUser() { return businessUser; }
}
