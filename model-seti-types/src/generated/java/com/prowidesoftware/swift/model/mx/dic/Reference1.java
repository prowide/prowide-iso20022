
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
 * Additional references linked to the quote request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference1", propOrder = {
    "reqForQtReqId",
    "clntOrdrId"
})
public class Reference1 {

    @XmlElement(name = "ReqForQtReqId")
    protected String reqForQtReqId;
    @XmlElement(name = "ClntOrdrId")
    protected String clntOrdrId;

    /**
     * Gets the value of the reqForQtReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqForQtReqId() {
        return reqForQtReqId;
    }

    /**
     * Sets the value of the reqForQtReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference1 setReqForQtReqId(String value) {
        this.reqForQtReqId = value;
        return this;
    }

    /**
     * Gets the value of the clntOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntOrdrId() {
        return clntOrdrId;
    }

    /**
     * Sets the value of the clntOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference1 setClntOrdrId(String value) {
        this.clntOrdrId = value;
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
