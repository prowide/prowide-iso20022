
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of characteristics related to the protocol.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header72", propOrder = {
    "msgFctn",
    "prtcolVrsn",
    "xchgId",
    "reTrnsmssnCntr",
    "creDtTm",
    "colltnId",
    "btchId",
    "msgSeqNb",
    "msgChcksmInptVal",
    "initgPtyId",
    "rcptPtyId",
    "tracData"
})
public class Header72 {

    @XmlElement(name = "MsgFctn", required = true)
    protected String msgFctn;
    @XmlElement(name = "PrtcolVrsn")
    protected String prtcolVrsn;
    @XmlElement(name = "XchgId")
    protected String xchgId;
    @XmlElement(name = "ReTrnsmssnCntr")
    protected String reTrnsmssnCntr;
    @XmlElement(name = "CreDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime creDtTm;
    @XmlElement(name = "ColltnId")
    protected String colltnId;
    @XmlElement(name = "BtchId")
    protected String btchId;
    @XmlElement(name = "MsgSeqNb")
    protected String msgSeqNb;
    @XmlElement(name = "MsgChcksmInptVal")
    protected byte[] msgChcksmInptVal;
    @XmlElement(name = "InitgPtyId")
    protected String initgPtyId;
    @XmlElement(name = "RcptPtyId")
    protected String rcptPtyId;
    @XmlElement(name = "TracData")
    protected String tracData;

    /**
     * Gets the value of the msgFctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgFctn() {
        return msgFctn;
    }

    /**
     * Sets the value of the msgFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Header72 setMsgFctn(String value) {
        this.msgFctn = value;
        return this;
    }

    /**
     * Gets the value of the prtcolVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtcolVrsn() {
        return prtcolVrsn;
    }

    /**
     * Sets the value of the prtcolVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Header72 setPrtcolVrsn(String value) {
        this.prtcolVrsn = value;
        return this;
    }

    /**
     * Gets the value of the xchgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgId() {
        return xchgId;
    }

    /**
     * Sets the value of the xchgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Header72 setXchgId(String value) {
        this.xchgId = value;
        return this;
    }

    /**
     * Gets the value of the reTrnsmssnCntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReTrnsmssnCntr() {
        return reTrnsmssnCntr;
    }

    /**
     * Sets the value of the reTrnsmssnCntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Header72 setReTrnsmssnCntr(String value) {
        this.reTrnsmssnCntr = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Header72 setCreDtTm(OffsetDateTime value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the colltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColltnId() {
        return colltnId;
    }

    /**
     * Sets the value of the colltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Header72 setColltnId(String value) {
        this.colltnId = value;
        return this;
    }

    /**
     * Gets the value of the btchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBtchId() {
        return btchId;
    }

    /**
     * Sets the value of the btchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Header72 setBtchId(String value) {
        this.btchId = value;
        return this;
    }

    /**
     * Gets the value of the msgSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSeqNb() {
        return msgSeqNb;
    }

    /**
     * Sets the value of the msgSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Header72 setMsgSeqNb(String value) {
        this.msgSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the msgChcksmInptVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMsgChcksmInptVal() {
        return msgChcksmInptVal;
    }

    /**
     * Sets the value of the msgChcksmInptVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public Header72 setMsgChcksmInptVal(byte[] value) {
        this.msgChcksmInptVal = value;
        return this;
    }

    /**
     * Gets the value of the initgPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitgPtyId() {
        return initgPtyId;
    }

    /**
     * Sets the value of the initgPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Header72 setInitgPtyId(String value) {
        this.initgPtyId = value;
        return this;
    }

    /**
     * Gets the value of the rcptPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptPtyId() {
        return rcptPtyId;
    }

    /**
     * Sets the value of the rcptPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Header72 setRcptPtyId(String value) {
        this.rcptPtyId = value;
        return this;
    }

    /**
     * Gets the value of the tracData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTracData() {
        return tracData;
    }

    /**
     * Sets the value of the tracData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Header72 setTracData(String value) {
        this.tracData = value;
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
