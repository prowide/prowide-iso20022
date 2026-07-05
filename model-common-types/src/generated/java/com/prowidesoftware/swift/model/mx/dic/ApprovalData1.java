
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
 * Data pertaining to the approval of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovalData1", propOrder = {
    "apprvlNtty",
    "apprvlCd"
})
public class ApprovalData1 {

    @XmlElement(name = "ApprvlNtty")
    protected ApprovalEntity1 apprvlNtty;
    @XmlElement(name = "ApprvlCd")
    protected String apprvlCd;

    /**
     * Gets the value of the apprvlNtty property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalEntity1 }
     *     
     */
    public ApprovalEntity1 getApprvlNtty() {
        return apprvlNtty;
    }

    /**
     * Sets the value of the apprvlNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalEntity1 }
     *     
     */
    public ApprovalData1 setApprvlNtty(ApprovalEntity1 value) {
        this.apprvlNtty = value;
        return this;
    }

    /**
     * Gets the value of the apprvlCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprvlCd() {
        return apprvlCd;
    }

    /**
     * Sets the value of the apprvlCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ApprovalData1 setApprvlCd(String value) {
        this.apprvlCd = value;
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
