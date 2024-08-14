
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReconciliationStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NREC"/>
 *     <enumeration value="RECO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReconciliationStatus1Code")
@XmlEnum
public enum ReconciliationStatus1Code {


    /**
     * Indicator of reconciliation of derivatives for which all the reconcilable fields are not within the allowed tolerances.
     * 
     */
    NREC,

    /**
     * Indicator of reconciliation of derivatives for which all the reconcilable fields are within the allowed tolerances.
     * 
     */
    RECO;

    public String value() {
        return name();
    }

    public static ReconciliationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
