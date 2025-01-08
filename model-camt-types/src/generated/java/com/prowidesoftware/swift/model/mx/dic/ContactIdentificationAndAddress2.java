
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
 * Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactIdentificationAndAddress2", propOrder = {
    "nm",
    "role",
    "comAdr"
})
public class ContactIdentificationAndAddress2 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Role", required = true)
    protected PaymentRole1Choice role;
    @XmlElement(name = "ComAdr", required = true)
    protected CommunicationAddress10 comAdr;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContactIdentificationAndAddress2 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRole1Choice }
     *     
     */
    public PaymentRole1Choice getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRole1Choice }
     *     
     */
    public ContactIdentificationAndAddress2 setRole(PaymentRole1Choice value) {
        this.role = value;
        return this;
    }

    /**
     * Gets the value of the comAdr property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress10 }
     *     
     */
    public CommunicationAddress10 getComAdr() {
        return comAdr;
    }

    /**
     * Sets the value of the comAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress10 }
     *     
     */
    public ContactIdentificationAndAddress2 setComAdr(CommunicationAddress10 value) {
        this.comAdr = value;
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
