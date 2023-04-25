
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetAssetValueBasis1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="NetAssetValueBasis1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CNAV"/>
 *     <enumeration value="NAVL"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NetAssetValueBasis1Code")
@XmlEnum
public enum NetAssetValueBasis1Code {


    /**
     * Constant net asset value at the valuation date of a specific investment fund class calculated in accordance with the amortised cost method divided by the number of outstanding units or shares of the fund.
     * 
     */
    CNAV,

    /**
     * Value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.
     * 
     */
    NAVL;

    public String value() {
        return name();
    }

    public static NetAssetValueBasis1Code fromValue(String v) {
        return valueOf(v);
    }

}
