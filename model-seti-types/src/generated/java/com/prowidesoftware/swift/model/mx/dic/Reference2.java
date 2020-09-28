
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
 * Additional references linked to the quote request reject.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference2", propOrder = {
    "qtReqId",
    "reqForQtReqId"
})
public class Reference2 {

    @XmlElement(name = "QtReqId", required = true)
    protected String qtReqId;
    @XmlElement(name = "ReqForQtReqId")
    protected String reqForQtReqId;

    /**
     * Gets the value of the qtReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtReqId() {
        return qtReqId;
    }

    /**
     * Sets the value of the qtReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference2 setQtReqId(String value) {
        this.qtReqId = value;
        return this;
    }

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
    public Reference2 setReqForQtReqId(String value) {
        this.reqForQtReqId = value;
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
