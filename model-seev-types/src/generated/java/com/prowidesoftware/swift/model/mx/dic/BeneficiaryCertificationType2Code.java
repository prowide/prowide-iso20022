
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeneficiaryCertificationType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BeneficiaryCertificationType2Code"&gt;
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
 *     &lt;enumeration value="NARR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BeneficiaryCertificationType2Code")
@XmlEnum
public enum BeneficiaryCertificationType2Code {


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
     * See narrative field for certification requirements.
     * 
     */
    NARR;

    public String value() {
        return name();
    }

    public static BeneficiaryCertificationType2Code fromValue(String v) {
        return valueOf(v);
    }

}
