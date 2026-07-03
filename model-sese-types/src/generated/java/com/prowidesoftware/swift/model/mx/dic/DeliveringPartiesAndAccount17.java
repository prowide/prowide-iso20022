
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
 * Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveringPartiesAndAccount17", propOrder = {
    "dlvrrDtls",
    "dlvrrsCtdnDtls",
    "dlvrrsIntrmy1Dtls",
    "dlvrrsIntrmy2Dtls",
    "dlvrgAgtDtls",
    "sctiesSttlmSys",
    "plcOfSttlmDtls"
})
public class DeliveringPartiesAndAccount17 {

    @XmlElement(name = "DlvrrDtls")
    protected InvestmentAccount65 dlvrrDtls;
    @XmlElement(name = "DlvrrsCtdnDtls")
    protected PartyIdentificationAndAccount157 dlvrrsCtdnDtls;
    @XmlElement(name = "DlvrrsIntrmy1Dtls")
    protected PartyIdentificationAndAccount157 dlvrrsIntrmy1Dtls;
    @XmlElement(name = "DlvrrsIntrmy2Dtls")
    protected PartyIdentificationAndAccount157 dlvrrsIntrmy2Dtls;
    @XmlElement(name = "DlvrgAgtDtls", required = true)
    protected PartyIdentificationAndAccount157 dlvrgAgtDtls;
    @XmlElement(name = "SctiesSttlmSys")
    protected String sctiesSttlmSys;
    @XmlElement(name = "PlcOfSttlmDtls")
    protected PartyIdentification123 plcOfSttlmDtls;

    /**
     * Gets the value of the dlvrrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount65 }
     *     
     */
    public InvestmentAccount65 getDlvrrDtls() {
        return dlvrrDtls;
    }

    /**
     * Sets the value of the dlvrrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount65 }
     *     
     */
    public DeliveringPartiesAndAccount17 setDlvrrDtls(InvestmentAccount65 value) {
        this.dlvrrDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrrsCtdnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount157 }
     *     
     */
    public PartyIdentificationAndAccount157 getDlvrrsCtdnDtls() {
        return dlvrrsCtdnDtls;
    }

    /**
     * Sets the value of the dlvrrsCtdnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount157 }
     *     
     */
    public DeliveringPartiesAndAccount17 setDlvrrsCtdnDtls(PartyIdentificationAndAccount157 value) {
        this.dlvrrsCtdnDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrrsIntrmy1Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount157 }
     *     
     */
    public PartyIdentificationAndAccount157 getDlvrrsIntrmy1Dtls() {
        return dlvrrsIntrmy1Dtls;
    }

    /**
     * Sets the value of the dlvrrsIntrmy1Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount157 }
     *     
     */
    public DeliveringPartiesAndAccount17 setDlvrrsIntrmy1Dtls(PartyIdentificationAndAccount157 value) {
        this.dlvrrsIntrmy1Dtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrrsIntrmy2Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount157 }
     *     
     */
    public PartyIdentificationAndAccount157 getDlvrrsIntrmy2Dtls() {
        return dlvrrsIntrmy2Dtls;
    }

    /**
     * Sets the value of the dlvrrsIntrmy2Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount157 }
     *     
     */
    public DeliveringPartiesAndAccount17 setDlvrrsIntrmy2Dtls(PartyIdentificationAndAccount157 value) {
        this.dlvrrsIntrmy2Dtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount157 }
     *     
     */
    public PartyIdentificationAndAccount157 getDlvrgAgtDtls() {
        return dlvrgAgtDtls;
    }

    /**
     * Sets the value of the dlvrgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount157 }
     *     
     */
    public DeliveringPartiesAndAccount17 setDlvrgAgtDtls(PartyIdentificationAndAccount157 value) {
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
    public DeliveringPartiesAndAccount17 setSctiesSttlmSys(String value) {
        this.sctiesSttlmSys = value;
        return this;
    }

    /**
     * Gets the value of the plcOfSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification123 }
     *     
     */
    public PartyIdentification123 getPlcOfSttlmDtls() {
        return plcOfSttlmDtls;
    }

    /**
     * Sets the value of the plcOfSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification123 }
     *     
     */
    public DeliveringPartiesAndAccount17 setPlcOfSttlmDtls(PartyIdentification123 value) {
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
