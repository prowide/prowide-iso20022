
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Parties used for acting parties that apply either to the whole message or to individual sides.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmationPartyDetails16", propOrder = {
    "id",
    "sfkpgAcct",
    "cshDtls",
    "altrnId",
    "prcgId",
    "addtlInf",
    "ptyCpcty",
    "invstrPrtcnAssoctnMmbsh"
})
public class ConfirmationPartyDetails16 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification240Choice id;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount35 sfkpgAcct;
    @XmlElement(name = "CshDtls")
    protected AccountIdentification55Choice cshDtls;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification8 altrnId;
    @XmlElement(name = "PrcgId")
    protected String prcgId;
    @XmlElement(name = "AddtlInf")
    protected PartyTextInformation5 addtlInf;
    @XmlElement(name = "PtyCpcty")
    protected TradingPartyCapacity3Choice ptyCpcty;
    @XmlElement(name = "InvstrPrtcnAssoctnMmbsh")
    protected Boolean invstrPrtcnAssoctnMmbsh;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification240Choice }
     *     
     */
    public PartyIdentification240Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification240Choice }
     *     
     */
    public ConfirmationPartyDetails16 setId(PartyIdentification240Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount35 }
     *     
     */
    public SecuritiesAccount35 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount35 }
     *     
     */
    public ConfirmationPartyDetails16 setSfkpgAcct(SecuritiesAccount35 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the cshDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification55Choice }
     *     
     */
    public AccountIdentification55Choice getCshDtls() {
        return cshDtls;
    }

    /**
     * Sets the value of the cshDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification55Choice }
     *     
     */
    public ConfirmationPartyDetails16 setCshDtls(AccountIdentification55Choice value) {
        this.cshDtls = value;
        return this;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification8 }
     *     
     */
    public AlternatePartyIdentification8 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification8 }
     *     
     */
    public ConfirmationPartyDetails16 setAltrnId(AlternatePartyIdentification8 value) {
        this.altrnId = value;
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
    public ConfirmationPartyDetails16 setPrcgId(String value) {
        this.prcgId = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTextInformation5 }
     *     
     */
    public PartyTextInformation5 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTextInformation5 }
     *     
     */
    public ConfirmationPartyDetails16 setAddtlInf(PartyTextInformation5 value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the ptyCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingPartyCapacity3Choice }
     *     
     */
    public TradingPartyCapacity3Choice getPtyCpcty() {
        return ptyCpcty;
    }

    /**
     * Sets the value of the ptyCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingPartyCapacity3Choice }
     *     
     */
    public ConfirmationPartyDetails16 setPtyCpcty(TradingPartyCapacity3Choice value) {
        this.ptyCpcty = value;
        return this;
    }

    /**
     * Gets the value of the invstrPrtcnAssoctnMmbsh property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvstrPrtcnAssoctnMmbsh() {
        return invstrPrtcnAssoctnMmbsh;
    }

    /**
     * Sets the value of the invstrPrtcnAssoctnMmbsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ConfirmationPartyDetails16 setInvstrPrtcnAssoctnMmbsh(Boolean value) {
        this.invstrPrtcnAssoctnMmbsh = value;
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
