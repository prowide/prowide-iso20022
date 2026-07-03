
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
 * Scope
 * The DeleteLimit message is sent by a member to the transaction administrator.
 * It is used to request the deletion of one particular, several or all limits set by the member and managed by the transaction administrator.
 * The DeleteLimit message may delete several types of current limits (risk or liquidity management limit), based on a multiple requests.
 * Usage
 * The member will submit a DeleteLimit message identifying which limit(s) it wants to delete (current limit risk/liquidity limit concepts have been merged) based on following criteria:
 * - type of limit(s) (current/default)
 * - value of the limit(s) (default and/or current limit(s))
 * - identification of the counterparty (bilateral limit)
 * Based on the criteria received within the DeleteLimit message, the transaction administrator will execute or reject the requested modifications.
 * The transaction administrator may send a Receipt message as a reply to the DeleteLimit request.
 * To verify the outcome of the request, the member may submit a GetLimit message with the appropriate search criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteLimitV05", propOrder = {
    "msgHdr",
    "lmtDtls"
})
public class DeleteLimitV05 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "LmtDtls", required = true)
    protected LimitStructure1Choice lmtDtls;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader1 }
     *     
     */
    public MessageHeader1 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader1 }
     *     
     */
    public DeleteLimitV05 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the lmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link LimitStructure1Choice }
     *     
     */
    public LimitStructure1Choice getLmtDtls() {
        return lmtDtls;
    }

    /**
     * Sets the value of the lmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitStructure1Choice }
     *     
     */
    public DeleteLimitV05 setLmtDtls(LimitStructure1Choice value) {
        this.lmtDtls = value;
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
