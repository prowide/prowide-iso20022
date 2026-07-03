
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Instruction3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Instruction3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CHQB"/&gt;
 *     &lt;enumeration value="HOLD"/&gt;
 *     &lt;enumeration value="PHOB"/&gt;
 *     &lt;enumeration value="TELB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Instruction3Code")
@XmlEnum
public enum Instruction3Code {


    /**
     * (Ultimate) creditor must be paid by cheque.
     * 
     */
    CHQB,

    /**
     * Amount of money must be held for the (ultimate) creditor, who will call. Pay on identification.
     * 
     */
    HOLD,

    /**
     * Please advise/contact (ultimate) creditor/claimant by phone.
     * 
     */
    PHOB,

    /**
     * Please advise/contact (ultimate) creditor/claimant by the most efficient means of telecommunication.
     * 
     */
    TELB;

    public String value() {
        return name();
    }

    public static Instruction3Code fromValue(String v) {
        return valueOf(v);
    }

}
