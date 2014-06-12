package org.apache.camel.example.businessobject;

import javax.annotation.PostConstruct;
/**
 * Created by zsmith on 6/10/14.
 */
public class SomeBusinessObject {

    private String odom;
    private String year;
    private String vin;
    private String condition;

    public SomeBusinessObject()
    {
        System.out.println("object created");
    }



    public String getOdom() {
        return odom;
    }

    public void setOdom(String odom) {
        System.out.println("setting odom: "+odom);
        this.odom = odom;
    }


    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        System.out.println("setting vin: "+vin);
        this.vin = vin;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        System.out.println("setting year: "+year);
        this.year = year;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        System.out.println("setting condition: "+condition);
        this.condition = condition;
    }


    @Override
    @PostConstruct
    public String toString() {
        return "SomeBusinessObject{" +
                "odom='" + odom + '\'' +
                ", year='" + year + '\'' +
                ", vin='" + vin + '\'' +
                ", condition='" + condition + '\'' +
                '}';
    }
}
