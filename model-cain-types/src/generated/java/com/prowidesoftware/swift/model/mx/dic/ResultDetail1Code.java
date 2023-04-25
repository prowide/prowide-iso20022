
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultDetail1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResultDetail1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTF"/>
 *     <enumeration value="ACQS"/>
 *     <enumeration value="AMLV"/>
 *     <enumeration value="AMTA"/>
 *     <enumeration value="BANK"/>
 *     <enumeration value="CRDR"/>
 *     <enumeration value="CRDF"/>
 *     <enumeration value="CSHI"/>
 *     <enumeration value="CSHE"/>
 *     <enumeration value="ACTC"/>
 *     <enumeration value="CTVG"/>
 *     <enumeration value="DBER"/>
 *     <enumeration value="FEES"/>
 *     <enumeration value="TXNL"/>
 *     <enumeration value="CRDX"/>
 *     <enumeration value="FMTR"/>
 *     <enumeration value="ACEF"/>
 *     <enumeration value="TXNG"/>
 *     <enumeration value="FNDI"/>
 *     <enumeration value="ACPI"/>
 *     <enumeration value="AMTI"/>
 *     <enumeration value="CHDI"/>
 *     <enumeration value="CRDI"/>
 *     <enumeration value="CTFV"/>
 *     <enumeration value="NPRA"/>
 *     <enumeration value="PINA"/>
 *     <enumeration value="LBLU"/>
 *     <enumeration value="CRDA"/>
 *     <enumeration value="PINN"/>
 *     <enumeration value="MACK"/>
 *     <enumeration value="MACR"/>
 *     <enumeration value="CRDL"/>
 *     <enumeration value="LBLA"/>
 *     <enumeration value="ISSU"/>
 *     <enumeration value="ISST"/>
 *     <enumeration value="ISSO"/>
 *     <enumeration value="ISSF"/>
 *     <enumeration value="ISSP"/>
 *     <enumeration value="DATI"/>
 *     <enumeration value="TXNV"/>
 *     <enumeration value="TKID"/>
 *     <enumeration value="TKKO"/>
 *     <enumeration value="CSCV"/>
 *     <enumeration value="PINV"/>
 *     <enumeration value="AMTO"/>
 *     <enumeration value="NPRC"/>
 *     <enumeration value="OFFL"/>
 *     <enumeration value="ONLP"/>
 *     <enumeration value="TXNM"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="BALO"/>
 *     <enumeration value="SEQO"/>
 *     <enumeration value="AMTL"/>
 *     <enumeration value="NMBL"/>
 *     <enumeration value="PINC"/>
 *     <enumeration value="PIND"/>
 *     <enumeration value="PINE"/>
 *     <enumeration value="PINS"/>
 *     <enumeration value="PINX"/>
 *     <enumeration value="QMAX"/>
 *     <enumeration value="RECD"/>
 *     <enumeration value="CRDT"/>
 *     <enumeration value="SECV"/>
 *     <enumeration value="SFWE"/>
 *     <enumeration value="SPCC"/>
 *     <enumeration value="CRDW"/>
 *     <enumeration value="NMBW"/>
 *     <enumeration value="AMTW"/>
 *     <enumeration value="VNDF"/>
 *     <enumeration value="VNDR"/>
 *     <enumeration value="SVSU"/>
 *     <enumeration value="CRDU"/>
 *     <enumeration value="CMKY"/>
 *     <enumeration value="UNBC"/>
 *     <enumeration value="UNBP"/>
 *     <enumeration value="UNBO"/>
 *     <enumeration value="ORGF"/>
 *     <enumeration value="TXND"/>
 *     <enumeration value="TXNU"/>
 *     <enumeration value="TTLV"/>
 *     <enumeration value="ACTT"/>
 *     <enumeration value="SYSM"/>
 *     <enumeration value="SYSP"/>
 *     <enumeration value="FRDS"/>
 *     <enumeration value="CNTC"/>
 *     <enumeration value="SRCH"/>
 *     <enumeration value="CRDS"/>
 *     <enumeration value="ACKO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResultDetail1Code")
@XmlEnum
public enum ResultDetail1Code {


    /**
     * Account of the cardholder or the customer is not found.
     * 
     */
    ACTF,

    /**
     * Acquirer is not supported.
     * 
     */
    ACQS,

    /**
     * Error on AML (Anti Money Laundering) validation.
     * 
     */
    AMLV,

    /**
     * Amount not found.
     * 
     */
    AMTA,

    /**
     * Bank not found.
     * 
     */
    BANK,

    /**
     * Card error, for instance invalid ARQC (Authorisation ReQuest Cryptogram).
     * 
     */
    CRDR,

    /**
     * Identification of the card is invalid.
     * 
     */
    CRDF,

    /**
     * Cashback is not permitted.
     * 
     */
    CSHI,

    /**
     * Cashback amount is higher than permitted.
     * 
     */
    CSHE,

    /**
     * Account is no more usable for the transaction.
     * 
     */
    ACTC,

    /**
     * Cutover is in progress, transaction could not be processed.
     * 
     */
    CTVG,

    /**
     * Database access error.
     * 
     */
    DBER,

    /**
     * Transaction fees are disputed by the issuer.
     * 
     */
    FEES,

    /**
     * Validity period of the transaction is exceeded.
     * 
     */
    TXNL,

    /**
     * Card has expired.
     * 
     */
    CRDX,

    /**
     * Invalid format of the message or its content.
     * 
     */
    FMTR,

    /**
     * From account status error.
     * 
     */
    ACEF,

    /**
     * Original request is in progress.
     * 
     */
    TXNG,

    /**
     * Account balance is not sufficient.
     * 
     */
    FNDI,

    /**
     * Issuer denies the acceptor.
     * 
     */
    ACPI,

    /**
     * Requested amount is outside the card limits, or the currency is invalid.
     * 
     */
    AMTI,

    /**
     * Identification of the cardholder or the customer does not match.
     * 
     */
    CHDI,

    /**
     * Identification of the card is invalid.
     * 
     */
    CRDI,

    /**
     * Digital certificate cannot be authenticated, is expired or revoked.
     * 
     */
    CTFV,

    /**
     * Process not permitted to the acceptor (for example fall back).
     * 
     */
    NPRA,

    /**
     * PIN could not be validated.
     * 
     */
    PINA,

    /**
     * Transaction is processed, but liability is not accepted.
     * 
     */
    LBLU,

    /**
     * No card file record.
     * 
     */
    CRDA,

    /**
     * New PIN is invalid (PIN change).
     * 
     */
    PINN,

    /**
     * MAC key error.
     * 
     */
    MACK,

    /**
     * MAC error.
     * 
     */
    MACR,

    /**
     * Card has been declared lost.
     * 
     */
    CRDL,

    /**
     * Transaction is processed and liability is accepted.
     * 
     */
    LBLA,

    /**
     * Transaction could not be processed as Issuer is unavailable.
     * 
     */
    ISSU,

    /**
     * Transaction could not be processed as Issuer times out.
     * 
     */
    ISST,

    /**
     * Transaction could not be processed as Issuer is signed off.
     * 
     */
    ISSO,

    /**
     * Issuer is not found.
     * 
     */
    ISSF,

    /**
     * Issuer is inoperative.
     * 
     */
    ISSP,

    /**
     * Date time of the transaction is invalid.
     * 
     */
    DATI,

    /**
     * Transaction is invalid.
     * 
     */
    TXNV,

    /**
     * Identification of the token provider or the token requestor is invalid.
     * 
     */
    TKID,

    /**
     * Token cannot be used to surrogate a PAN (Primary Account Number).
     * 
     */
    TKKO,

    /**
     * Security code validation fails.
     * 
     */
    CSCV,

    /**
     * PIN is invalid.
     * 
     */
    PINV,

    /**
     * Original amount is invalid.
     * 
     */
    AMTO,

    /**
     * Transaction not permitted to the cardholder or the customer.
     * 
     */
    NPRC,

    /**
     * Transaction has been processed offline by the terminal.
     * 
     */
    OFFL,

    /**
     * Transaction has been processed offline after referral.
     * 
     */
    ONLP,

    /**
     * Original is found, but transaction does not match.
     * 
     */
    TXNM,

    /**
     * Other error.
     * 
     */
    OTHR,

    /**
     * Out of balance.
     * 
     */
    BALO,

    /**
     * Message is out of sequence.
     * 
     */
    SEQO,

    /**
     * Amount of payment transactions exceeds card limit.
     * 
     */
    AMTL,

    /**
     * Number of payment transactions exceeds card limit.
     * 
     */
    NMBL,

    /**
     * Cardholder must change the PIN to be able to perform the transaction.
     * 
     */
    PINC,

    /**
     * Additional information are required to verify the PIN.
     * 
     */
    PIND,

    /**
     * Decrypted PIN block is invalid.
     * 
     */
    PINE,

    /**
     * PIN length or PIN key is invalid.
     * 
     */
    PINS,

    /**
     * Last attempt of the PIN verification fails.
     * 
     */
    PINX,

    /**
     * Store and forward queue maximum exceeded.
     * 
     */
    QMAX,

    /**
     * Recurring Error on Data.
     * 
     */
    RECD,

    /**
     * Requested service not allowed by the card.
     * 
     */
    CRDT,

    /**
     * Security violation, for instance invalid ARPC (Authorisation ResPonse Cryptogram).
     * 
     */
    SECV,

    /**
     * Security software or hardware error.
     * 
     */
    SFWE,

    /**
     * Special card conditions not respected.
     * 
     */
    SPCC,

    /**
     * Other card used for the original transaction.
     * 
     */
    CRDW,

    /**
     * Number of withdrawal transactions exceeds card limit.
     * 
     */
    NMBW,

    /**
     * Amount of withdrawal transactions exceeds card limit.
     * 
     */
    AMTW,

    /**
     * Vendor not found.
     * 
     */
    VNDF,

    /**
     * Vendor format has an error.
     * 
     */
    VNDR,

    /**
     * Requested service not supported.
     * 
     */
    SVSU,

    /**
     * Card is not active yet.
     * 
     */
    CRDU,

    /**
     * Communication keys are not available.
     * 
     */
    CMKY,

    /**
     * Currency is unacceptable for the Issuer or the processor.
     * 
     */
    UNBC,

    /**
     * Transaction cannot be processed offline.
     * 
     */
    UNBP,

    /**
     * Transaction cannot be processed online by the terminal.
     * 
     */
    UNBO,

    /**
     * Transaction could not be processed as original is not found.
     * 
     */
    ORGF,

    /**
     * Transaction identification already used for another transaction.
     * 
     */
    TXND,

    /**
     * Transaction did not complete at the terminal.
     * 
     */
    TXNU,

    /**
     * Totals are not available.
     * 
     */
    TTLV,

    /**
     * To account status error.
     * 
     */
    ACTT,

    /**
     * System Malfunction.
     * 
     */
    SYSM,

    /**
     * Processing temporary not available.
     * 
     */
    SYSP,

    /**
     * Fraudulent transaction is suspected by the issuer or the processor.
     * 
     */
    FRDS,

    /**
     * Counterfeit card suspected by the issuer or the processor.
     * 
     */
    CNTC,

    /**
     * Surcharging is not permitted.
     * 
     */
    SRCH,

    /**
     * Card has been declared stolen.
     * 
     */
    CRDS,

    /**
     * Message is acknowledged only without processing the service, for instance the reconciliation is not performed, acknowledged only.
     * 
     */
    ACKO;

    public String value() {
        return name();
    }

    public static ResultDetail1Code fromValue(String v) {
        return valueOf(v);
    }

}
