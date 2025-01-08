
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
 * Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveringPartiesAndAccount8", propOrder = {
    "dlvrrDtls",
    "dlvrrsCtdnDtls",
    "dlvrrsIntrmyDtls",
    "dlvrgAgtDtls",
    "sctiesSttlmSys",
    "plcOfSttlmDtls"
})
public class DeliveringPartiesAndAccount8 {

    @XmlElement(name = "DlvrrDtls")
    protected InvestmentAccount24 dlvrrDtls;
    @XmlElement(name = "DlvrrsCtdnDtls")
    protected PartyIdentificationAndAccount5 dlvrrsCtdnDtls;
    @XmlElement(name = "DlvrrsIntrmyDtls")
    protected PartyIdentificationAndAccount5 dlvrrsIntrmyDtls;
    @XmlElement(name = "DlvrgAgtDtls", required = true)
    protected PartyIdentificationAndAccount4 dlvrgAgtDtls;
    @XmlElement(name = "SctiesSttlmSys")
    protected String sctiesSttlmSys;
    @XmlElement(name = "PlcOfSttlmDtls")
    protected PartyIdentification21 plcOfSttlmDtls;

    /**
     * Gets the value of the dlvrrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount24 }
     *     
     */
    public InvestmentAccount24 getDlvrrDtls() {
        return dlvrrDtls;
    }

    /**
     * Sets the value of the dlvrrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount24 }
     *     
     */
    public DeliveringPartiesAndAccount8 setDlvrrDtls(InvestmentAccount24 value) {
        this.dlvrrDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrrsCtdnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount5 }
     *     
     */
    public PartyIdentificationAndAccount5 getDlvrrsCtdnDtls() {
        return dlvrrsCtdnDtls;
    }

    /**
     * Sets the value of the dlvrrsCtdnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount5 }
     *     
     */
    public DeliveringPartiesAndAccount8 setDlvrrsCtdnDtls(PartyIdentificationAndAccount5 value) {
        this.dlvrrsCtdnDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrrsIntrmyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount5 }
     *     
     */
    public PartyIdentificationAndAccount5 getDlvrrsIntrmyDtls() {
        return dlvrrsIntrmyDtls;
    }

    /**
     * Sets the value of the dlvrrsIntrmyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount5 }
     *     
     */
    public DeliveringPartiesAndAccount8 setDlvrrsIntrmyDtls(PartyIdentificationAndAccount5 value) {
        this.dlvrrsIntrmyDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount4 }
     *     
     */
    public PartyIdentificationAndAccount4 getDlvrgAgtDtls() {
        return dlvrgAgtDtls;
    }

    /**
     * Sets the value of the dlvrgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount4 }
     *     
     */
    public DeliveringPartiesAndAccount8 setDlvrgAgtDtls(PartyIdentificationAndAccount4 value) {
        this.dlvrgAgtDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesSttlmSys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesSttlmSys() {
        return sctiesSttlmSys;
    }

    /**
     * Sets the value of the sctiesSttlmSys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DeliveringPartiesAndAccount8 setSctiesSttlmSys(String value) {
        this.sctiesSttlmSys = value;
        return this;
    }

    /**
     * Gets the value of the plcOfSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification21 }
     *     
     */
    public PartyIdentification21 getPlcOfSttlmDtls() {
        return plcOfSttlmDtls;
    }

    /**
     * Sets the value of the plcOfSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification21 }
     *     
     */
    public DeliveringPartiesAndAccount8 setPlcOfSttlmDtls(PartyIdentification21 value) {
        this.plcOfSttlmDtls = value;
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
