
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionRejectionReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InstructionRejectionReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACKA"/&gt;
 *     &lt;enumeration value="ACKS"/&gt;
 *     &lt;enumeration value="BIDI"/&gt;
 *     &lt;enumeration value="BIDG"/&gt;
 *     &lt;enumeration value="BIDM"/&gt;
 *     &lt;enumeration value="BNDU"/&gt;
 *     &lt;enumeration value="CN1N"/&gt;
 *     &lt;enumeration value="CN2N"/&gt;
 *     &lt;enumeration value="CN1R"/&gt;
 *     &lt;enumeration value="CN1Y"/&gt;
 *     &lt;enumeration value="BID0"/&gt;
 *     &lt;enumeration value="BIDE"/&gt;
 *     &lt;enumeration value="CN2Y"/&gt;
 *     &lt;enumeration value="CN2R"/&gt;
 *     &lt;enumeration value="CN3N"/&gt;
 *     &lt;enumeration value="CN3Y"/&gt;
 *     &lt;enumeration value="CN3R"/&gt;
 *     &lt;enumeration value="CN4N"/&gt;
 *     &lt;enumeration value="CN4Y"/&gt;
 *     &lt;enumeration value="CN4R"/&gt;
 *     &lt;enumeration value="CN5Y"/&gt;
 *     &lt;enumeration value="CN5N"/&gt;
 *     &lt;enumeration value="CN5R"/&gt;
 *     &lt;enumeration value="CN6N"/&gt;
 *     &lt;enumeration value="CN6Y"/&gt;
 *     &lt;enumeration value="CN6R"/&gt;
 *     &lt;enumeration value="COQX"/&gt;
 *     &lt;enumeration value="COTQ"/&gt;
 *     &lt;enumeration value="COQE"/&gt;
 *     &lt;enumeration value="COQI"/&gt;
 *     &lt;enumeration value="COQ0"/&gt;
 *     &lt;enumeration value="CNAM"/&gt;
 *     &lt;enumeration value="CNAX"/&gt;
 *     &lt;enumeration value="CNPM"/&gt;
 *     &lt;enumeration value="CNPX"/&gt;
 *     &lt;enumeration value="COVR"/&gt;
 *     &lt;enumeration value="CHIL"/&gt;
 *     &lt;enumeration value="CUSD"/&gt;
 *     &lt;enumeration value="CUID"/&gt;
 *     &lt;enumeration value="CQRQ"/&gt;
 *     &lt;enumeration value="COMM"/&gt;
 *     &lt;enumeration value="CAID"/&gt;
 *     &lt;enumeration value="CSEQ"/&gt;
 *     &lt;enumeration value="ATOP"/&gt;
 *     &lt;enumeration value="ADIN"/&gt;
 *     &lt;enumeration value="ADIM"/&gt;
 *     &lt;enumeration value="BODD"/&gt;
 *     &lt;enumeration value="BONM"/&gt;
 *     &lt;enumeration value="CENM"/&gt;
 *     &lt;enumeration value="CERN"/&gt;
 *     &lt;enumeration value="CERS"/&gt;
 *     &lt;enumeration value="SUMO"/&gt;
 *     &lt;enumeration value="SUME"/&gt;
 *     &lt;enumeration value="PROE"/&gt;
 *     &lt;enumeration value="PROS"/&gt;
 *     &lt;enumeration value="CUSI"/&gt;
 *     &lt;enumeration value="OVCU"/&gt;
 *     &lt;enumeration value="SEQ0"/&gt;
 *     &lt;enumeration value="CUTC"/&gt;
 *     &lt;enumeration value="CUTT"/&gt;
 *     &lt;enumeration value="BODC"/&gt;
 *     &lt;enumeration value="SEQD"/&gt;
 *     &lt;enumeration value="ENTR"/&gt;
 *     &lt;enumeration value="ENTL"/&gt;
 *     &lt;enumeration value="FRAQ"/&gt;
 *     &lt;enumeration value="FUNU"/&gt;
 *     &lt;enumeration value="QUIE"/&gt;
 *     &lt;enumeration value="INDI"/&gt;
 *     &lt;enumeration value="INDM"/&gt;
 *     &lt;enumeration value="LACK"/&gt;
 *     &lt;enumeration value="RECI"/&gt;
 *     &lt;enumeration value="RQIN"/&gt;
 *     &lt;enumeration value="TRTI"/&gt;
 *     &lt;enumeration value="BOIJ"/&gt;
 *     &lt;enumeration value="KEYV"/&gt;
 *     &lt;enumeration value="KEYM"/&gt;
 *     &lt;enumeration value="LEGI"/&gt;
 *     &lt;enumeration value="LEGM"/&gt;
 *     &lt;enumeration value="MSTB"/&gt;
 *     &lt;enumeration value="NWIT"/&gt;
 *     &lt;enumeration value="ODLI"/&gt;
 *     &lt;enumeration value="HIST"/&gt;
 *     &lt;enumeration value="OFFP"/&gt;
 *     &lt;enumeration value="OVRX"/&gt;
 *     &lt;enumeration value="OVRG"/&gt;
 *     &lt;enumeration value="OVRI"/&gt;
 *     &lt;enumeration value="OVTT"/&gt;
 *     &lt;enumeration value="PACH"/&gt;
 *     &lt;enumeration value="ODLY"/&gt;
 *     &lt;enumeration value="WITE"/&gt;
 *     &lt;enumeration value="WIT0"/&gt;
 *     &lt;enumeration value="WITG"/&gt;
 *     &lt;enumeration value="WITQ"/&gt;
 *     &lt;enumeration value="WARC"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="SHQO"/&gt;
 *     &lt;enumeration value="SHQI"/&gt;
 *     &lt;enumeration value="CUSU"/&gt;
 *     &lt;enumeration value="CUSP"/&gt;
 *     &lt;enumeration value="TRNM"/&gt;
 *     &lt;enumeration value="TNFN"/&gt;
 *     &lt;enumeration value="TRNS"/&gt;
 *     &lt;enumeration value="TRQM"/&gt;
 *     &lt;enumeration value="SUBL"/&gt;
 *     &lt;enumeration value="SOCR"/&gt;
 *     &lt;enumeration value="SEQO"/&gt;
 *     &lt;enumeration value="SEQM"/&gt;
 *     &lt;enumeration value="SEQP"/&gt;
 *     &lt;enumeration value="RTSP"/&gt;
 *     &lt;enumeration value="RTIO"/&gt;
 *     &lt;enumeration value="RQDV"/&gt;
 *     &lt;enumeration value="RILA"/&gt;
 *     &lt;enumeration value="TRQI"/&gt;
 *     &lt;enumeration value="TRQ0"/&gt;
 *     &lt;enumeration value="TRNI"/&gt;
 *     &lt;enumeration value="SUBE"/&gt;
 *     &lt;enumeration value="SOLX"/&gt;
 *     &lt;enumeration value="SOLI"/&gt;
 *     &lt;enumeration value="RPCI"/&gt;
 *     &lt;enumeration value="TRQP"/&gt;
 *     &lt;enumeration value="PROX"/&gt;
 *     &lt;enumeration value="PROT"/&gt;
 *     &lt;enumeration value="PRO0"/&gt;
 *     &lt;enumeration value="PROL"/&gt;
 *     &lt;enumeration value="PROI"/&gt;
 *     &lt;enumeration value="POLM"/&gt;
 *     &lt;enumeration value="POLI"/&gt;
 *     &lt;enumeration value="PART"/&gt;
 *     &lt;enumeration value="PAPI"/&gt;
 *     &lt;enumeration value="PARL"/&gt;
 *     &lt;enumeration value="PARX"/&gt;
 *     &lt;enumeration value="PAEC"/&gt;
 *     &lt;enumeration value="WITI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InstructionRejectionReason1Code")
@XmlEnum
public enum InstructionRejectionReason1Code {


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
     * Bond check on master table is not available.
     * 
     */
    BNDU("BNDU"),

    /**
     * Condition 1 indicator is invalid. It must be No.
     * 
     */
    @XmlEnumValue("CN1N")
    CN_1_N("CN1N"),

    /**
     * Condition 2 indicator is invalid. It must be No.
     * 
     */
    @XmlEnumValue("CN2N")
    CN_2_N("CN2N"),

    /**
     * Condition 1 indicator is must be present.
     * 
     */
    @XmlEnumValue("CN1R")
    CN_1_R("CN1R"),

    /**
     * Condition 1 indicator is invalid. It must be Yes.
     * 
     */
    @XmlEnumValue("CN1Y")
    CN_1_Y("CN1Y"),

    /**
     * Zeroes are required for bid price.
     * 
     */
    @XmlEnumValue("BID0")
    BID_0("BID0"),

    /**
     * Bid Price exceeds maximum bid price allowed for the offer.
     * 
     */
    BIDE("BIDE"),

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
     * Condition 5 indicator is invalid. It must be Yes.
     * 
     */
    @XmlEnumValue("CN5Y")
    CN_5_Y("CN5Y"),

    /**
     * Condition 5 indicator is invalid. It must be No.
     * 
     */
    @XmlEnumValue("CN5N")
    CN_5_N("CN5N"),

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
     * Condition 6 indicator is must be present.
     * 
     */
    @XmlEnumValue("CN6R")
    CN_6_R("CN6R"),

    /**
     * Conditional quantity cannot be zero.
     * 
     */
    COQX("COQX"),

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
     * Conditional quantity is missing or invalid.
     * 
     */
    COQI("COQI"),

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
     * Cover quantity is greater than the remaining protect quantity.
     * 
     */
    COVR("COVR"),

    /**
     * CUSIP is depository deliver chilled.
     * 
     */
    CHIL("CHIL"),

    /**
     * Target CUSIP or contra CUSIP identification is not DTC eligible.
     * 
     */
    CUSD("CUSD"),

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
     * Comment area is invalid.
     * 
     */
    COMM("COMM"),

    /**
     * Corporate action event identification is invalid.
     * 
     */
    CAID("CAID"),

    /**
     * Customer Sequence number is invalid or out of sequence.
     * 
     */
    CSEQ("CSEQ"),

    /**
     * Offer is not ATOP eligible.
     * 
     */
    ATOP("ATOP"),

    /**
     * Adjudication of incompetency acknowledgement indicator is invalid.
     * 
     */
    ADIN("ADIN"),

    /**
     * Adjudication of incompetency acknowledgement indicator is missing.
     * 
     */
    ADIM("ADIM"),

    /**
     * Beneficial owner death date is missing.
     * 
     */
    BODD("BODD"),

    /**
     * Beneficial owner name is missing.
     * 
     */
    BONM("BONM"),

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
     * Target CUSIP or contra CUSIP identification is missing or invalid.
     * 
     */
    CUSI("CUSI"),

    /**
     * Customer oversubscription quantities do not add up to total oversubscription quantity.
     * 
     */
    OVCU("OVCU"),

    /**
     * Customer Sequence number must be all zero.
     * 
     */
    @XmlEnumValue("SEQ0")
    SEQ_0("SEQ0"),

    /**
     * Cut-off time check has failed.
     * 
     */
    CUTC("CUTC"),

    /**
     * Cut-off time has passed.
     * 
     */
    CUTT("CUTT"),

    /**
     * Death certificate details are missing.
     * 
     */
    BODC("BODC"),

    /**
     * Transaction sequence number is duplicated.
     * 
     */
    SEQD("SEQD"),

    /**
     * Entry Date is invalid.
     * 
     */
    ENTR("ENTR"),

    /**
     * Entry date must be less than or equal to current date.
     * 
     */
    ENTL("ENTL"),

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
     * Instruction deletion acknowledgement indicator is missing.
     * 
     */
    INDM("INDM"),

    /**
     * Participant has insufficient position.
     * 
     */
    LACK("LACK"),

    /**
     * Record type is invalid.
     * 
     */
    RECI("RECI"),

    /**
     * Rights quantity is invalid.
     * 
     */
    RQIN("RQIN"),

    /**
     * Transaction type or withdrawal transaction type is invalid.
     * 
     */
    TRTI("TRTI"),

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
     * Key Information is missing (tenders data).
     * 
     */
    KEYM("KEYM"),

    /**
     * Legal documentation thirty months retention acknowledgement indicator is invalid.
     * 
     */
    LEGI("LEGI"),

    /**
     * Legal documentation thirty Months retention acknowledgement indicator is missing.
     * 
     */
    LEGM("LEGM"),

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
     * Offer is already on historical data base.
     * 
     */
    HIST("HIST"),

    /**
     * Offer is not eligible for the PUTS function.
     * 
     */
    OFFP("OFFP"),

    /**
     * Oversubscription is not allowed.
     * 
     */
    OVRX("OVRX"),

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
     * Cannot submit odd lot indicator 'Yes' for the offer.
     * 
     */
    ODLY("ODLY"),

    /**
     * Error in withdraw occurred.
     * 
     */
    WITE("WITE"),

    /**
     * Withdrawal transaction quantity cannot be zero.
     * 
     */
    @XmlEnumValue("WIT0")
    WIT_0("WIT0"),

    /**
     * Withdrawal quantity is greater than VOI / protect quantity.
     * 
     */
    WITG("WITG"),

    /**
     * Withdrawal quantity exceeds the remaining quantity.
     * 
     */
    WITQ("WITQ"),

    /**
     * Warrant subscription charge amount is not balancing.
     * 
     */
    WARC("WARC"),

    /**
     * The rejection reason is unknown.
     * 
     */
    OTHR("OTHR"),

    /**
     * Underlying share quantity does not match original share quantity.
     * 
     */
    SHQO("SHQO"),

    /**
     * Underlying share quantity is invalid.
     * 
     */
    SHQI("SHQI"),

    /**
     * Underlying security CUSIP does not match the original.
     * 
     */
    CUSU("CUSU"),

    /**
     * Underlying security CUSIP is invalid.
     * 
     */
    CUSP("CUSP"),

    /**
     * Transaction type is missing.
     * 
     */
    TRNM("TRNM"),

    /**
     * Transaction type and event are incompatible.
     * 
     */
    TNFN("TNFN"),

    /**
     * Transaction sequence number is invalid, not numeric.
     * 
     */
    TRNS("TRNS"),

    /**
     * Transaction quantity is less than the transaction minimum.
     * 
     */
    TRQM("TRQM"),

    /**
     * Date of submission has passed.
     * 
     */
    SUBL("SUBL"),

    /**
     * Comments are required for solicitation fee.
     * 
     */
    SOCR("SOCR"),

    /**
     * Sequence number is out of sequence.
     * 
     */
    SEQO("SEQO"),

    /**
     * Sequence number is missing.
     * 
     */
    SEQM("SEQM"),

    /**
     * Customer sequence number must be between 1 and 1 or for PUTS between 9999901 and 9999912.
     * 
     */
    SEQP("SEQP"),

    /**
     * RTS processing is in progress. Submit later.
     * 
     */
    RTSP("RTSP"),

    /**
     * Rights ratio not found on data base.
     * 
     */
    RTIO("RTIO"),

    /**
     * Rights quantity for this subscription must be divisible by rights.
     * 
     */
    RQDV("RQDV"),

    /**
     * Rights CUSIP has insufficient position.
     * 
     */
    RILA("RILA"),

    /**
     * Transaction Quantity is missing or invalid.
     * 
     */
    TRQI("TRQI"),

    /**
     * Transaction Quantity cannot be zero.
     * 
     */
    @XmlEnumValue("TRQ0")
    TRQ_0("TRQ0"),

    /**
     * Transaction Identification is invalid.
     * 
     */
    TRNI("TRNI"),

    /**
     * Submission date is not yet reached.
     * 
     */
    SUBE("SUBE"),

    /**
     * Solicitation fee indicator is not used with this event.
     * 
     */
    SOLX("SOLX"),

    /**
     * Solicitation fee indicator is required.
     * 
     */
    SOLI("SOLI"),

    /**
     * Not a good return code from rights position check.
     * 
     */
    RPCI("RPCI"),

    /**
     * Provided by protect, enter 0 for transaction quantity.
     * 
     */
    TRQP("TRQP"),

    /**
     * Protect identification is not used with this event.
     * 
     */
    PROX("PROX"),

    /**
     * Protect identification is missing or invalid.
     * 
     */
    PROT("PROT"),

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
     * Protect Date invalid or missing.
     * 
     */
    PROI("PROI"),

    /**
     * Potential loss acknowledgement indicator is missing.
     * 
     */
    POLM("POLM"),

    /**
     * Potential loss acknowledgement indicator is invalid.
     * 
     */
    POLI("POLI"),

    /**
     * Participant number is invalid.
     * 
     */
    PART("PART"),

    /**
     * Participant does not match participant on Protect ID.
     * 
     */
    PAPI("PAPI"),

    /**
     * Participant is globally locked.
     * 
     */
    PARL("PARL"),

    /**
     * Participant is not DTC eligible.
     * 
     */
    PARX("PARX"),

    /**
     * Participant eligibility check on master table is not available.
     * 
     */
    PAEC("PAEC"),

    /**
     * Withdrawal Transaction type is invalid.
     * 
     */
    WITI("WITI");
    private final String value;

    InstructionRejectionReason1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InstructionRejectionReason1Code fromValue(String v) {
        for (InstructionRejectionReason1Code c: InstructionRejectionReason1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
