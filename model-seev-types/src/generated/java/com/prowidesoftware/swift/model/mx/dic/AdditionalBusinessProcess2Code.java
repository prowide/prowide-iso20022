
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalBusinessProcess2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalBusinessProcess2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CLAI"/&gt;
 *     &lt;enumeration value="REVR"/&gt;
 *     &lt;enumeration value="TAXR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdditionalBusinessProcess2Code")
@XmlEnum
public enum AdditionalBusinessProcess2Code {


    /**
     * Relates to a claim on the associated corporate action event.
     * 
     */
    CLAI,

    /**
     * Indicates a preadvice of movement reversal.
     * 
     */
    REVR,

    /**
     * Relates to a tax refund from the authorities on the associated corporate action event.
     * 
     */
    TAXR;

    public String value() {
        return name();
    }

    public static AdditionalBusinessProcess2Code fromValue(String v) {
        return valueOf(v);
    }

}
