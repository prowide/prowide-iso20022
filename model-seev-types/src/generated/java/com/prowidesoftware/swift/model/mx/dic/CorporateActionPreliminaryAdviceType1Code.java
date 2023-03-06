
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPreliminaryAdviceType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateActionPreliminaryAdviceType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NEWM"/&gt;
 *     &lt;enumeration value="REPL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
