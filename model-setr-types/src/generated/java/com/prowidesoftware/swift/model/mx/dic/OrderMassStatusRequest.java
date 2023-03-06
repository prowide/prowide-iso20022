
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
 * An instructing party, eg, an investment manager, sends the OrderMassStatusRequest message to an executing party, eg, a broker, to request the status for orders matching criteria specified within the request.
 * Usage
 * No additional information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderMassStatusRequest", propOrder = {
    "id",
    "stsOfAllOrdrs",
    "stsPerSd",
    "stsForTradgSsn",
    "stsForFinInstrm",
    "stsForUndrlygInstrm",
    "stsForSctyTp",
    "stsForPdct",
    "stsForAcct",
    "stsForPty",
    "stsForCshPties",
    "stsForRcvgPties",
    "stsForDlvrgPties",
    "stsForOthrBizPties"
})
public class OrderMassStatusRequest {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "StsOfAllOrdrs")
    protected OrderSide1 stsOfAllOrdrs;
    @XmlElement(name = "StsPerSd")
    protected OrderSide1 stsPerSd;
    @XmlElement(name = "StsForTradgSsn")
    protected TradingSession1 stsForTradgSsn;
    @XmlElement(name = "StsForFinInstrm")
    protected SecurityIdentification7 stsForFinInstrm;
    @XmlElement(name = "StsForUndrlygInstrm")
    protected List<SecurityIdentification7> stsForUndrlygInstrm;
    @XmlElement(name = "StsForSctyTp")
    protected FinancialInstrumentClassification1 stsForSctyTp;
    @XmlElement(name = "StsForPdct")
    protected FinancialInstrumentProductType1Choice stsForPdct;
    @XmlElement(name = "StsForAcct")
    protected SecuritiesAccount2 stsForAcct;
    @XmlElement(name = "StsForPty")
    protected Intermediary14 stsForPty;
    @XmlElement(name = "StsForCshPties")
    protected CashParties1 stsForCshPties;
    @XmlElement(name = "StsForRcvgPties")
    protected SettlementParties3 stsForRcvgPties;
    @XmlElement(name = "StsForDlvrgPties")
    protected SettlementParties3 stsForDlvrgPties;
    @XmlElement(name = "StsForOthrBizPties")
    protected OtherParties1 stsForOthrBizPties;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public OrderMassStatusRequest setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the stsOfAllOrdrs property.
     * 
     * @return
     *     possible object is
     *     {@link OrderSide1 }
     *     
     */
    public OrderSide1 getStsOfAllOrdrs() {
        return stsOfAllOrdrs;
    }

    /**
     * Sets the value of the stsOfAllOrdrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderSide1 }
     *     
     */
    public OrderMassStatusRequest setStsOfAllOrdrs(OrderSide1 value) {
        this.stsOfAllOrdrs = value;
        return this;
    }

    /**
     * Gets the value of the stsPerSd property.
     * 
     * @return
     *     possible object is
     *     {@link OrderSide1 }
     *     
     */
    public OrderSide1 getStsPerSd() {
        return stsPerSd;
    }

    /**
     * Sets the value of the stsPerSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderSide1 }
     *     
     */
    public OrderMassStatusRequest setStsPerSd(OrderSide1 value) {
        this.stsPerSd = value;
        return this;
    }

    /**
     * Gets the value of the stsForTradgSsn property.
     * 
     * @return
     *     possible object is
     *     {@link TradingSession1 }
     *     
     */
    public TradingSession1 getStsForTradgSsn() {
        return stsForTradgSsn;
    }

    /**
     * Sets the value of the stsForTradgSsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingSession1 }
     *     
     */
    public OrderMassStatusRequest setStsForTradgSsn(TradingSession1 value) {
        this.stsForTradgSsn = value;
        return this;
    }

    /**
     * Gets the value of the stsForFinInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getStsForFinInstrm() {
        return stsForFinInstrm;
    }

    /**
     * Sets the value of the stsForFinInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public OrderMassStatusRequest setStsForFinInstrm(SecurityIdentification7 value) {
        this.stsForFinInstrm = value;
        return this;
    }

    /**
     * Gets the value of the stsForUndrlygInstrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stsForUndrlygInstrm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsForUndrlygInstrm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification7 }
     * 
     * 
     */
    public List<SecurityIdentification7> getStsForUndrlygInstrm() {
        if (stsForUndrlygInstrm == null) {
            stsForUndrlygInstrm = new ArrayList<SecurityIdentification7>();
        }
        return this.stsForUndrlygInstrm;
    }

    /**
     * Gets the value of the stsForSctyTp property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentClassification1 }
     *     
     */
    public FinancialInstrumentClassification1 getStsForSctyTp() {
        return stsForSctyTp;
    }

    /**
     * Sets the value of the stsForSctyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentClassification1 }
     *     
     */
    public OrderMassStatusRequest setStsForSctyTp(FinancialInstrumentClassification1 value) {
        this.stsForSctyTp = value;
        return this;
    }

    /**
     * Gets the value of the stsForPdct property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentProductType1Choice }
     *     
     */
    public FinancialInstrumentProductType1Choice getStsForPdct() {
        return stsForPdct;
    }

    /**
     * Sets the value of the stsForPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentProductType1Choice }
     *     
     */
    public OrderMassStatusRequest setStsForPdct(FinancialInstrumentProductType1Choice value) {
        this.stsForPdct = value;
        return this;
    }

    /**
     * Gets the value of the stsForAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount2 }
     *     
     */
    public SecuritiesAccount2 getStsForAcct() {
        return stsForAcct;
    }

    /**
     * Sets the value of the stsForAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount2 }
     *     
     */
    public OrderMassStatusRequest setStsForAcct(SecuritiesAccount2 value) {
        this.stsForAcct = value;
        return this;
    }

    /**
     * Gets the value of the stsForPty property.
     * 
     * @return
     *     possible object is
     *     {@link Intermediary14 }
     *     
     */
    public Intermediary14 getStsForPty() {
        return stsForPty;
    }

    /**
     * Sets the value of the stsForPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Intermediary14 }
     *     
     */
    public OrderMassStatusRequest setStsForPty(Intermediary14 value) {
        this.stsForPty = value;
        return this;
    }

    /**
     * Gets the value of the stsForCshPties property.
     * 
     * @return
     *     possible object is
     *     {@link CashParties1 }
     *     
     */
    public CashParties1 getStsForCshPties() {
        return stsForCshPties;
    }

    /**
     * Sets the value of the stsForCshPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashParties1 }
     *     
     */
    public OrderMassStatusRequest setStsForCshPties(CashParties1 value) {
        this.stsForCshPties = value;
        return this;
    }

    /**
     * Gets the value of the stsForRcvgPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties3 }
     *     
     */
    public SettlementParties3 getStsForRcvgPties() {
        return stsForRcvgPties;
    }

    /**
     * Sets the value of the stsForRcvgPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties3 }
     *     
     */
    public OrderMassStatusRequest setStsForRcvgPties(SettlementParties3 value) {
        this.stsForRcvgPties = value;
        return this;
    }

    /**
     * Gets the value of the stsForDlvrgPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties3 }
     *     
     */
    public SettlementParties3 getStsForDlvrgPties() {
        return stsForDlvrgPties;
    }

    /**
     * Sets the value of the stsForDlvrgPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties3 }
     *     
     */
    public OrderMassStatusRequest setStsForDlvrgPties(SettlementParties3 value) {
        this.stsForDlvrgPties = value;
        return this;
    }

    /**
     * Gets the value of the stsForOthrBizPties property.
     * 
     * @return
     *     possible object is
     *     {@link OtherParties1 }
     *     
     */
    public OtherParties1 getStsForOthrBizPties() {
        return stsForOthrBizPties;
    }

    /**
     * Sets the value of the stsForOthrBizPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherParties1 }
     *     
     */
    public OrderMassStatusRequest setStsForOthrBizPties(OtherParties1 value) {
        this.stsForOthrBizPties = value;
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

    /**
     * Adds a new item to the stsForUndrlygInstrm list.
     * @see #getStsForUndrlygInstrm()
     * 
     */
    public OrderMassStatusRequest addStsForUndrlygInstrm(SecurityIdentification7 stsForUndrlygInstrm) {
        getStsForUndrlygInstrm().add(stsForUndrlygInstrm);
        return this;
    }

}
