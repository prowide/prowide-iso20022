
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AffirmStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="AffirmStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ATCN"/>
 *     <enumeration value="ATSC"/>
 *     <enumeration value="COMP"/>
 *     <enumeration value="MISM"/>
 *     <enumeration value="MISE"/>
 *     <enumeration value="NOTP"/>
 *     <enumeration value="OUOR"/>
 *     <enumeration value="OUOS"/>
 *     <enumeration value="RECE"/>
 *     <enumeration value="UNRE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AffirmStatus1Code")
@XmlEnum
public enum AffirmStatus1Code {


    /**
     * Notfies that the trade confimation was conpleted.
     * 
     */
    ATCN,

    /**
     * Notfies the clearing status changed.
     * 
     */
    ATSC,

    /**
     * Data was successfully matched.
     * 
     */
    COMP,

    /**
     * Data was mismatched.
     * 
     */
    MISM,

    /**
     * Model has errors.
     * 
     */
    MISE,

    /**
     * Have no trading permissions.
     * 
     */
    NOTP,

    /**
     * Query time was out of range.
     * 
     */
    OUOR,

    /**
     * Query time was over system service time.
     * 
     */
    OUOS,

    /**
     * Format of upload data was right, and system receives successfully.
     * 
     */
    RECE,

    /**
     * Format of upload data was wrong, and system receives unsuccessfully.
     * 
     */
    UNRE;

    public String value() {
        return name();
    }

    public static AffirmStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
