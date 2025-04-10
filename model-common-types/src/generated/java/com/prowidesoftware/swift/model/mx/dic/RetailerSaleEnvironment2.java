
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * Environment of Retailer for this message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailerSaleEnvironment2", propOrder = {
    "saleCpblties",
    "ccy",
    "minAmtToDlvr",
    "maxCshBckAmt",
    "minSpltAmt",
    "dbtPrefrdFlg",
    "lltyHdlg"
})
public class RetailerSaleEnvironment2 {

    @XmlElement(name = "SaleCpblties")
    @XmlSchemaType(name = "string")
    protected List<SaleCapabilities1Code> saleCpblties;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "MinAmtToDlvr")
    protected BigDecimal minAmtToDlvr;
    @XmlElement(name = "MaxCshBckAmt")
    protected BigDecimal maxCshBckAmt;
    @XmlElement(name = "MinSpltAmt")
    protected BigDecimal minSpltAmt;
    @XmlElement(name = "DbtPrefrdFlg")
    protected Boolean dbtPrefrdFlg;
    @XmlElement(name = "LltyHdlg")
    @XmlSchemaType(name = "string")
    protected LoyaltyHandling1Code lltyHdlg;

    /**
     * Gets the value of the saleCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the saleCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaleCapabilities1Code }
     * 
     * 
     * @return
     *     The value of the saleCpblties property.
     */
    public List<SaleCapabilities1Code> getSaleCpblties() {
        if (saleCpblties == null) {
            saleCpblties = new ArrayList<>();
        }
        return this.saleCpblties;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RetailerSaleEnvironment2 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the minAmtToDlvr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAmtToDlvr() {
        return minAmtToDlvr;
    }

    /**
     * Sets the value of the minAmtToDlvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RetailerSaleEnvironment2 setMinAmtToDlvr(BigDecimal value) {
        this.minAmtToDlvr = value;
        return this;
    }

    /**
     * Gets the value of the maxCshBckAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxCshBckAmt() {
        return maxCshBckAmt;
    }

    /**
     * Sets the value of the maxCshBckAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RetailerSaleEnvironment2 setMaxCshBckAmt(BigDecimal value) {
        this.maxCshBckAmt = value;
        return this;
    }

    /**
     * Gets the value of the minSpltAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinSpltAmt() {
        return minSpltAmt;
    }

    /**
     * Sets the value of the minSpltAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RetailerSaleEnvironment2 setMinSpltAmt(BigDecimal value) {
        this.minSpltAmt = value;
        return this;
    }

    /**
     * Gets the value of the dbtPrefrdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDbtPrefrdFlg() {
        return dbtPrefrdFlg;
    }

    /**
     * Sets the value of the dbtPrefrdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RetailerSaleEnvironment2 setDbtPrefrdFlg(Boolean value) {
        this.dbtPrefrdFlg = value;
        return this;
    }

    /**
     * Gets the value of the lltyHdlg property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyHandling1Code }
     *     
     */
    public LoyaltyHandling1Code getLltyHdlg() {
        return lltyHdlg;
    }

    /**
     * Sets the value of the lltyHdlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyHandling1Code }
     *     
     */
    public RetailerSaleEnvironment2 setLltyHdlg(LoyaltyHandling1Code value) {
        this.lltyHdlg = value;
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
     * Adds a new item to the saleCpblties list.
     * @see #getSaleCpblties()
     * 
     */
    public RetailerSaleEnvironment2 addSaleCpblties(SaleCapabilities1Code saleCpblties) {
        getSaleCpblties().add(saleCpblties);
        return this;
    }

}
