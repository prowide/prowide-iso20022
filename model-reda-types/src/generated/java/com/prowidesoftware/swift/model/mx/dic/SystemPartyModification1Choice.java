
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
 * Identifies which information are involved by a modification request for party reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemPartyModification1Choice", propOrder = {
    "sysPty",
    "ptyId",
    "ptyNm",
    "techAdr",
    "ptyAdr",
    "sysRstrctn",
    "mktSpcfcAttr"
})
public class SystemPartyModification1Choice {

    @XmlElement(name = "SysPty")
    protected SystemParty2 sysPty;
    @XmlElement(name = "PtyId")
    protected SystemPartyIdentification2 ptyId;
    @XmlElement(name = "PtyNm")
    protected PartyName2 ptyNm;
    @XmlElement(name = "TechAdr")
    protected TechnicalIdentification1Choice techAdr;
    @XmlElement(name = "PtyAdr")
    protected PostalAddress9 ptyAdr;
    @XmlElement(name = "SysRstrctn")
    protected SystemRestriction1 sysRstrctn;
    @XmlElement(name = "MktSpcfcAttr")
    protected MarketSpecificAttribute1 mktSpcfcAttr;

    /**
     * Gets the value of the sysPty property.
     * 
     * @return
     *     possible object is
     *     {@link SystemParty2 }
     *     
     */
    public SystemParty2 getSysPty() {
        return sysPty;
    }

    /**
     * Sets the value of the sysPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemParty2 }
     *     
     */
    public SystemPartyModification1Choice setSysPty(SystemParty2 value) {
        this.sysPty = value;
        return this;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2 }
     *     
     */
    public SystemPartyIdentification2 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2 }
     *     
     */
    public SystemPartyModification1Choice setPtyId(SystemPartyIdentification2 value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the ptyNm property.
     * 
     * @return
     *     possible object is
     *     {@link PartyName2 }
     *     
     */
    public PartyName2 getPtyNm() {
        return ptyNm;
    }

    /**
     * Sets the value of the ptyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyName2 }
     *     
     */
    public SystemPartyModification1Choice setPtyNm(PartyName2 value) {
        this.ptyNm = value;
        return this;
    }

    /**
     * Gets the value of the techAdr property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalIdentification1Choice }
     *     
     */
    public TechnicalIdentification1Choice getTechAdr() {
        return techAdr;
    }

    /**
     * Sets the value of the techAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalIdentification1Choice }
     *     
     */
    public SystemPartyModification1Choice setTechAdr(TechnicalIdentification1Choice value) {
        this.techAdr = value;
        return this;
    }

    /**
     * Gets the value of the ptyAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress9 }
     *     
     */
    public PostalAddress9 getPtyAdr() {
        return ptyAdr;
    }

    /**
     * Sets the value of the ptyAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress9 }
     *     
     */
    public SystemPartyModification1Choice setPtyAdr(PostalAddress9 value) {
        this.ptyAdr = value;
        return this;
    }

    /**
     * Gets the value of the sysRstrctn property.
     * 
     * @return
     *     possible object is
     *     {@link SystemRestriction1 }
     *     
     */
    public SystemRestriction1 getSysRstrctn() {
        return sysRstrctn;
    }

    /**
     * Sets the value of the sysRstrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemRestriction1 }
     *     
     */
    public SystemPartyModification1Choice setSysRstrctn(SystemRestriction1 value) {
        this.sysRstrctn = value;
        return this;
    }

    /**
     * Gets the value of the mktSpcfcAttr property.
     * 
     * @return
     *     possible object is
     *     {@link MarketSpecificAttribute1 }
     *     
     */
    public MarketSpecificAttribute1 getMktSpcfcAttr() {
        return mktSpcfcAttr;
    }

    /**
     * Sets the value of the mktSpcfcAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketSpecificAttribute1 }
     *     
     */
    public SystemPartyModification1Choice setMktSpcfcAttr(MarketSpecificAttribute1 value) {
        this.mktSpcfcAttr = value;
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
