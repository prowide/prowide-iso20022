
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPreliminaryAdviceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CorporateActionPreliminaryAdviceType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NEWM"/>
 *     <enumeration value="REPL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CorporateActionPreliminaryAdviceType1Code")
@XmlEnum
public enum CorporateActionPreliminaryAdviceType1Code {


    /**
     * New movement preliminary advice.
     * 
     */
    NEWM,

    /**
     * Movement preliminary advice replacing a previously sent preliminary advice.
     * 
     */
    REPL;

    public String value() {
        return name();
    }

    public static CorporateActionPreliminaryAdviceType1Code fromValue(String v) {
        return valueOf(v);
    }

}
