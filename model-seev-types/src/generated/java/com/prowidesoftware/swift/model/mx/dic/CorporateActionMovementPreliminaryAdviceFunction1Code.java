
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionMovementPreliminaryAdviceFunction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionMovementPreliminaryAdviceFunction1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ENTL"/>
 *     <enumeration value="CAPA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
