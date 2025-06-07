
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyInDeferral1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BuyInDeferral1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEFY"/&gt;
 *     &lt;enumeration value="DEFN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BuyInDeferral1Code")
@XmlEnum
public enum BuyInDeferral1Code {


    /**
     * Buy-in is deferred.
     * 
     * 
     */
    DEFY,

    /**
     * Buy-in is not deferred.
     * 
     */
    DEFN;

    public String value() {
        return name();
    }

    public static BuyInDeferral1Code fromValue(String v) {
        return valueOf(v);
    }

}
