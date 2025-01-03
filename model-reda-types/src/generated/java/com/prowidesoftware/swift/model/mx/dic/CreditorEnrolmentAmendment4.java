
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
 * Information that serves as a basis to debit an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorEnrolmentAmendment4", propOrder = {
    "cdtrEnrlmnt",
    "actvtnData"
})
public class CreditorEnrolmentAmendment4 {

    @XmlElement(name = "CdtrEnrlmnt")
    protected CreditorEnrolment4 cdtrEnrlmnt;
    @XmlElement(name = "ActvtnData")
    protected CreditorInvoice4 actvtnData;

    /**
     * Gets the value of the cdtrEnrlmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorEnrolment4 }
     *     
     */
    public CreditorEnrolment4 getCdtrEnrlmnt() {
        return cdtrEnrlmnt;
    }

    /**
     * Sets the value of the cdtrEnrlmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorEnrolment4 }
     *     
     */
    public CreditorEnrolmentAmendment4 setCdtrEnrlmnt(CreditorEnrolment4 value) {
        this.cdtrEnrlmnt = value;
        return this;
    }

    /**
     * Gets the value of the actvtnData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorInvoice4 }
     *     
     */
    public CreditorInvoice4 getActvtnData() {
        return actvtnData;
    }

    /**
     * Sets the value of the actvtnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorInvoice4 }
     *     
     */
    public CreditorEnrolmentAmendment4 setActvtnData(CreditorInvoice4 value) {
        this.actvtnData = value;
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
