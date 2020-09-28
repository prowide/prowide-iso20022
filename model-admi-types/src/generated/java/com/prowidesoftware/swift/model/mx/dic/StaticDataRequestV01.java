
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
 * The StaticDataRequest message is sent by a participant of a central system to the central system to request a static data report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaticDataRequestV01", propOrder = {
    "msgId",
    "dataReqDtls"
})
public class StaticDataRequestV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification msgId;
    @XmlElement(name = "DataReqDtls", required = true)
    protected RequestDetails3 dataReqDtls;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification }
     *     
     */
    public MessageIdentification getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification }
     *     
     */
    public StaticDataRequestV01 setMsgId(MessageIdentification value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the dataReqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RequestDetails3 }
     *     
     */
    public RequestDetails3 getDataReqDtls() {
        return dataReqDtls;
    }

    /**
     * Sets the value of the dataReqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestDetails3 }
     *     
     */
    public StaticDataRequestV01 setDataReqDtls(RequestDetails3 value) {
        this.dataReqDtls = value;
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
