
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Non-extension information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonExtension1", propOrder = {
    "ntfctnPrd",
    "ntfctnMtd",
    "ntfctnRcptTp",
    "ntfctnRcptNm",
    "ntfctnRcptAdr"
})
public class NonExtension1 {

    @XmlElement(name = "NtfctnPrd")
    protected BigDecimal ntfctnPrd;
    @XmlElement(name = "NtfctnMtd")
    protected CommunicationMethod1Choice ntfctnMtd;
    @XmlElement(name = "NtfctnRcptTp")
    protected PartyType1Choice ntfctnRcptTp;
    @XmlElement(name = "NtfctnRcptNm")
    protected String ntfctnRcptNm;
    @XmlElement(name = "NtfctnRcptAdr")
    protected PostalAddress6 ntfctnRcptAdr;

    /**
     * Gets the value of the ntfctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNtfctnPrd() {
        return ntfctnPrd;
    }

    /**
     * Sets the value of the ntfctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public NonExtension1 setNtfctnPrd(BigDecimal value) {
        this.ntfctnPrd = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationMethod1Choice }
     *     
     */
    public CommunicationMethod1Choice getNtfctnMtd() {
        return ntfctnMtd;
    }

    /**
     * Sets the value of the ntfctnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationMethod1Choice }
     *     
     */
    public NonExtension1 setNtfctnMtd(CommunicationMethod1Choice value) {
        this.ntfctnMtd = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnRcptTp property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType1Choice }
     *     
     */
    public PartyType1Choice getNtfctnRcptTp() {
        return ntfctnRcptTp;
    }

    /**
     * Sets the value of the ntfctnRcptTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType1Choice }
     *     
     */
    public NonExtension1 setNtfctnRcptTp(PartyType1Choice value) {
        this.ntfctnRcptTp = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnRcptNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtfctnRcptNm() {
        return ntfctnRcptNm;
    }

    /**
     * Sets the value of the ntfctnRcptNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NonExtension1 setNtfctnRcptNm(String value) {
        this.ntfctnRcptNm = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnRcptAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress6 }
     *     
     */
    public PostalAddress6 getNtfctnRcptAdr() {
        return ntfctnRcptAdr;
    }

    /**
     * Sets the value of the ntfctnRcptAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress6 }
     *     
     */
    public NonExtension1 setNtfctnRcptAdr(PostalAddress6 value) {
        this.ntfctnRcptAdr = value;
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
