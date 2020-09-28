
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IOISideTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IOISideTypeCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BUYI"/&gt;
 *     &lt;enumeration value="SELL"/&gt;
 *     &lt;enumeration value="UNDI"/&gt;
 *     &lt;enumeration value="DEFI"/&gt;
 *     &lt;enumeration value="OPPO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IOISideTypeCode")
@XmlEnum
public enum IOISideTypeCode {


    /**
     * Order is buy driven.
     * 
     */
    BUYI,

    /**
     * Order is sell driven.
     * 
     */
    SELL,

    /**
     * The side of the indication of interest is not disclosed.
     * 
     */
    UNDI,

    /**
     * Indicates, in the case of a multileg instrument,that the sides of the legs are the same as defined at the creation of the multileg instrument.
     * 
     */
    DEFI,

    /**
     * Indicates, in the case of a multileg instrument,that the sides of the legs are the opposite of their definition at the creation of the multileg instrument.
     * 
     */
    OPPO;

    public String value() {
        return name();
    }

    public static IOISideTypeCode fromValue(String v) {
        return valueOf(v);
    }

}
