
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputCommand1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InputCommand1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DCSG"/>
 *     <enumeration value="DGSG"/>
 *     <enumeration value="GAKY"/>
 *     <enumeration value="GCNF"/>
 *     <enumeration value="GFKY"/>
 *     <enumeration value="GMNE"/>
 *     <enumeration value="PSWD"/>
 *     <enumeration value="SITE"/>
 *     <enumeration value="TXSG"/>
 *     <enumeration value="HTML"/>
 *     <enumeration value="SIGN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InputCommand1Code")
@XmlEnum
public enum InputCommand1Code {


    /**
     * Wait for a string of digit characters with a decimal point, the length range could be specified.
     * 
     */
    DCSG,

    /**
     * Wait for a string of digit characters.
     * 
     */
    DGSG,

    /**
     * Wait for a key pressed on the Terminal, to be able to read the message displayed on the Terminal.
     * 
     */
    GAKY,

    /**
     * Wait for a confirmation Yes (Y) or No (N) on the Sale System. Wait for a confirmation (Valid or Cancel button) on the POI Terminal. The result of the command is a Boolean: True or False.
     * 
     */
    GCNF,

    /**
     * Wait for a function key pressed on the Terminal: From POI, Valid, Clear, Correct, Generic Function key number. From Sale, Generic Function key.
     * 
     */
    GFKY,

    /**
     * To choose an entry among a list of entries (all of them are not necessary selectable). The OutputFormat has to be MenuEntry.
     * 
     */
    GMNE,

    /**
     * Request to enter a password with masked characters while typing the password.
     * 
     */
    PSWD,

    /**
     * Wait for a confirmation Yes (Y) or No (N) of the Site Manager on the Sale System.
     * 
     */
    SITE,

    /**
     * Wait for a string of alphanumeric characters.
     * 
     */
    TXSG,

    /**
     * Wait for a XHTML data.
     * 
     */
    HTML,

    /**
     * Request to wait for signature.
     * 
     */
    SIGN;

    public String value() {
        return name();
    }

    public static InputCommand1Code fromValue(String v) {
        return valueOf(v);
    }

}
