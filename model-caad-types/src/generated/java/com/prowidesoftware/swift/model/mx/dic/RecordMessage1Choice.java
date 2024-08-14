
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Message to be sent in a batch transfer as a record.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordMessage1Choice", propOrder = {
    "adddmInitn",
    "adddmRspn",
    "amdmnt",
    "authstnInitn",
    "authstnRspn",
    "cardMgmtInitn",
    "cardMgmtRspn",
    "chrgBckInitn",
    "chrgBckRspn",
    "err",
    "feeColltnInitn",
    "feeColltnRspn",
    "fileActnInitn",
    "fileActnRspn",
    "finInitn",
    "finRspn",
    "frdDspstnInitn",
    "frdDspstnRspn",
    "frdRptgInitn",
    "frdRptgRspn",
    "nqryInitn",
    "nqryRspn",
    "keyXchgInitn",
    "keyXchgRspn",
    "ntwkMgmtInitn",
    "ntwkMgmtRspn",
    "rcncltnInitn",
    "rcncltnRspn",
    "rtrvlInitn",
    "rtrvlRspn",
    "rtrvlFlfmtInitn",
    "rtrvlFlfmtRspn",
    "rvslInitn",
    "rvslRspn",
    "sttlmRptgInitn",
    "sttlmRptgRspn",
    "vrfctnInitn",
    "vrfctnRspn"
})
public class RecordMessage1Choice {

    @XmlElement(name = "AdddmInitn")
    protected byte[] adddmInitn;
    @XmlElement(name = "AdddmRspn")
    protected byte[] adddmRspn;
    @XmlElement(name = "Amdmnt")
    protected byte[] amdmnt;
    @XmlElement(name = "AuthstnInitn")
    protected byte[] authstnInitn;
    @XmlElement(name = "AuthstnRspn")
    protected byte[] authstnRspn;
    @XmlElement(name = "CardMgmtInitn")
    protected byte[] cardMgmtInitn;
    @XmlElement(name = "CardMgmtRspn")
    protected byte[] cardMgmtRspn;
    @XmlElement(name = "ChrgBckInitn")
    protected byte[] chrgBckInitn;
    @XmlElement(name = "ChrgBckRspn")
    protected byte[] chrgBckRspn;
    @XmlElement(name = "Err")
    protected byte[] err;
    @XmlElement(name = "FeeColltnInitn")
    protected byte[] feeColltnInitn;
    @XmlElement(name = "FeeColltnRspn")
    protected byte[] feeColltnRspn;
    @XmlElement(name = "FileActnInitn")
    protected byte[] fileActnInitn;
    @XmlElement(name = "FileActnRspn")
    protected byte[] fileActnRspn;
    @XmlElement(name = "FinInitn")
    protected byte[] finInitn;
    @XmlElement(name = "FinRspn")
    protected byte[] finRspn;
    @XmlElement(name = "FrdDspstnInitn")
    protected byte[] frdDspstnInitn;
    @XmlElement(name = "FrdDspstnRspn")
    protected byte[] frdDspstnRspn;
    @XmlElement(name = "FrdRptgInitn")
    protected byte[] frdRptgInitn;
    @XmlElement(name = "FrdRptgRspn")
    protected byte[] frdRptgRspn;
    @XmlElement(name = "NqryInitn")
    protected byte[] nqryInitn;
    @XmlElement(name = "NqryRspn")
    protected byte[] nqryRspn;
    @XmlElement(name = "KeyXchgInitn")
    protected byte[] keyXchgInitn;
    @XmlElement(name = "KeyXchgRspn")
    protected byte[] keyXchgRspn;
    @XmlElement(name = "NtwkMgmtInitn")
    protected byte[] ntwkMgmtInitn;
    @XmlElement(name = "NtwkMgmtRspn")
    protected byte[] ntwkMgmtRspn;
    @XmlElement(name = "RcncltnInitn")
    protected byte[] rcncltnInitn;
    @XmlElement(name = "RcncltnRspn")
    protected byte[] rcncltnRspn;
    @XmlElement(name = "RtrvlInitn")
    protected byte[] rtrvlInitn;
    @XmlElement(name = "RtrvlRspn")
    protected byte[] rtrvlRspn;
    @XmlElement(name = "RtrvlFlfmtInitn")
    protected byte[] rtrvlFlfmtInitn;
    @XmlElement(name = "RtrvlFlfmtRspn")
    protected byte[] rtrvlFlfmtRspn;
    @XmlElement(name = "RvslInitn")
    protected byte[] rvslInitn;
    @XmlElement(name = "RvslRspn")
    protected byte[] rvslRspn;
    @XmlElement(name = "SttlmRptgInitn")
    protected byte[] sttlmRptgInitn;
    @XmlElement(name = "SttlmRptgRspn")
    protected byte[] sttlmRptgRspn;
    @XmlElement(name = "VrfctnInitn")
    protected byte[] vrfctnInitn;
    @XmlElement(name = "VrfctnRspn")
    protected byte[] vrfctnRspn;

    /**
     * Gets the value of the adddmInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAdddmInitn() {
        return adddmInitn;
    }

    /**
     * Sets the value of the adddmInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setAdddmInitn(byte[] value) {
        this.adddmInitn = value;
        return this;
    }

    /**
     * Gets the value of the adddmRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAdddmRspn() {
        return adddmRspn;
    }

    /**
     * Sets the value of the adddmRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setAdddmRspn(byte[] value) {
        this.adddmRspn = value;
        return this;
    }

    /**
     * Gets the value of the amdmnt property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAmdmnt() {
        return amdmnt;
    }

    /**
     * Sets the value of the amdmnt property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setAmdmnt(byte[] value) {
        this.amdmnt = value;
        return this;
    }

    /**
     * Gets the value of the authstnInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAuthstnInitn() {
        return authstnInitn;
    }

    /**
     * Sets the value of the authstnInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setAuthstnInitn(byte[] value) {
        this.authstnInitn = value;
        return this;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setAuthstnRspn(byte[] value) {
        this.authstnRspn = value;
        return this;
    }

    /**
     * Gets the value of the cardMgmtInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCardMgmtInitn() {
        return cardMgmtInitn;
    }

    /**
     * Sets the value of the cardMgmtInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setCardMgmtInitn(byte[] value) {
        this.cardMgmtInitn = value;
        return this;
    }

    /**
     * Gets the value of the cardMgmtRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCardMgmtRspn() {
        return cardMgmtRspn;
    }

    /**
     * Sets the value of the cardMgmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setCardMgmtRspn(byte[] value) {
        this.cardMgmtRspn = value;
        return this;
    }

    /**
     * Gets the value of the chrgBckInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getChrgBckInitn() {
        return chrgBckInitn;
    }

    /**
     * Sets the value of the chrgBckInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setChrgBckInitn(byte[] value) {
        this.chrgBckInitn = value;
        return this;
    }

    /**
     * Gets the value of the chrgBckRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getChrgBckRspn() {
        return chrgBckRspn;
    }

    /**
     * Sets the value of the chrgBckRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setChrgBckRspn(byte[] value) {
        this.chrgBckRspn = value;
        return this;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setErr(byte[] value) {
        this.err = value;
        return this;
    }

    /**
     * Gets the value of the feeColltnInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFeeColltnInitn() {
        return feeColltnInitn;
    }

    /**
     * Sets the value of the feeColltnInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setFeeColltnInitn(byte[] value) {
        this.feeColltnInitn = value;
        return this;
    }

    /**
     * Gets the value of the feeColltnRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFeeColltnRspn() {
        return feeColltnRspn;
    }

    /**
     * Sets the value of the feeColltnRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setFeeColltnRspn(byte[] value) {
        this.feeColltnRspn = value;
        return this;
    }

    /**
     * Gets the value of the fileActnInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileActnInitn() {
        return fileActnInitn;
    }

    /**
     * Sets the value of the fileActnInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setFileActnInitn(byte[] value) {
        this.fileActnInitn = value;
        return this;
    }

    /**
     * Gets the value of the fileActnRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFileActnRspn() {
        return fileActnRspn;
    }

    /**
     * Sets the value of the fileActnRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setFileActnRspn(byte[] value) {
        this.fileActnRspn = value;
        return this;
    }

    /**
     * Gets the value of the finInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFinInitn() {
        return finInitn;
    }

    /**
     * Sets the value of the finInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setFinInitn(byte[] value) {
        this.finInitn = value;
        return this;
    }

    /**
     * Gets the value of the finRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFinRspn() {
        return finRspn;
    }

    /**
     * Sets the value of the finRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setFinRspn(byte[] value) {
        this.finRspn = value;
        return this;
    }

    /**
     * Gets the value of the frdDspstnInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFrdDspstnInitn() {
        return frdDspstnInitn;
    }

    /**
     * Sets the value of the frdDspstnInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setFrdDspstnInitn(byte[] value) {
        this.frdDspstnInitn = value;
        return this;
    }

    /**
     * Gets the value of the frdDspstnRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFrdDspstnRspn() {
        return frdDspstnRspn;
    }

    /**
     * Sets the value of the frdDspstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setFrdDspstnRspn(byte[] value) {
        this.frdDspstnRspn = value;
        return this;
    }

    /**
     * Gets the value of the frdRptgInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFrdRptgInitn() {
        return frdRptgInitn;
    }

    /**
     * Sets the value of the frdRptgInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setFrdRptgInitn(byte[] value) {
        this.frdRptgInitn = value;
        return this;
    }

    /**
     * Gets the value of the frdRptgRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFrdRptgRspn() {
        return frdRptgRspn;
    }

    /**
     * Sets the value of the frdRptgRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setFrdRptgRspn(byte[] value) {
        this.frdRptgRspn = value;
        return this;
    }

    /**
     * Gets the value of the nqryInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNqryInitn() {
        return nqryInitn;
    }

    /**
     * Sets the value of the nqryInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setNqryInitn(byte[] value) {
        this.nqryInitn = value;
        return this;
    }

    /**
     * Gets the value of the nqryRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNqryRspn() {
        return nqryRspn;
    }

    /**
     * Sets the value of the nqryRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setNqryRspn(byte[] value) {
        this.nqryRspn = value;
        return this;
    }

    /**
     * Gets the value of the keyXchgInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getKeyXchgInitn() {
        return keyXchgInitn;
    }

    /**
     * Sets the value of the keyXchgInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setKeyXchgInitn(byte[] value) {
        this.keyXchgInitn = value;
        return this;
    }

    /**
     * Gets the value of the keyXchgRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getKeyXchgRspn() {
        return keyXchgRspn;
    }

    /**
     * Sets the value of the keyXchgRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setKeyXchgRspn(byte[] value) {
        this.keyXchgRspn = value;
        return this;
    }

    /**
     * Gets the value of the ntwkMgmtInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNtwkMgmtInitn() {
        return ntwkMgmtInitn;
    }

    /**
     * Sets the value of the ntwkMgmtInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setNtwkMgmtInitn(byte[] value) {
        this.ntwkMgmtInitn = value;
        return this;
    }

    /**
     * Gets the value of the ntwkMgmtRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNtwkMgmtRspn() {
        return ntwkMgmtRspn;
    }

    /**
     * Sets the value of the ntwkMgmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setNtwkMgmtRspn(byte[] value) {
        this.ntwkMgmtRspn = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRcncltnInitn() {
        return rcncltnInitn;
    }

    /**
     * Sets the value of the rcncltnInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setRcncltnInitn(byte[] value) {
        this.rcncltnInitn = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRcncltnRspn() {
        return rcncltnRspn;
    }

    /**
     * Sets the value of the rcncltnRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setRcncltnRspn(byte[] value) {
        this.rcncltnRspn = value;
        return this;
    }

    /**
     * Gets the value of the rtrvlInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRtrvlInitn() {
        return rtrvlInitn;
    }

    /**
     * Sets the value of the rtrvlInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setRtrvlInitn(byte[] value) {
        this.rtrvlInitn = value;
        return this;
    }

    /**
     * Gets the value of the rtrvlRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRtrvlRspn() {
        return rtrvlRspn;
    }

    /**
     * Sets the value of the rtrvlRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setRtrvlRspn(byte[] value) {
        this.rtrvlRspn = value;
        return this;
    }

    /**
     * Gets the value of the rtrvlFlfmtInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRtrvlFlfmtInitn() {
        return rtrvlFlfmtInitn;
    }

    /**
     * Sets the value of the rtrvlFlfmtInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setRtrvlFlfmtInitn(byte[] value) {
        this.rtrvlFlfmtInitn = value;
        return this;
    }

    /**
     * Gets the value of the rtrvlFlfmtRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRtrvlFlfmtRspn() {
        return rtrvlFlfmtRspn;
    }

    /**
     * Sets the value of the rtrvlFlfmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setRtrvlFlfmtRspn(byte[] value) {
        this.rtrvlFlfmtRspn = value;
        return this;
    }

    /**
     * Gets the value of the rvslInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRvslInitn() {
        return rvslInitn;
    }

    /**
     * Sets the value of the rvslInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setRvslInitn(byte[] value) {
        this.rvslInitn = value;
        return this;
    }

    /**
     * Gets the value of the rvslRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getRvslRspn() {
        return rvslRspn;
    }

    /**
     * Sets the value of the rvslRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setRvslRspn(byte[] value) {
        this.rvslRspn = value;
        return this;
    }

    /**
     * Gets the value of the sttlmRptgInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSttlmRptgInitn() {
        return sttlmRptgInitn;
    }

    /**
     * Sets the value of the sttlmRptgInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setSttlmRptgInitn(byte[] value) {
        this.sttlmRptgInitn = value;
        return this;
    }

    /**
     * Gets the value of the sttlmRptgRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSttlmRptgRspn() {
        return sttlmRptgRspn;
    }

    /**
     * Sets the value of the sttlmRptgRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setSttlmRptgRspn(byte[] value) {
        this.sttlmRptgRspn = value;
        return this;
    }

    /**
     * Gets the value of the vrfctnInitn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getVrfctnInitn() {
        return vrfctnInitn;
    }

    /**
     * Sets the value of the vrfctnInitn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setVrfctnInitn(byte[] value) {
        this.vrfctnInitn = value;
        return this;
    }

    /**
     * Gets the value of the vrfctnRspn property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getVrfctnRspn() {
        return vrfctnRspn;
    }

    /**
     * Sets the value of the vrfctnRspn property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public RecordMessage1Choice setVrfctnRspn(byte[] value) {
        this.vrfctnRspn = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
