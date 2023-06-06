
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BrokeredDeal1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BrokeredDeal1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BILA"/>
 *     <enumeration value="BROK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
