
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDataReading4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardDataReading4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ECTL"/&gt;
 *     &lt;enumeration value="CICC"/&gt;
 *     &lt;enumeration value="MGST"/&gt;
 *     &lt;enumeration value="CTLS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardDataReading4Code")
@XmlEnum
public enum CardDataReading4Code {


    /**
     * Contactless proximity reader, with application conform to the standard EMV (standard initiated by Europay, Mastercard and Visa).
     * 
     */
    ECTL,

    /**
     * ICC (Integrated Circuit Card) with contact containing software applications conform to ISO 7816.
     * 
     */
    CICC,

    /**
     * Magnetic stripe.
     * 
     */
    MGST,

    /**
     * Contactless proximity reader.
     * 
     */
    CTLS;

    public String value() {
        return name();
    }

    public static CardDataReading4Code fromValue(String v) {
        return valueOf(v);
    }

}
