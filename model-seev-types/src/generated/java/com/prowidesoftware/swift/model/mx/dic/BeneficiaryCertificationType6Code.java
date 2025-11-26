
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeneficiaryCertificationType6Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BeneficiaryCertificationType6Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCI"/>
 *     <enumeration value="DOMI"/>
 *     <enumeration value="NDOM"/>
 *     <enumeration value="FULL"/>
 *     <enumeration value="NCOM"/>
 *     <enumeration value="QIBB"/>
 *     <enumeration value="TRBD"/>
 *     <enumeration value="PABD"/>
 *     <enumeration value="FRAC"/>
 *     <enumeration value="PAPW"/>
 *     <enumeration value="DIOR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BeneficiaryCertificationType6Code")
@XmlEnum
public enum BeneficiaryCertificationType6Code {


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
     * The (I)CSD has to provide its participants' details for disclosure purpose to the issuer/issuer’s agent.
     * 
     */
    PABD,

    /**
     * Indicates that the rounding rule in the Fraction Disposition component at the option level can be offered at the beneficial owner level.
     * 
     */
    FRAC,

    /**
     * Indicates if the Beneficial Owner is responsible to fill in the paperwork.
     * 
     */
    PAPW,

    /**
     * Documentation required on or prior to the documentation deadline date.
     * 
     */
    DIOR;

    public String value() {
        return name();
    }

    public static BeneficiaryCertificationType6Code fromValue(String v) {
        return valueOf(v);
    }

}
