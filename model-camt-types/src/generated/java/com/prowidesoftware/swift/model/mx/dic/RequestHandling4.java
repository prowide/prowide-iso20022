
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
 * Explains the status of the related request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHandling4", propOrder = {
    "sts",
    "stsRsn",
    "desc"
})
public class RequestHandling4 {

    @XmlElement(name = "Sts", required = true)
    protected RequestStatus1Choice sts;
    @XmlElement(name = "StsRsn")
    protected StatusReasonInformation14 stsRsn;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link RequestStatus1Choice }
     *     
     */
    public RequestStatus1Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStatus1Choice }
     *     
     */
    public RequestHandling4 setSts(RequestStatus1Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReasonInformation14 }
     *     
     */
    public StatusReasonInformation14 getStsRsn() {
        return stsRsn;
    }

    /**
     * Sets the value of the stsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReasonInformation14 }
     *     
     */
    public RequestHandling4 setStsRsn(StatusReasonInformation14 value) {
        this.stsRsn = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequestHandling4 setDesc(String value) {
        this.desc = value;
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
