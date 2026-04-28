
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxReportingStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxReportingStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACPT"/&gt;
 *     &lt;enumeration value="RJCT"/&gt;
 *     &lt;enumeration value="WARN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxReportingStatus2Code")
@XmlEnum
public enum TaxReportingStatus2Code {


    /**
     * Transaction or report has been accepted.
     * 
     */
    ACPT,

    /**
     * Transaction or report has been rejected.
     * 
     */
    RJCT,

    /**
     * Transaction has been accepted with warnings.
     * 
     */
    WARN;

    public String value() {
        return name();
    }

    public static TaxReportingStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
