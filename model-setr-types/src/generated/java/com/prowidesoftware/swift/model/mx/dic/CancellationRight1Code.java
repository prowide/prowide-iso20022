
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationRight1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CancellationRight1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VALI"/&gt;
 *     &lt;enumeration value="NOXO"/&gt;
 *     &lt;enumeration value="NOWA"/&gt;
 *     &lt;enumeration value="NOIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CancellationRight1Code")
@XmlEnum
public enum CancellationRight1Code {


    /**
     * Investor is entitled to a "cooling off" period with cancellation rights under compliance rules.
     * 
     */
    VALI,

    /**
     * Investor is not entitled to cancellation rights under compliance rules, as the investor is an execution's only client.
     * 
     */
    NOXO,

    /**
     * Investor is not entitled to cancellation rights under compliance rules as the investor has agreed to waive those rights.
     * 
     */
    NOWA,

    /**
     * Investor is not entitled to cancellation rights under compliance rules as the investor is a financial institution.
     * 
     */
    NOIN;

    public String value() {
        return name();
    }

    public static CancellationRight1Code fromValue(String v) {
        return valueOf(v);
    }

}
