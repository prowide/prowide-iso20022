
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountingStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YDOM"/&gt;
 *     &lt;enumeration value="NDOM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountingStatus1Code")
@XmlEnum
public enum AccountingStatus1Code {


    /**
     * Account or party is regarded as domestic for reporting purposes.
     * 
     */
    YDOM,

    /**
     * Account or party is not regarded as domestic for reporting purposes.
     * 
     */
    NDOM;

    public String value() {
        return name();
    }

    public static AccountingStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
