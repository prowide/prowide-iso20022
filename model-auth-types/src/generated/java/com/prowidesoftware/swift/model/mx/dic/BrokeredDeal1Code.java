
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrokeredDeal1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BrokeredDeal1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BILA"/&gt;
 *     &lt;enumeration value="BROK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BrokeredDeal1Code")
@XmlEnum
public enum BrokeredDeal1Code {


    /**
     * Transaction was arranged directly by the reporting agent.
     * 
     */
    BILA,

    /**
     * Transaction was arranged by a third party broking agent.
     * 
     * 
     * 
     */
    BROK;

    public String value() {
        return name();
    }

    public static BrokeredDeal1Code fromValue(String v) {
        return valueOf(v);
    }

}
