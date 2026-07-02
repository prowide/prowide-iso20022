
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionStyle4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionStyle4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AMER"/&gt;
 *     &lt;enumeration value="EURO"/&gt;
 *     &lt;enumeration value="BERM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OptionStyle4Code")
@XmlEnum
public enum OptionStyle4Code {


    /**
     * Option can be exercised before or on expiry date.
     * 
     */
    AMER,

    /**
     * Option that can be exercised on expiry date only.
     * 
     */
    EURO,

    /**
     * Option that can be exercised on multiple discrete dates prior to, or on expiry date.
     * 
     */
    BERM;

    public String value() {
        return name();
    }

    public static OptionStyle4Code fromValue(String v) {
        return valueOf(v);
    }

}
