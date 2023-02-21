
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialAssetTypeCategory1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FinancialAssetTypeCategory1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EQTY"/&gt;
 *     &lt;enumeration value="DEBT"/&gt;
 *     &lt;enumeration value="ENTL"/&gt;
 *     &lt;enumeration value="DERV"/&gt;
 *     &lt;enumeration value="MMKT"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
