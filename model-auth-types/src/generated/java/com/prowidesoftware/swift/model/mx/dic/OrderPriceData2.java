
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
 * Prices related to an order in financial instruments.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderPriceData2", propOrder = {
    "lmtPric",
    "stopPric",
    "addtlLmtPric",
    "pggdPric",
    "ccyScndLeg"
})
public class OrderPriceData2 {

    @XmlElement(name = "LmtPric")
    protected SecuritiesTransactionPrice2Choice lmtPric;
    @XmlElement(name = "StopPric")
    protected SecuritiesTransactionPrice2Choice stopPric;
    @XmlElement(name = "AddtlLmtPric")
    protected SecuritiesTransactionPrice2Choice addtlLmtPric;
    @XmlElement(name = "PggdPric")
    protected SecuritiesTransactionPrice2Choice pggdPric;
    @XmlElement(name = "CcyScndLeg")
    protected String ccyScndLeg;

    /**
     * Gets the value of the lmtPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public SecuritiesTransactionPrice2Choice getLmtPric() {
        return lmtPric;
    }

    /**
     * Sets the value of the lmtPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public OrderPriceData2 setLmtPric(SecuritiesTransactionPrice2Choice value) {
        this.lmtPric = value;
        return this;
    }

    /**
     * Gets the value of the stopPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public SecuritiesTransactionPrice2Choice getStopPric() {
        return stopPric;
    }

    /**
     * Sets the value of the stopPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public OrderPriceData2 setStopPric(SecuritiesTransactionPrice2Choice value) {
        this.stopPric = value;
        return this;
    }

    /**
     * Gets the value of the addtlLmtPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public SecuritiesTransactionPrice2Choice getAddtlLmtPric() {
        return addtlLmtPric;
    }

    /**
     * Sets the value of the addtlLmtPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public OrderPriceData2 setAddtlLmtPric(SecuritiesTransactionPrice2Choice value) {
        this.addtlLmtPric = value;
        return this;
    }

    /**
     * Gets the value of the pggdPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public SecuritiesTransactionPrice2Choice getPggdPric() {
        return pggdPric;
    }

    /**
     * Sets the value of the pggdPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public OrderPriceData2 setPggdPric(SecuritiesTransactionPrice2Choice value) {
        this.pggdPric = value;
        return this;
    }

    /**
     * Gets the value of the ccyScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyScndLeg() {
        return ccyScndLeg;
    }

    /**
     * Sets the value of the ccyScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderPriceData2 setCcyScndLeg(String value) {
        this.ccyScndLeg = value;
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
