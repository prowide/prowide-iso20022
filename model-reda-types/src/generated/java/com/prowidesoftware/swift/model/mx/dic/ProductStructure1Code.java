
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductStructure1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ProductStructure1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BOND"/>
 *     <enumeration value="NUMM"/>
 *     <enumeration value="UCMM"/>
 *     <enumeration value="EXTC"/>
 *     <enumeration value="UCIT"/>
 *     <enumeration value="SSEC"/>
 *     <enumeration value="SFUN"/>
 *     <enumeration value="NUCI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ProductStructure1Code")
@XmlEnum
public enum ProductStructure1Code {


    /**
     * Product is a bond.
     * 
     */
    BOND,

    /**
     * Product is a money market fund that is not an Undertaking for Collective Investment in Transferable Securities (UCITS).
     * 
     */
    NUMM,

    /**
     * Product is an Undertaking for Collective Investment in Transferable Securities (UCITS) money market fund.
     * 
     */
    UCMM,

    /**
     * Product is an exchange traded commodity.
     * 
     */
    EXTC,

    /**
     * Product is an Undertaking for Collective Investment in Transferable Securities (UCITS).
     * 
     */
    UCIT,

    /**
     * Product is a structured security.
     * 
     */
    SSEC,

    /**
     * Product is a structured fund.
     * 
     */
    SFUN,

    /**
     * Product is a not an Undertaking for Collective Investment in Transferable Securities (UCITS).
     * 
     */
    NUCI;

    public String value() {
        return name();
    }

    public static ProductStructure1Code fromValue(String v) {
        return valueOf(v);
    }

}
