
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileActionScope1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileActionScope1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FILE"/&gt;
 *     &lt;enumeration value="RECD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FileActionScope1Code")
@XmlEnum
public enum FileActionScope1Code {


    /**
     * Action applies to a file
     * 
     */
    FILE,

    /**
     * Action applies to a record
     * 
     */
    RECD;

    public String value() {
        return name();
    }

    public static FileActionScope1Code fromValue(String v) {
        return valueOf(v);
    }

}
