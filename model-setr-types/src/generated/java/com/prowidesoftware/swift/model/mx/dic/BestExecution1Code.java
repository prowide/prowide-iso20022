
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BestExecution1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BestExecution1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BTEX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BestExecution1Code")
@XmlEnum
public enum BestExecution1Code {


    /**
     * Best execution rules were followed.
     * 
     */
    BTEX;

    public String value() {
        return name();
    }

    public static BestExecution1Code fromValue(String v) {
        return valueOf(v);
    }

}
