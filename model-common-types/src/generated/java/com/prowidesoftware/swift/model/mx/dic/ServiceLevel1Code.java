
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceLevel1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceLevel1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SEPA"/&gt;
 *     &lt;enumeration value="SDVA"/&gt;
 *     &lt;enumeration value="PRPT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceLevel1Code")
@XmlEnum
public enum ServiceLevel1Code {


    /**
     * Payment must be executed following the Single Euro Payments Area scheme.
     * 
     */
    SEPA,

    /**
     * Payment must be executed with same day value to the creditor.
     * 
     */
    SDVA,

    /**
     * Transaction must be processed according to the EBA
     * Priority Service.
     * 
     */
    PRPT;

    public String value() {
        return name();
    }

    public static ServiceLevel1Code fromValue(String v) {
        return valueOf(v);
    }

}
