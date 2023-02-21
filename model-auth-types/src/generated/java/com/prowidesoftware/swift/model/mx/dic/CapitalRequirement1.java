
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Report of the breakdown of the components for the capital requirement for central counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapitalRequirement1", propOrder = {
    "wndgDwnOrRstrgRsk",
    "oprlAndLglRsk",
    "cdtRsk",
    "cntrPtyRsk",
    "mktRsk",
    "bizRsk",
    "ntfctnBffr"
})
public class CapitalRequirement1 {

    @XmlElement(name = "WndgDwnOrRstrgRsk", required = true)
    protected ActiveCurrencyAndAmount wndgDwnOrRstrgRsk;
    @XmlElement(name = "OprlAndLglRsk", required = true)
    protected ActiveCurrencyAndAmount oprlAndLglRsk;
    @XmlElement(name = "CdtRsk", required = true)
    protected ActiveCurrencyAndAmount cdtRsk;
    @XmlElement(name = "CntrPtyRsk", required = true)
    protected ActiveCurrencyAndAmount cntrPtyRsk;
    @XmlElement(name = "MktRsk", required = true)
    protected ActiveCurrencyAndAmount mktRsk;
    @XmlElement(name = "BizRsk", required = true)
    protected ActiveCurrencyAndAmount bizRsk;
    @XmlElement(name = "NtfctnBffr")
    protected BigDecimal ntfctnBffr;

    /**
     * Gets the value of the wndgDwnOrRstrgRsk property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getWndgDwnOrRstrgRsk() {
        return wndgDwnOrRstrgRsk;
    }

    /**
     * Sets the value of the wndgDwnOrRstrgRsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CapitalRequirement1 setWndgDwnOrRstrgRsk(ActiveCurrencyAndAmount value) {
        this.wndgDwnOrRstrgRsk = value;
        return this;
    }

    /**
     * Gets the value of the oprlAndLglRsk property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOprlAndLglRsk() {
        return oprlAndLglRsk;
    }

    /**
     * Sets the value of the oprlAndLglRsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CapitalRequirement1 setOprlAndLglRsk(ActiveCurrencyAndAmount value) {
        this.oprlAndLglRsk = value;
        return this;
    }

    /**
     * Gets the value of the cdtRsk property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCdtRsk() {
        return cdtRsk;
    }

    /**
     * Sets the value of the cdtRsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CapitalRequirement1 setCdtRsk(ActiveCurrencyAndAmount value) {
        this.cdtRsk = value;
        return this;
    }

    /**
     * Gets the value of the cntrPtyRsk property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCntrPtyRsk() {
        return cntrPtyRsk;
    }

    /**
     * Sets the value of the cntrPtyRsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CapitalRequirement1 setCntrPtyRsk(ActiveCurrencyAndAmount value) {
        this.cntrPtyRsk = value;
        return this;
    }

    /**
     * Gets the value of the mktRsk property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMktRsk() {
        return mktRsk;
    }

    /**
     * Sets the value of the mktRsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CapitalRequirement1 setMktRsk(ActiveCurrencyAndAmount value) {
        this.mktRsk = value;
        return this;
    }

    /**
     * Gets the value of the bizRsk property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getBizRsk() {
        return bizRsk;
    }

    /**
     * Sets the value of the bizRsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CapitalRequirement1 setBizRsk(ActiveCurrencyAndAmount value) {
        this.bizRsk = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnBffr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNtfctnBffr() {
        return ntfctnBffr;
    }

    /**
     * Sets the value of the ntfctnBffr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CapitalRequirement1 setNtfctnBffr(BigDecimal value) {
        this.ntfctnBffr = value;
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
