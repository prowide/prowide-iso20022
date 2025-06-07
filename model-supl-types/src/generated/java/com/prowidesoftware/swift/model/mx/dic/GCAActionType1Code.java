
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCAActionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GCAActionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RCON"/&gt;
 *     &lt;enumeration value="FREA"/&gt;
 *     &lt;enumeration value="CDCU"/&gt;
 *     &lt;enumeration value="NQCU"/&gt;
 *     &lt;enumeration value="NFAC"/&gt;
 *     &lt;enumeration value="NSUP"/&gt;
 *     &lt;enumeration value="INVA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GCAActionType1Code")
@XmlEnum
public enum GCAActionType1Code {


    /**
     * Custodian needs to be contacted.
     * 
     */
    RCON,

    /**
     * Further research is required.
     * 
     */
    FREA,

    /**
     * Custodian has been contacted.
     * 
     */
    CDCU,

    /**
     * Custodian does not need to be contacted.
     * 
     */
    NQCU,

    /**
     * No further action is required.
     * 
     */
    NFAC,

    /**
     * Not supported by the GCA VA (Global Corporate Actions Validation service).
     * 
     */
    NSUP,

    /**
     * Invalid.
     * 
     */
    INVA;

    public String value() {
        return name();
    }

    public static GCAActionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
