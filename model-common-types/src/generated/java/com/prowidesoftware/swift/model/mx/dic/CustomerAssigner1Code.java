
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerAssigner1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerAssigner1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="CRCY"/&gt;
 *     &lt;enumeration value="CUST"/&gt;
 *     &lt;enumeration value="ONFL"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="TRAY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerAssigner1Code")
@XmlEnum
public enum CustomerAssigner1Code {


    /**
     * Legal authority assigning an identification.
     * 
     */
    AUTH,

    /**
     * Company assigning an identification to a customer.
     * 
     */
    CRCY,

    /**
     * Company for which the customer is on duty.
     * 
     */
    CUST,

    /**
     * On file identification.
     * 
     */
    ONFL,

    /**
     * Other party assigning an identification.
     * 
     */
    OTHR,

    /**
     * Travel agency assigning an identification.
     * 
     */
    TRAY;

    public String value() {
        return name();
    }

    public static CustomerAssigner1Code fromValue(String v) {
        return valueOf(v);
    }

}
