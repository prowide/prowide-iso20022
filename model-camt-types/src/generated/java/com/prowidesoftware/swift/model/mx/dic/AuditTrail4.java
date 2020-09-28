
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Describes information needed to identify a change for a static data, the time when it was performed and the user requesting the change and approving it.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditTrail4", propOrder = {
    "rcrd",
    "oprTmStmp",
    "apprvlSts",
    "prcgSts"
})
public class AuditTrail4 {

    @XmlElement(name = "Rcrd", required = true)
    protected AuditTrailBusinessItem2Choice rcrd;
    @XmlElement(name = "OprTmStmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar oprTmStmp;
    @XmlElement(name = "ApprvlSts", required = true)
    protected AuditTrailApprovalStatus2 apprvlSts;
    @XmlElement(name = "PrcgSts")
    protected AuditTrailProcessingStatus1Choice prcgSts;

    /**
     * Gets the value of the rcrd property.
     * 
     * @return
     *     possible object is
     *     {@link AuditTrailBusinessItem2Choice }
     *     
     */
    public AuditTrailBusinessItem2Choice getRcrd() {
        return rcrd;
    }

    /**
     * Sets the value of the rcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditTrailBusinessItem2Choice }
     *     
     */
    public AuditTrail4 setRcrd(AuditTrailBusinessItem2Choice value) {
        this.rcrd = value;
        return this;
    }

    /**
     * Gets the value of the oprTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOprTmStmp() {
        return oprTmStmp;
    }

    /**
     * Sets the value of the oprTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public AuditTrail4 setOprTmStmp(XMLGregorianCalendar value) {
        this.oprTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the apprvlSts property.
     * 
     * @return
     *     possible object is
     *     {@link AuditTrailApprovalStatus2 }
     *     
     */
    public AuditTrailApprovalStatus2 getApprvlSts() {
        return apprvlSts;
    }

    /**
     * Sets the value of the apprvlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditTrailApprovalStatus2 }
     *     
     */
    public AuditTrail4 setApprvlSts(AuditTrailApprovalStatus2 value) {
        this.apprvlSts = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link AuditTrailProcessingStatus1Choice }
     *     
     */
    public AuditTrailProcessingStatus1Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditTrailProcessingStatus1Choice }
     *     
     */
    public AuditTrail4 setPrcgSts(AuditTrailProcessingStatus1Choice value) {
        this.prcgSts = value;
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
