
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundIntention1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FundIntention1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="YQUA"/>
 *     <enumeration value="NQUA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FundIntention1Code")
@XmlEnum
public enum FundIntention1Code {


    /**
     * Qualified.
     * 
     */
    YQUA,

    /**
     * Not qualified.
     * 
     */
    NQUA;

    public String value() {
        return name();
    }

    public static FundIntention1Code fromValue(String v) {
        return valueOf(v);
    }

}
