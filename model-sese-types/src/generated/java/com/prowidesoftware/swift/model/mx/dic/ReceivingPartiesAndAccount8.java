
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
@XmlType(name = "ReceivingPartiesAndAccount8", propOrder = {
    "rcvrDtls",
    "rcvrsCtdnDtls",
    "rcvrsIntrmyDtls",
    "rcvgAgtDtls",
    "sctiesSttlmSys",
    "plcOfSttlmDtls"
})
public class ReceivingPartiesAndAccount8 {

    @XmlElement(name = "RcvrDtls")
    protected InvestmentAccount24 rcvrDtls;
    @XmlElement(name = "RcvrsCtdnDtls")
    protected PartyIdentificationAndAccount5 rcvrsCtdnDtls;
    @XmlElement(name = "RcvrsIntrmyDtls")
    protected PartyIdentificationAndAccount5 rcvrsIntrmyDtls;
    @XmlElement(name = "RcvgAgtDtls", required = true)
    protected PartyIdentificationAndAccount4 rcvgAgtDtls;
    @XmlElement(name = "SctiesSttlmSys")
    protected String sctiesSttlmSys;
    @XmlElement(name = "PlcOfSttlmDtls")
    protected PartyIdentification21 plcOfSttlmDtls;

    /**
     * Gets the value of the rcvrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount24 }
     *     
     */
    public InvestmentAccount24 getRcvrDtls() {
        return rcvrDtls;
    }

    /**
     * Sets the value of the rcvrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount24 }
     *     
     */
    public ReceivingPartiesAndAccount8 setRcvrDtls(InvestmentAccount24 value) {
        this.rcvrDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvrsCtdnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount5 }
     *     
     */
    public PartyIdentificationAndAccount5 getRcvrsCtdnDtls() {
        return rcvrsCtdnDtls;
    }

    /**
     * Sets the value of the rcvrsCtdnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount5 }
     *     
     */
    public ReceivingPartiesAndAccount8 setRcvrsCtdnDtls(PartyIdentificationAndAccount5 value) {
        this.rcvrsCtdnDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvrsIntrmyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount5 }
     *     
     */
    public PartyIdentificationAndAccount5 getRcvrsIntrmyDtls() {
        return rcvrsIntrmyDtls;
    }

    /**
     * Sets the value of the rcvrsIntrmyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount5 }
     *     
     */
    public ReceivingPartiesAndAccount8 setRcvrsIntrmyDtls(PartyIdentificationAndAccount5 value) {
        this.rcvrsIntrmyDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount4 }
     *     
     */
    public PartyIdentificationAndAccount4 getRcvgAgtDtls() {
        return rcvgAgtDtls;
    }

    /**
     * Sets the value of the rcvgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount4 }
     *     
     */
    public ReceivingPartiesAndAccount8 setRcvgAgtDtls(PartyIdentificationAndAccount4 value) {
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
    public ReceivingPartiesAndAccount8 setSctiesSttlmSys(String value) {
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
    public ReceivingPartiesAndAccount8 setPlcOfSttlmDtls(PartyIdentification21 value) {
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
