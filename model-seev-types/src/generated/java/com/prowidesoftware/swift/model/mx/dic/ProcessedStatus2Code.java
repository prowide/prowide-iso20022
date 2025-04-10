
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessedStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessedStatus2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProcessedStatus2Code")
@XmlEnum
public enum ProcessedStatus2Code {


    /**
     * The instruction/request has been received.
     * 
     */
    RECE,

    /**
     * The request has been completed.
     * 
     */
    COMP;

    public String value() {
        return name();
    }

    public static ProcessedStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
