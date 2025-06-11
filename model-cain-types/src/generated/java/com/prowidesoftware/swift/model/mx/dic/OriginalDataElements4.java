
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data elements contained in the original message.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalDataElements4", propOrder = {
    "msgClss",
    "msgFctn",
    "acqrrId",
    "sndrId",
    "txTp",
    "txId",
    "rspnCd"
})
public class OriginalDataElements4 {

    @XmlElement(name = "MsgClss")
    @XmlSchemaType(name = "string")
    protected MessageClass1Code msgClss;
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
    protected OriginalTransactionIdentification1 txId;
    @XmlElement(name = "RspnCd")
    protected String rspnCd;

    /**
     * Gets the value of the msgClss property.
     * 
     * @return
     *     possible object is
     *     {@link MessageClass1Code }
     *     
     */
    public MessageClass1Code getMsgClss() {
        return msgClss;
    }

    /**
     * Sets the value of the msgClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageClass1Code }
     *     
     */
    public OriginalDataElements4 setMsgClss(MessageClass1Code value) {
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
    public OriginalDataElements4 setMsgFctn(MessageFunction16Code value) {
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
    public OriginalDataElements4 setAcqrrId(String value) {
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
    public OriginalDataElements4 setSndrId(String value) {
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
    public OriginalDataElements4 setTxTp(String value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionIdentification1 }
     *     
     */
    public OriginalTransactionIdentification1 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionIdentification1 }
     *     
     */
    public OriginalDataElements4 setTxId(OriginalTransactionIdentification1 value) {
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
    public OriginalDataElements4 setRspnCd(String value) {
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
