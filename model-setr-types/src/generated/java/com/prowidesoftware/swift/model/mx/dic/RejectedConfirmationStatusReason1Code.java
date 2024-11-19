
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectedConfirmationStatusReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectedConfirmationStatusReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DSAF"/>
 *     <enumeration value="DFIN"/>
 *     <enumeration value="DBEN"/>
 *     <enumeration value="DPTD"/>
 *     <enumeration value="DORD"/>
 *     <enumeration value="DCXR"/>
 *     <enumeration value="DUNB"/>
 *     <enumeration value="DORT"/>
 *     <enumeration value="DROU"/>
 *     <enumeration value="DNAM"/>
 *     <enumeration value="DGAM"/>
 *     <enumeration value="DHRR"/>
 *     <enumeration value="DGRP"/>
 *     <enumeration value="DINP"/>
 *     <enumeration value="DLIR"/>
 *     <enumeration value="DARR"/>
 *     <enumeration value="DPDI"/>
 *     <enumeration value="DRSC"/>
 *     <enumeration value="DNAV"/>
 *     <enumeration value="DFXD"/>
 *     <enumeration value="DCHD"/>
 *     <enumeration value="DXOD"/>
 *     <enumeration value="DTAD"/>
 *     <enumeration value="DPDD"/>
 *     <enumeration value="DSCA"/>
 *     <enumeration value="DPID"/>
 *     <enumeration value="DSAM"/>
 *     <enumeration value="DSDT"/>
 *     <enumeration value="DEXD"/>
 *     <enumeration value="DIMD"/>
 *     <enumeration value="DTRA"/>
 *     <enumeration value="DTSA"/>
 *     <enumeration value="DACI"/>
 *     <enumeration value="DACO"/>
 *     <enumeration value="DPSA"/>
 *     <enumeration value="DPRA"/>
 *     <enumeration value="DLID"/>
 *     <enumeration value="DORF"/>
 *     <enumeration value="ULNK"/>
 *     <enumeration value="DREF"/>
 *     <enumeration value="IVAG"/>
 *     <enumeration value="IRCU"/>
 *     <enumeration value="IRIN"/>
 *     <enumeration value="ICAG"/>
 *     <enumeration value="IDCU"/>
 *     <enumeration value="IDIN"/>
 *     <enumeration value="ICTR"/>
 *     <enumeration value="DMON"/>
 *     <enumeration value="DDAT"/>
 *     <enumeration value="NSLA"/>
 *     <enumeration value="MEUT"/>
 *     <enumeration value="MCOM"/>
 *     <enumeration value="MCHA"/>
 *     <enumeration value="MTAX"/>
 *     <enumeration value="NATA"/>
 *     <enumeration value="ALAT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
