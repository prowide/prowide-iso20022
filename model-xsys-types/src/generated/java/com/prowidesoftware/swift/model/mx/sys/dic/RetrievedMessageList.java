
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for RetrievedMessageList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievedMessageList", propOrder = {
    "rtrvdInptMsgLst",
    "rtrvdOutptMsgLst"
})
public class RetrievedMessageList {

    @XmlElement(name = "RtrvdInptMsgLst")
    protected RetrievedInputMessageList rtrvdInptMsgLst;
    @XmlElement(name = "RtrvdOutptMsgLst")
    protected RetrievedOutputMessageList rtrvdOutptMsgLst;

    /**
     * Gets the value of the rtrvdInptMsgLst property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievedInputMessageList }
     *     
     */
    public RetrievedInputMessageList getRtrvdInptMsgLst() {
        return rtrvdInptMsgLst;
    }

    /**
     * Sets the value of the rtrvdInptMsgLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievedInputMessageList }
     *     
     */
    public RetrievedMessageList setRtrvdInptMsgLst(RetrievedInputMessageList value) {
        this.rtrvdInptMsgLst = value;
        return this;
    }

    /**
     * Gets the value of the rtrvdOutptMsgLst property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievedOutputMessageList }
     *     
     */
    public RetrievedOutputMessageList getRtrvdOutptMsgLst() {
        return rtrvdOutptMsgLst;
    }

    /**
     * Sets the value of the rtrvdOutptMsgLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievedOutputMessageList }
     *     
     */
    public RetrievedMessageList setRtrvdOutptMsgLst(RetrievedOutputMessageList value) {
        this.rtrvdOutptMsgLst = value;
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
