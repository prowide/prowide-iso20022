
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceTaxDesignation1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ServiceTaxDesignation1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="XMPT"/>
 *     <enumeration value="ZERO"/>
 *     <enumeration value="TAXE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ServiceTaxDesignation1Code")
@XmlEnum
public enum ServiceTaxDesignation1Code {


    /**
     * No taxes are due.
     * 
     */
    XMPT,

    /**
     * Tax is due but at zero percent and a zero charge.
     * 
     */
    ZERO,

    /**
     * One or more taxes are due on this service.
     * 
     */
    TAXE;

    public String value() {
        return name();
    }

    public static ServiceTaxDesignation1Code fromValue(String v) {
        return valueOf(v);
    }

}
