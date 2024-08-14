
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
 * Provides details on the original request. Identifies the message being acknowledged and its status
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptAcknowledgementReport2", propOrder = {
    "rltdRef",
    "reqHdlg"
})
public class ReceiptAcknowledgementReport2 {

    @XmlElement(name = "RltdRef", required = true)
    protected MessageReference1 rltdRef;
    @XmlElement(name = "ReqHdlg", required = true)
    protected RequestHandling2 reqHdlg;

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageReference1 }
     *     
     */
    public MessageReference1 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageReference1 }
     *     
     */
    public ReceiptAcknowledgementReport2 setRltdRef(MessageReference1 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the reqHdlg property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHandling2 }
     *     
     */
    public RequestHandling2 getReqHdlg() {
        return reqHdlg;
    }

    /**
     * Sets the value of the reqHdlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHandling2 }
     *     
     */
    public ReceiptAcknowledgementReport2 setReqHdlg(RequestHandling2 value) {
        this.reqHdlg = value;
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
