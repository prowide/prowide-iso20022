
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxEfficientProductType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxEfficientProductType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="CLIS"/>
 *     <enumeration value="FISA"/>
 *     <enumeration value="GISK"/>
 *     <enumeration value="GASK"/>
 *     <enumeration value="HISA"/>
 *     <enumeration value="INNF"/>
 *     <enumeration value="JCSH"/>
 *     <enumeration value="JISA"/>
 *     <enumeration value="LISA"/>
 *     <enumeration value="CCTF"/>
 *     <enumeration value="SCTF"/>
 *     <enumeration value="EQUI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxEfficientProductType2Code")
@XmlEnum
public enum TaxEfficientProductType2Code {


    /**
     * Cash individual savings account. In the UK, this is known as a cash ISA.
     * 
     */
    CASH,

    /**
     * Cash lifetime individual savings account. In the UK, this is known as a cash LISA.
     * 
     */
    CLIS,

    /**
     * Flexible individual savings account. In the UK, this is known as a FISA.
     * 
     */
    FISA,

    /**
     * General investment savings account. (Known as Investeringssparkonto (ISK) in some markets.)
     * 
     */
    GISK,

    /**
     * General shares or equity savings account. (Known as ASK in some markets.)
     * 
     */
    GASK,

    /**
     * Help to buy individual savings account. In the UK, this is known as a HISA.
     * 
     */
    HISA,

    /**
     * Innovative finance individual savings account. In the UK, this is known as an innovative ISA.
     * 
     */
    INNF,

    /**
     * Junior cash individual savings account. In the UK, this is known as a cash JISA.
     * 
     */
    JCSH,

    /**
     * Junior stocks and shares individual savings account. In the UK, this is known as a stocks and shares  JISA.
     * 
     */
    JISA,

    /**
     * Stocks and shares lifetime individual savings account. In the UK, this is known as a stocks and shares LISA.
     * 
     */
    LISA,

    /**
     * Non-stakeholder child trust fund individual savings account. In the UK, this is known as a non-stakeholder CTF ISA.
     * 
     */
    CCTF,

    /**
     * Stakeholder child trust fund individual savings account. In the UK, this is known as a stakeholder CTF ISA.
     * 
     */
    SCTF,

    /**
     * Stocks and shares individual savings account. In the UK, this is known as a stocks and shares ISA.
     * 
     */
    EQUI;

    public String value() {
        return name();
    }

    public static TaxEfficientProductType2Code fromValue(String v) {
        return valueOf(v);
    }

}
