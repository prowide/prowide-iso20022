
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
 * Stock lending deadline assigned to a borrower of the stock.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BorrowerLendingDeadline2", propOrder = {
    "stockLndgDdln",
    "brrwr"
})
public class BorrowerLendingDeadline2 {

    @XmlElement(name = "StockLndgDdln", required = true)
    protected DateFormat34Choice stockLndgDdln;
    @XmlElement(name = "Brrwr", required = true)
    protected PartyIdentification103Choice brrwr;

    /**
     * Gets the value of the stockLndgDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat34Choice }
     *     
     */
    public DateFormat34Choice getStockLndgDdln() {
        return stockLndgDdln;
    }

    /**
     * Sets the value of the stockLndgDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat34Choice }
     *     
     */
    public BorrowerLendingDeadline2 setStockLndgDdln(DateFormat34Choice value) {
        this.stockLndgDdln = value;
        return this;
    }

    /**
     * Gets the value of the brrwr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification103Choice }
     *     
     */
    public PartyIdentification103Choice getBrrwr() {
        return brrwr;
    }

    /**
     * Sets the value of the brrwr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification103Choice }
     *     
     */
    public BorrowerLendingDeadline2 setBrrwr(PartyIdentification103Choice value) {
        this.brrwr = value;
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
