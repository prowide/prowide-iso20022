
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the penalties for a given party.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Penalty3", propOrder = {
    "ccy",
    "dt",
    "ptyId",
    "ctrPtyCSD",
    "csdDpstry",
    "aggtdAmt",
    "cshAcct",
    "cshSttlmDt",
    "cshPnltyId",
    "nbOfCtrPties",
    "pnltyPerCtrPty"
})
public class Penalty3 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "Dt")
    protected DateAndDateTime2Choice dt;
    @XmlElement(name = "PtyId", required = true)
    protected PenaltyPartyIdentification1 ptyId;
    @XmlElement(name = "CtrPtyCSD")
    protected PartyIdentification136 ctrPtyCSD;
    @XmlElement(name = "CSDDpstry")
    protected PartyIdentification136 csdDpstry;
    @XmlElement(name = "AggtdAmt")
    protected AggregatedPenaltyAmount1 aggtdAmt;
    @XmlElement(name = "CshAcct")
    protected AccountIdentification4Choice cshAcct;
    @XmlElement(name = "CshSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate cshSttlmDt;
    @XmlElement(name = "CshPnltyId")
    protected String cshPnltyId;
    @XmlElement(name = "NbOfCtrPties")
    protected BigDecimal nbOfCtrPties;
    @XmlElement(name = "PnltyPerCtrPty")
    protected List<PenaltyPerCounterparty3> pnltyPerCtrPty;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Penalty3 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public Penalty3 setDt(DateAndDateTime2Choice value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyPartyIdentification1 }
     *     
     */
    public PenaltyPartyIdentification1 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyPartyIdentification1 }
     *     
     */
    public Penalty3 setPtyId(PenaltyPartyIdentification1 value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyCSD property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getCtrPtyCSD() {
        return ctrPtyCSD;
    }

    /**
     * Sets the value of the ctrPtyCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public Penalty3 setCtrPtyCSD(PartyIdentification136 value) {
        this.ctrPtyCSD = value;
        return this;
    }

    /**
     * Gets the value of the csdDpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getCSDDpstry() {
        return csdDpstry;
    }

    /**
     * Sets the value of the csdDpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public Penalty3 setCSDDpstry(PartyIdentification136 value) {
        this.csdDpstry = value;
        return this;
    }

    /**
     * Gets the value of the aggtdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AggregatedPenaltyAmount1 }
     *     
     */
    public AggregatedPenaltyAmount1 getAggtdAmt() {
        return aggtdAmt;
    }

    /**
     * Sets the value of the aggtdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatedPenaltyAmount1 }
     *     
     */
    public Penalty3 setAggtdAmt(AggregatedPenaltyAmount1 value) {
        this.aggtdAmt = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public Penalty3 setCshAcct(AccountIdentification4Choice value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the cshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getCshSttlmDt() {
        return cshSttlmDt;
    }

    /**
     * Sets the value of the cshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Penalty3 setCshSttlmDt(LocalDate value) {
        this.cshSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the cshPnltyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshPnltyId() {
        return cshPnltyId;
    }

    /**
     * Sets the value of the cshPnltyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Penalty3 setCshPnltyId(String value) {
        this.cshPnltyId = value;
        return this;
    }

    /**
     * Gets the value of the nbOfCtrPties property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfCtrPties() {
        return nbOfCtrPties;
    }

    /**
     * Sets the value of the nbOfCtrPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Penalty3 setNbOfCtrPties(BigDecimal value) {
        this.nbOfCtrPties = value;
        return this;
    }

    /**
     * Gets the value of the pnltyPerCtrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pnltyPerCtrPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnltyPerCtrPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PenaltyPerCounterparty3 }
     * 
     * 
     * @return
     *     The value of the pnltyPerCtrPty property.
     */
    public List<PenaltyPerCounterparty3> getPnltyPerCtrPty() {
        if (pnltyPerCtrPty == null) {
            pnltyPerCtrPty = new ArrayList<>();
        }
        return this.pnltyPerCtrPty;
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
     * Adds a new item to the pnltyPerCtrPty list.
     * @see #getPnltyPerCtrPty()
     * 
     */
    public Penalty3 addPnltyPerCtrPty(PenaltyPerCounterparty3 pnltyPerCtrPty) {
        getPnltyPerCtrPty().add(pnltyPerCtrPty);
        return this;
    }

}
