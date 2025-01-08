
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related to counterparty identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Counterparty45", propOrder = {
    "id",
    "ntr",
    "tradgCpcty",
    "drctnOrSd",
    "tradrLctn",
    "bookgLctn",
    "rptgXmptn"
})
public class Counterparty45 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification248Choice id;
    @XmlElement(name = "Ntr")
    protected CounterpartyTradeNature15Choice ntr;
    @XmlElement(name = "TradgCpcty")
    @XmlSchemaType(name = "string")
    protected TradingCapacity7Code tradgCpcty;
    @XmlElement(name = "DrctnOrSd")
    protected Direction4Choice drctnOrSd;
    @XmlElement(name = "TradrLctn")
    protected String tradrLctn;
    @XmlElement(name = "BookgLctn")
    protected String bookgLctn;
    @XmlElement(name = "RptgXmptn")
    protected ReportingExemption1 rptgXmptn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification248Choice }
     *     
     */
    public PartyIdentification248Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification248Choice }
     *     
     */
    public Counterparty45 setId(PartyIdentification248Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ntr property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyTradeNature15Choice }
     *     
     */
    public CounterpartyTradeNature15Choice getNtr() {
        return ntr;
    }

    /**
     * Sets the value of the ntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyTradeNature15Choice }
     *     
     */
    public Counterparty45 setNtr(CounterpartyTradeNature15Choice value) {
        this.ntr = value;
        return this;
    }

    /**
     * Gets the value of the tradgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingCapacity7Code }
     *     
     */
    public TradingCapacity7Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Sets the value of the tradgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingCapacity7Code }
     *     
     */
    public Counterparty45 setTradgCpcty(TradingCapacity7Code value) {
        this.tradgCpcty = value;
        return this;
    }

    /**
     * Gets the value of the drctnOrSd property.
     * 
     * @return
     *     possible object is
     *     {@link Direction4Choice }
     *     
     */
    public Direction4Choice getDrctnOrSd() {
        return drctnOrSd;
    }

    /**
     * Sets the value of the drctnOrSd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Direction4Choice }
     *     
     */
    public Counterparty45 setDrctnOrSd(Direction4Choice value) {
        this.drctnOrSd = value;
        return this;
    }

    /**
     * Gets the value of the tradrLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradrLctn() {
        return tradrLctn;
    }

    /**
     * Sets the value of the tradrLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Counterparty45 setTradrLctn(String value) {
        this.tradrLctn = value;
        return this;
    }

    /**
     * Gets the value of the bookgLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookgLctn() {
        return bookgLctn;
    }

    /**
     * Sets the value of the bookgLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Counterparty45 setBookgLctn(String value) {
        this.bookgLctn = value;
        return this;
    }

    /**
     * Gets the value of the rptgXmptn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingExemption1 }
     *     
     */
    public ReportingExemption1 getRptgXmptn() {
        return rptgXmptn;
    }

    /**
     * Sets the value of the rptgXmptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingExemption1 }
     *     
     */
    public Counterparty45 setRptgXmptn(ReportingExemption1 value) {
        this.rptgXmptn = value;
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
