
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxEfficientProductType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxEfficientProductType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CCTF"/&gt;
 *     &lt;enumeration value="FISA"/&gt;
 *     &lt;enumeration value="HISA"/&gt;
 *     &lt;enumeration value="INNF"/&gt;
 *     &lt;enumeration value="JCSH"/&gt;
 *     &lt;enumeration value="JISA"/&gt;
 *     &lt;enumeration value="LISA"/&gt;
 *     &lt;enumeration value="SCTF"/&gt;
 *     &lt;enumeration value="EQUI"/&gt;
 *     &lt;enumeration value="GISK"/&gt;
 *     &lt;enumeration value="GASK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
