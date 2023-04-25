
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Collateral1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Collateral1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COLL"/>
 *     <enumeration value="NCOL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Collateral1Code")
@XmlEnum
public enum Collateral1Code {


    /**
     * Item is used as collateral.
     * 
     */
    COLL,

    /**
     * Item is not used as collateral.
     * 
     */
    NCOL;

    public String value() {
        return name();
    }

    public static Collateral1Code fromValue(String v) {
        return valueOf(v);
    }

}
