
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IOISideTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="IOISideTypeCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BUYI"/>
 *     <enumeration value="SELL"/>
 *     <enumeration value="UNDI"/>
 *     <enumeration value="DEFI"/>
 *     <enumeration value="OPPO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
