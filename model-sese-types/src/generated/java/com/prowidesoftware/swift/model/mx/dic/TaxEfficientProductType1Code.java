
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxEfficientProductType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxEfficientProductType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CASH"/>
 *     <enumeration value="CCTF"/>
 *     <enumeration value="FISA"/>
 *     <enumeration value="HISA"/>
 *     <enumeration value="INNF"/>
 *     <enumeration value="JCSH"/>
 *     <enumeration value="JISA"/>
 *     <enumeration value="LISA"/>
 *     <enumeration value="SCTF"/>
 *     <enumeration value="EQUI"/>
 *     <enumeration value="GISK"/>
 *     <enumeration value="GASK"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxEfficientProductType1Code")
@XmlEnum
public enum TaxEfficientProductType1Code {


    /**
     * Cash individual savings account. In the UK, this is known as a cash ISA.
     * 
     */
    CASH,

    /**
     * Non-stakeholder child trust fund individual savings account. In the UK, this is known as a non-stakeholder CTF ISA.
     * 
     */
    CCTF,

    /**
     * Flexible individual savings account. In the UK, this is known as a FISA.
     * 
     */
    FISA,

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
     * Stakeholder child trust fund individual savings account. In the UK, this is known as a stakeholder CTF ISA.
     * 
     */
    SCTF,

    /**
     * Stocks and shares individual savings account. In the UK, this is known as a stocks and shares ISA.
     * 
     */
    EQUI,

    /**
     * General investment savings account. (Known as Investeringssparkonto (ISK) in some markets.)
     * 
     */
    GISK,

    /**
     * General shares or equity savings account. (Known as ASK in some markets.)
     * 
     */
    GASK;

    public String value() {
        return name();
    }

    public static TaxEfficientProductType1Code fromValue(String v) {
        return valueOf(v);
    }

}
