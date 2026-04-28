
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentNeed1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvestmentNeed1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ESGO"/&gt;
 *     &lt;enumeration value="ETHI"/&gt;
 *     &lt;enumeration value="GRIN"/&gt;
 *     &lt;enumeration value="ISLB"/&gt;
 *     &lt;enumeration value="NSPE"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="YSPE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
