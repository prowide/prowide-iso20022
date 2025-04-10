
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxReclaimMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxReclaimMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INPP"/&gt;
 *     &lt;enumeration value="INPS"/&gt;
 *     &lt;enumeration value="INSU"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxReclaimMethod1Code")
@XmlEnum
public enum TaxReclaimMethod1Code {


    /**
     * Invoice printed and given to purchaser and then used for tax reclaim
     * 
     */
    INPP,

    /**
     * Invoice printed but treated as supplemental because electronic copy is used for tax reclaim
     * 
     */
    INPS,

    /**
     * Printed invoice suppressed because electronic master version is used for tax reclaim
     * 
     */
    INSU,

    /**
     * Other tax reclaim method not elsewhere specified
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static TaxReclaimMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
