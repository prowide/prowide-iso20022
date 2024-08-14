
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The TradeLegNotification message is sent by the central counterparty (CCP) to a clearing member to report the trade that has been executed by the trading platform.
 * 
 * The message definition is intended for use with the ISO20022 Business Application Header.
 * 
 * Usage
 * The CCP reports both sides of the trade from the clearing member perspective. The CCP sends a message to the global clearing member of the seller and a message to the global clearing member of the buyer. Note: An individual clearing member only clear its own trades.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeLegNotificationV03", propOrder = {
    "clrMmb",
    "clrAcct",
    "dlvryAcct",
    "nonClrMmb",
    "clrDtls",
    "tradLegDtls",
    "sttlmDtls",
    "splmtryData"
})
public class TradeLegNotificationV03 {

    @XmlElement(name = "ClrMmb", required = true)
    protected PartyIdentification35Choice clrMmb;
    @XmlElement(name = "ClrAcct", required = true)
    protected SecuritiesAccount18 clrAcct;
    @XmlElement(name = "DlvryAcct")
    protected SecuritiesAccount19 dlvryAcct;
    @XmlElement(name = "NonClrMmb")
    protected PartyIdentificationAndAccount31 nonClrMmb;
    @XmlElement(name = "ClrDtls")
    protected Clearing4 clrDtls;
    @XmlElement(name = "TradLegDtls", required = true)
    protected TradeLeg8 tradLegDtls;
    @XmlElement(name = "SttlmDtls", required = true)
    protected Settlement1 sttlmDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public TradeLegNotificationV03 setClrMmb(PartyIdentification35Choice value) {
        this.clrMmb = value;
        return this;
    }

    /**
     * Gets the value of the clrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public SecuritiesAccount18 getClrAcct() {
        return clrAcct;
    }

    /**
     * Sets the value of the clrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public TradeLegNotificationV03 setClrAcct(SecuritiesAccount18 value) {
        this.clrAcct = value;
        return this;
    }

    /**
     * Gets the value of the dlvryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getDlvryAcct() {
        return dlvryAcct;
    }

    /**
     * Sets the value of the dlvryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public TradeLegNotificationV03 setDlvryAcct(SecuritiesAccount19 value) {
        this.dlvryAcct = value;
        return this;
    }

    /**
     * Gets the value of the nonClrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public PartyIdentificationAndAccount31 getNonClrMmb() {
        return nonClrMmb;
    }

    /**
     * Sets the value of the nonClrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount31 }
     *     
     */
    public TradeLegNotificationV03 setNonClrMmb(PartyIdentificationAndAccount31 value) {
        this.nonClrMmb = value;
        return this;
    }

    /**
     * Gets the value of the clrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Clearing4 }
     *     
     */
    public Clearing4 getClrDtls() {
        return clrDtls;
    }

    /**
     * Sets the value of the clrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clearing4 }
     *     
     */
    public TradeLegNotificationV03 setClrDtls(Clearing4 value) {
        this.clrDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradLegDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TradeLeg8 }
     *     
     */
    public TradeLeg8 getTradLegDtls() {
        return tradLegDtls;
    }

    /**
     * Sets the value of the tradLegDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeLeg8 }
     *     
     */
    public TradeLegNotificationV03 setTradLegDtls(TradeLeg8 value) {
        this.tradLegDtls = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Settlement1 }
     *     
     */
    public Settlement1 getSttlmDtls() {
        return sttlmDtls;
    }

    /**
     * Sets the value of the sttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Settlement1 }
     *     
     */
    public TradeLegNotificationV03 setSttlmDtls(Settlement1 value) {
        this.sttlmDtls = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
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

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public TradeLegNotificationV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
