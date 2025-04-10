
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Intention to transfer an ownership of a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order2", propOrder = {
    "tp",
    "tradgCpcty",
    "tradOrgtnDt",
    "cstmrCpcty",
    "plcOfExctn",
    "qtyDtls"
})
public class Order2 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected OrderType1Code tp;
    @XmlElement(name = "TradgCpcty")
    @XmlSchemaType(name = "string")
    protected TradingCapacity3Code tradgCpcty;
    @XmlElement(name = "TradOrgtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime tradOrgtnDt;
    @XmlElement(name = "CstmrCpcty")
    @XmlSchemaType(name = "string")
    protected CustomerOrderCapacity1Code cstmrCpcty;
    @XmlElement(name = "PlcOfExctn")
    protected MarketIdentification1 plcOfExctn;
    @XmlElement(name = "QtyDtls")
    protected OrderQuantity1 qtyDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType1Code }
     *     
     */
    public OrderType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType1Code }
     *     
     */
    public Order2 setTp(OrderType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the tradgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link TradingCapacity3Code }
     *     
     */
    public TradingCapacity3Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Sets the value of the tradgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingCapacity3Code }
     *     
     */
    public Order2 setTradgCpcty(TradingCapacity3Code value) {
        this.tradgCpcty = value;
        return this;
    }

    /**
     * Gets the value of the tradOrgtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getTradOrgtnDt() {
        return tradOrgtnDt;
    }

    /**
     * Sets the value of the tradOrgtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Order2 setTradOrgtnDt(OffsetDateTime value) {
        this.tradOrgtnDt = value;
        return this;
    }

    /**
     * Gets the value of the cstmrCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrderCapacity1Code }
     *     
     */
    public CustomerOrderCapacity1Code getCstmrCpcty() {
        return cstmrCpcty;
    }

    /**
     * Sets the value of the cstmrCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrderCapacity1Code }
     *     
     */
    public Order2 setCstmrCpcty(CustomerOrderCapacity1Code value) {
        this.cstmrCpcty = value;
        return this;
    }

    /**
     * Gets the value of the plcOfExctn property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification1 }
     *     
     */
    public MarketIdentification1 getPlcOfExctn() {
        return plcOfExctn;
    }

    /**
     * Sets the value of the plcOfExctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification1 }
     *     
     */
    public Order2 setPlcOfExctn(MarketIdentification1 value) {
        this.plcOfExctn = value;
        return this;
    }

    /**
     * Gets the value of the qtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantity1 }
     *     
     */
    public OrderQuantity1 getQtyDtls() {
        return qtyDtls;
    }

    /**
     * Sets the value of the qtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantity1 }
     *     
     */
    public Order2 setQtyDtls(OrderQuantity1 value) {
        this.qtyDtls = value;
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
