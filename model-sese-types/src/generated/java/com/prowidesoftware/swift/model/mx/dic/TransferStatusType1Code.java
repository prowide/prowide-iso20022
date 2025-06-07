
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferStatusType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransferStatusType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="S019"/&gt;
 *     &lt;enumeration value="BCEV"/&gt;
 *     &lt;enumeration value="DRAW"/&gt;
 *     &lt;enumeration value="PAYA"/&gt;
 *     &lt;enumeration value="S012"/&gt;
 *     &lt;enumeration value="S005"/&gt;
 *     &lt;enumeration value="S001"/&gt;
 *     &lt;enumeration value="SETT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransferStatusType1Code")
@XmlEnum
public enum TransferStatusType1Code {


    /**
     * Status report is sent in response to an account holding information request.
     * 
     */
    @XmlEnumValue("S019")
    S_019("S019"),

    /**
     * Status report advises one or more Benefit Crystallisation Events (BCE) have occurred.
     * 
     */
    BCEV("BCEV"),

    /**
     * Status report advises one or more drawdowns.
     * 
     */
    DRAW("DRAW"),

    /**
     * Status report advises cash is or has been instructed.
     * 
     */
    PAYA("PAYA"),

    /**
     * Status report is sent in response to a portfolio transfer instruction.
     * 
     */
    @XmlEnumValue("S012")
    S_012("S012"),

    /**
     * Status report is sent in response to a transfer-in instruction.
     * 
     */
    @XmlEnumValue("S005")
    S_005("S005"),

    /**
     * Status report is sent in response to a transfer-out instruction.
     * 
     */
    @XmlEnumValue("S001")
    S_001("S001"),

    /**
     * Status report is sent to provide information required for a CSD or ICSD settlement leg.
     * 
     */
    SETT("SETT");
    private final String value;

    TransferStatusType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransferStatusType1Code fromValue(String v) {
        for (TransferStatusType1Code c: TransferStatusType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
