
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BorrowingReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BorrowingReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SFCT"/&gt;
 *     &lt;enumeration value="TTTP"/&gt;
 *     &lt;enumeration value="MMPP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BorrowingReason1Code")
@XmlEnum
public enum BorrowingReason1Code {


    /**
     * The borrowing reason is for Self consumption.
     * 
     */
    SFCT,

    /**
     * The borrowing reason is for Transfer to thrid party.
     * 
     */
    TTTP,

    /**
     * The borrowing reason is for Market making purpose.
     * 
     */
    MMPP;

    public String value() {
        return name();
    }

    public static BorrowingReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
