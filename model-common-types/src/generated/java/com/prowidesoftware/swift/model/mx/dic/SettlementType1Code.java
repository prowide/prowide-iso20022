
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SettlementType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRIN"/&gt;
 *     &lt;enumeration value="NETO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettlementType1Code")
@XmlEnum
public enum SettlementType1Code {


    /**
     * Option trade is settled as principal.
     * 
     */
    PRIN,

    /**
     * Option trade is netted off against another trade.
     * 
     */
    NETO;

    public String value() {
        return name();
    }

    public static SettlementType1Code fromValue(String v) {
        return valueOf(v);
    }

}
