
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
 * Choice between a list of pending statuses or final statuses.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusCode5Choice", propOrder = {
    "pdg",
    "fnl",
    "rtgs",
    "sttlm",
    "prtry"
})
public class PaymentStatusCode5Choice {

    @XmlElement(name = "Pdg")
    @XmlSchemaType(name = "string")
    protected PendingStatus4Code pdg;
    @XmlElement(name = "Fnl")
    @XmlSchemaType(name = "string")
    protected FinalStatus1Code fnl;
    @XmlElement(name = "RTGS")
    protected String rtgs;
    @XmlElement(name = "Sttlm")
    protected String sttlm;
    @XmlElement(name = "Prtry")
    protected String prtry;

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus4Code }
     *     
     */
    public PendingStatus4Code getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus4Code }
     *     
     */
    public PaymentStatusCode5Choice setPdg(PendingStatus4Code value) {
        this.pdg = value;
        return this;
    }

    /**
     * Gets the value of the fnl property.
     * 
     * @return
     *     possible object is
     *     {@link FinalStatus1Code }
     *     
     */
    public FinalStatus1Code getFnl() {
        return fnl;
    }

    /**
     * Sets the value of the fnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalStatus1Code }
     *     
     */
    public PaymentStatusCode5Choice setFnl(FinalStatus1Code value) {
        this.fnl = value;
        return this;
    }

    /**
     * Gets the value of the rtgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTGS() {
        return rtgs;
    }

    /**
     * Sets the value of the rtgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentStatusCode5Choice setRTGS(String value) {
        this.rtgs = value;
        return this;
    }

    /**
     * Gets the value of the sttlm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlm() {
        return sttlm;
    }

    /**
     * Sets the value of the sttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentStatusCode5Choice setSttlm(String value) {
        this.sttlm = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentStatusCode5Choice setPrtry(String value) {
        this.prtry = value;
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
