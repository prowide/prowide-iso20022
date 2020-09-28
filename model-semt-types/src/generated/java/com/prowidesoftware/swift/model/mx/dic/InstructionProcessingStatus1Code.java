
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionProcessingStatus1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InstructionProcessingStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CAN1"/&gt;
 *     &lt;enumeration value="CAN2"/&gt;
 *     &lt;enumeration value="CAN3"/&gt;
 *     &lt;enumeration value="CAND"/&gt;
 *     &lt;enumeration value="CANO"/&gt;
 *     &lt;enumeration value="CANP"/&gt;
 *     &lt;enumeration value="CGEN"/&gt;
 *     &lt;enumeration value="COSE"/&gt;
 *     &lt;enumeration value="CPRC"/&gt;
 *     &lt;enumeration value="DFLA"/&gt;
 *     &lt;enumeration value="DONE"/&gt;
 *     &lt;enumeration value="DONF"/&gt;
 *     &lt;enumeration value="EXCH"/&gt;
 *     &lt;enumeration value="EXSE"/&gt;
 *     &lt;enumeration value="FORC"/&gt;
 *     &lt;enumeration value="FUTU"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="NOTC"/&gt;
 *     &lt;enumeration value="OPOD"/&gt;
 *     &lt;enumeration value="OVER"/&gt;
 *     &lt;enumeration value="PACK"/&gt;
 *     &lt;enumeration value="PAFI"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="PPRC"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="REPR"/&gt;
 *     &lt;enumeration value="SESE"/&gt;
 *     &lt;enumeration value="STIN"/&gt;
 *     &lt;enumeration value="SUSP"/&gt;
 *     &lt;enumeration value="TREA"/&gt;
 *     &lt;enumeration value="UNDE"/&gt;
 *     &lt;enumeration value="MPRC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
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
     * Cancellation request from the counterparty is awaiting for your cancellation request or your concent.
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
     * Modification request from the counterparty is awaiting for your modification request or your concent.
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
