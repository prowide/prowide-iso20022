
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PREC"/&gt;
 *     &lt;enumeration value="CURR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportType2Code")
@XmlEnum
public enum ReportType2Code {


    /**
     * The report is precalculated. This type of report is sent when an amendment is proposed.
     * 
     */
    PREC,

    /**
     * The report is calculated on the basis of a dataset matched with a baseline.
     * 
     */
    CURR;

    public String value() {
        return name();
    }

    public static ReportType2Code fromValue(String v) {
        return valueOf(v);
    }

}
