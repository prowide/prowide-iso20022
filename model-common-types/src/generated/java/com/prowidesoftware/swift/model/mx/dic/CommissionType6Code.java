
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommissionType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CommissionType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEND"/&gt;
 *     &lt;enumeration value="BEND"/&gt;
 *     &lt;enumeration value="CDPL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * Commission for redeeming  an investment, when an investor redeems an investment fund within a certain period of time.
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
