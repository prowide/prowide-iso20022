
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
@XmlType(name = "ReceivingPartiesAndAccount1", propOrder = {
    "rcvrDtls",
    "rcvrsCtdnDtls",
    "rcvrsIntrmyDtls",
    "rcvgAgtDtls",
    "sctiesSttlmSys",
    "plcOfSttlmDtls"
})
public class ReceivingPartiesAndAccount1 {

    @XmlElement(name = "RcvrDtls", required = true)
    protected InvestmentAccount11 rcvrDtls;
    @XmlElement(name = "RcvrsCtdnDtls")
    protected PartyIdentificationAndAccount2 rcvrsCtdnDtls;
    @XmlElement(name = "RcvrsIntrmyDtls")
    protected PartyIdentificationAndAccount2 rcvrsIntrmyDtls;
    @XmlElement(name = "RcvgAgtDtls", required = true)
    protected PartyIdentificationAndAccount2 rcvgAgtDtls;
    @XmlElement(name = "SctiesSttlmSys")
    protected String sctiesSttlmSys;
    @XmlElement(name = "PlcOfSttlmDtls", required = true)
    protected PartyIdentificationAndAccount2 plcOfSttlmDtls;

    /**
     * Gets the value of the rcvrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount11 }
     *     
     */
    public InvestmentAccount11 getRcvrDtls() {
        return rcvrDtls;
    }

    /**
     * Sets the value of the rcvrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount11 }
     *     
     */
    public ReceivingPartiesAndAccount1 setRcvrDtls(InvestmentAccount11 value) {
        this.rcvrDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvrsCtdnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount2 }
     *     
     */
    public PartyIdentificationAndAccount2 getRcvrsCtdnDtls() {
        return rcvrsCtdnDtls;
    }

    /**
     * Sets the value of the rcvrsCtdnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount2 }
     *     
     */
    public ReceivingPartiesAndAccount1 setRcvrsCtdnDtls(PartyIdentificationAndAccount2 value) {
        this.rcvrsCtdnDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvrsIntrmyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount2 }
     *     
     */
    public PartyIdentificationAndAccount2 getRcvrsIntrmyDtls() {
        return rcvrsIntrmyDtls;
    }

    /**
     * Sets the value of the rcvrsIntrmyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount2 }
     *     
     */
    public ReceivingPartiesAndAccount1 setRcvrsIntrmyDtls(PartyIdentificationAndAccount2 value) {
        this.rcvrsIntrmyDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount2 }
     *     
     */
    public PartyIdentificationAndAccount2 getRcvgAgtDtls() {
        return rcvgAgtDtls;
    }

    /**
     * Sets the value of the rcvgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount2 }
     *     
     */
    public ReceivingPartiesAndAccount1 setRcvgAgtDtls(PartyIdentificationAndAccount2 value) {
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
    public ReceivingPartiesAndAccount1 setSctiesSttlmSys(String value) {
        this.sctiesSttlmSys = value;
        return this;
    }

    /**
     * Gets the value of the plcOfSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount2 }
     *     
     */
    public PartyIdentificationAndAccount2 getPlcOfSttlmDtls() {
        return plcOfSttlmDtls;
    }

    /**
     * Sets the value of the plcOfSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount2 }
     *     
     */
    public ReceivingPartiesAndAccount1 setPlcOfSttlmDtls(PartyIdentificationAndAccount2 value) {
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
