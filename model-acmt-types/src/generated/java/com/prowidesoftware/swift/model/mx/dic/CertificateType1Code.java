
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificateType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CertificateType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DFOR"/&gt;
 *     &lt;enumeration value="GOST"/&gt;
 *     &lt;enumeration value="LREF"/&gt;
 *     &lt;enumeration value="AMLC"/&gt;
 *     &lt;enumeration value="INCU"/&gt;
 *     &lt;enumeration value="PASS"/&gt;
 *     &lt;enumeration value="DVLC"/&gt;
 *     &lt;enumeration value="IDEN"/&gt;
 *     &lt;enumeration value="PRAD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CertificateType1Code")
@XmlEnum
public enum CertificateType1Code {


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
     * Letter of reference.
     * 
     */
    LREF,

    /**
     * Anti-money laundering certification form.
     * 
     */
    AMLC,

    /**
     * Certification of incumbency.
     * 
     */
    INCU,

    /**
     * Government issued form of picture identification - passport.
     * 
     */
    PASS,

    /**
     * Government issued form of picture identification - driving license.
     * 
     */
    DVLC,

    /**
     * Government issued form of picture identification - identity card.
     * 
     */
    IDEN,

    /**
     * Proof of the address, such as a utility bill.
     * 
     */
    PRAD;

    public String value() {
        return name();
    }

    public static CertificateType1Code fromValue(String v) {
        return valueOf(v);
    }

}
