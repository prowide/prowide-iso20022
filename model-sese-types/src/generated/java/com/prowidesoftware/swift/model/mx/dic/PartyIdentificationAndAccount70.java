
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
@XmlType(name = "PartyIdentificationAndAccount70", propOrder = {
    "id",
    "altrnId",
    "cshAcct",
    "chrgsAcct",
    "comssnAcct",
    "taxAcct",
    "addtlInf"
})
public class PartyIdentificationAndAccount70 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification55Choice id;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification3 altrnId;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification6Choice cshAcct;
    @XmlElement(name = "ChrgsAcct")
    protected CashAccountIdentification6Choice chrgsAcct;
    @XmlElement(name = "ComssnAcct")
    protected CashAccountIdentification6Choice comssnAcct;
    @XmlElement(name = "TaxAcct")
    protected CashAccountIdentification6Choice taxAcct;
    @XmlElement(name = "AddtlInf")
    protected PartyTextInformation4 addtlInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification55Choice }
     *     
     */
    public PartyIdentification55Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification55Choice }
     *     
     */
    public PartyIdentificationAndAccount70 setId(PartyIdentification55Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification3 }
     *     
     */
    public AlternatePartyIdentification3 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification3 }
     *     
     */
    public PartyIdentificationAndAccount70 setAltrnId(AlternatePartyIdentification3 value) {
        this.altrnId = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public CashAccountIdentification6Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public PartyIdentificationAndAccount70 setCshAcct(CashAccountIdentification6Choice value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the chrgsAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public CashAccountIdentification6Choice getChrgsAcct() {
        return chrgsAcct;
    }

    /**
     * Sets the value of the chrgsAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public PartyIdentificationAndAccount70 setChrgsAcct(CashAccountIdentification6Choice value) {
        this.chrgsAcct = value;
        return this;
    }

    /**
     * Gets the value of the comssnAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public CashAccountIdentification6Choice getComssnAcct() {
        return comssnAcct;
    }

    /**
     * Sets the value of the comssnAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public PartyIdentificationAndAccount70 setComssnAcct(CashAccountIdentification6Choice value) {
        this.comssnAcct = value;
        return this;
    }

    /**
     * Gets the value of the taxAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public CashAccountIdentification6Choice getTaxAcct() {
        return taxAcct;
    }

    /**
     * Sets the value of the taxAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification6Choice }
     *     
     */
    public PartyIdentificationAndAccount70 setTaxAcct(CashAccountIdentification6Choice value) {
        this.taxAcct = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTextInformation4 }
     *     
     */
    public PartyTextInformation4 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTextInformation4 }
     *     
     */
    public PartyIdentificationAndAccount70 setAddtlInf(PartyTextInformation4 value) {
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
