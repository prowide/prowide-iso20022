
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionProcessingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InstructionProcessingStatus1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="CAN1"/>
 *     <enumeration value="CAN2"/>
 *     <enumeration value="CAN3"/>
 *     <enumeration value="CAND"/>
 *     <enumeration value="CANO"/>
 *     <enumeration value="CANP"/>
 *     <enumeration value="CGEN"/>
 *     <enumeration value="COSE"/>
 *     <enumeration value="CPRC"/>
 *     <enumeration value="DFLA"/>
 *     <enumeration value="DONE"/>
 *     <enumeration value="DONF"/>
 *     <enumeration value="EXCH"/>
 *     <enumeration value="EXSE"/>
 *     <enumeration value="FORC"/>
 *     <enumeration value="FUTU"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="NOTC"/>
 *     <enumeration value="OPOD"/>
 *     <enumeration value="OVER"/>
 *     <enumeration value="PACK"/>
 *     <enumeration value="PAFI"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="PPRC"/>
 *     <enumeration value="REJT"/>
 *     <enumeration value="REPR"/>
 *     <enumeration value="SESE"/>
 *     <enumeration value="STIN"/>
 *     <enumeration value="SUSP"/>
 *     <enumeration value="TREA"/>
 *     <enumeration value="UNDE"/>
 *     <enumeration value="MPRC"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InstructionProcessingStatus1Code")
@XmlEnum
public enum InstructionProcessingStatus1Code {


    /**
     * Pending cancellation; only one side has been input and a cancellation request has been sent.
     * 
     */
    @XmlEnumValue("CAN1")
    CAN_1("CAN1"),

    /**
     * Pending cancellation; both sides have been input, the trade has not yet been matched, and one side has sent a cancellation request.
     * 
     */
    @XmlEnumValue("CAN2")
    CAN_2("CAN2"),

    /**
     * Pending cancellation; both sides have been input, the trade is matched, and one side has sent a cancellation request.
     * 
     */
    @XmlEnumValue("CAN3")
    CAN_3("CAN3"),

    /**
     * Instruction has been cancelled.
     * 
     */
    CAND("CAND"),

    /**
     * Instruction has been cancelled by another party than the instructing party, for example, market infrastructure such as a stock exchange.
     * 
     */
    CANO("CANO"),

    /**
     * Cancellation request from yourself for this instruction is pending waiting for further processing.
     * 
     */
    CANP("CANP"),

    /**
     * Account servicer or third party created the transaction. It was not instructed directly by the account owner.
     * 
     */
    CGEN("CGEN"),

    /**
     * Order is fully executed and the confirmation was sent.
     * 
     */
    COSE("COSE"),

    /**
     * Cancellation request from the counterparty is awaiting for your cancellation request or your consent.
     * 
     */
    CPRC("CPRC"),

    /**
     * Default action is taken.
     * 
     */
    DFLA("DFLA"),

    /**
     * Order is partially filled and no further executions forthcoming for the trading day.
     * 
     */
    DONE("DONE"),

    /**
     * Order is partially filled and no further executions will take place.
     * 
     */
    DONF("DONF"),

    /**
     * Order has been received at the stock exchange.
     * 
     */
    EXCH("EXCH"),

    /**
     * Order was fully executed and the execution sent.
     * 
     */
    EXSE("EXSE"),

    /**
     * Message has been sent automatically by the service provider to notify that settlement will not take place.
     * 
     */
    FORC("FORC"),

    /**
     * All checks relative to the instruction (except collateral) are successful.
     * 
     */
    FUTU("FUTU"),

    /**
     * Order has been received at the intermediary.
     * 
     */
    INTE("INTE"),

    /**
     * Instruction cannot be cancelled as it has already been matched and affirmed.
     * 
     */
    NOTC("NOTC"),

    /**
     * Order is open.
     * 
     */
    OPOD("OPOD"),

    /**
     * Quantity of financial instrument of the block trade has been overallocated.
     * 
     */
    OVER("OVER"),

    /**
     * Instruction has been acknowledged/accepted for further processing by the account servicer.
     * 
     */
    PACK("PACK"),

    /**
     * Order has been partially filled and the remaining quantity is warehoused.
     * 
     */
    PAFI("PAFI"),

    /**
     * Order has been partially cancelled as requested.
     * 
     */
    PART("PART"),

    /**
     * Processing of the instruction is pending.
     * 
     */
    PPRC("PPRC"),

    /**
     * Instruction has been rejected for further processing.
     * 
     */
    REJT("REJT"),

    /**
     * Instruction is accepted but in repair.
     * 
     */
    REPR("REPR"),

    /**
     * Settlement instruction has been sent to your custodian.
     * 
     */
    SESE("SESE"),

    /**
     * Standing instruction has been applied.
     * 
     */
    STIN("STIN"),

    /**
     * Trading is suspended by the stock exchange.
     * 
     */
    SUSP("SUSP"),

    /**
     * Transaction has been treated (triparty collateral status).
     * 
     */
    TREA("TREA"),

    /**
     * Quantity of financial instrument of the block trade has been under allocated.
     * 
     */
    UNDE("UNDE"),

    /**
     * Modification request from the counterparty is awaiting for your modification request or your consent.
     * 
     */
    MPRC("MPRC");
    private final String value;

    InstructionProcessingStatus1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstructionProcessingStatus1Code fromValue(String v) {
        for (InstructionProcessingStatus1Code c: InstructionProcessingStatus1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
