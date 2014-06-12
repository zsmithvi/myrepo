package org.apache.camel.example.converter;

import org.apache.camel.Exchange;
import org.apache.camel.example.businessobject.SomeBusinessObject;
import org.apache.camel.support.TypeConverterSupport;

public class MyTypeConverter extends TypeConverterSupport {

    //TODO Not needed right now...ZS

    public <T> T convertTo(Class<T> type, Exchange exchange, Object value) {

        SomeBusinessObject bo = new SomeBusinessObject();
//        order.setId(Integer.parseInt(value.toString()));
        return (T) bo;
    }
}