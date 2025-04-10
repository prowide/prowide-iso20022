
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionMovementPreliminaryAdviceFunction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionMovementPreliminaryAdviceFunction1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ENTL"/&gt;
 *     &lt;enumeration value="CAPA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionMovementPreliminaryAdviceFunction1Code")
@XmlEnum
public enum CorporateActionMovementPreliminaryAdviceFunction1Code {


    /**
     * Message is an entitlement.
     * 
     */
    ENTL,

    /**
     * Message is a preadvice of movement.
     * 
     */
    CAPA;

    public String value() {
        return name();
    }

    public static CorporateActionMovementPreliminaryAdviceFunction1Code fromValue(String v) {
        return valueOf(v);
    }

}
