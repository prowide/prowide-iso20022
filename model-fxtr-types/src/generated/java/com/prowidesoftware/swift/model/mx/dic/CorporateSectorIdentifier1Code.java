
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateSectorIdentifier1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CorporateSectorIdentifier1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateSectorIdentifier1Code")
@XmlEnum
public enum CorporateSectorIdentifier1Code {


    /**
     * Alternative investment fund managed by an Alternative Investment Fund Manager (AIFM) authorised or registered in accordance with European Securities and Markets Authority (ESMA) Directive 2011/61/EU.
     * 
     */
    L,

    /**
     * Assurance undertaking authorised in accordance with European Securities and Markets Authority (ESMA) Directive 2002/83/EC.
     * 
     */
    A,

    /**
     * Credit Institution authorised in accordance with  European Securities and Markets Authority (ESMA) Directive 2006/48/EC.
     * 
     */
    C,

    /**
     * Insurance undertaking in accordance with  European Securities and Markets Authority (ESMA) Directive 73/239/EEC.
     * 
     */
    I,

    /**
     * Investment firm in accordance with  European Securities and Markets Authority (ESMA) Directive 2004/39/EC.
     * 
     */
    F,

    /**
     * Institution for occupational retirement provision within the meaning of Article 6(a) of  European Securities and Markets Authority (ESMA) Directive 2003/41/EC.
     * 
     */
    O,

    /**
     * Reinsurance undertaking authorised in accordance with  European Securities and Markets Authority (ESMA) Directive 2005/68/EC.
     * 
     */
    R,

    /**
     * Undertakings for Collective Investment in Transferable Securities (UCITS) and its management company, authorised in accordance with  European Securities and Markets Authority (ESMA) Directive 2009/95/EC.
     * 
     */
    U;

    public String value() {
        return name();
    }

    public static CorporateSectorIdentifier1Code fromValue(String v) {
        return valueOf(v);
    }

}
