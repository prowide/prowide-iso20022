
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeConfirmationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeConfirmationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ECNF"/&gt;
 *     &lt;enumeration value="YCNF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradeConfirmationType1Code")
@XmlEnum
public enum TradeConfirmationType1Code {


    /**
     * Electronically confirmed.
     * 
     */
    ECNF,

    /**
     * Non-electronically confirmed.
     * 
     */
    YCNF;

    public String value() {
        return name();
    }

    public static TradeConfirmationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
