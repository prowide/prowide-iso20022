
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of reference.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "References38Choice", propOrder = {
    "sctiesSttlmTxConfId",
    "intraPosMvmntConfId",
    "sctiesBalAcctgRptId",
    "sctiesBalCtdyRptId",
    "intraPosMvmntPstngRptId",
    "sctiesFincgConfId",
    "sctiesTxPdgRptId",
    "sctiesTxPstngRptId",
    "sctiesSttlmTxAllgmtRptId",
    "sctiesSttlmTxAllgmtNtfctnTxId",
    "prtflTrfNtfctnId",
    "sctiesSttlmTxGnrtnNtfctnId",
    "othrMsgId",
    "ttlPrtflValtnRptId"
})
public class References38Choice {

    @XmlElement(name = "SctiesSttlmTxConfId")
    protected SettlementTypeAndIdentification14 sctiesSttlmTxConfId;
    @XmlElement(name = "IntraPosMvmntConfId")
    protected String intraPosMvmntConfId;
    @XmlElement(name = "SctiesBalAcctgRptId")
    protected String sctiesBalAcctgRptId;
    @XmlElement(name = "SctiesBalCtdyRptId")
    protected String sctiesBalCtdyRptId;
    @XmlElement(name = "IntraPosMvmntPstngRptId")
    protected String intraPosMvmntPstngRptId;
    @XmlElement(name = "SctiesFincgConfId")
    protected SettlementTypeAndIdentification14 sctiesFincgConfId;
    @XmlElement(name = "SctiesTxPdgRptId")
    protected String sctiesTxPdgRptId;
    @XmlElement(name = "SctiesTxPstngRptId")
    protected String sctiesTxPstngRptId;
    @XmlElement(name = "SctiesSttlmTxAllgmtRptId")
    protected String sctiesSttlmTxAllgmtRptId;
    @XmlElement(name = "SctiesSttlmTxAllgmtNtfctnTxId")
    protected SettlementTypeAndIdentification14 sctiesSttlmTxAllgmtNtfctnTxId;
    @XmlElement(name = "PrtflTrfNtfctnId")
    protected String prtflTrfNtfctnId;
    @XmlElement(name = "SctiesSttlmTxGnrtnNtfctnId")
    protected SettlementTypeAndIdentification14 sctiesSttlmTxGnrtnNtfctnId;
    @XmlElement(name = "OthrMsgId")
    protected String othrMsgId;
    @XmlElement(name = "TtlPrtflValtnRptId")
    protected String ttlPrtflValtnRptId;

    /**
     * Gets the value of the sctiesSttlmTxConfId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification14 }
     *     
     */
    public SettlementTypeAndIdentification14 getSctiesSttlmTxConfId() {
        return sctiesSttlmTxConfId;
    }

    /**
     * Sets the value of the sctiesSttlmTxConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification14 }
     *     
     */
    public References38Choice setSctiesSttlmTxConfId(SettlementTypeAndIdentification14 value) {
        this.sctiesSttlmTxConfId = value;
        return this;
    }

    /**
     * Gets the value of the intraPosMvmntConfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraPosMvmntConfId() {
        return intraPosMvmntConfId;
    }

    /**
     * Sets the value of the intraPosMvmntConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References38Choice setIntraPosMvmntConfId(String value) {
        this.intraPosMvmntConfId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesBalAcctgRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesBalAcctgRptId() {
        return sctiesBalAcctgRptId;
    }

    /**
     * Sets the value of the sctiesBalAcctgRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References38Choice setSctiesBalAcctgRptId(String value) {
        this.sctiesBalAcctgRptId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesBalCtdyRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesBalCtdyRptId() {
        return sctiesBalCtdyRptId;
    }

    /**
     * Sets the value of the sctiesBalCtdyRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References38Choice setSctiesBalCtdyRptId(String value) {
        this.sctiesBalCtdyRptId = value;
        return this;
    }

    /**
     * Gets the value of the intraPosMvmntPstngRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraPosMvmntPstngRptId() {
        return intraPosMvmntPstngRptId;
    }

    /**
     * Sets the value of the intraPosMvmntPstngRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References38Choice setIntraPosMvmntPstngRptId(String value) {
        this.intraPosMvmntPstngRptId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgConfId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification14 }
     *     
     */
    public SettlementTypeAndIdentification14 getSctiesFincgConfId() {
        return sctiesFincgConfId;
    }

    /**
     * Sets the value of the sctiesFincgConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification14 }
     *     
     */
    public References38Choice setSctiesFincgConfId(SettlementTypeAndIdentification14 value) {
        this.sctiesFincgConfId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesTxPdgRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesTxPdgRptId() {
        return sctiesTxPdgRptId;
    }

    /**
     * Sets the value of the sctiesTxPdgRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References38Choice setSctiesTxPdgRptId(String value) {
        this.sctiesTxPdgRptId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesTxPstngRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesTxPstngRptId() {
        return sctiesTxPstngRptId;
    }

    /**
     * Sets the value of the sctiesTxPstngRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References38Choice setSctiesTxPstngRptId(String value) {
        this.sctiesTxPstngRptId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSttlmTxAllgmtRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesSttlmTxAllgmtRptId() {
        return sctiesSttlmTxAllgmtRptId;
    }

    /**
     * Sets the value of the sctiesSttlmTxAllgmtRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References38Choice setSctiesSttlmTxAllgmtRptId(String value) {
        this.sctiesSttlmTxAllgmtRptId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSttlmTxAllgmtNtfctnTxId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification14 }
     *     
     */
    public SettlementTypeAndIdentification14 getSctiesSttlmTxAllgmtNtfctnTxId() {
        return sctiesSttlmTxAllgmtNtfctnTxId;
    }

    /**
     * Sets the value of the sctiesSttlmTxAllgmtNtfctnTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification14 }
     *     
     */
    public References38Choice setSctiesSttlmTxAllgmtNtfctnTxId(SettlementTypeAndIdentification14 value) {
        this.sctiesSttlmTxAllgmtNtfctnTxId = value;
        return this;
    }

    /**
     * Gets the value of the prtflTrfNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtflTrfNtfctnId() {
        return prtflTrfNtfctnId;
    }

    /**
     * Sets the value of the prtflTrfNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References38Choice setPrtflTrfNtfctnId(String value) {
        this.prtflTrfNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSttlmTxGnrtnNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification14 }
     *     
     */
    public SettlementTypeAndIdentification14 getSctiesSttlmTxGnrtnNtfctnId() {
        return sctiesSttlmTxGnrtnNtfctnId;
    }

    /**
     * Sets the value of the sctiesSttlmTxGnrtnNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification14 }
     *     
     */
    public References38Choice setSctiesSttlmTxGnrtnNtfctnId(SettlementTypeAndIdentification14 value) {
        this.sctiesSttlmTxGnrtnNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the othrMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrMsgId() {
        return othrMsgId;
    }

    /**
     * Sets the value of the othrMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References38Choice setOthrMsgId(String value) {
        this.othrMsgId = value;
        return this;
    }

    /**
     * Gets the value of the ttlPrtflValtnRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlPrtflValtnRptId() {
        return ttlPrtflValtnRptId;
    }

    /**
     * Sets the value of the ttlPrtflValtnRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public References38Choice setTtlPrtflValtnRptId(String value) {
        this.ttlPrtflValtnRptId = value;
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
