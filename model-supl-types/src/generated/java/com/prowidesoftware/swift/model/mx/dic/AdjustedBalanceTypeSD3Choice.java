
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
 * Choice of balance types to provide transaction details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustedBalanceTypeSD3Choice", propOrder = {
    "stockLn",
    "repo"
})
public class AdjustedBalanceTypeSD3Choice {

    @XmlElement(name = "StockLn")
    protected SignedQuantityFormat4 stockLn;
    @XmlElement(name = "Repo")
    protected SignedQuantityFormat4 repo;

    /**
     * Gets the value of the stockLn property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getStockLn() {
        return stockLn;
    }

    /**
     * Sets the value of the stockLn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public AdjustedBalanceTypeSD3Choice setStockLn(SignedQuantityFormat4 value) {
        this.stockLn = value;
        return this;
    }

    /**
     * Gets the value of the repo property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public SignedQuantityFormat4 getRepo() {
        return repo;
    }

    /**
     * Sets the value of the repo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat4 }
     *     
     */
    public AdjustedBalanceTypeSD3Choice setRepo(SignedQuantityFormat4 value) {
        this.repo = value;
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
