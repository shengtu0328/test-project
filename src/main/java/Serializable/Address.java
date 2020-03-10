package Serializable;

/**
 * @Author: rqxiao
 * @Date: 2020-2-28 15:30
 * @Description:
 */
import java.io.Serializable;

public class Address implements Serializable{



    String street;
    String country;



    String country2;    String country23;



    public void setStreet(String street){
        this.street = street;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public String getStreet(){
        return this.street;
    }

    public String getCountry(){
        return this.country;
    }



    @Override
    public String toString() {
        return new StringBuffer(" Street : ")
                .append(this.street)
                .append(" Country : ")
                .append(this.country).toString();
    }
}