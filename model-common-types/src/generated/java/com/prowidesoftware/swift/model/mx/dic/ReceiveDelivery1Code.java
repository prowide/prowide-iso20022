
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiveDelivery1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReceiveDelivery1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DELI"/>
 *     <enumeration value="RECE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReceiveDelivery1Code")
@XmlEnum
public enum ReceiveDelivery1Code {


    /**
     * Financial instruments will be debited from the safekeeping account.
     * 
     */
    DELI,

    /**
     * Financial instruments will be credited to the safekeeping account.
     * 
     */
    RECE;

    public String value() {
        return name();
    }

    public static ReceiveDelivery1Code fromValue(String v) {
        return valueOf(v);
    }

}
