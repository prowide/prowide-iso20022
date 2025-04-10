
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EMTDataReportingVFMUKType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EMTDataReportingVFMUKType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YSCO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EMTDataReportingVFMUKType1Code")
@XmlEnum
public enum EMTDataReportingVFMUKType1Code {


    /**
     * Value for money data is being provided.
     * 
     */
    YSCO;

    public String value() {
        return name();
    }

    public static EMTDataReportingVFMUKType1Code fromValue(String v) {
        return valueOf(v);
    }

}
