
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TMSContactLevel1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TMSContactLevel1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRIT"/>
 *     <enumeration value="ASAP"/>
 *     <enumeration value="DTIM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TMSContactLevel1Code")
@XmlEnum
public enum TMSContactLevel1Code {


    /**
     * Terminal management system has to be contacted before the next transaction.
     * 
     */
    CRIT,

    /**
     * Terminal management system has to be contacted as soon as possible (for example after reconciliation).
     * 
     */
    ASAP,

    /**
     * Terminal management system has to be contacted at the date and time provided.
     * 
     */
    DTIM;

    public String value() {
        return name();
    }

    public static TMSContactLevel1Code fromValue(String v) {
        return valueOf(v);
    }

}
