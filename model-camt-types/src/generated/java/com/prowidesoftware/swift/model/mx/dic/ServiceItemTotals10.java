
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
 * Specifies totals related to the invoice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceItemTotals10", propOrder = {
    "itmTp",
    "desc",
    "qty",
    "balCcy",
    "unitPric",
    "tax",
    "ttlInvcAmt"
})
public class ServiceItemTotals10 {

    @XmlElement(name = "ItmTp", required = true)
    protected String itmTp;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Qty", required = true)
    protected BigDecimal qty;
    @XmlElement(name = "BalCcy")
    protected String balCcy;
    @XmlElement(name = "UnitPric")
    protected ActiveCurrencyAndAmount unitPric;
    @XmlElement(name = "Tax")
    protected List<BillingTaxRecord2> tax;
    @XmlElement(name = "TtlInvcAmt", required = true)
    protected AmountAndForeignExchange1 ttlInvcAmt;

    /**
     * Gets the value of the itmTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmTp() {
        return itmTp;
    }

    /**
     * Sets the value of the itmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ServiceItemTotals10 setItmTp(String value) {
        this.itmTp = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ServiceItemTotals10 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ServiceItemTotals10 setQty(BigDecimal value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the balCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalCcy() {
        return balCcy;
    }

    /**
     * Sets the value of the balCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ServiceItemTotals10 setBalCcy(String value) {
        this.balCcy = value;
        return this;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ServiceItemTotals10 setUnitPric(ActiveCurrencyAndAmount value) {
        this.unitPric = value;
        return this;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingTaxRecord2 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<BillingTaxRecord2> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the ttlInvcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndForeignExchange1 }
     *     
     */
    public AmountAndForeignExchange1 getTtlInvcAmt() {
        return ttlInvcAmt;
    }

    /**
     * Sets the value of the ttlInvcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndForeignExchange1 }
     *     
     */
    public ServiceItemTotals10 setTtlInvcAmt(AmountAndForeignExchange1 value) {
        this.ttlInvcAmt = value;
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
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public ServiceItemTotals10 addTax(BillingTaxRecord2 tax) {
        getTax().add(tax);
        return this;
    }

}
