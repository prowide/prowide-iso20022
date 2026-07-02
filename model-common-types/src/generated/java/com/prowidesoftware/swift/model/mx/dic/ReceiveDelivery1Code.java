
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiveDelivery1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReceiveDelivery1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DELI"/&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
