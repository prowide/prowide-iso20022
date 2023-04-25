
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompensationMethod1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CompensationMethod1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NOCP"/>
 *     <enumeration value="DBTD"/>
 *     <enumeration value="INVD"/>
 *     <enumeration value="DDBT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CompensationMethod1Code")
@XmlEnum
public enum CompensationMethod1Code {


    /**
     * Account does not pay and charges or taxes due.
     * 
     */
    NOCP,

    /**
     * Account is debited for any charges or taxes due.
     * 
     */
    DBTD,

    /**
     * Account or summary account is invoiced for any charges or taxes due.
     * 
     */
    INVD,

    /**
     * Account is automatically debited on a future date.
     * 
     */
    DDBT;

    public String value() {
        return name();
    }

    public static CompensationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
