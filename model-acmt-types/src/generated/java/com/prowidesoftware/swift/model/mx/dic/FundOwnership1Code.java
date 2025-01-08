
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundOwnership1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FundOwnership1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="YALL"/>
 *     <enumeration value="NALL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FundOwnership1Code")
@XmlEnum
public enum FundOwnership1Code {


    /**
     * All shares owned.
     * 
     */
    YALL,

    /**
     * Not all shares owned.
     * 
     */
    NALL;

    public String value() {
        return name();
    }

    public static FundOwnership1Code fromValue(String v) {
        return valueOf(v);
    }

}
