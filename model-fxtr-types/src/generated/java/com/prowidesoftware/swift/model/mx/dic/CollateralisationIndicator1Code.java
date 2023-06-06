
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralisationIndicator1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CollateralisationIndicator1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FULL"/>
 *     <enumeration value="ONEW"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="UNCO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CollateralisationIndicator1Code")
@XmlEnum
public enum CollateralisationIndicator1Code {


    /**
     * Transaction is fully collateralised.
     * 
     */
    FULL,

    /**
     * Transaction is one-way collateralised.
     * 
     */
    ONEW,

    /**
     * Transaction is partially collateralised.
     * 
     */
    PART,

    /**
     * Transaction is uncollateralised.
     * 
     */
    UNCO;

    public String value() {
        return name();
    }

    public static CollateralisationIndicator1Code fromValue(String v) {
        return valueOf(v);
    }

}
