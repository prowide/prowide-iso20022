
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalServiceResult1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdditionalServiceResult1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOPF"/&gt;
 *     &lt;enumeration value="NOSP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PERF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AdditionalServiceResult1Code")
@XmlEnum
public enum AdditionalServiceResult1Code {


    /**
     * The service was not performed.
     * 
     */
    NOPF,

    /**
     * The service is not supported and could not be performed.
     * 
     */
    NOSP,

    /**
     * Other nationally defined code.
     * 
     */
    OTHN,

    /**
     * Other privately defined code.
     * 
     */
    OTHP,

    /**
     * The service was performed.
     * 
     */
    PERF;

    public String value() {
        return name();
    }

    public static AdditionalServiceResult1Code fromValue(String v) {
        return valueOf(v);
    }

}
