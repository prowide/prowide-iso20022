
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfficialDocumentType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OfficialDocumentType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ARNU"/&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="DIPL"/&gt;
 *     &lt;enumeration value="DVLC"/&gt;
 *     &lt;enumeration value="EURO"/&gt;
 *     &lt;enumeration value="IDEN"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="INPO"/&gt;
 *     &lt;enumeration value="LZPR"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PASS"/&gt;
 *     &lt;enumeration value="VISA"/&gt;
 *     &lt;enumeration value="PERM"/&gt;
 *     &lt;enumeration value="REFU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
