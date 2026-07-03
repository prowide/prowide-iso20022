
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
 * Java class for PutFileResponse complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PutFileResponse", propOrder = {
    "transferAnswer",
    "rejectDescription",
    "rejectInfo",
    "physicalName"
})
public class SwPutFileResponse {

    @XmlElement(name = "TransferAnswer", required = true)
    protected String transferAnswer;
    @XmlElement(name = "RejectDescription")
    protected String rejectDescription;
    @XmlElement(name = "RejectInfo")
    protected String rejectInfo;
    @XmlElement(name = "PhysicalName")
    protected String physicalName;

    /**
     * Gets the value of the transferAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferAnswer() {
        return transferAnswer;
    }

    /**
     * Sets the value of the transferAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwPutFileResponse setTransferAnswer(String value) {
        this.transferAnswer = value;
        return this;
    }

    /**
     * Gets the value of the rejectDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectDescription() {
        return rejectDescription;
    }

    /**
     * Sets the value of the rejectDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwPutFileResponse setRejectDescription(String value) {
        this.rejectDescription = value;
        return this;
    }

    /**
     * Gets the value of the rejectInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectInfo() {
        return rejectInfo;
    }

    /**
     * Sets the value of the rejectInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwPutFileResponse setRejectInfo(String value) {
        this.rejectInfo = value;
        return this;
    }

    /**
     * Gets the value of the physicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalName() {
        return physicalName;
    }

    /**
     * Sets the value of the physicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwPutFileResponse setPhysicalName(String value) {
        this.physicalName = value;
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
