
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoCriteria1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NoCriteria1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOCR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NoCriteria1Code")
@XmlEnum
public enum NoCriteria1Code {


    /**
     * No criteria.
     * 
     */
    NOCR;

    public String value() {
        return name();
    }

    public static NoCriteria1Code fromValue(String v) {
        return valueOf(v);
    }

}
