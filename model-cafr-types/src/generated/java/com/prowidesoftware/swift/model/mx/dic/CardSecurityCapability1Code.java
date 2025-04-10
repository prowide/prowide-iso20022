
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardSecurityCapability1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardSecurityCapability1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ICCD"/>
 *     <enumeration value="MWOS"/>
 *     <enumeration value="MSWS"/>
 *     <enumeration value="OTHN"/>
 *     <enumeration value="OTHP"/>
 *     <enumeration value="OLPN"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardSecurityCapability1Code")
@XmlEnum
public enum CardSecurityCapability1Code {


    /**
     * Card contains an integrated circuit card.
     * 
     */
    ICCD,

    /**
     * Card does not contain a card security code in the magstripe
     * 
     */
    MWOS,

    /**
     * Card contains a card security code in the magstripe
     * 
     */
    MSWS,

    /**
     * Other type of card defined at national level.
     * 
     */
    OTHN,

    /**
     * Other type of card defined at private level.
     * 
     */
    OTHP,

    /**
     * Off line PIN card
     * 
     */
    OLPN;

    public String value() {
        return name();
    }

    public static CardSecurityCapability1Code fromValue(String v) {
        return valueOf(v);
    }

}
