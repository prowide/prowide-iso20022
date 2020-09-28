
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
 * The GetLimit message is used to request information on the details of one or more limits set by the member (or on behalf of the member) and managed by the transaction administrator.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLimitV05", propOrder = {
    "msgHdr",
    "lmtQryDef"
})
public class GetLimitV05 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader2 msgHdr;
    @XmlElement(name = "LmtQryDef")
    protected LimitQuery1 lmtQryDef;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader2 }
     *     
     */
    public MessageHeader2 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader2 }
     *     
     */
    public GetLimitV05 setMsgHdr(MessageHeader2 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the lmtQryDef property.
     * 
     * @return
     *     possible object is
     *     {@link LimitQuery1 }
     *     
     */
    public LimitQuery1 getLmtQryDef() {
        return lmtQryDef;
    }

    /**
     * Sets the value of the lmtQryDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitQuery1 }
     *     
     */
    public GetLimitV05 setLmtQryDef(LimitQuery1 value) {
        this.lmtQryDef = value;
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
