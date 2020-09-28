
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentContractType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FinancialInstrumentContractType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CFDS"/&gt;
 *     &lt;enumeration value="FORW"/&gt;
 *     &lt;enumeration value="FRAS"/&gt;
 *     &lt;enumeration value="FUTR"/&gt;
 *     &lt;enumeration value="OPTN"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="SPDB"/&gt;
 *     &lt;enumeration value="SWAP"/&gt;
 *     &lt;enumeration value="SWPT"/&gt;
 *     &lt;enumeration value="FONS"/&gt;
 *     &lt;enumeration value="PSWP"/&gt;
 *     &lt;enumeration value="FFAS"/&gt;
 *     &lt;enumeration value="FWOS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
