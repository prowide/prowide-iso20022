
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferInFunction1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransferInFunction1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ADRE"/>
 *     <enumeration value="INST"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransferInFunction1Code")
@XmlEnum
public enum TransferInFunction1Code {


    /**
     * The transfer-in is an advice and request, that is, the message is used to inform the receiver to expect an unsolicited transfer in confirmation and to request account information for the transfer.
     * 
     */
    ADRE,

    /**
     * The transfer-in is an instruction.
     * 
     */
    INST;

    public String value() {
        return name();
    }

    public static TransferInFunction1Code fromValue(String v) {
        return valueOf(v);
    }

}
