
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentNeed2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestmentNeed2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NSPE"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="ISLB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvestmentNeed2Code")
@XmlEnum
public enum InvestmentNeed2Code {


    /**
     * No specific need.
     * 
     */
    NSPE,

    /**
     * Other specific need.
     * 
     */
    OTHR,

    /**
     * Investment need is for Islamic banking.
     * 
     */
    ISLB;

    public String value() {
        return name();
    }

    public static InvestmentNeed2Code fromValue(String v) {
        return valueOf(v);
    }

}
