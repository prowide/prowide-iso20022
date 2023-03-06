
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeneficiaryCertificationType4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BeneficiaryCertificationType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCI"/&gt;
 *     &lt;enumeration value="DOMI"/&gt;
 *     &lt;enumeration value="NDOM"/&gt;
 *     &lt;enumeration value="FULL"/&gt;
 *     &lt;enumeration value="NCOM"/&gt;
 *     &lt;enumeration value="QIBB"/&gt;
 *     &lt;enumeration value="TRBD"/&gt;
 *     &lt;enumeration value="PAPW"/&gt;
 *     &lt;enumeration value="PABD"/&gt;
 *     &lt;enumeration value="FRAC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BeneficiaryCertificationType4Code")
@XmlEnum
public enum BeneficiaryCertificationType4Code {


    /**
     * The holder of the security has to irrevocably certify that it is an Accredited Investor as defined in US Securities and Exchange Commission Regulation D.
     * 
     */
    ACCI,

    /**
     * The holder of the security has to certify his domicile.
     * 
     */
    DOMI,

    /**
     * The holder of the security has to certify, in line with the terms of the corporate action, that it is not domiciled in the country indicated.
     * 
     */
    NDOM,

    /**
     * The holder of the security has to provide his beneficial owner details for disclosure/instruction purpose.
     * 
     */
    FULL,

    /**
     * The holder of the security has to certify he is an Non-Company related person.
     * 
     */
    NCOM,

    /**
     * The holder of the security has to irrevocably certify that it is a Qualified Institutional Buyer as defined in US Securities and Exchange Commission Rule 144A.
     * 
     */
    QIBB,

    /**
     * The holder of the security has to provide basic details on nominals and associated tax rate to be used by the account servicer.
     * 
     */
    TRBD,

    /**
     * Indicates if the Beneficial Owner is responsible to fill in the paperwork.
     * 
     */
    PAPW,

    /**
     * The (I)CSD has to provide its participants' details for disclosure purpose to the issuer/issuer’s agent.
     * 
     */
    PABD,

    /**
     * Indicates that the rounding rule in the Fraction Disposition component at the option level can be offered at the beneficial owner level.
     * 
     */
    FRAC;

    public String value() {
        return name();
    }

    public static BeneficiaryCertificationType4Code fromValue(String v) {
        return valueOf(v);
    }

}
