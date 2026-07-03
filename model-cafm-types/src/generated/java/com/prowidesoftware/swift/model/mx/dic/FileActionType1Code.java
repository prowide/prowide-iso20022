
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileActionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileActionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADDD"/&gt;
 *     &lt;enumeration value="DELT"/&gt;
 *     &lt;enumeration value="ENQR"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="REPL"/&gt;
 *     &lt;enumeration value="UPDT"/&gt;
 *     &lt;enumeration value="BRPT"/&gt;
 *     &lt;enumeration value="DLSP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
