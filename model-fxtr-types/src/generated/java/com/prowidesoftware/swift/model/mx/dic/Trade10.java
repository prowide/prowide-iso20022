
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
 * Details of the foreign exchange trade including Spot\Forward\NDF that is captured.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trade10", propOrder = {
    "exctnPric",
    "lastQty",
    "sttlmTp",
    "sttlmDt",
    "valtnRate",
    "fwdPts",
    "clctdCtrPtyCcyLastQty",
    "valDt",
    "rskAmt",
    "sctyId",
    "fxgCcy",
    "fxgDt",
    "optnInd",
    "dltaInd",
    "assoctdTradRef"
})
public class Trade10 {

    @XmlElement(name = "ExctnPric", required = true)
    protected ActiveCurrencyAnd13DecimalAmount exctnPric;
    @XmlElement(name = "LastQty", required = true)
    protected ActiveCurrencyAndAmount lastQty;
    @XmlElement(name = "SttlmTp", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementDate8Code sttlmTp;
    @XmlElement(name = "SttlmDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate sttlmDt;
    @XmlElement(name = "ValtnRate", required = true)
    protected AgreedRate3 valtnRate;
    @XmlElement(name = "FwdPts")
    protected BigDecimal fwdPts;
    @XmlElement(name = "ClctdCtrPtyCcyLastQty", required = true)
    protected ActiveCurrencyAndAmount clctdCtrPtyCcyLastQty;
    @XmlElement(name = "ValDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate valDt;
    @XmlElement(name = "RskAmt", required = true)
    protected ActiveCurrencyAndAmount rskAmt;
    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification18 sctyId;
    @XmlElement(name = "FxgCcy")
    protected String fxgCcy;
    @XmlElement(name = "FxgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate fxgDt;
    @XmlElement(name = "OptnInd")
    protected Boolean optnInd;
    @XmlElement(name = "DltaInd")
    protected Boolean dltaInd;
    @XmlElement(name = "AssoctdTradRef")
    protected List<String> assoctdTradRef;

    /**
     * Gets the value of the exctnPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getExctnPric() {
        return exctnPric;
    }

    /**
     * Sets the value of the exctnPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public Trade10 setExctnPric(ActiveCurrencyAnd13DecimalAmount value) {
        this.exctnPric = value;
        return this;
    }

    /**
     * Gets the value of the lastQty property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLastQty() {
        return lastQty;
    }

    /**
     * Sets the value of the lastQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Trade10 setLastQty(ActiveCurrencyAndAmount value) {
        this.lastQty = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate8Code }
     *     
     */
    public SettlementDate8Code getSttlmTp() {
        return sttlmTp;
    }

    /**
     * Sets the value of the sttlmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate8Code }
     *     
     */
    public Trade10 setSttlmTp(SettlementDate8Code value) {
        this.sttlmTp = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade10 setSttlmDt(LocalDate value) {
        this.sttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the valtnRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate3 }
     *     
     */
    public AgreedRate3 getValtnRate() {
        return valtnRate;
    }

    /**
     * Sets the value of the valtnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate3 }
     *     
     */
    public Trade10 setValtnRate(AgreedRate3 value) {
        this.valtnRate = value;
        return this;
    }

    /**
     * Gets the value of the fwdPts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFwdPts() {
        return fwdPts;
    }

    /**
     * Sets the value of the fwdPts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Trade10 setFwdPts(BigDecimal value) {
        this.fwdPts = value;
        return this;
    }

    /**
     * Gets the value of the clctdCtrPtyCcyLastQty property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getClctdCtrPtyCcyLastQty() {
        return clctdCtrPtyCcyLastQty;
    }

    /**
     * Sets the value of the clctdCtrPtyCcyLastQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Trade10 setClctdCtrPtyCcyLastQty(ActiveCurrencyAndAmount value) {
        this.clctdCtrPtyCcyLastQty = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade10 setValDt(LocalDate value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the rskAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRskAmt() {
        return rskAmt;
    }

    /**
     * Sets the value of the rskAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Trade10 setRskAmt(ActiveCurrencyAndAmount value) {
        this.rskAmt = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification18 }
     *     
     */
    public SecurityIdentification18 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification18 }
     *     
     */
    public Trade10 setSctyId(SecurityIdentification18 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the fxgCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxgCcy() {
        return fxgCcy;
    }

    /**
     * Sets the value of the fxgCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade10 setFxgCcy(String value) {
        this.fxgCcy = value;
        return this;
    }

    /**
     * Gets the value of the fxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFxgDt() {
        return fxgDt;
    }

    /**
     * Sets the value of the fxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Trade10 setFxgDt(LocalDate value) {
        this.fxgDt = value;
        return this;
    }

    /**
     * Gets the value of the optnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptnInd() {
        return optnInd;
    }

    /**
     * Sets the value of the optnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Trade10 setOptnInd(Boolean value) {
        this.optnInd = value;
        return this;
    }

    /**
     * Gets the value of the dltaInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDltaInd() {
        return dltaInd;
    }

    /**
     * Sets the value of the dltaInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Trade10 setDltaInd(Boolean value) {
        this.dltaInd = value;
        return this;
    }

    /**
     * Gets the value of the assoctdTradRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assoctdTradRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssoctdTradRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the assoctdTradRef property.
     */
    public List<String> getAssoctdTradRef() {
        if (assoctdTradRef == null) {
            assoctdTradRef = new ArrayList<>();
        }
        return this.assoctdTradRef;
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
     * Adds a new item to the assoctdTradRef list.
     * @see #getAssoctdTradRef()
     * 
     */
    public Trade10 addAssoctdTradRef(String assoctdTradRef) {
        getAssoctdTradRef().add(assoctdTradRef);
        return this;
    }

}
