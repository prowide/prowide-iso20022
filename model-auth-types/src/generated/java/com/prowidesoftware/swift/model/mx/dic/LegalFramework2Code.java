
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalFramework2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LegalFramework2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UCIT"/>
 *     <enumeration value="AIFD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LegalFramework2Code")
@XmlEnum
public enum LegalFramework2Code {


    /**
     * Relates to the European legal framework for undertakings for collective investment in transferable securities.
     * 
     */
    UCIT,

    /**
     * Relates to the European legal framework for alternative investment fund.
     * 
     */
    AIFD;

    public String value() {
        return name();
    }

    public static LegalFramework2Code fromValue(String v) {
        return valueOf(v);
    }

}
