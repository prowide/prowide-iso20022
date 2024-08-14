
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
 * Information that serves as a basis to debit an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorEnrolmentAmendment6", propOrder = {
    "cdtrEnrlmnt",
    "actvtnData"
})
public class CreditorEnrolmentAmendment6 {

    @XmlElement(name = "CdtrEnrlmnt")
    protected CreditorEnrolment6 cdtrEnrlmnt;
    @XmlElement(name = "ActvtnData")
    protected CreditorInvoice5 actvtnData;

    /**
     * Gets the value of the cdtrEnrlmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorEnrolment6 }
     *     
     */
    public CreditorEnrolment6 getCdtrEnrlmnt() {
        return cdtrEnrlmnt;
    }

    /**
     * Sets the value of the cdtrEnrlmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorEnrolment6 }
     *     
     */
    public CreditorEnrolmentAmendment6 setCdtrEnrlmnt(CreditorEnrolment6 value) {
        this.cdtrEnrlmnt = value;
        return this;
    }

    /**
     * Gets the value of the actvtnData property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorInvoice5 }
     *     
     */
    public CreditorInvoice5 getActvtnData() {
        return actvtnData;
    }

    /**
     * Sets the value of the actvtnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorInvoice5 }
     *     
     */
    public CreditorEnrolmentAmendment6 setActvtnData(CreditorInvoice5 value) {
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
