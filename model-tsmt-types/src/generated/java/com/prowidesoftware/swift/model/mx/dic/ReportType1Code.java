
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FWIS"/&gt;
 *     &lt;enumeration value="FWRE"/&gt;
 *     &lt;enumeration value="FWAM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReportType1Code")
@XmlEnum
public enum ReportType1Code {


    /**
     * The report contains a baseline submitted for the first time.
     * 
     */
    FWIS,

    /**
     * The report contains a baseline that is resubmitted.
     * 
     */
    FWRE,

    /**
     * The report contains a baseline that is amended.
     * 
     */
    FWAM;

    public String value() {
        return name();
    }

    public static ReportType1Code fromValue(String v) {
        return valueOf(v);
    }

}
