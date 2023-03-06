
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedConfirmationStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RejectedConfirmationStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DSAF"/&gt;
 *     &lt;enumeration value="DFIN"/&gt;
 *     &lt;enumeration value="DBEN"/&gt;
 *     &lt;enumeration value="DPTD"/&gt;
 *     &lt;enumeration value="DORD"/&gt;
 *     &lt;enumeration value="DCXR"/&gt;
 *     &lt;enumeration value="DUNB"/&gt;
 *     &lt;enumeration value="DORT"/&gt;
 *     &lt;enumeration value="DROU"/&gt;
 *     &lt;enumeration value="DNAM"/&gt;
 *     &lt;enumeration value="DGAM"/&gt;
 *     &lt;enumeration value="DHRR"/&gt;
 *     &lt;enumeration value="DGRP"/&gt;
 *     &lt;enumeration value="DINP"/&gt;
 *     &lt;enumeration value="DLIR"/&gt;
 *     &lt;enumeration value="DARR"/&gt;
 *     &lt;enumeration value="DPDI"/&gt;
 *     &lt;enumeration value="DRSC"/&gt;
 *     &lt;enumeration value="DNAV"/&gt;
 *     &lt;enumeration value="DFXD"/&gt;
 *     &lt;enumeration value="DCHD"/&gt;
 *     &lt;enumeration value="DXOD"/&gt;
 *     &lt;enumeration value="DTAD"/&gt;
 *     &lt;enumeration value="DPDD"/&gt;
 *     &lt;enumeration value="DSCA"/&gt;
 *     &lt;enumeration value="DPID"/&gt;
 *     &lt;enumeration value="DSAM"/&gt;
 *     &lt;enumeration value="DSDT"/&gt;
 *     &lt;enumeration value="DEXD"/&gt;
 *     &lt;enumeration value="DIMD"/&gt;
 *     &lt;enumeration value="DTRA"/&gt;
 *     &lt;enumeration value="DTSA"/&gt;
 *     &lt;enumeration value="DACI"/&gt;
 *     &lt;enumeration value="DACO"/&gt;
 *     &lt;enumeration value="DPSA"/&gt;
 *     &lt;enumeration value="DPRA"/&gt;
 *     &lt;enumeration value="DLID"/&gt;
 *     &lt;enumeration value="DORF"/&gt;
 *     &lt;enumeration value="ULNK"/&gt;
 *     &lt;enumeration value="DREF"/&gt;
 *     &lt;enumeration value="IVAG"/&gt;
 *     &lt;enumeration value="IRCU"/&gt;
 *     &lt;enumeration value="IRIN"/&gt;
 *     &lt;enumeration value="ICAG"/&gt;
 *     &lt;enumeration value="IDCU"/&gt;
 *     &lt;enumeration value="IDIN"/&gt;
 *     &lt;enumeration value="ICTR"/&gt;
 *     &lt;enumeration value="DMON"/&gt;
 *     &lt;enumeration value="DDAT"/&gt;
 *     &lt;enumeration value="NSLA"/&gt;
 *     &lt;enumeration value="MEUT"/&gt;
 *     &lt;enumeration value="MCOM"/&gt;
 *     &lt;enumeration value="MCHA"/&gt;
 *     &lt;enumeration value="MTAX"/&gt;
 *     &lt;enumeration value="NATA"/&gt;
 *     &lt;enumeration value="ALAT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectedConfirmationStatusReason1Code")
@XmlEnum
public enum RejectedConfirmationStatusReason1Code {


    /**
     * Investment account information not the same as instructed.
     * 
     */
    DSAF,

    /**
     * Financial instrument information not the same as instructed.
     * 
     */
    DFIN,

    /**
     * Beneficiary details is not the same as instructed.
     * 
     */
    DBEN,

    /**
     * Place of trade not the same as instructed.
     * 
     */
    DPTD,

    /**
     * Order date time not the same as instructed.
     * 
     */
    DORD,

    /**
     * Cancellation right not the same as instructed.
     * 
     */
    DCXR,

    /**
     * Units number information not the same as instructed.
     * 
     */
    DUNB,

    /**
     * Order type information not the same as instructed.
     * 
     */
    DORT,

    /**
     * Rounding information not the same as instructed.
     * 
     */
    DROU,

    /**
     * Net amount information not the same as instructed.
     * 
     */
    DNAM,

    /**
     * Gross amount information not the same as instructed.
     * 
     */
    DGAM,

    /**
     * Holdings redemption rate not the same as instructed.
     * 
     */
    DHRR,

    /**
     * Group 1 or 2 units not the same as instructed.
     * 
     */
    DGRP,

    /**
     * Income preference information not the same as instructed.
     * 
     */
    DINP,

    /**
     * Letter Intent reference information not the same as instructed.
     * 
     */
    DLIR,

    /**
     * Accumulation right reference information not the same as instructed.
     * 
     */
    DARR,

    /**
     * Physical delivery indicator information not the same as instructed.
     * 
     */
    DPDI,

    /**
     * Requested settlement currency information not the same as instructed.
     * 
     */
    DRSC,

    /**
     * Requested NAV currency information not the same as instructed.
     * 
     */
    DNAV,

    /**
     * Foreign exchange details information not the same as instructed.
     * 
     */
    DFXD,

    /**
     * Charge details information not the same as instructed.
     * 
     */
    DCHD,

    /**
     * Commission details information not the same as instructed.
     * 
     */
    DXOD,

    /**
     * Tax details information not the same as instructed.
     * 
     */
    DTAD,

    /**
     * Physical delivery details information not the same as instructed.
     * 
     */
    DPDD,

    /**
     * Settlement and custody details information not the same as instructed.
     * 
     */
    DSCA,

    /**
     * Payment Instrument details information not the same as instructed.
     * 
     */
    DPID,

    /**
     * Settlement amount not the same as instructed.
     * 
     */
    DSAM,

    /**
     * Settlement date not the same as instructed.
     * 
     */
    DSDT,

    /**
     * Extension information not the same as instructed.
     * 
     */
    DEXD,

    /**
     * Intermediary information not the same as instructed.
     * 
     */
    DIMD,

    /**
     * Total redemption amount not the same as instructed.
     * 
     */
    DTRA,

    /**
     * Total subscription amount not the same as instructed.
     * 
     */
    DTSA,

    /**
     * Additional cash in not the same as instructed.
     * 
     */
    DACI,

    /**
     * Resulting cash out not the same as instructed.
     * 
     */
    DACO,

    /**
     * Percentage of total subscription amount not the same as instructed.
     * 
     */
    DPSA,

    /**
     * Percentage of total redemption amount not the same as instructed.
     * 
     */
    DPRA,

    /**
     * Leg Identification not the same as instructed.
     * 
     */
    DLID,

    /**
     * Confirmation is recognised by the Receiver because the message reference is identified, but the order reference is not the same as instructed.
     * 
     */
    DORF,

    /**
     * Linked reference is not known.
     * 
     */
    ULNK,

    /**
     * Deal reference is a duplicate of a previously received deal reference.
     * 
     */
    DREF,

    /**
     * Receiving agent is not recognised or is invalid.
     * 
     */
    IVAG,

    /**
     * Receiver's Custodian is not recognised or is invalid.
     * 
     */
    IRCU,

    /**
     * Receiver's Intermediary is not recognised or is invalid.
     * 
     */
    IRIN,

    /**
     * Delivering agent is not recognised or is invalid.
     * 
     */
    ICAG,

    /**
     * Deliverer's Custodian is not recognised or is invalid.
     * 
     */
    IDCU,

    /**
     * Deliverer's Intermediary is not recognised or is invalid.
     * 
     */
    IDIN,

    /**
     * Credit transfer details are incorrect.
     * 
     */
    ICTR,

    /**
     * Settlement Amount is invalid.
     * 
     */
    DMON,

    /**
     * Settlement date or transfer date is not recognised or is invalid.
     * 
     */
    DDAT,

    /**
     * Confirmation is not compliant with the service level agreement.
     * 
     */
    NSLA,

    /**
     * EU tax information is missing.
     * 
     */
    MEUT,

    /**
     * Commission information is missing.
     * 
     */
    MCOM,

    /**
     * Charge information is missing.
     * 
     */
    MCHA,

    /**
     * Tax information is missing.
     * 
     */
    MTAX,

    /**
     * Amendment of order confirmation not allowed.
     * 
     */
    NATA,

    /**
     * Amendment of order confirmation too late.
     * 
     */
    ALAT;

    public String value() {
        return name();
    }

    public static RejectedConfirmationStatusReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
