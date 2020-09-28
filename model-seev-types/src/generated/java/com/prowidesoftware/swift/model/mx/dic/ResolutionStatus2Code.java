
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResolutionStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResolutionStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACPT"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="WDRA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResolutionStatus2Code")
@XmlEnum
public enum ResolutionStatus2Code {


    /**
     * Meeting resolution has been accepted.
     * 
     */
    ACPT,

    /**
     * Meeting resolution has been rejected.
     * 
     */
    REJT,

    /**
     * Meeting resolution has been withdrawn.
     * 
     */
    WDRA;

    public String value() {
        return name();
    }

    public static ResolutionStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
