
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
 * Parties used for acting parties that apply either to the whole message or to individual sides.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmationPartyDetails6", propOrder = {
    "id",
    "sfkpgAcct",
    "cshDtls",
    "altrnId",
    "prcgId",
    "addtlInf",
    "ptyCpcty",
    "invstrPrtcnAssoctnMmbsh"
})
public class ConfirmationPartyDetails6 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification32Choice id;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount3 sfkpgAcct;
    @XmlElement(name = "CshDtls")
    protected AccountIdentification3Choice cshDtls;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification5 altrnId;
    @XmlElement(name = "PrcgId")
    protected String prcgId;
    @XmlElement(name = "AddtlInf")
    protected PartyTextInformation5 addtlInf;
    @XmlElement(name = "PtyCpcty")
    protected TradingPartyCapacity2Choice ptyCpcty;
    @XmlElement(name = "InvstrPrtcnAssoctnMmbsh")
    protected Boolean invstrPrtcnAssoctnMmbsh;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification32Choice }
     *     
     */
    public PartyIdentification32Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification32Choice }
     *     
     */
    public ConfirmationPartyDetails6 setId(PartyIdentification32Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount3 }
     *     
     */
    public SecuritiesAccount3 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount3 }
     *     
     */
    public ConfirmationPartyDetails6 setSfkpgAcct(SecuritiesAccount3 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the cshDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification3Choice }
     *     
     */
    public AccountIdentification3Choice getCshDtls() {
        return cshDtls;
    }

    /**
     * Sets the value of the cshDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification3Choice }
     *     
     */
    public ConfirmationPartyDetails6 setCshDtls(AccountIdentification3Choice value) {
        this.cshDtls = value;
        return this;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification5 }
     *     
     */
    public AlternatePartyIdentification5 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification5 }
     *     
     */
    public ConfirmationPartyDetails6 setAltrnId(AlternatePartyIdentification5 value) {
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
    public ConfirmationPartyDetails6 setPrcgId(String value) {
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
    public ConfirmationPartyDetails6 setAddtlInf(PartyTextInformation5 value) {
        this.addtlInf = value;
        return this;
    }

    /**
     * Gets the value of the ptyCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingPartyCapacity2Choice }
     *     
     */
    public TradingPartyCapacity2Choice getPtyCpcty() {
        return ptyCpcty;
    }

    /**
     * Sets the value of the ptyCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingPartyCapacity2Choice }
     *     
     */
    public ConfirmationPartyDetails6 setPtyCpcty(TradingPartyCapacity2Choice value) {
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
    public ConfirmationPartyDetails6 setInvstrPrtcnAssoctnMmbsh(Boolean value) {
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
