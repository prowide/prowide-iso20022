
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReconciliationStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NREC"/&gt;
 *     &lt;enumeration value="RECO"/&gt;
 *     &lt;enumeration value="NOAP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
