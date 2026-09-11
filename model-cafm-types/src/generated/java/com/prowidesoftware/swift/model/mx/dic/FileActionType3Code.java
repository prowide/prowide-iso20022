
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileActionType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FileActionType3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADDD"/>
 *     <enumeration value="BRPT"/>
 *     <enumeration value="DELT"/>
 *     <enumeration value="DLSP"/>
 *     <enumeration value="ENQR"/>
 *     <enumeration value="REPL"/>
 *     <enumeration value="REQU"/>
 *     <enumeration value="UPDT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FileActionType3Code")
@XmlEnum
public enum FileActionType3Code {


    /**
     * Add a new record or file.
     * 
     */
    ADDD,

    /**
     * Replacing  previously added records.
     * 
     */
    BRPT,

    /**
     * Delete an existing record or file.
     * 
     */
    DELT,

    /**
     * System purge.
     * 
     */
    DLSP,

    /**
     * Request the content of an existing record or file.
     * 
     */
    ENQR,

    /**
     * Add a new record or file if none exists or replace an existing record or file if one exists.
     * 
     */
    REPL,

    /**
     * Request for a file or record.
     * 
     */
    REQU,

    /**
     * Update an existing record or file.
     * 
     */
    UPDT;

    public String value() {
        return name();
    }

    public static FileActionType3Code fromValue(String v) {
        return valueOf(v);
    }

}
