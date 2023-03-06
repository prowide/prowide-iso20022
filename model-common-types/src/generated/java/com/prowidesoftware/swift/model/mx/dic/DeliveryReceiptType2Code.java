
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryReceiptType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryReceiptType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FREE"/&gt;
 *     &lt;enumeration value="APMT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeliveryReceiptType2Code")
@XmlEnum
public enum DeliveryReceiptType2Code {


    /**
     * Settlement of the financial instrument and cash is separate.
     * 
     */
    FREE,

    /**
     * Settlement of the financial instrument and cash takes place in a delivery versus payment (DVP) environment, that is, through an International Central Securities Depository (ICSD) or Central Securities Depository (CSD).
     * 
     */
    APMT;

    public String value() {
        return name();
    }

    public static DeliveryReceiptType2Code fromValue(String v) {
        return valueOf(v);
    }

}
