
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
 * Provides the details on the approval status, with the data required on the users requesting the update and approving it.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditTrailApprovalStatus2", propOrder = {
    "apprvlReqd",
    "instgUsr",
    "apprvgUsr"
})
public class AuditTrailApprovalStatus2 {

    @XmlElement(name = "ApprvlReqd")
    protected boolean apprvlReqd;
    @XmlElement(name = "InstgUsr", required = true)
    protected String instgUsr;
    @XmlElement(name = "ApprvgUsr")
    protected String apprvgUsr;

    /**
     * Gets the value of the apprvlReqd property.
     * 
     */
    public boolean isApprvlReqd() {
        return apprvlReqd;
    }

    /**
     * Sets the value of the apprvlReqd property.
     * 
     */
    public AuditTrailApprovalStatus2 setApprvlReqd(boolean value) {
        this.apprvlReqd = value;
        return this;
    }

    /**
     * Gets the value of the instgUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgUsr() {
        return instgUsr;
    }

    /**
     * Sets the value of the instgUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AuditTrailApprovalStatus2 setInstgUsr(String value) {
        this.instgUsr = value;
        return this;
    }

    /**
     * Gets the value of the apprvgUsr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprvgUsr() {
        return apprvgUsr;
    }

    /**
     * Sets the value of the apprvgUsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AuditTrailApprovalStatus2 setApprvgUsr(String value) {
        this.apprvgUsr = value;
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
