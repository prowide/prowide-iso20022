
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
 * Details of breakdown of a quantity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityBreakdown58", propOrder = {
    "lotNb",
    "lotQty",
    "lotDtTm",
    "lotPric",
    "tpOfPric",
    "acctBaseCcyAmts",
    "instrmCcyAmts",
    "altrnRptgCcyAmts"
})
public class QuantityBreakdown58 {

    @XmlElement(name = "LotNb")
    protected GenericIdentification37 lotNb;
    @XmlElement(name = "LotQty")
    protected Balance16 lotQty;
    @XmlElement(name = "LotDtTm")
    protected DateAndDateTime2Choice lotDtTm;
    @XmlElement(name = "LotPric")
    protected Price7 lotPric;
    @XmlElement(name = "TpOfPric")
    protected TypeOfPrice29Choice tpOfPric;
    @XmlElement(name = "AcctBaseCcyAmts")
    protected BalanceAmounts2 acctBaseCcyAmts;
    @XmlElement(name = "InstrmCcyAmts")
    protected BalanceAmounts2 instrmCcyAmts;
    @XmlElement(name = "AltrnRptgCcyAmts")
    protected BalanceAmounts2 altrnRptgCcyAmts;

    /**
     * Gets the value of the lotNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification37 }
     *     
     */
    public GenericIdentification37 getLotNb() {
        return lotNb;
    }

    /**
     * Sets the value of the lotNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification37 }
     *     
     */
    public QuantityBreakdown58 setLotNb(GenericIdentification37 value) {
        this.lotNb = value;
        return this;
    }

    /**
     * Gets the value of the lotQty property.
     * 
     * @return
     *     possible object is
     *     {@link Balance16 }
     *     
     */
    public Balance16 getLotQty() {
        return lotQty;
    }

    /**
     * Sets the value of the lotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance16 }
     *     
     */
    public QuantityBreakdown58 setLotQty(Balance16 value) {
        this.lotQty = value;
        return this;
    }

    /**
     * Gets the value of the lotDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getLotDtTm() {
        return lotDtTm;
    }

    /**
     * Sets the value of the lotDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public QuantityBreakdown58 setLotDtTm(DateAndDateTime2Choice value) {
        this.lotDtTm = value;
        return this;
    }

    /**
     * Gets the value of the lotPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price7 }
     *     
     */
    public Price7 getLotPric() {
        return lotPric;
    }

    /**
     * Sets the value of the lotPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price7 }
     *     
     */
    public QuantityBreakdown58 setLotPric(Price7 value) {
        this.lotPric = value;
        return this;
    }

    /**
     * Gets the value of the tpOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice29Choice }
     *     
     */
    public TypeOfPrice29Choice getTpOfPric() {
        return tpOfPric;
    }

    /**
     * Sets the value of the tpOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice29Choice }
     *     
     */
    public QuantityBreakdown58 setTpOfPric(TypeOfPrice29Choice value) {
        this.tpOfPric = value;
        return this;
    }

    /**
     * Gets the value of the acctBaseCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts2 }
     *     
     */
    public BalanceAmounts2 getAcctBaseCcyAmts() {
        return acctBaseCcyAmts;
    }

    /**
     * Sets the value of the acctBaseCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts2 }
     *     
     */
    public QuantityBreakdown58 setAcctBaseCcyAmts(BalanceAmounts2 value) {
        this.acctBaseCcyAmts = value;
        return this;
    }

    /**
     * Gets the value of the instrmCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts2 }
     *     
     */
    public BalanceAmounts2 getInstrmCcyAmts() {
        return instrmCcyAmts;
    }

    /**
     * Sets the value of the instrmCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts2 }
     *     
     */
    public QuantityBreakdown58 setInstrmCcyAmts(BalanceAmounts2 value) {
        this.instrmCcyAmts = value;
        return this;
    }

    /**
     * Gets the value of the altrnRptgCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts2 }
     *     
     */
    public BalanceAmounts2 getAltrnRptgCcyAmts() {
        return altrnRptgCcyAmts;
    }

    /**
     * Sets the value of the altrnRptgCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts2 }
     *     
     */
    public QuantityBreakdown58 setAltrnRptgCcyAmts(BalanceAmounts2 value) {
        this.altrnRptgCcyAmts = value;
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
