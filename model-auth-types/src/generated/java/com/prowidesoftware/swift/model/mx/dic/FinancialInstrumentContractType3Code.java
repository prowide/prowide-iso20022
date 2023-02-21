
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentContractType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FinancialInstrumentContractType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CFDS"/&gt;
 *     &lt;enumeration value="FRAS"/&gt;
 *     &lt;enumeration value="FUTR"/&gt;
 *     &lt;enumeration value="FORW"/&gt;
 *     &lt;enumeration value="OPTN"/&gt;
 *     &lt;enumeration value="SWAP"/&gt;
 *     &lt;enumeration value="SWPT"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="FWOS"/&gt;
 *     &lt;enumeration value="FONS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
