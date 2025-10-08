
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultDetail4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultDetail4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTF"/&gt;
 *     &lt;enumeration value="ACQS"/&gt;
 *     &lt;enumeration value="AMLV"/&gt;
 *     &lt;enumeration value="AMTA"/&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="BANK"/&gt;
 *     &lt;enumeration value="CRDR"/&gt;
 *     &lt;enumeration value="CRDF"/&gt;
 *     &lt;enumeration value="ACTC"/&gt;
 *     &lt;enumeration value="CTVG"/&gt;
 *     &lt;enumeration value="DBER"/&gt;
 *     &lt;enumeration value="FEES"/&gt;
 *     &lt;enumeration value="TXNL"/&gt;
 *     &lt;enumeration value="AMTD"/&gt;
 *     &lt;enumeration value="NMBD"/&gt;
 *     &lt;enumeration value="CRDX"/&gt;
 *     &lt;enumeration value="FDCL"/&gt;
 *     &lt;enumeration value="FMTR"/&gt;
 *     &lt;enumeration value="TXNG"/&gt;
 *     &lt;enumeration value="FNDI"/&gt;
 *     &lt;enumeration value="ACPI"/&gt;
 *     &lt;enumeration value="AMTI"/&gt;
 *     &lt;enumeration value="ADDI"/&gt;
 *     &lt;enumeration value="BRHI"/&gt;
 *     &lt;enumeration value="CHDI"/&gt;
 *     &lt;enumeration value="CRDI"/&gt;
 *     &lt;enumeration value="CTFV"/&gt;
 *     &lt;enumeration value="AMTO"/&gt;
 *     &lt;enumeration value="PINV"/&gt;
 *     &lt;enumeration value="TKKO"/&gt;
 *     &lt;enumeration value="SGNI"/&gt;
 *     &lt;enumeration value="TKID"/&gt;
 *     &lt;enumeration value="TXNV"/&gt;
 *     &lt;enumeration value="DATI"/&gt;
 *     &lt;enumeration value="ISSP"/&gt;
 *     &lt;enumeration value="ISSF"/&gt;
 *     &lt;enumeration value="ISSO"/&gt;
 *     &lt;enumeration value="ISST"/&gt;
 *     &lt;enumeration value="ISSU"/&gt;
 *     &lt;enumeration value="KEYS"/&gt;
 *     &lt;enumeration value="LBLA"/&gt;
 *     &lt;enumeration value="CRDL"/&gt;
 *     &lt;enumeration value="MACR"/&gt;
 *     &lt;enumeration value="MACK"/&gt;
 *     &lt;enumeration value="ICCM"/&gt;
 *     &lt;enumeration value="PINN"/&gt;
 *     &lt;enumeration value="CRDA"/&gt;
 *     &lt;enumeration value="LBLU"/&gt;
 *     &lt;enumeration value="PINA"/&gt;
 *     &lt;enumeration value="NPRA"/&gt;
 *     &lt;enumeration value="OFFL"/&gt;
 *     &lt;enumeration value="ONLP"/&gt;
 *     &lt;enumeration value="NPRC"/&gt;
 *     &lt;enumeration value="TXNM"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="BALO"/&gt;
 *     &lt;enumeration value="SEQO"/&gt;
 *     &lt;enumeration value="PINC"/&gt;
 *     &lt;enumeration value="PIND"/&gt;
 *     &lt;enumeration value="PINS"/&gt;
 *     &lt;enumeration value="PINX"/&gt;
 *     &lt;enumeration value="PINE"/&gt;
 *     &lt;enumeration value="QMAX"/&gt;
 *     &lt;enumeration value="RECD"/&gt;
 *     &lt;enumeration value="CRDT"/&gt;
 *     &lt;enumeration value="SECV"/&gt;
 *     &lt;enumeration value="SRVU"/&gt;
 *     &lt;enumeration value="SFWE"/&gt;
 *     &lt;enumeration value="SPCC"/&gt;
 *     &lt;enumeration value="CRDS"/&gt;
 *     &lt;enumeration value="SRCH"/&gt;
 *     &lt;enumeration value="CNTC"/&gt;
 *     &lt;enumeration value="FRDS"/&gt;
 *     &lt;enumeration value="SYSP"/&gt;
 *     &lt;enumeration value="SYSM"/&gt;
 *     &lt;enumeration value="TRMI"/&gt;
 *     &lt;enumeration value="ACTT"/&gt;
 *     &lt;enumeration value="TTLV"/&gt;
 *     &lt;enumeration value="TXNU"/&gt;
 *     &lt;enumeration value="TXND"/&gt;
 *     &lt;enumeration value="ORGF"/&gt;
 *     &lt;enumeration value="UNBO"/&gt;
 *     &lt;enumeration value="UNBP"/&gt;
 *     &lt;enumeration value="UNBC"/&gt;
 *     &lt;enumeration value="CMKY"/&gt;
 *     &lt;enumeration value="CRDU"/&gt;
 *     &lt;enumeration value="SVSU"/&gt;
 *     &lt;enumeration value="VNDR"/&gt;
 *     &lt;enumeration value="VNDF"/&gt;
 *     &lt;enumeration value="AMTW"/&gt;
 *     &lt;enumeration value="NMBW"/&gt;
 *     &lt;enumeration value="CRDW"/&gt;
 *     &lt;enumeration value="MEDI"/&gt;
 *     &lt;enumeration value="SRVI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResultDetail4Code")
@XmlEnum
public enum ResultDetail4Code {


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
     * Cardholder or customer could not be authenticated, for instance due to an incorrect login identification or an incorrect password.
     * 
     */
    AUTH,

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
     * Amount of deposit transactions exceeds the limit.
     * 
     */
    AMTD,

    /**
     * Number of deposit transactions or items exceeds the limit.
     * 
     */
    NMBD,

    /**
     * Card has expired.
     * 
     */
    CRDX,

    /**
     * Issuer declined the fall-back transaction.
     * 
     */
    FDCL,

    /**
     * Invalid format of the message or its content.
     * 
     */
    FMTR,

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
     * Part of the specified address is incorrect.
     * 
     */
    ADDI,

    /**
     * Invalid branch or bank information.
     * 
     */
    BRHI,

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
     * Original amount is invalid.
     * 
     */
    AMTO,

    /**
     * PIN is invalid.
     * 
     */
    PINV,

    /**
     * Token cannot be used to surrogate a PAN (Primary Account Number).
     * 
     */
    TKKO,

    /**
     * Signed message has an invalid signature.
     * 
     */
    SGNI,

    /**
     * Identification of the token provider or the token requestor is invalid.
     * 
     */
    TKID,

    /**
     * Transaction is invalid.
     * 
     */
    TXNV,

    /**
     * Date time of the transaction is invalid.
     * 
     */
    DATI,

    /**
     * Issuer is inoperative.
     * 
     */
    ISSP,

    /**
     * Issuer is not found.
     * 
     */
    ISSF,

    /**
     * Transaction could not be processed as Issuer is signed off.
     * 
     */
    ISSO,

    /**
     * Transaction could not be processed as Issuer times out.
     * 
     */
    ISST,

    /**
     * Transaction could not be processed as Issuer is unavailable.
     * 
     */
    ISSU,

    /**
     * Storage space not available for the key.
     * 
     */
    KEYS,

    /**
     * Transaction is processed and liability is accepted.
     * 
     */
    LBLA,

    /**
     * Card has been declared lost.
     * 
     */
    CRDL,

    /**
     * MAC error.
     * 
     */
    MACR,

    /**
     * MAC key error.
     * 
     */
    MACK,

    /**
     * ICC data elements required for processing the ICC transaction were not present in the message.
     * 
     */
    ICCM,

    /**
     * New PIN is invalid (PIN change).
     * 
     */
    PINN,

    /**
     * No card file record.
     * 
     */
    CRDA,

    /**
     * Transaction is processed, but liability is not accepted.
     * 
     */
    LBLU,

    /**
     * PIN could not be validated.
     * 
     */
    PINA,

    /**
     * Process not permitted to the acceptor (for example fall back).
     * 
     */
    NPRA,

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
     * Transaction not permitted to the cardholder or the customer.
     * 
     */
    NPRC,

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
     * Decrypted PIN block is invalid.
     * 
     */
    PINE,

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
     * Cardholder or customer has not enabled the service with the service provider.
     * 
     */
    SRVU,

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
     * Card has been declared stolen.
     * 
     */
    CRDS,

    /**
     * Surcharging is not permitted.
     * 
     */
    SRCH,

    /**
     * Counterfeit card suspected by the issuer or the processor.
     * 
     */
    CNTC,

    /**
     * Fraudulent transaction is suspected by the issuer or the processor.
     * 
     */
    FRDS,

    /**
     * Processing temporary not available.
     * 
     */
    SYSP,

    /**
     * System Malfunction.
     * 
     */
    SYSM,

    /**
     * Server received a terminal identification that it does not have any knowledge of.
     * 
     */
    TRMI,

    /**
     * To account status error.
     * 
     */
    ACTT,

    /**
     * Totals are not available.
     * 
     */
    TTLV,

    /**
     * Transaction did not complete at the terminal.
     * 
     */
    TXNU,

    /**
     * Transaction identification already used for another transaction.
     * 
     */
    TXND,

    /**
     * Transaction could not be processed as original is not found.
     * 
     */
    ORGF,

    /**
     * Transaction cannot be processed online by the terminal.
     * 
     */
    UNBO,

    /**
     * Transaction cannot be processed offline.
     * 
     */
    UNBP,

    /**
     * Currency is unacceptable for the Issuer or the processor.
     * 
     */
    UNBC,

    /**
     * Communication keys are not available.
     * 
     */
    CMKY,

    /**
     * Card is not active yet.
     * 
     */
    CRDU,

    /**
     * Requested service not supported.
     * 
     */
    SVSU,

    /**
     * Vendor format has an error.
     * 
     */
    VNDR,

    /**
     * Vendor not found.
     * 
     */
    VNDF,

    /**
     * Amount of withdrawal transactions exceeds card limit.
     * 
     */
    AMTW,

    /**
     * Number of withdrawal transactions exceeds card limit.
     * 
     */
    NMBW,

    /**
     * Other card used for the original transaction.
     * 
     */
    CRDW,

    /**
     * The requested media are not allowed for the service.
     * 
     */
    MEDI,

    /**
     * The requested service is not allowed.
     * 
     */
    SRVI;

    public String value() {
        return name();
    }

    public static ResultDetail4Code fromValue(String v) {
        return valueOf(v);
    }

}
