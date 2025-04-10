
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileActionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="FileActionType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADDD"/>
 *     <enumeration value="DELT"/>
 *     <enumeration value="ENQR"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="REPL"/>
 *     <enumeration value="UPDT"/>
 *     <enumeration value="BRPT"/>
 *     <enumeration value="DLSP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "FileActionType1Code")
@XmlEnum
public enum FileActionType1Code {


    /**
     * Add a new record or file.
     * 
     */
    ADDD,

    /**
     * Delete an existing record or file.
     * 
     */
    DELT,

    /**
     * Request the content of an existing record or file.
     * 
     */
    ENQR,

    /**
     * Other type of file action defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of file action defined at private level.
     * 
     */
    OTHP,

    /**
     * Add a new record or file if none exists or replace an existing record or file if one exists.
     * 
     */
    REPL,

    /**
     * Update an existing record or file.
     * 
     */
    UPDT,

    /**
     * Replacing  previously added records.
     * 
     */
    BRPT,

    /**
     * System purge.
     * 
     */
    DLSP;

    public String value() {
        return name();
    }

    public static FileActionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
