
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficialDocumentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="OfficialDocumentType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ARNU"/>
 *     <enumeration value="AUTH"/>
 *     <enumeration value="DIPL"/>
 *     <enumeration value="DVLC"/>
 *     <enumeration value="EURO"/>
 *     <enumeration value="IDEN"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="INPO"/>
 *     <enumeration value="LZPR"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="PASS"/>
 *     <enumeration value="VISA"/>
 *     <enumeration value="PERM"/>
 *     <enumeration value="REFU"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "OfficialDocumentType1Code")
@XmlEnum
public enum OfficialDocumentType1Code {


    /**
     * Number assigned by a government agency to identify foreign nationals.
     * 
     */
    ARNU,

    /**
     * Travel authorisation assigned by a government agency (e.g. ESTA, etc.)
     * 
     */
    AUTH,

    /**
     * Diplomatic passport or travel document.
     * 
     */
    DIPL,

    /**
     * Driving license.
     * 
     */
    DVLC,

    /**
     * Europol-issued travel or related document.
     * 
     */
    EURO,

    /**
     * Identity card.
     * 
     */
    IDEN,

    /**
     * Internal travel document.
     * 
     */
    INTE,

    /**
     * Interpol-issued travel or related document 
     * 
     */
    INPO,

    /**
     * Emergency travel or related document.
     * 
     */
    LZPR,

    /**
     * Other type of official document defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of official document defined at private level.
     * 
     */
    OTHP,

    /**
     * Passport.
     * 
     */
    PASS,

    /**
     * Visa issued by a government or related authority.
     * 
     */
    VISA,

    /**
     * Permit.
     * 
     */
    PERM,

    /**
     * Travel or related document issued to refugees.
     * 
     */
    REFU;

    public String value() {
        return name();
    }

    public static OfficialDocumentType1Code fromValue(String v) {
        return valueOf(v);
    }

}
