
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultDetail5Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="ResultDetail5Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACTF"/>
 *     <enumeration value="ACQS"/>
 *     <enumeration value="AMLV"/>
 *     <enumeration value="AMTA"/>
 *     <enumeration value="AUTH"/>
 *     <enumeration value="BANK"/>
 *     <enumeration value="CRDR"/>
 *     <enumeration value="CRDF"/>
 *     <enumeration value="ACTC"/>
 *     <enumeration value="CTVG"/>
 *     <enumeration value="DBER"/>
 *     <enumeration value="FEES"/>
 *     <enumeration value="TXNL"/>
 *     <enumeration value="AMTD"/>
 *     <enumeration value="NMBD"/>
 *     <enumeration value="CRDX"/>
 *     <enumeration value="FDCL"/>
 *     <enumeration value="FMTR"/>
 *     <enumeration value="TXNG"/>
 *     <enumeration value="FNDI"/>
 *     <enumeration value="ACPI"/>
 *     <enumeration value="AMTI"/>
 *     <enumeration value="ADDI"/>
 *     <enumeration value="BRHI"/>
 *     <enumeration value="CHDI"/>
 *     <enumeration value="CRDI"/>
 *     <enumeration value="CTFV"/>
 *     <enumeration value="AMTO"/>
 *     <enumeration value="PINV"/>
 *     <enumeration value="TKKO"/>
 *     <enumeration value="SGNI"/>
 *     <enumeration value="TKID"/>
 *     <enumeration value="TXNV"/>
 *     <enumeration value="DATI"/>
 *     <enumeration value="ISSP"/>
 *     <enumeration value="ISSF"/>
 *     <enumeration value="ISSO"/>
 *     <enumeration value="ISST"/>
 *     <enumeration value="ISSU"/>
 *     <enumeration value="KEYS"/>
 *     <enumeration value="LBLA"/>
 *     <enumeration value="CRDL"/>
 *     <enumeration value="MACR"/>
 *     <enumeration value="MACK"/>
 *     <enumeration value="ICCM"/>
 *     <enumeration value="PINN"/>
 *     <enumeration value="CRDA"/>
 *     <enumeration value="LBLU"/>
 *     <enumeration value="PINA"/>
 *     <enumeration value="NPRA"/>
 *     <enumeration value="OFFL"/>
 *     <enumeration value="ONLP"/>
 *     <enumeration value="NPRC"/>
 *     <enumeration value="TXNM"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="BALO"/>
 *     <enumeration value="SEQO"/>
 *     <enumeration value="PINC"/>
 *     <enumeration value="PIND"/>
 *     <enumeration value="PINS"/>
 *     <enumeration value="PINX"/>
 *     <enumeration value="PINE"/>
 *     <enumeration value="QMAX"/>
 *     <enumeration value="RECD"/>
 *     <enumeration value="CRDT"/>
 *     <enumeration value="SECV"/>
 *     <enumeration value="SRVU"/>
 *     <enumeration value="SFWE"/>
 *     <enumeration value="SPCC"/>
 *     <enumeration value="CRDS"/>
 *     <enumeration value="SRCH"/>
 *     <enumeration value="CNTC"/>
 *     <enumeration value="FRDS"/>
 *     <enumeration value="SYSP"/>
 *     <enumeration value="SYSM"/>
 *     <enumeration value="TRMI"/>
 *     <enumeration value="ACTT"/>
 *     <enumeration value="TTLV"/>
 *     <enumeration value="TXNU"/>
 *     <enumeration value="TXND"/>
 *     <enumeration value="ORGF"/>
 *     <enumeration value="UNBO"/>
 *     <enumeration value="UNBP"/>
 *     <enumeration value="UNBC"/>
 *     <enumeration value="CMKY"/>
 *     <enumeration value="CRDU"/>
 *     <enumeration value="SVSU"/>
 *     <enumeration value="VNDR"/>
 *     <enumeration value="VNDF"/>
 *     <enumeration value="AMTW"/>
 *     <enumeration value="NMBW"/>
 *     <enumeration value="CRDW"/>
 *     <enumeration value="MEDI"/>
 *     <enumeration value="SRVI"/>
 *     <enumeration value="AMMA"/>
 *     <enumeration value="AGFE"/>
 *     <enumeration value="SACT"/>
 *     <enumeration value="ADCC"/>
 *     <enumeration value="FEEM"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ResultDetail5Code")
@XmlEnum
public enum ResultDetail5Code {


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
    SRVI,

    /**
     * The account details provided in the request message matches multiple accounts.
     * 
     */
    AMMA,

    /**
     * Consumer must agree fee from those provided to authorise the transaction. See <Tx><AuthstnRslt><FeeToAdd>.
     * 
     */
    AGFE,

    /**
     * Consumer must select an account from those provided to authorise the transaction. See <Tx><AcctInf>.
     * 
     */
    SACT,

    /**
     * Consumer must choose whether to accept DCC offer provided to authorise the transaction. See <Tx><CcyConvsElgblty>.
     * 
     */
    ADCC,

    /**
     * Transaction fee is missing from the request.
     * 
     */
    FEEM;

    public String value() {
        return name();
    }

    public static ResultDetail5Code fromValue(String v) {
        return valueOf(v);
    }

}
