
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyRole2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartyRole2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DIST"/&gt;
 *     &lt;enumeration value="LGRD"/&gt;
 *     &lt;enumeration value="DECM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyRole2Code")
@XmlEnum
public enum PartyRole2Code {


    /**
     * Party that act as an wholesaler of funds.
     * 
     */
    DIST,

    /**
     * Party that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated.
     * 
     */
    LGRD,

    /**
     * Party that is authorised to take investment decisions on behalf of the shareholder.
     * 
     */
    DECM;

    public String value() {
        return name();
    }

    public static PartyRole2Code fromValue(String v) {
        return valueOf(v);
    }

}
