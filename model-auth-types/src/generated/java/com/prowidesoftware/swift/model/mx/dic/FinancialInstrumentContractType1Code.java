
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentContractType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FinancialInstrumentContractType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CFDS"/>
 *     <enumeration value="FORW"/>
 *     <enumeration value="FRAS"/>
 *     <enumeration value="FUTR"/>
 *     <enumeration value="OPTN"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="SPDB"/>
 *     <enumeration value="SWAP"/>
 *     <enumeration value="SWPT"/>
 *     <enumeration value="FONS"/>
 *     <enumeration value="PSWP"/>
 *     <enumeration value="FFAS"/>
 *     <enumeration value="FWOS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FinancialInstrumentContractType1Code")
@XmlEnum
public enum FinancialInstrumentContractType1Code {


    /**
     * Contract of type contracts for difference.
     * 
     */
    CFDS,

    /**
     * Contract of type forward.
     * 
     * 
     * 
     */
    FORW,

    /**
     * Contract of type forward rate agreement.
     * 
     */
    FRAS,

    /**
     * Contract of type future.
     * 
     */
    FUTR,

    /**
     * Contract of type option.
     * 
     * 
     */
    OPTN,

    /**
     * Contract of other financial instrument contract type.
     * 
     */
    OTHR,

    /**
     * Contract of type spread betting.
     * 
     * 
     */
    SPDB,

    /**
     * Contract of type swap.
     * 
     * 
     */
    SWAP,

    /**
     * Contract of type swaption.
     * 
     * 
     */
    SWPT,

    /**
     * Contract of type future on a swap.
     * 
     */
    FONS,

    /**
     * Contract of type portfolio swap.
     * 
     */
    PSWP,

    /**
     * Contract of type forward freight agreement.
     * 
     */
    FFAS,

    /**
     * Contract of type forwards on a swap.
     * 
     */
    FWOS;

    public String value() {
        return name();
    }

    public static FinancialInstrumentContractType1Code fromValue(String v) {
        return valueOf(v);
    }

}
