
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductStructure1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductStructure1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOND"/&gt;
 *     &lt;enumeration value="NUMM"/&gt;
 *     &lt;enumeration value="UCMM"/&gt;
 *     &lt;enumeration value="EXTC"/&gt;
 *     &lt;enumeration value="UCIT"/&gt;
 *     &lt;enumeration value="SSEC"/&gt;
 *     &lt;enumeration value="SFUN"/&gt;
 *     &lt;enumeration value="NUCI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
