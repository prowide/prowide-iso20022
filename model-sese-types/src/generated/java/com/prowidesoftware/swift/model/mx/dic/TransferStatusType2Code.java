
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferStatusType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransferStatusType2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="S019"/>
 *     <enumeration value="BCEV"/>
 *     <enumeration value="SETT"/>
 *     <enumeration value="DRAW"/>
 *     <enumeration value="PAYA"/>
 *     <enumeration value="S012"/>
 *     <enumeration value="INFO"/>
 *     <enumeration value="STAT"/>
 *     <enumeration value="S005"/>
 *     <enumeration value="S001"/>
 *     <enumeration value="CONV"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransferStatusType2Code")
@XmlEnum
public enum TransferStatusType2Code {


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
     * Status report is sent to provide information required for a CSD or ICSD settlement leg.
     * 
     */
    SETT("SETT"),

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
     * Status report is sent to provide information pertinent to the transfer. May be sent in response to a request for transfer status.
     * 
     */
    INFO("INFO"),

    /**
     * Status report is sent to provide the status of a transfer. May be sent in response to a request for transfer status.
     * 
     */
    STAT("STAT"),

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
     * Status report is sent to provide the number of units following a conversion.
     * 
     */
    CONV("CONV");
    private final String value;

    TransferStatusType2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransferStatusType2Code fromValue(String v) {
        for (TransferStatusType2Code c: TransferStatusType2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
