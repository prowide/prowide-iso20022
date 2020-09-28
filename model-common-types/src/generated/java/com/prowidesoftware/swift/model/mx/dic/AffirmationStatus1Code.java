
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AffirmationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AffirmationStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AFFI"/&gt;
 *     &lt;enumeration value="NAFI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AffirmationStatus1Code")
@XmlEnum
public enum AffirmationStatus1Code {


    /**
     * Status of the transaction is affirmed.
     * 
     */
    AFFI,

    /**
     * Status of the transaction is unaffirmed.
     * 
     */
    NAFI;

    public String value() {
        return name();
    }

    public static AffirmationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
