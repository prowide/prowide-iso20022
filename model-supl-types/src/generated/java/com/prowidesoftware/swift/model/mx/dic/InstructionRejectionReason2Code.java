
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionRejectionReason2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="InstructionRejectionReason2Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACKA"/>
 *     <enumeration value="ACKS"/>
 *     <enumeration value="ADIN"/>
 *     <enumeration value="BODD"/>
 *     <enumeration value="ADIM"/>
 *     <enumeration value="BONM"/>
 *     <enumeration value="BIDI"/>
 *     <enumeration value="BIDG"/>
 *     <enumeration value="BIDM"/>
 *     <enumeration value="BIDE"/>
 *     <enumeration value="BID0"/>
 *     <enumeration value="BNDU"/>
 *     <enumeration value="CENM"/>
 *     <enumeration value="CERN"/>
 *     <enumeration value="CERS"/>
 *     <enumeration value="COMM"/>
 *     <enumeration value="CN1N"/>
 *     <enumeration value="CN1Y"/>
 *     <enumeration value="CN1R"/>
 *     <enumeration value="CN2N"/>
 *     <enumeration value="CN2Y"/>
 *     <enumeration value="CN2R"/>
 *     <enumeration value="CN3N"/>
 *     <enumeration value="CN3Y"/>
 *     <enumeration value="CN3R"/>
 *     <enumeration value="CN4N"/>
 *     <enumeration value="CN4Y"/>
 *     <enumeration value="CN4R"/>
 *     <enumeration value="CN5N"/>
 *     <enumeration value="CN5Y"/>
 *     <enumeration value="CN5R"/>
 *     <enumeration value="CN6N"/>
 *     <enumeration value="CN6Y"/>
 *     <enumeration value="COQX"/>
 *     <enumeration value="CN6R"/>
 *     <enumeration value="COTQ"/>
 *     <enumeration value="COQE"/>
 *     <enumeration value="COQ0"/>
 *     <enumeration value="CNAM"/>
 *     <enumeration value="CNAX"/>
 *     <enumeration value="CNPM"/>
 *     <enumeration value="CNPX"/>
 *     <enumeration value="SUMO"/>
 *     <enumeration value="SUME"/>
 *     <enumeration value="CAID"/>
 *     <enumeration value="COVR"/>
 *     <enumeration value="COQI"/>
 *     <enumeration value="PROE"/>
 *     <enumeration value="PROS"/>
 *     <enumeration value="CHIL"/>
 *     <enumeration value="CUSI"/>
 *     <enumeration value="CUSD"/>
 *     <enumeration value="OVCU"/>
 *     <enumeration value="CUID"/>
 *     <enumeration value="CQRQ"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="SEQ0"/>
 *     <enumeration value="CSEQ"/>
 *     <enumeration value="CUTC"/>
 *     <enumeration value="BODC"/>
 *     <enumeration value="ENTR"/>
 *     <enumeration value="FRAQ"/>
 *     <enumeration value="FUNU"/>
 *     <enumeration value="QUIE"/>
 *     <enumeration value="INDI"/>
 *     <enumeration value="LACK"/>
 *     <enumeration value="INDM"/>
 *     <enumeration value="ENTL"/>
 *     <enumeration value="SEQD"/>
 *     <enumeration value="CUTT"/>
 *     <enumeration value="BOIJ"/>
 *     <enumeration value="KEYV"/>
 *     <enumeration value="LEGI"/>
 *     <enumeration value="MSTB"/>
 *     <enumeration value="NWIT"/>
 *     <enumeration value="ODLI"/>
 *     <enumeration value="ODLY"/>
 *     <enumeration value="ATOP"/>
 *     <enumeration value="OFFP"/>
 *     <enumeration value="OVRG"/>
 *     <enumeration value="OVRI"/>
 *     <enumeration value="PAEC"/>
 *     <enumeration value="PARL"/>
 *     <enumeration value="PAPI"/>
 *     <enumeration value="PARX"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="PROC"/>
 *     <enumeration value="OVTT"/>
 *     <enumeration value="PACH"/>
 *     <enumeration value="OVRX"/>
 *     <enumeration value="HIST"/>
 *     <enumeration value="LEGM"/>
 *     <enumeration value="KEYM"/>
 *     <enumeration value="POLI"/>
 *     <enumeration value="POLM"/>
 *     <enumeration value="PROI"/>
 *     <enumeration value="PROT"/>
 *     <enumeration value="PROX"/>
 *     <enumeration value="TRQP"/>
 *     <enumeration value="RECI"/>
 *     <enumeration value="RILA"/>
 *     <enumeration value="RPCI"/>
 *     <enumeration value="RQDV"/>
 *     <enumeration value="RQIN"/>
 *     <enumeration value="RTIO"/>
 *     <enumeration value="RTSP"/>
 *     <enumeration value="SEQP"/>
 *     <enumeration value="SEQM"/>
 *     <enumeration value="SEQO"/>
 *     <enumeration value="SOCR"/>
 *     <enumeration value="SOLX"/>
 *     <enumeration value="SUBE"/>
 *     <enumeration value="SOLI"/>
 *     <enumeration value="SUBL"/>
 *     <enumeration value="PRO0"/>
 *     <enumeration value="PROL"/>
 *     <enumeration value="TRNI"/>
 *     <enumeration value="TRQ0"/>
 *     <enumeration value="TRQM"/>
 *     <enumeration value="TRQI"/>
 *     <enumeration value="TRNS"/>
 *     <enumeration value="TNFN"/>
 *     <enumeration value="TRNM"/>
 *     <enumeration value="CUSU"/>
 *     <enumeration value="SHQI"/>
 *     <enumeration value="SHQO"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="WARC"/>
 *     <enumeration value="WITQ"/>
 *     <enumeration value="WIT0"/>
 *     <enumeration value="WITE"/>
 *     <enumeration value="WITI"/>
 *     <enumeration value="WITG"/>
 *     <enumeration value="CUSP"/>
 *     <enumeration value="TRTI"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "InstructionRejectionReason2Code")
@XmlEnum
public enum InstructionRejectionReason2Code {


    /**
     * Acknowledgement must be agreed.
     * 
     */
    ACKA("ACKA"),

    /**
     * Acknowledgment indicator is missing.
     * 
     */
    ACKS("ACKS"),

    /**
     * Adjudication of incompetency acknowledgement indicator is invalid.
     * 
     */
    ADIN("ADIN"),

    /**
     * Beneficial owner death date is missing.
     * 
     */
    BODD("BODD"),

    /**
     * Adjudication of incompetency acknowledgement indicator is missing.
     * 
     */
    ADIM("ADIM"),

    /**
     * Beneficial owner name is missing.
     * 
     */
    BONM("BONM"),

    /**
     * Bid price is missing or invalid.
     * 
     */
    BIDI("BIDI"),

    /**
     * Bid Price cannot be greater than 9999.99999.
     * 
     */
    BIDG("BIDG"),

    /**
     * Bid Price is less than the minimum bid price allowed for the offer.
     * 
     */
    BIDM("BIDM"),

    /**
     * Bid Price exceeds maximum bid price allowed for the offer.
     * 
     */
    BIDE("BIDE"),

    /**
     * Zeroes are required for bid price.
     * 
     */
    @XmlEnumValue("BID0")
    BID_0("BID0"),

    /**
     * Bond check on master table is not available.
     * 
     */
    BNDU("BNDU"),

    /**
     * Certificate number is missing.
     * 
     */
    CENM("CENM"),

    /**
     * Certificate number is invalid.
     * 
     */
    CERN("CERN"),

    /**
     * Certificate sequence number is invalid.
     * 
     */
    CERS("CERS"),

    /**
     * Comment area is invalid.
     * 
     */
    COMM("COMM"),

    /**
     * Condition 1 indicator is invalid. It must be No.
     * 
     */
    @XmlEnumValue("CN1N")
    CN_1_N("CN1N"),

    /**
     * Condition 1 indicator is invalid. It must be Yes.
     * 
     */
    @XmlEnumValue("CN1Y")
    CN_1_Y("CN1Y"),

    /**
     * Condition 1 indicator is must be present.
     * 
     */
    @XmlEnumValue("CN1R")
    CN_1_R("CN1R"),

    /**
     * Condition 2 indicator is invalid. It must be No.
     * 
     */
    @XmlEnumValue("CN2N")
    CN_2_N("CN2N"),

    /**
     * Condition 2 indicator is invalid. It must be Yes.
     * 
     */
    @XmlEnumValue("CN2Y")
    CN_2_Y("CN2Y"),

    /**
     * Condition 2 indicator is must be present.
     * 
     */
    @XmlEnumValue("CN2R")
    CN_2_R("CN2R"),

    /**
     * Condition 3 indicator is invalid. It must be No.
     * 
     */
    @XmlEnumValue("CN3N")
    CN_3_N("CN3N"),

    /**
     * Condition 3 indicator is invalid. It must be Yes.
     * 
     */
    @XmlEnumValue("CN3Y")
    CN_3_Y("CN3Y"),

    /**
     * Condition 3 indicator is must be present.
     * 
     */
    @XmlEnumValue("CN3R")
    CN_3_R("CN3R"),

    /**
     * Condition 4 indicator is invalid. It must be No.
     * 
     */
    @XmlEnumValue("CN4N")
    CN_4_N("CN4N"),

    /**
     * Condition 4 indicator is invalid. It must be Yes.
     * 
     */
    @XmlEnumValue("CN4Y")
    CN_4_Y("CN4Y"),

    /**
     * Condition 4 indicator is must be present.
     * 
     */
    @XmlEnumValue("CN4R")
    CN_4_R("CN4R"),

    /**
     * Condition 5 indicator is invalid. It must be No.
     * 
     */
    @XmlEnumValue("CN5N")
    CN_5_N("CN5N"),

    /**
     * Condition 5 indicator is invalid. It must be Yes.
     * 
     */
    @XmlEnumValue("CN5Y")
    CN_5_Y("CN5Y"),

    /**
     * Condition 5 indicator is must be present.
     * 
     */
    @XmlEnumValue("CN5R")
    CN_5_R("CN5R"),

    /**
     * Condition 6 indicator is invalid. It must be No.
     * 
     */
    @XmlEnumValue("CN6N")
    CN_6_N("CN6N"),

    /**
     * Condition 6 indicator is invalid. It must be Yes.
     * 
     */
    @XmlEnumValue("CN6Y")
    CN_6_Y("CN6Y"),

    /**
     * Conditional quantity cannot be zero.
     * 
     */
    COQX("COQX"),

    /**
     * Condition 6 indicator is must be present.
     * 
     */
    @XmlEnumValue("CN6R")
    CN_6_R("CN6R"),

    /**
     * Conditional quantity does not equal the transaction quantity whilst this offer accepts only full conditional quantity.
     * 
     */
    COTQ("COTQ"),

    /**
     * Conditional quantity exceeds the transaction quantity.
     * 
     */
    COQE("COQE"),

    /**
     * Conditional quantity zeroes are required.
     * 
     */
    @XmlEnumValue("COQ0")
    COQ_0("COQ0"),

    /**
     * Contact name is missing.
     * 
     */
    CNAM("CNAM"),

    /**
     * Contact name is not used with this event.
     * 
     */
    CNAX("CNAX"),

    /**
     * Contact phone number is missing.
     * 
     */
    CNPM("CNPM"),

    /**
     * Contact phone number is not used with this event.
     * 
     */
    CNPX("CNPX"),

    /**
     * There is summary difference between core oversubscription quantity and extension transaction details.
     * 
     */
    SUMO("SUMO"),

    /**
     * There is a summary difference between the core instruction quantity and the extension transaction details.
     * 
     */
    SUME("SUME"),

    /**
     * Corporate action event identification is invalid.
     * 
     */
    CAID("CAID"),

    /**
     * Cover quantity is greater than the remaining protect quantity.
     * 
     */
    COVR("COVR"),

    /**
     * Conditional quantity is missing or invalid.
     * 
     */
    COQI("COQI"),

    /**
     * Current date is greater than protect submission end date.
     * 
     */
    PROE("PROE"),

    /**
     * Current date is less than protect submission start date.
     * 
     */
    PROS("PROS"),

    /**
     * CUSIP is depository deliver chilled.
     * 
     */
    CHIL("CHIL"),

    /**
     * Target CUSIP or contra CUSIP identification is missing or invalid.
     * 
     */
    CUSI("CUSI"),

    /**
     * Target CUSIP or contra CUSIP identification is not DTC eligible.
     * 
     */
    CUSD("CUSD"),

    /**
     * Customer oversubscription quantities do not add up to total oversubscription quantity.
     * 
     */
    OVCU("OVCU"),

    /**
     * Customer identification is missing or invalid.
     * 
     */
    CUID("CUID"),

    /**
     * Customer quantities do not add up to total rights quantities.
     * 
     */
    CQRQ("CQRQ"),

    /**
     * Customer Reference Identification must be populated for each sequence.
     * 
     */
    CUST("CUST"),

    /**
     * Customer Sequence number must be all zero.
     * 
     */
    @XmlEnumValue("SEQ0")
    SEQ_0("SEQ0"),

    /**
     * Customer Sequence number is invalid or out of sequence.
     * 
     */
    CSEQ("CSEQ"),

    /**
     * Cut-off time check has failed.
     * 
     */
    CUTC("CUTC"),

    /**
     * Death certificate details are missing.
     * 
     */
    BODC("BODC"),

    /**
     * Entry Date is invalid.
     * 
     */
    ENTR("ENTR"),

    /**
     * Customer has fractional underlying quantity, adjust quantity.
     * 
     */
    FRAQ("FRAQ"),

    /**
     * Function is not available at this time. Please check expiration start and end times for the event.
     * 
     */
    FUNU("FUNU"),

    /**
     * Function is quiesced (not available).
     * 
     */
    QUIE("QUIE"),

    /**
     * Instruction deletion acknowledgement indicator is invalid.
     * 
     */
    INDI("INDI"),

    /**
     * Participant has insufficient position.
     * 
     */
    LACK("LACK"),

    /**
     * Instruction deletion acknowledgement indicator is missing.
     * 
     */
    INDM("INDM"),

    /**
     * Entry date must be less than or equal to current date.
     * 
     */
    ENTL("ENTL"),

    /**
     * Transaction sequence number is duplicated.
     * 
     */
    SEQD("SEQD"),

    /**
     * Cut-off time has passed.
     * 
     */
    CUTT("CUTT"),

    /**
     * Issuing jurisdiction is missing.
     * 
     */
    BOIJ("BOIJ"),

    /**
     * Key data (VOI transaction) cannot be found.
     * 
     */
    KEYV("KEYV"),

    /**
     * Legal documentation thirty months retention acknowledgement indicator is invalid.
     * 
     */
    LEGI("LEGI"),

    /**
     * Master tables are not available.
     * 
     */
    MSTB("MSTB"),

    /**
     * There is no withdrawal privilege on this offer.
     * 
     */
    NWIT("NWIT"),

    /**
     * Odd lot indicator is missing or invalid.
     * 
     */
    ODLI("ODLI"),

    /**
     * Cannot submit odd lot indicator 'Yes' for the offer.
     * 
     */
    ODLY("ODLY"),

    /**
     * Offer is not ATOP eligible.
     * 
     */
    ATOP("ATOP"),

    /**
     * Offer is not eligible for the PUTS function.
     * 
     */
    OFFP("OFFP"),

    /**
     * Oversubscription quantity is greater than percentage of underlying shares.
     * 
     */
    OVRG("OVRG"),

    /**
     * Oversubscription quantity is invalid.
     * 
     */
    OVRI("OVRI"),

    /**
     * Participant eligibility check on master table is not available.
     * 
     */
    PAEC("PAEC"),

    /**
     * Participant is globally locked.
     * 
     */
    PARL("PARL"),

    /**
     * Participant does not match participant on Protect ID.
     * 
     */
    PAPI("PAPI"),

    /**
     * Participant is not DTC eligible.
     * 
     */
    PARX("PARX"),

    /**
     * Participant number is invalid.
     * 
     */
    PART("PART"),

    /**
     * Current date has passed cover protect submission end date.
     * 
     */
    PROC("PROC"),

    /**
     * Oversubscription quantity not used with this transaction type.
     * 
     */
    OVTT("OVTT"),

    /**
     * Participant is DO chilled.
     * 
     */
    PACH("PACH"),

    /**
     * Oversubscription is not allowed.
     * 
     */
    OVRX("OVRX"),

    /**
     * Offer is already on historical data base.
     * 
     */
    HIST("HIST"),

    /**
     * Legal documentation thirty Months retention acknowledgement indicator is missing.
     * 
     */
    LEGM("LEGM"),

    /**
     * Key Information is missing (tenders data).
     * 
     */
    KEYM("KEYM"),

    /**
     * Potential loss acknowledgement indicator is invalid.
     * 
     */
    POLI("POLI"),

    /**
     * Potential loss acknowledgement indicator is missing.
     * 
     */
    POLM("POLM"),

    /**
     * Protect Date invalid or missing.
     * 
     */
    PROI("PROI"),

    /**
     * Protect identification is missing or invalid.
     * 
     */
    PROT("PROT"),

    /**
     * Protect identification is not used with this event.
     * 
     */
    PROX("PROX"),

    /**
     * Provided by protect, enter 0 for transaction quantity.
     * 
     */
    TRQP("TRQP"),

    /**
     * Record type is invalid.
     * 
     */
    RECI("RECI"),

    /**
     * Rights CUSIP has insufficient position.
     * 
     */
    RILA("RILA"),

    /**
     * Not a good return code from rights position check.
     * 
     */
    RPCI("RPCI"),

    /**
     * Rights quantity for this subscription must be divisible by rights.
     * 
     */
    RQDV("RQDV"),

    /**
     * Rights quantity is invalid.
     * 
     */
    RQIN("RQIN"),

    /**
     * Rights ratio not found on data base.
     * 
     */
    RTIO("RTIO"),

    /**
     * RTS processing is in progress. Submit later.
     * 
     */
    RTSP("RTSP"),

    /**
     * Customer sequence number must be between 1 and 1 or for PUTS between 9999901 and 9999912.
     * 
     */
    SEQP("SEQP"),

    /**
     * Sequence number is missing.
     * 
     */
    SEQM("SEQM"),

    /**
     * Sequence number is out of sequence.
     * 
     */
    SEQO("SEQO"),

    /**
     * Comments are required for solicitation fee.
     * 
     */
    SOCR("SOCR"),

    /**
     * Solicitation fee indicator is not used with this event.
     * 
     */
    SOLX("SOLX"),

    /**
     * Submission date is not yet reached.
     * 
     */
    SUBE("SUBE"),

    /**
     * Solicitation fee indicator is required.
     * 
     */
    SOLI("SOLI"),

    /**
     * Date of submission has passed.
     * 
     */
    SUBL("SUBL"),

    /**
     * Protect date on file must be zero.
     * 
     */
    @XmlEnumValue("PRO0")
    PRO_0("PRO0"),

    /**
     * Protect date must be less than or equal to current date.
     * 
     */
    PROL("PROL"),

    /**
     * Transaction Identification is invalid.
     * 
     */
    TRNI("TRNI"),

    /**
     * Transaction Quantity cannot be zero.
     * 
     */
    @XmlEnumValue("TRQ0")
    TRQ_0("TRQ0"),

    /**
     * Transaction quantity is less than the transaction minimum.
     * 
     */
    TRQM("TRQM"),

    /**
     * Transaction Quantity is missing or invalid.
     * 
     */
    TRQI("TRQI"),

    /**
     * Transaction sequence number is invalid, not numeric.
     * 
     */
    TRNS("TRNS"),

    /**
     * Transaction type and event are incompatible.
     * 
     */
    TNFN("TNFN"),

    /**
     * Transaction type is missing.
     * 
     */
    TRNM("TRNM"),

    /**
     * Underlying security CUSIP does not match the original.
     * 
     */
    CUSU("CUSU"),

    /**
     * Underlying share quantity is invalid.
     * 
     */
    SHQI("SHQI"),

    /**
     * Underlying share quantity does not match original share quantity.
     * 
     */
    SHQO("SHQO"),

    /**
     * The rejection reason is unknown.
     * 
     */
    OTHR("OTHR"),

    /**
     * Warrant subscription charge amount is not balancing.
     * 
     */
    WARC("WARC"),

    /**
     * Withdrawal quantity exceeds the remaining quantity.
     * 
     */
    WITQ("WITQ"),

    /**
     * Withdrawal transaction quantity cannot be zero.
     * 
     */
    @XmlEnumValue("WIT0")
    WIT_0("WIT0"),

    /**
     * Error in withdraw occurred.
     * 
     */
    WITE("WITE"),

    /**
     * Withdrawal Transaction type is invalid.
     * 
     */
    WITI("WITI"),

    /**
     * Withdrawal quantity is greater than VOI / protect quantity.
     * 
     */
    WITG("WITG"),

    /**
     * Underlying security CUSIP is invalid.
     * 
     */
    CUSP("CUSP"),

    /**
     * Transaction type or withdrawal transaction type is invalid.
     * 
     */
    TRTI("TRTI");
    private final String value;

    InstructionRejectionReason2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstructionRejectionReason2Code fromValue(String v) {
        for (InstructionRejectionReason2Code c: InstructionRejectionReason2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
