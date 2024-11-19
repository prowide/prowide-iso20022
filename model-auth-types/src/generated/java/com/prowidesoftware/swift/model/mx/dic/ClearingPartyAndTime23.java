
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the central counterparty intended clearing time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingPartyAndTime23", propOrder = {
    "ccp",
    "clrRctDtTm",
    "clrDtTm",
    "clrIdr",
    "orgnlIdr",
    "orgnlTradRpstryIdr"
})
public class ClearingPartyAndTime23 {

    @XmlElement(name = "CCP")
    protected OrganisationIdentification15Choice ccp;
    @XmlElement(name = "ClrRctDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime clrRctDtTm;
    @XmlElement(name = "ClrDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime clrDtTm;
    @XmlElement(name = "ClrIdr")
    protected UniqueTransactionIdentifier1Choice clrIdr;
    @XmlElement(name = "OrgnlIdr")
    protected UniqueTransactionIdentifier1Choice orgnlIdr;
    @XmlElement(name = "OrgnlTradRpstryIdr")
    protected OrganisationIdentification15Choice orgnlTradRpstryIdr;

    /**
     * Gets the value of the ccp property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getCCP() {
        return ccp;
    }

    /**
     * Sets the value of the ccp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public ClearingPartyAndTime23 setCCP(OrganisationIdentification15Choice value) {
        this.ccp = value;
        return this;
    }

    /**
     * Gets the value of the clrRctDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getClrRctDtTm() {
        return clrRctDtTm;
    }

    /**
     * Sets the value of the clrRctDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingPartyAndTime23 setClrRctDtTm(OffsetDateTime value) {
        this.clrRctDtTm = value;
        return this;
    }

    /**
     * Gets the value of the clrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getClrDtTm() {
        return clrDtTm;
    }

    /**
     * Sets the value of the clrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ClearingPartyAndTime23 setClrDtTm(OffsetDateTime value) {
        this.clrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the clrIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier1Choice }
     *     
     */
    public UniqueTransactionIdentifier1Choice getClrIdr() {
        return clrIdr;
    }

    /**
     * Sets the value of the clrIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier1Choice }
     *     
     */
    public ClearingPartyAndTime23 setClrIdr(UniqueTransactionIdentifier1Choice value) {
        this.clrIdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier1Choice }
     *     
     */
    public UniqueTransactionIdentifier1Choice getOrgnlIdr() {
        return orgnlIdr;
    }

    /**
     * Sets the value of the orgnlIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier1Choice }
     *     
     */
    public ClearingPartyAndTime23 setOrgnlIdr(UniqueTransactionIdentifier1Choice value) {
        this.orgnlIdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlTradRpstryIdr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getOrgnlTradRpstryIdr() {
        return orgnlTradRpstryIdr;
    }

    /**
     * Sets the value of the orgnlTradRpstryIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public ClearingPartyAndTime23 setOrgnlTradRpstryIdr(OrganisationIdentification15Choice value) {
        this.orgnlTradRpstryIdr = value;
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
