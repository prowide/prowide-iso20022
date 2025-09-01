
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the central counterparty clearing time.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingPartyAndTime22", propOrder = {
    "ccp",
    "clrRctDtTm",
    "clrDtTm",
    "clrIdr",
    "orgnlIdr",
    "orgnlTradRpstryIdr",
    "clrAcctOrgn"
})
public class ClearingPartyAndTime22 {

    @XmlElement(name = "CCP")
    protected OrganisationIdentification15Choice ccp;
    @XmlElement(name = "ClrRctDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clrRctDtTm;
    @XmlElement(name = "ClrDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clrDtTm;
    @XmlElement(name = "ClrIdr")
    protected UniqueTransactionIdentifier2Choice clrIdr;
    @XmlElement(name = "OrgnlIdr")
    protected UniqueTransactionIdentifier2Choice orgnlIdr;
    @XmlElement(name = "OrgnlTradRpstryIdr")
    protected OrganisationIdentification15Choice orgnlTradRpstryIdr;
    @XmlElement(name = "ClrAcctOrgn")
    @XmlSchemaType(name = "string")
    protected ClearingAccountType4Code clrAcctOrgn;

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
    public ClearingPartyAndTime22 setCCP(OrganisationIdentification15Choice value) {
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
    public XMLGregorianCalendar getClrRctDtTm() {
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
    public ClearingPartyAndTime22 setClrRctDtTm(XMLGregorianCalendar value) {
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
    public XMLGregorianCalendar getClrDtTm() {
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
    public ClearingPartyAndTime22 setClrDtTm(XMLGregorianCalendar value) {
        this.clrDtTm = value;
        return this;
    }

    /**
     * Gets the value of the clrIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier2Choice }
     *     
     */
    public UniqueTransactionIdentifier2Choice getClrIdr() {
        return clrIdr;
    }

    /**
     * Sets the value of the clrIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier2Choice }
     *     
     */
    public ClearingPartyAndTime22 setClrIdr(UniqueTransactionIdentifier2Choice value) {
        this.clrIdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier2Choice }
     *     
     */
    public UniqueTransactionIdentifier2Choice getOrgnlIdr() {
        return orgnlIdr;
    }

    /**
     * Sets the value of the orgnlIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier2Choice }
     *     
     */
    public ClearingPartyAndTime22 setOrgnlIdr(UniqueTransactionIdentifier2Choice value) {
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
    public ClearingPartyAndTime22 setOrgnlTradRpstryIdr(OrganisationIdentification15Choice value) {
        this.orgnlTradRpstryIdr = value;
        return this;
    }

    /**
     * Gets the value of the clrAcctOrgn property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingAccountType4Code }
     *     
     */
    public ClearingAccountType4Code getClrAcctOrgn() {
        return clrAcctOrgn;
    }

    /**
     * Sets the value of the clrAcctOrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingAccountType4Code }
     *     
     */
    public ClearingPartyAndTime22 setClrAcctOrgn(ClearingAccountType4Code value) {
        this.clrAcctOrgn = value;
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
