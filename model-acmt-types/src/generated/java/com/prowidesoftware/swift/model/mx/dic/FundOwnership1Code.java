
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundOwnership1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FundOwnership1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YALL"/&gt;
 *     &lt;enumeration value="NALL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FundOwnership1Code")
@XmlEnum
public enum FundOwnership1Code {


    /**
     * All shares owned.
     * 
     */
    YALL,

    /**
     * Not all shares owned.
     * 
     */
    NALL;

    public String value() {
        return name();
    }

    public static FundOwnership1Code fromValue(String v) {
        return valueOf(v);
    }

}
