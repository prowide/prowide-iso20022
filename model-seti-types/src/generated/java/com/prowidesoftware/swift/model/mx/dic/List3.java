
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the details for negotiating and trading a large number of securities contained in or comprising a portfolio. 
 * 
 * One example is index arbitrage, which consists in the purchase or sale of a basket of stocks in conjunction with the sale or purchase of
 * a derivative product (for example index futures) to profit from price differences between the basket and the derivative product. 
 * 
 * Other examples include liquidation of EFP (Exchange for Physical) stock positions, portfolio realignment and portfolio liquidation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "List3", propOrder = {
    "listId",
    "nbOfStrks",
    "ttlNbOfStrks",
    "strkPricDtls"
})
public class List3 {

    @XmlElement(name = "ListId", required = true)
    protected String listId;
    @XmlElement(name = "NbOfStrks", required = true)
    protected BigDecimal nbOfStrks;
    @XmlElement(name = "TtlNbOfStrks", required = true)
    protected BigDecimal ttlNbOfStrks;
    @XmlElement(name = "StrkPricDtls", required = true)
    protected List<ListStrikePriceDetails1> strkPricDtls;

    /**
     * Gets the value of the listId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListId() {
        return listId;
    }

    /**
     * Sets the value of the listId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public List3 setListId(String value) {
        this.listId = value;
        return this;
    }

    /**
     * Gets the value of the nbOfStrks property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfStrks() {
        return nbOfStrks;
    }

    /**
     * Sets the value of the nbOfStrks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public List3 setNbOfStrks(BigDecimal value) {
        this.nbOfStrks = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfStrks property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfStrks() {
        return ttlNbOfStrks;
    }

    /**
     * Sets the value of the ttlNbOfStrks property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public List3 setTtlNbOfStrks(BigDecimal value) {
        this.ttlNbOfStrks = value;
        return this;
    }

    /**
     * Gets the value of the strkPricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strkPricDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrkPricDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListStrikePriceDetails1 }
     * 
     * 
     */
    public List<ListStrikePriceDetails1> getStrkPricDtls() {
        if (strkPricDtls == null) {
            strkPricDtls = new ArrayList<ListStrikePriceDetails1>();
        }
        return this.strkPricDtls;
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
     * Adds a new item to the strkPricDtls list.
     * @see #getStrkPricDtls()
     * 
     */
    public List3 addStrkPricDtls(ListStrikePriceDetails1 strkPricDtls) {
        getStrkPricDtls().add(strkPricDtls);
        return this;
    }

}
