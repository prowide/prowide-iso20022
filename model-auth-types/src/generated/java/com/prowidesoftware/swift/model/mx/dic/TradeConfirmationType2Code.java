
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeConfirmationType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TradeConfirmationType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NCNF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradeConfirmationType2Code")
@XmlEnum
public enum TradeConfirmationType2Code {


    /**
     * Non-confirmed.
     * 
     */
    NCNF;

    public String value() {
        return name();
    }

    public static TradeConfirmationType2Code fromValue(String v) {
        return valueOf(v);
    }

}
