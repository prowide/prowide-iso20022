
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfPrice14Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfPrice14Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AVER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfPrice14Code")
@XmlEnum
public enum TypeOfPrice14Code {


    /**
     * Price is an average execution price.
     * 
     */
    AVER;

    public String value() {
        return name();
    }

    public static TypeOfPrice14Code fromValue(String v) {
        return valueOf(v);
    }

}
