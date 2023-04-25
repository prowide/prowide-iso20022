
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommissionType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CommissionType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FEND"/>
 *     <enumeration value="BEND"/>
 *     <enumeration value="CDPL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CommissionType6Code")
@XmlEnum
public enum CommissionType6Code {


    /**
     * Commission for subscribing to an investment, paid at the time of the subscription.
     * 
     */
    FEND,

    /**
     * Commission for redeeming an investment, when an investor redeems an investment fund within a certain period of time.
     * 
     */
    BEND,

    /**
     * Amount of cash due to an intermediary for selling a product, or services, to a third party.
     * 
     */
    CDPL;

    public String value() {
        return name();
    }

    public static CommissionType6Code fromValue(String v) {
        return valueOf(v);
    }

}
