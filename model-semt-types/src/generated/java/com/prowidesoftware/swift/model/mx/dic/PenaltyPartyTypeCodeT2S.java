
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyPartyTypeCode_T2S.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="PenaltyPartyTypeCode_T2S">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NCSD"/>
 *     <enumeration value="CSDP"/>
 *     <enumeration value="EXTE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PenaltyPartyTypeCode_T2S")
@XmlEnum
public enum PenaltyPartyTypeCodeT2S {


    /**
     * NationalCentralSecuritiesDepository
     * 
     */
    NCSD,

    /**
     * CSDParticipant
     * 
     */
    CSDP,

    /**
     * ExternalCSD
     * 
     */
    EXTE;

    public String value() {
        return name();
    }

    public static PenaltyPartyTypeCodeT2S fromValue(String v) {
        return valueOf(v);
    }

}
