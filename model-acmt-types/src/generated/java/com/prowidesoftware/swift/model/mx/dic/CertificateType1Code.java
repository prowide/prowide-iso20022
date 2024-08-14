
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificateType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CertificateType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DFOR"/>
 *     <enumeration value="GOST"/>
 *     <enumeration value="LREF"/>
 *     <enumeration value="AMLC"/>
 *     <enumeration value="INCU"/>
 *     <enumeration value="PASS"/>
 *     <enumeration value="DVLC"/>
 *     <enumeration value="IDEN"/>
 *     <enumeration value="PRAD"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
