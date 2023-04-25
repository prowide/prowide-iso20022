
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LevelOfControl1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LevelOfControl1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="TRAN"/>
 *     <enumeration value="VIEW"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LevelOfControl1Code")
@XmlEnum
public enum LevelOfControl1Code {


    /**
     * Transactions are permitted on the account.
     * 
     */
    TRAN,

    /**
     * Account may be viewed only.
     * 
     */
    VIEW;

    public String value() {
        return name();
    }

    public static LevelOfControl1Code fromValue(String v) {
        return valueOf(v);
    }

}
