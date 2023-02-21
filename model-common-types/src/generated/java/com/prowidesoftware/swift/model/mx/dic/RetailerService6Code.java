
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerService6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RetailerService6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RPTQ"/&gt;
 *     &lt;enumeration value="RPAQ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RetailerService6Code")
@XmlEnum
public enum RetailerService6Code {


    /**
     * The Sale System requests to the POI System a report on a list of transactions.
     * 
     */
    RPTQ,

    /**
     * The Sale System requests to the POI System a report on the totals figures of the POI system.
     * 
     */
    RPAQ;

    public String value() {
        return name();
    }

    public static RetailerService6Code fromValue(String v) {
        return valueOf(v);
    }

}
