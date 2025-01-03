
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
@XmlType(name = "QuantityBreakdown70", propOrder = {
    "lotNb",
    "lotQty",
    "lotDtTm",
    "lotPric",
    "tpOfPric",
    "acctBaseCcyAmts",
    "instrmCcyAmts",
    "altrnRptgCcyAmts"
})
public class QuantityBreakdown70 {

    @XmlElement(name = "LotNb")
    protected GenericIdentification39 lotNb;
    @XmlElement(name = "LotQty")
    protected Balance23 lotQty;
    @XmlElement(name = "LotDtTm")
    protected DateAndDateTime2Choice lotDtTm;
    @XmlElement(name = "LotPric")
    protected Price3 lotPric;
    @XmlElement(name = "TpOfPric")
    protected TypeOfPrice32Choice tpOfPric;
    @XmlElement(name = "AcctBaseCcyAmts")
    protected BalanceAmounts6 acctBaseCcyAmts;
    @XmlElement(name = "InstrmCcyAmts")
    protected BalanceAmounts6 instrmCcyAmts;
    @XmlElement(name = "AltrnRptgCcyAmts")
    protected BalanceAmounts6 altrnRptgCcyAmts;

    /**
     * Gets the value of the lotNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification39 }
     *     
     */
    public GenericIdentification39 getLotNb() {
        return lotNb;
    }

    /**
     * Sets the value of the lotNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification39 }
     *     
     */
    public QuantityBreakdown70 setLotNb(GenericIdentification39 value) {
        this.lotNb = value;
        return this;
    }

    /**
     * Gets the value of the lotQty property.
     * 
     * @return
     *     possible object is
     *     {@link Balance23 }
     *     
     */
    public Balance23 getLotQty() {
        return lotQty;
    }

    /**
     * Sets the value of the lotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance23 }
     *     
     */
    public QuantityBreakdown70 setLotQty(Balance23 value) {
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
    public QuantityBreakdown70 setLotDtTm(DateAndDateTime2Choice value) {
        this.lotDtTm = value;
        return this;
    }

    /**
     * Gets the value of the lotPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price3 }
     *     
     */
    public Price3 getLotPric() {
        return lotPric;
    }

    /**
     * Sets the value of the lotPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price3 }
     *     
     */
    public QuantityBreakdown70 setLotPric(Price3 value) {
        this.lotPric = value;
        return this;
    }

    /**
     * Gets the value of the tpOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice32Choice }
     *     
     */
    public TypeOfPrice32Choice getTpOfPric() {
        return tpOfPric;
    }

    /**
     * Sets the value of the tpOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice32Choice }
     *     
     */
    public QuantityBreakdown70 setTpOfPric(TypeOfPrice32Choice value) {
        this.tpOfPric = value;
        return this;
    }

    /**
     * Gets the value of the acctBaseCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts6 }
     *     
     */
    public BalanceAmounts6 getAcctBaseCcyAmts() {
        return acctBaseCcyAmts;
    }

    /**
     * Sets the value of the acctBaseCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts6 }
     *     
     */
    public QuantityBreakdown70 setAcctBaseCcyAmts(BalanceAmounts6 value) {
        this.acctBaseCcyAmts = value;
        return this;
    }

    /**
     * Gets the value of the instrmCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts6 }
     *     
     */
    public BalanceAmounts6 getInstrmCcyAmts() {
        return instrmCcyAmts;
    }

    /**
     * Sets the value of the instrmCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts6 }
     *     
     */
    public QuantityBreakdown70 setInstrmCcyAmts(BalanceAmounts6 value) {
        this.instrmCcyAmts = value;
        return this;
    }

    /**
     * Gets the value of the altrnRptgCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts6 }
     *     
     */
    public BalanceAmounts6 getAltrnRptgCcyAmts() {
        return altrnRptgCcyAmts;
    }

    /**
     * Sets the value of the altrnRptgCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts6 }
     *     
     */
    public QuantityBreakdown70 setAltrnRptgCcyAmts(BalanceAmounts6 value) {
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
