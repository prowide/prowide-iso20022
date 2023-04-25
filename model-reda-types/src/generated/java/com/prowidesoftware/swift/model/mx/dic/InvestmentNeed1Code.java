
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentNeed1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InvestmentNeed1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ESGO"/>
 *     <enumeration value="ETHI"/>
 *     <enumeration value="GRIN"/>
 *     <enumeration value="ISLB"/>
 *     <enumeration value="NSPE"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="YSPE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InvestmentNeed1Code")
@XmlEnum
public enum InvestmentNeed1Code {


    /**
     * Investment need is for environmental social corporate governance.
     * 
     * 
     */
    ESGO,

    /**
     * Investment need is for ethical investment.
     * 
     */
    ETHI,

    /**
     * Investment need is for green investment.
     * 
     */
    GRIN,

    /**
     * Investment need is for Islamic banking.
     * 
     */
    ISLB,

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
     * Specific investment need.
     * 
     */
    YSPE;

    public String value() {
        return name();
    }

    public static InvestmentNeed1Code fromValue(String v) {
        return valueOf(v);
    }

}
