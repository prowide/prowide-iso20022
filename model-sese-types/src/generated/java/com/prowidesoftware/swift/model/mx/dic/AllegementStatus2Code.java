
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllegementStatus2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AllegementStatus2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACPT"/>
 *     <enumeration value="PEND"/>
 *     <enumeration value="REJT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AllegementStatus2Code")
@XmlEnum
public enum AllegementStatus2Code {


    /**
     * Allegement has been accepted.
     * 
     */
    ACPT,

    /**
     * Allegement is pending.
     * 
     */
    PEND,

    /**
     * Transaction or report has been rejected.
     * 
     */
    REJT;

    public String value() {
        return name();
    }

    public static AllegementStatus2Code fromValue(String v) {
        return valueOf(v);
    }

}
