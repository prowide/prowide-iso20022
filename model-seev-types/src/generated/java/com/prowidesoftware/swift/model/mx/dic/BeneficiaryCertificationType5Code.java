
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeneficiaryCertificationType5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BeneficiaryCertificationType5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCI"/&gt;
 *     &lt;enumeration value="NCOM"/&gt;
 *     &lt;enumeration value="QIBB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BeneficiaryCertificationType5Code")
@XmlEnum
public enum BeneficiaryCertificationType5Code {


    /**
     * The holder of the security has to irrevocably certify that it is an Accredited Investor as defined in US Securities and Exchange Commission Regulation D.
     * 
     */
    ACCI,

    /**
     * The holder of the security has to certify he is an Non-Company related person.
     * 
     */
    NCOM,

    /**
     * The holder of the security has to irrevocably certify that it is a Qualified Institutional Buyer as defined in US Securities and Exchange Commission Rule 144A.
     * 
     */
    QIBB;

    public String value() {
        return name();
    }

    public static BeneficiaryCertificationType5Code fromValue(String v) {
        return valueOf(v);
    }

}
