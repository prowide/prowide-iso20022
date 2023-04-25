
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialAssetTypeCategory1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FinancialAssetTypeCategory1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EQTY"/>
 *     <enumeration value="DEBT"/>
 *     <enumeration value="ENTL"/>
 *     <enumeration value="DERV"/>
 *     <enumeration value="MMKT"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FinancialAssetTypeCategory1Code")
@XmlEnum
public enum FinancialAssetTypeCategory1Code {


    /**
     * Balance attributed to equities.
     * 
     */
    EQTY,

    /**
     * Balance attributed to debt instruments.
     * 
     */
    DEBT,

    /**
     * Balance attributed to entitlements.
     * 
     */
    ENTL,

    /**
     * Balance attributed to derivatives.
     * 
     */
    DERV,

    /**
     * Balance attributed to money market instruments.
     * 
     */
    MMKT,

    /**
     * Other financial asset type balance according to a different classification, which is not explictly defined.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static FinancialAssetTypeCategory1Code fromValue(String v) {
        return valueOf(v);
    }

}
