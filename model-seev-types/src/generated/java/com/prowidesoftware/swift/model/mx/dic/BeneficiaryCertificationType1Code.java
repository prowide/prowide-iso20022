
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeneficiaryCertificationType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="BeneficiaryCertificationType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCI"/>
 *     <enumeration value="DOMI"/>
 *     <enumeration value="FULL"/>
 *     <enumeration value="QIBB"/>
 *     <enumeration value="TRBD"/>
 *     <enumeration value="NCOM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "BeneficiaryCertificationType1Code")
@XmlEnum
public enum BeneficiaryCertificationType1Code {


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
     * The holder of the security has to provide his beneficial owner details for disclosure/instruction purpose.
     * 
     */
    FULL,

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
     * The holder of the security has to certify he is an Non-Company related person.
     * 
     */
    NCOM;

    public String value() {
        return name();
    }

    public static BeneficiaryCertificationType1Code fromValue(String v) {
        return valueOf(v);
    }

}
