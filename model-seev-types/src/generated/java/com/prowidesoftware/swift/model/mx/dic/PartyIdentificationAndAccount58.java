
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
 * Provides information about identification and account of the party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount58", propOrder = {
    "id",
    "cshAcct",
    "prcgId",
    "addtlInf",
    "altrnId"
})
public class PartyIdentificationAndAccount58 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification55Choice id;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification6Choice cshAcct;
    @XmlElement(name = "PrcgId")
    protected String prcgId;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification3 altrnId;

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
    public PartyIdentificationAndAccount58 setId(PartyIdentification55Choice value) {
        this.id = value;
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
    public PartyIdentificationAndAccount58 setCshAcct(CashAccountIdentification6Choice value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the prcgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcgId() {
        return prcgId;
    }

    /**
     * Sets the value of the prcgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentificationAndAccount58 setPrcgId(String value) {
        this.prcgId = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentificationAndAccount58 setAddtlInf(String value) {
        this.addtlInf = value;
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
    public PartyIdentificationAndAccount58 setAltrnId(AlternatePartyIdentification3 value) {
        this.altrnId = value;
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
