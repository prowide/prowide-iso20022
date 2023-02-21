
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Specifies the penalties for a given party.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Penalty1", propOrder = {
    "ccy",
    "dt",
    "ptyId",
    "aggtdAmt",
    "nbOfCtrPties",
    "pnltyPerCtrPty"
})
public class Penalty1 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "Dt")
    protected DateAndDateTime2Choice dt;
    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification193 ptyId;
    @XmlElement(name = "AggtdAmt")
    protected AggregatedPenaltyAmount1 aggtdAmt;
    @XmlElement(name = "NbOfCtrPties")
    protected BigDecimal nbOfCtrPties;
    @XmlElement(name = "PnltyPerCtrPty")
    protected List<PenaltyPerCounterparty1> pnltyPerCtrPty;

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
    public Penalty1 setCcy(String value) {
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
    public Penalty1 setDt(DateAndDateTime2Choice value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification193 }
     *     
     */
    public PartyIdentification193 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification193 }
     *     
     */
    public Penalty1 setPtyId(PartyIdentification193 value) {
        this.ptyId = value;
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
    public Penalty1 setAggtdAmt(AggregatedPenaltyAmount1 value) {
        this.aggtdAmt = value;
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
    public Penalty1 setNbOfCtrPties(BigDecimal value) {
        this.nbOfCtrPties = value;
        return this;
    }

    /**
     * Gets the value of the pnltyPerCtrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnltyPerCtrPty property.
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
     * {@link PenaltyPerCounterparty1 }
     * 
     * 
     */
    public List<PenaltyPerCounterparty1> getPnltyPerCtrPty() {
        if (pnltyPerCtrPty == null) {
            pnltyPerCtrPty = new ArrayList<PenaltyPerCounterparty1>();
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
    public Penalty1 addPnltyPerCtrPty(PenaltyPerCounterparty1 pnltyPerCtrPty) {
        getPnltyPerCtrPty().add(pnltyPerCtrPty);
        return this;
    }

}
