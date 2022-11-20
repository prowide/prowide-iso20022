
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
 * Specifies the service details for the creditor enrolment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorServiceEnrolment1", propOrder = {
    "enrlmntStartDt",
    "enrlmntEndDt",
    "vsblty",
    "svcActvtnAllwd",
    "svcDescLk",
    "cdtrSvcActvtnLk"
})
public class CreditorServiceEnrolment1 {

    @XmlElement(name = "EnrlmntStartDt")
    protected DateAndDateTime2Choice enrlmntStartDt;
    @XmlElement(name = "EnrlmntEndDt")
    protected DateAndDateTime2Choice enrlmntEndDt;
    @XmlElement(name = "Vsblty")
    protected Visibilty1 vsblty;
    @XmlElement(name = "SvcActvtnAllwd")
    protected boolean svcActvtnAllwd;
    @XmlElement(name = "SvcDescLk")
    protected String svcDescLk;
    @XmlElement(name = "CdtrSvcActvtnLk")
    protected String cdtrSvcActvtnLk;

    /**
     * Gets the value of the enrlmntStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getEnrlmntStartDt() {
        return enrlmntStartDt;
    }

    /**
     * Sets the value of the enrlmntStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public CreditorServiceEnrolment1 setEnrlmntStartDt(DateAndDateTime2Choice value) {
        this.enrlmntStartDt = value;
        return this;
    }

    /**
     * Gets the value of the enrlmntEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getEnrlmntEndDt() {
        return enrlmntEndDt;
    }

    /**
     * Sets the value of the enrlmntEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public CreditorServiceEnrolment1 setEnrlmntEndDt(DateAndDateTime2Choice value) {
        this.enrlmntEndDt = value;
        return this;
    }

    /**
     * Gets the value of the vsblty property.
     * 
     * @return
     *     possible object is
     *     {@link Visibilty1 }
     *     
     */
    public Visibilty1 getVsblty() {
        return vsblty;
    }

    /**
     * Sets the value of the vsblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visibilty1 }
     *     
     */
    public CreditorServiceEnrolment1 setVsblty(Visibilty1 value) {
        this.vsblty = value;
        return this;
    }

    /**
     * Gets the value of the svcActvtnAllwd property.
     * 
     */
    public boolean isSvcActvtnAllwd() {
        return svcActvtnAllwd;
    }

    /**
     * Sets the value of the svcActvtnAllwd property.
     * 
     */
    public CreditorServiceEnrolment1 setSvcActvtnAllwd(boolean value) {
        this.svcActvtnAllwd = value;
        return this;
    }

    /**
     * Gets the value of the svcDescLk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcDescLk() {
        return svcDescLk;
    }

    /**
     * Sets the value of the svcDescLk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditorServiceEnrolment1 setSvcDescLk(String value) {
        this.svcDescLk = value;
        return this;
    }

    /**
     * Gets the value of the cdtrSvcActvtnLk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtrSvcActvtnLk() {
        return cdtrSvcActvtnLk;
    }

    /**
     * Sets the value of the cdtrSvcActvtnLk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditorServiceEnrolment1 setCdtrSvcActvtnLk(String value) {
        this.cdtrSvcActvtnLk = value;
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
