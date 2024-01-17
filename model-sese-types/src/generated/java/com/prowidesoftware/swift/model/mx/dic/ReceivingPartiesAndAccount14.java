
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
@XmlType(name = "ReceivingPartiesAndAccount14", propOrder = {
    "rcvrsCtdnDtls",
    "rcvrsIntrmy1Dtls",
    "rcvrsIntrmy2Dtls",
    "rcvgAgtDtls",
    "sctiesSttlmSys",
    "plcOfSttlmDtls"
})
public class ReceivingPartiesAndAccount14 {

    @XmlElement(name = "RcvrsCtdnDtls")
    protected PartyIdentificationAndAccount124 rcvrsCtdnDtls;
    @XmlElement(name = "RcvrsIntrmy1Dtls")
    protected PartyIdentificationAndAccount124 rcvrsIntrmy1Dtls;
    @XmlElement(name = "RcvrsIntrmy2Dtls")
    protected PartyIdentificationAndAccount124 rcvrsIntrmy2Dtls;
    @XmlElement(name = "RcvgAgtDtls", required = true)
    protected PartyIdentificationAndAccount123 rcvgAgtDtls;
    @XmlElement(name = "SctiesSttlmSys")
    protected String sctiesSttlmSys;
    @XmlElement(name = "PlcOfSttlmDtls")
    protected PartyIdentification97 plcOfSttlmDtls;

    /**
     * Gets the value of the rcvrsCtdnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount124 }
     *     
     */
    public PartyIdentificationAndAccount124 getRcvrsCtdnDtls() {
        return rcvrsCtdnDtls;
    }

    /**
     * Sets the value of the rcvrsCtdnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount124 }
     *     
     */
    public ReceivingPartiesAndAccount14 setRcvrsCtdnDtls(PartyIdentificationAndAccount124 value) {
        this.rcvrsCtdnDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvrsIntrmy1Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount124 }
     *     
     */
    public PartyIdentificationAndAccount124 getRcvrsIntrmy1Dtls() {
        return rcvrsIntrmy1Dtls;
    }

    /**
     * Sets the value of the rcvrsIntrmy1Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount124 }
     *     
     */
    public ReceivingPartiesAndAccount14 setRcvrsIntrmy1Dtls(PartyIdentificationAndAccount124 value) {
        this.rcvrsIntrmy1Dtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvrsIntrmy2Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount124 }
     *     
     */
    public PartyIdentificationAndAccount124 getRcvrsIntrmy2Dtls() {
        return rcvrsIntrmy2Dtls;
    }

    /**
     * Sets the value of the rcvrsIntrmy2Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount124 }
     *     
     */
    public ReceivingPartiesAndAccount14 setRcvrsIntrmy2Dtls(PartyIdentificationAndAccount124 value) {
        this.rcvrsIntrmy2Dtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount123 }
     *     
     */
    public PartyIdentificationAndAccount123 getRcvgAgtDtls() {
        return rcvgAgtDtls;
    }

    /**
     * Sets the value of the rcvgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount123 }
     *     
     */
    public ReceivingPartiesAndAccount14 setRcvgAgtDtls(PartyIdentificationAndAccount123 value) {
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
    public ReceivingPartiesAndAccount14 setSctiesSttlmSys(String value) {
        this.sctiesSttlmSys = value;
        return this;
    }

    /**
     * Gets the value of the plcOfSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification97 }
     *     
     */
    public PartyIdentification97 getPlcOfSttlmDtls() {
        return plcOfSttlmDtls;
    }

    /**
     * Sets the value of the plcOfSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification97 }
     *     
     */
    public ReceivingPartiesAndAccount14 setPlcOfSttlmDtls(PartyIdentification97 value) {
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
