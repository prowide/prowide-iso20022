
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
@XmlType(name = "SystemPartyModification2Choice", propOrder = {
    "sysPtyDt",
    "ptyId",
    "ptyNm",
    "ctctDtls",
    "techAdr",
    "ptyAdr",
    "resTp",
    "lckSts",
    "sysRstrctn",
    "mktSpcfcAttr"
})
public class SystemPartyModification2Choice {

    @XmlElement(name = "SysPtyDt")
    protected SystemParty2 sysPtyDt;
    @XmlElement(name = "PtyId")
    protected SystemPartyIdentification10 ptyId;
    @XmlElement(name = "PtyNm")
    protected PartyName3 ptyNm;
    @XmlElement(name = "CtctDtls")
    protected Contact5 ctctDtls;
    @XmlElement(name = "TechAdr")
    protected TechnicalIdentification2Choice techAdr;
    @XmlElement(name = "PtyAdr")
    protected PostalAddress25 ptyAdr;
    @XmlElement(name = "ResTp")
    @XmlSchemaType(name = "string")
    protected ResidenceType1Code resTp;
    @XmlElement(name = "LckSts")
    protected PartyLockStatus1 lckSts;
    @XmlElement(name = "SysRstrctn")
    protected SystemRestriction1 sysRstrctn;
    @XmlElement(name = "MktSpcfcAttr")
    protected MarketSpecificAttribute1 mktSpcfcAttr;

    /**
     * Gets the value of the sysPtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link SystemParty2 }
     *     
     */
    public SystemParty2 getSysPtyDt() {
        return sysPtyDt;
    }

    /**
     * Sets the value of the sysPtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemParty2 }
     *     
     */
    public SystemPartyModification2Choice setSysPtyDt(SystemParty2 value) {
        this.sysPtyDt = value;
        return this;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification10 }
     *     
     */
    public SystemPartyIdentification10 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification10 }
     *     
     */
    public SystemPartyModification2Choice setPtyId(SystemPartyIdentification10 value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the ptyNm property.
     * 
     * @return
     *     possible object is
     *     {@link PartyName3 }
     *     
     */
    public PartyName3 getPtyNm() {
        return ptyNm;
    }

    /**
     * Sets the value of the ptyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyName3 }
     *     
     */
    public SystemPartyModification2Choice setPtyNm(PartyName3 value) {
        this.ptyNm = value;
        return this;
    }

    /**
     * Gets the value of the ctctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Contact5 }
     *     
     */
    public Contact5 getCtctDtls() {
        return ctctDtls;
    }

    /**
     * Sets the value of the ctctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact5 }
     *     
     */
    public SystemPartyModification2Choice setCtctDtls(Contact5 value) {
        this.ctctDtls = value;
        return this;
    }

    /**
     * Gets the value of the techAdr property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalIdentification2Choice }
     *     
     */
    public TechnicalIdentification2Choice getTechAdr() {
        return techAdr;
    }

    /**
     * Sets the value of the techAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalIdentification2Choice }
     *     
     */
    public SystemPartyModification2Choice setTechAdr(TechnicalIdentification2Choice value) {
        this.techAdr = value;
        return this;
    }

    /**
     * Gets the value of the ptyAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress25 }
     *     
     */
    public PostalAddress25 getPtyAdr() {
        return ptyAdr;
    }

    /**
     * Sets the value of the ptyAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress25 }
     *     
     */
    public SystemPartyModification2Choice setPtyAdr(PostalAddress25 value) {
        this.ptyAdr = value;
        return this;
    }

    /**
     * Gets the value of the resTp property.
     * 
     * @return
     *     possible object is
     *     {@link ResidenceType1Code }
     *     
     */
    public ResidenceType1Code getResTp() {
        return resTp;
    }

    /**
     * Sets the value of the resTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidenceType1Code }
     *     
     */
    public SystemPartyModification2Choice setResTp(ResidenceType1Code value) {
        this.resTp = value;
        return this;
    }

    /**
     * Gets the value of the lckSts property.
     * 
     * @return
     *     possible object is
     *     {@link PartyLockStatus1 }
     *     
     */
    public PartyLockStatus1 getLckSts() {
        return lckSts;
    }

    /**
     * Sets the value of the lckSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyLockStatus1 }
     *     
     */
    public SystemPartyModification2Choice setLckSts(PartyLockStatus1 value) {
        this.lckSts = value;
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
    public SystemPartyModification2Choice setSysRstrctn(SystemRestriction1 value) {
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
    public SystemPartyModification2Choice setMktSpcfcAttr(MarketSpecificAttribute1 value) {
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
