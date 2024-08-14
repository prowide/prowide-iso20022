
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="CardType1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CRDT"/>
 *     <enumeration value="DBIT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CardType1Code")
@XmlEnum
public enum CardType1Code {


    /**
     * Card where the holder has been granted a line of credit. The card enables the holder to make purchases and withdraw cash up to a pre-arranged ceiling.
     * 
     */
    CRDT,

    /**
     * Card enabling the holder to have its purchases directly charged to its account. The card may also combine other functions, for example, cash card or cheque guaranteed card.
     * 
     */
    DBIT;

    public String value() {
        return name();
    }

    public static CardType1Code fromValue(String v) {
        return valueOf(v);
    }

}
