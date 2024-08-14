
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
 * Additional references linked to the quote response.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference5", propOrder = {
    "qtId",
    "qtReqId",
    "ioiId",
    "clntOrdrId"
})
public class Reference5 {

    @XmlElement(name = "QtId")
    protected String qtId;
    @XmlElement(name = "QtReqId")
    protected String qtReqId;
    @XmlElement(name = "IOIId")
    protected String ioiId;
    @XmlElement(name = "ClntOrdrId")
    protected String clntOrdrId;

    /**
     * Gets the value of the qtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtId() {
        return qtId;
    }

    /**
     * Sets the value of the qtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference5 setQtId(String value) {
        this.qtId = value;
        return this;
    }

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
    public Reference5 setQtReqId(String value) {
        this.qtReqId = value;
        return this;
    }

    /**
     * Gets the value of the ioiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIOIId() {
        return ioiId;
    }

    /**
     * Sets the value of the ioiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference5 setIOIId(String value) {
        this.ioiId = value;
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
    public Reference5 setClntOrdrId(String value) {
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
