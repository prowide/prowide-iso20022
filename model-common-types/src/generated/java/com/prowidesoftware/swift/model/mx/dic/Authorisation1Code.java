
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Authorisation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Authorisation1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="FDET"/&gt;
 *     &lt;enumeration value="FSUM"/&gt;
 *     &lt;enumeration value="ILEV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Authorisation1Code")
@XmlEnum
public enum Authorisation1Code {


    /**
     * Indicates a file has been pre authorised or approved within the originating customer environment and no further approval is required.
     * 
     */
    AUTH,

    /**
     * Indicates that a file requires additional file level approval, with the ability to view both the payment information block and supporting customer credit transaction detail.
     * 
     */
    FDET,

    /**
     * Indicates that a file requires additional file level approval, with the ability to view only the payment information block level information.
     * 
     */
    FSUM,

    /**
     * Indicates that a file requires all customer transactions to be authorised or approved.
     * 
     */
    ILEV;

    public String value() {
        return name();
    }

    public static Authorisation1Code fromValue(String v) {
        return valueOf(v);
    }

}
