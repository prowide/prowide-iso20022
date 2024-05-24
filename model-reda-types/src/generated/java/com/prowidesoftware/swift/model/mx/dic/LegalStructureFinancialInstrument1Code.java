
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalStructureFinancialInstrument1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LegalStructureFinancialInstrument1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NUCI"/>
 *     <enumeration value="SFUN"/>
 *     <enumeration value="SSEC"/>
 *     <enumeration value="UCIT"/>
 *     <enumeration value="EXTC"/>
 *     <enumeration value="UCMM"/>
 *     <enumeration value="NUMM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LegalStructureFinancialInstrument1Code")
@XmlEnum
public enum LegalStructureFinancialInstrument1Code {


    /**
     * Legal structure is a not an Undertaking for Collective Investment in Transferable Securities (UCITS).
     * 
     */
    NUCI,

    /**
     * Legal structure is a structured fund.
     * 
     */
    SFUN,

    /**
     * Legal structure is a structured security.
     * 
     */
    SSEC,

    /**
     * Legal structure is an Undertaking for Collective Investment in Transferable Securities (UCITS).
     * 
     */
    UCIT,

    /**
     * Legal structure is an exchange traded commodity.
     * 
     */
    EXTC,

    /**
     * Legal structure is an Undertaking for Collective Investment in Transferable Securities (UCITS) money market fund.
     * 
     */
    UCMM,

    /**
     * Legal structure is a money market fund that is not an Undertaking for Collective Investment in Transferable Securities (UCITS).
     * 
     */
    NUMM;

    public String value() {
        return name();
    }

    public static LegalStructureFinancialInstrument1Code fromValue(String v) {
        return valueOf(v);
    }

}
