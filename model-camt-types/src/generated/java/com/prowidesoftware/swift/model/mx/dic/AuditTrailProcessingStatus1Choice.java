
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the details on the processing status of the update.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditTrailProcessingStatus1Choice", propOrder = {
    "apprvdPrcd",
    "pdgApprvlRsn",
    "pdgPrcgRsn",
    "rjctnRsn"
})
public class AuditTrailProcessingStatus1Choice {

    @XmlElement(name = "ApprvdPrcd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode apprvdPrcd;
    @XmlElement(name = "PdgApprvlRsn")
    protected String pdgApprvlRsn;
    @XmlElement(name = "PdgPrcgRsn")
    protected String pdgPrcgRsn;
    @XmlElement(name = "RjctnRsn")
    protected String rjctnRsn;

    /**
     * Gets the value of the apprvdPrcd property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getApprvdPrcd() {
        return apprvdPrcd;
    }

    /**
     * Sets the value of the apprvdPrcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public AuditTrailProcessingStatus1Choice setApprvdPrcd(NoReasonCode value) {
        this.apprvdPrcd = value;
        return this;
    }

    /**
     * Gets the value of the pdgApprvlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdgApprvlRsn() {
        return pdgApprvlRsn;
    }

    /**
     * Sets the value of the pdgApprvlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AuditTrailProcessingStatus1Choice setPdgApprvlRsn(String value) {
        this.pdgApprvlRsn = value;
        return this;
    }

    /**
     * Gets the value of the pdgPrcgRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdgPrcgRsn() {
        return pdgPrcgRsn;
    }

    /**
     * Sets the value of the pdgPrcgRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AuditTrailProcessingStatus1Choice setPdgPrcgRsn(String value) {
        this.pdgPrcgRsn = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AuditTrailProcessingStatus1Choice setRjctnRsn(String value) {
        this.rjctnRsn = value;
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
