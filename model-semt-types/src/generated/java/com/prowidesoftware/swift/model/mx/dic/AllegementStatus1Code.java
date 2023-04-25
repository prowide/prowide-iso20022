
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllegementStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AllegementStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CANC"/>
 *     <enumeration value="REMO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AllegementStatus1Code")
@XmlEnum
public enum AllegementStatus1Code {


    /**
     * Allegement has been cancelled since the previous delta statement. The allegement was cancelled because of a mistake by the sender or because the alleging party cancelled its instruction.
     * 
     */
    CANC,

    /**
     * Allegement has been removed since the previous delta statement. The allegement was removed because the alleged party sent its instruction.
     * 
     */
    REMO;

    public String value() {
        return name();
    }

    public static AllegementStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
