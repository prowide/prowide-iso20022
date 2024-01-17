
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferUnmatchedReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TransferUnmatchedReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CMIS"/>
 *     <enumeration value="CPCA"/>
 *     <enumeration value="DELN"/>
 *     <enumeration value="DSEC"/>
 *     <enumeration value="PHYS"/>
 *     <enumeration value="PODU"/>
 *     <enumeration value="DEPT"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="DQUA"/>
 *     <enumeration value="OTHR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TransferUnmatchedReason1Code")
@XmlEnum
public enum TransferUnmatchedReason1Code {


    /**
     * No potential match has been found.
     * 
     */
    CMIS,

    /**
     * Counterparty has cancelled the transaction/instruction.
     * 
     */
    CPCA,

    /**
     * Direction of transaction does not match: delivery instead of receipt or vice versa.
     * 
     */
    DELN,

    /**
     * Financial instrument identification does not match or a financial instrument attribute differs.
     * 
     */
    DSEC,

    /**
     * Settlement does not match: counterparty's instruction is for physical settlement, your instruction is not, or vice versa.
     * 
     */
    PHYS,

    /**
     * Instruction has not been matched: it is a possible duplicate instruction.
     * 
     */
    PODU,

    /**
     * Place of settlement does not match.
     * 
     */
    DEPT,

    /**
     * Settlement date or transfer date does not match.
     * 
     */
    DDAT,

    /**
     * Financial instrument quantity does not match.
     * 
     */
    DQUA,

    /**
     * Another unmatched reason.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static TransferUnmatchedReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
