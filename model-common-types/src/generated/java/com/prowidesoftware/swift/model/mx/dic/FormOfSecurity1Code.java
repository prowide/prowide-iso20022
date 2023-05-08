
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FormOfSecurity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FormOfSecurity1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BEAR"/>
 *     <enumeration value="REGD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FormOfSecurity1Code")
@XmlEnum
public enum FormOfSecurity1Code {


    /**
     * The financial instrument does not specify any registration of ownership, and is payable to whomever possesses the certificate.
     * 
     */
    BEAR,

    /**
     * Shareholder name of the financial instrument appears in the corporation/funds books.
     * 
     */
    REGD;

    public String value() {
        return name();
    }

    public static FormOfSecurity1Code fromValue(String v) {
        return valueOf(v);
    }

}
