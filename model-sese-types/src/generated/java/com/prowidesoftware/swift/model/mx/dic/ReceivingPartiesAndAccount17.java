
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
@XmlType(name = "ReceivingPartiesAndAccount17", propOrder = {
    "rcvrDtls",
    "rcvrsCtdnDtls",
    "rcvrsIntrmy1Dtls",
    "rcvrsIntrmy2Dtls",
    "rcvgAgtDtls",
    "sctiesSttlmSys",
    "plcOfSttlmDtls"
})
public class ReceivingPartiesAndAccount17 {

    @XmlElement(name = "RcvrDtls")
    protected InvestmentAccount65 rcvrDtls;
    @XmlElement(name = "RcvrsCtdnDtls")
    protected PartyIdentificationAndAccount157 rcvrsCtdnDtls;
    @XmlElement(name = "RcvrsIntrmy1Dtls")
    protected PartyIdentificationAndAccount157 rcvrsIntrmy1Dtls;
    @XmlElement(name = "RcvrsIntrmy2Dtls")
    protected PartyIdentificationAndAccount157 rcvrsIntrmy2Dtls;
    @XmlElement(name = "RcvgAgtDtls", required = true)
    protected PartyIdentificationAndAccount158 rcvgAgtDtls;
    @XmlElement(name = "SctiesSttlmSys")
    protected String sctiesSttlmSys;
    @XmlElement(name = "PlcOfSttlmDtls")
    protected PartyIdentification123 plcOfSttlmDtls;

    /**
     * Gets the value of the rcvrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount65 }
     *     
     */
    public InvestmentAccount65 getRcvrDtls() {
        return rcvrDtls;
    }

    /**
     * Sets the value of the rcvrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount65 }
     *     
     */
    public ReceivingPartiesAndAccount17 setRcvrDtls(InvestmentAccount65 value) {
        this.rcvrDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvrsCtdnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount157 }
     *     
     */
    public PartyIdentificationAndAccount157 getRcvrsCtdnDtls() {
        return rcvrsCtdnDtls;
    }

    /**
     * Sets the value of the rcvrsCtdnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount157 }
     *     
     */
    public ReceivingPartiesAndAccount17 setRcvrsCtdnDtls(PartyIdentificationAndAccount157 value) {
        this.rcvrsCtdnDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvrsIntrmy1Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount157 }
     *     
     */
    public PartyIdentificationAndAccount157 getRcvrsIntrmy1Dtls() {
        return rcvrsIntrmy1Dtls;
    }

    /**
     * Sets the value of the rcvrsIntrmy1Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount157 }
     *     
     */
    public ReceivingPartiesAndAccount17 setRcvrsIntrmy1Dtls(PartyIdentificationAndAccount157 value) {
        this.rcvrsIntrmy1Dtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvrsIntrmy2Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount157 }
     *     
     */
    public PartyIdentificationAndAccount157 getRcvrsIntrmy2Dtls() {
        return rcvrsIntrmy2Dtls;
    }

    /**
     * Sets the value of the rcvrsIntrmy2Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount157 }
     *     
     */
    public ReceivingPartiesAndAccount17 setRcvrsIntrmy2Dtls(PartyIdentificationAndAccount157 value) {
        this.rcvrsIntrmy2Dtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount158 }
     *     
     */
    public PartyIdentificationAndAccount158 getRcvgAgtDtls() {
        return rcvgAgtDtls;
    }

    /**
     * Sets the value of the rcvgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount158 }
     *     
     */
    public ReceivingPartiesAndAccount17 setRcvgAgtDtls(PartyIdentificationAndAccount158 value) {
        this.rcvgAgtDtls = value;
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
    public ReceivingPartiesAndAccount17 setSctiesSttlmSys(String value) {
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
    public ReceivingPartiesAndAccount17 setPlcOfSttlmDtls(PartyIdentification123 value) {
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
