
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GCAActionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="GCAActionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RCON"/>
 *     <enumeration value="FREA"/>
 *     <enumeration value="CDCU"/>
 *     <enumeration value="NQCU"/>
 *     <enumeration value="NFAC"/>
 *     <enumeration value="NSUP"/>
 *     <enumeration value="INVA"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
