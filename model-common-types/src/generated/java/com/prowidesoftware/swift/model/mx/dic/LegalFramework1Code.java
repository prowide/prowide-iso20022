
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LegalFramework1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LegalFramework1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FRAN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LegalFramework1Code")
@XmlEnum
public enum LegalFramework1Code {


    /**
     * Relates to the French legal framework for repos, that is, relates to a "Pension Livrée".
     * 
     */
    FRAN;

    public String value() {
        return name();
    }

    public static LegalFramework1Code fromValue(String v) {
        return valueOf(v);
    }

}
