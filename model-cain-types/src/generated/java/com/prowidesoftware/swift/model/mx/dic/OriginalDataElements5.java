
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data elements contained in the original message.
 * ISO 8583:1987 bit 90 and ISO 8583 1993/2003 bit 56.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalDataElements5", propOrder = {
    "msgClss",
    "msgFctn",
    "acqrrId",
    "sndrId",
    "txTp",
    "txId",
    "rspnCd"
})
public class OriginalDataElements5 {

    @XmlElement(name = "MsgClss")
    @XmlSchemaType(name = "string")
    protected MessageClass2Code msgClss;
    @XmlElement(name = "MsgFctn")
    @XmlSchemaType(name = "string")
    protected MessageFunction16Code msgFctn;
    @XmlElement(name = "AcqrrId")
    protected String acqrrId;
    @XmlElement(name = "SndrId")
    protected String sndrId;
    @XmlElement(name = "TxTp")
    protected String txTp;
    @XmlElement(name = "TxId")
    protected OriginalTransactionIdentification2 txId;
    @XmlElement(name = "RspnCd")
    protected String rspnCd;

    /**
     * Gets the value of the msgClss property.
     * 
     * @return
     *     possible object is
     *     {@link MessageClass2Code }
     *     
     */
    public MessageClass2Code getMsgClss() {
        return msgClss;
    }

    /**
     * Sets the value of the msgClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageClass2Code }
     *     
     */
    public OriginalDataElements5 setMsgClss(MessageClass2Code value) {
        this.msgClss = value;
        return this;
    }

    /**
     * Gets the value of the msgFctn property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunction16Code }
     *     
     */
    public MessageFunction16Code getMsgFctn() {
        return msgFctn;
    }

    /**
     * Sets the value of the msgFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunction16Code }
     *     
     */
    public OriginalDataElements5 setMsgFctn(MessageFunction16Code value) {
        this.msgFctn = value;
        return this;
    }

    /**
     * Gets the value of the acqrrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrId() {
        return acqrrId;
    }

    /**
     * Sets the value of the acqrrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalDataElements5 setAcqrrId(String value) {
        this.acqrrId = value;
        return this;
    }

    /**
     * Gets the value of the sndrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrId() {
        return sndrId;
    }

    /**
     * Sets the value of the sndrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalDataElements5 setSndrId(String value) {
        this.sndrId = value;
        return this;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalDataElements5 setTxTp(String value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionIdentification2 }
     *     
     */
    public OriginalTransactionIdentification2 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionIdentification2 }
     *     
     */
    public OriginalDataElements5 setTxId(OriginalTransactionIdentification2 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the rspnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnCd() {
        return rspnCd;
    }

    /**
     * Sets the value of the rspnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OriginalDataElements5 setRspnCd(String value) {
        this.rspnCd = value;
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
