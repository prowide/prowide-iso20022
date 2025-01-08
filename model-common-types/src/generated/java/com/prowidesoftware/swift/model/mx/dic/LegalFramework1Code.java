
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalFramework1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LegalFramework1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FRAN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LegalFramework1Code")
@XmlEnum
public enum LegalFramework1Code {


    /**
     * Relates to the French legal framework for repos, that is, relates to a "Pension Livrée".
     * 
     */
    FRAN;

    public String value() {
        return name();
    }

    public static LegalFramework1Code fromValue(String v) {
        return valueOf(v);
    }

}
