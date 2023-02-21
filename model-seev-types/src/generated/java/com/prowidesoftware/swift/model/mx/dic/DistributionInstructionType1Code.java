
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistributionInstructionType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DistributionInstructionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GDEB"/&gt;
 *     &lt;enumeration value="IDEB"/&gt;
 *     &lt;enumeration value="GRET"/&gt;
 *     &lt;enumeration value="CHAN"/&gt;
 *     &lt;enumeration value="IRET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DistributionInstructionType1Code")
@XmlEnum
public enum DistributionInstructionType1Code {


    /**
     * Instruction to debit the positions held under all clients accounts in the underlying resouces of the given event and option. This order applies to all clients who are eligible to participate to the CA event.
     * 
     */
    GDEB,

    /**
     * An instruction, on a per client basis, to debit the position held in the underlying resources (securities and/or cash) and/or the credit of the proceeds (securities and/or cash).
     * 
     */
    IDEB,

    /**
     * Instruction to transfer securities from the clients sequestered balances back to the respective available balances.
     * 
     */
    GRET,

    /**
     * Instruction to transfer the position from one sequestered balance (related to a CA option) to another sequestered balalnce (related to another CA option).
     * 
     */
    CHAN,

    /**
     * Instruction to transfer securities from a client sequestered balance back to its available balance.
     * 
     */
    IRET;

    public String value() {
        return name();
    }

    public static DistributionInstructionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
