
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatementUpdateTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="StatementUpdateTypeCode">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="COMP"/>
 *     <enumeration value="DELT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StatementUpdateTypeCode")
@XmlEnum
public enum StatementUpdateTypeCode {


    /**
     * Statement is complete.
     * 
     */
    COMP,

    /**
     * Statement contains changes only.
     * 
     */
    DELT;

    public String value() {
        return name();
    }

    public static StatementUpdateTypeCode fromValue(String v) {
        return valueOf(v);
    }

}
