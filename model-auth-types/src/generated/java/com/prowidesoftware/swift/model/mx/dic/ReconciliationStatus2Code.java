
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ReconciliationStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NREC"/>
 *     <enumeration value="RECO"/>
 *     <enumeration value="NOAP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReconciliationStatus2Code")
@XmlEnum
public enum ReconciliationStatus2Code {


    /**
     * Indicator of reconciliation of derivatives for which all the reconcilable fields are not within the allowed tolerances.
     * 
     */
    NREC,

    /**
     * Indicator of reconciliation of derivatives for which all the reconcilable fields are within the allowed tolerances.
     * 
     */
    RECO,

    /**
     * Not applicable.
     * 
     */
    NOAP;

    public String value() {
        return name();
    }

    public static ReconciliationStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
