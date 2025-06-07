
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingPosition5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessingPosition5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INFO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProcessingPosition5Code")
@XmlEnum
public enum ProcessingPosition5Code {


    /**
     * Specifies that the transactions/instructions are linked for information purposes only.
     * 
     */
    INFO;

    public String value() {
        return name();
    }

    public static ProcessingPosition5Code fromValue(String v) {
        return valueOf(v);
    }

}
