
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralPool1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollateralPool1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOPL"/&gt;
 *     &lt;enumeration value="POOL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollateralPool1Code")
@XmlEnum
public enum CollateralPool1Code {


    /**
     * Collateral is not of pool type.
     * 
     */
    NOPL,

    /**
     * Collateral is of pool type.
     * 
     */
    POOL;

    public String value() {
        return name();
    }

    public static CollateralPool1Code fromValue(String v) {
        return valueOf(v);
    }

}
