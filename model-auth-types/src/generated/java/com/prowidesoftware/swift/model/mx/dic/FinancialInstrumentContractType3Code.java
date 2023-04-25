
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentContractType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FinancialInstrumentContractType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CFDS"/>
 *     <enumeration value="FRAS"/>
 *     <enumeration value="FUTR"/>
 *     <enumeration value="FORW"/>
 *     <enumeration value="OPTN"/>
 *     <enumeration value="SWAP"/>
 *     <enumeration value="SWPT"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="FWOS"/>
 *     <enumeration value="FONS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FinancialInstrumentContractType3Code")
@XmlEnum
public enum FinancialInstrumentContractType3Code {


    /**
     * Contract of type contracts for difference.
     * 
     */
    CFDS,

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
     * Contract of type forward.
     * 
     * 
     * 
     */
    FORW,

    /**
     * Contract of type option.
     * 
     * 
     */
    OPTN,

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
     * Contract of other financial instrument contract type.
     * 
     */
    OTHR,

    /**
     * Contract of type forwards on a swap.
     * 
     */
    FWOS,

    /**
     * Contract of type future on a swap.
     * 
     */
    FONS;

    public String value() {
        return name();
    }

    public static FinancialInstrumentContractType3Code fromValue(String v) {
        return valueOf(v);
    }

}
