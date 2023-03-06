
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
 * Party and account details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount15", propOrder = {
    "id",
    "altrnId",
    "cshAcct",
    "chrgsAcct",
    "comssnAcct",
    "taxAcct",
    "addtlInf"
})
public class PartyIdentificationAndAccount15 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification30Choice id;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification2 altrnId;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification5Choice cshAcct;
    @XmlElement(name = "ChrgsAcct")
    protected CashAccountIdentification5Choice chrgsAcct;
    @XmlElement(name = "ComssnAcct")
    protected CashAccountIdentification5Choice comssnAcct;
    @XmlElement(name = "TaxAcct")
    protected CashAccountIdentification5Choice taxAcct;
    @XmlElement(name = "AddtlInf")
    protected PartyTextInformation2 addtlInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification30Choice }
     *     
     */
    public PartyIdentification30Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification30Choice }
     *     
     */
    public PartyIdentificationAndAccount15 setId(PartyIdentification30Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification2 }
     *     
     */
    public AlternatePartyIdentification2 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification2 }
     *     
     */
    public PartyIdentificationAndAccount15 setAltrnId(AlternatePartyIdentification2 value) {
        this.altrnId = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public PartyIdentificationAndAccount15 setCshAcct(CashAccountIdentification5Choice value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the chrgsAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getChrgsAcct() {
        return chrgsAcct;
    }

    /**
     * Sets the value of the chrgsAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public PartyIdentificationAndAccount15 setChrgsAcct(CashAccountIdentification5Choice value) {
        this.chrgsAcct = value;
        return this;
    }

    /**
     * Gets the value of the comssnAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getComssnAcct() {
        return comssnAcct;
    }

    /**
     * Sets the value of the comssnAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public PartyIdentificationAndAccount15 setComssnAcct(CashAccountIdentification5Choice value) {
        this.comssnAcct = value;
        return this;
    }

    /**
     * Gets the value of the taxAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getTaxAcct() {
        return taxAcct;
    }

    /**
     * Sets the value of the taxAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public PartyIdentificationAndAccount15 setTaxAcct(CashAccountIdentification5Choice value) {
        this.taxAcct = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTextInformation2 }
     *     
     */
    public PartyTextInformation2 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTextInformation2 }
     *     
     */
    public PartyIdentificationAndAccount15 setAddtlInf(PartyTextInformation2 value) {
        this.addtlInf = value;
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
