
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificateType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CertificateType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AMLC"/>
 *     <enumeration value="DVLC"/>
 *     <enumeration value="DFOR"/>
 *     <enumeration value="GOST"/>
 *     <enumeration value="IDEN"/>
 *     <enumeration value="INCU"/>
 *     <enumeration value="LREF"/>
 *     <enumeration value="PASS"/>
 *     <enumeration value="PRAD"/>
 *     <enumeration value="PKIC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CertificateType2Code")
@XmlEnum
public enum CertificateType2Code {


    /**
     * Anti-money laundering certification form.
     * 
     */
    AMLC,

    /**
     * Government issued form of picture identification - driving license.
     * 
     */
    DVLC,

    /**
     * Certification of due formation and organisation.
     * 
     */
    DFOR,

    /**
     * Certificate of good standing.
     * 
     */
    GOST,

    /**
     * Government issued form of picture identification - identity card.
     * 
     */
    IDEN,

    /**
     * Certification of incumbency.
     * 
     */
    INCU,

    /**
     * Letter of reference.
     * 
     */
    LREF,

    /**
     * Government issued form of picture identification - passport.
     * 
     */
    PASS,

    /**
     * Proof of the address, such as a utility bill.
     * 
     */
    PRAD,

    /**
     * Public key infrastructure certificate.
     * 
     */
    PKIC;

    public String value() {
        return name();
    }

    public static CertificateType2Code fromValue(String v) {
        return valueOf(v);
    }

}
