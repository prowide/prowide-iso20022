
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
 * Elements of identification of a batch management transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchManagementInformation1", propOrder = {
    "colltnId",
    "btchId",
    "msgSeqNb",
    "msgChcksmInptVal"
})
public class BatchManagementInformation1 {

    @XmlElement(name = "ColltnId")
    protected String colltnId;
    @XmlElement(name = "BtchId", required = true)
    protected String btchId;
    @XmlElement(name = "MsgSeqNb")
    protected String msgSeqNb;
    @XmlElement(name = "MsgChcksmInptVal")
    protected byte[] msgChcksmInptVal;

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
    public BatchManagementInformation1 setColltnId(String value) {
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
    public BatchManagementInformation1 setBtchId(String value) {
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
    public BatchManagementInformation1 setMsgSeqNb(String value) {
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
    public BatchManagementInformation1 setMsgChcksmInptVal(byte[] value) {
        this.msgChcksmInptVal = value;
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
