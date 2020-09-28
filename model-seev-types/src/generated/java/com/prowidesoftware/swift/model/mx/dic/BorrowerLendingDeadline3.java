
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "BorrowerLendingDeadline3", propOrder = {
    "stockLndgDdln",
    "brrwr"
})
public class BorrowerLendingDeadline3 {

    @XmlElement(name = "StockLndgDdln", required = true)
    protected DateFormat43Choice stockLndgDdln;
    @XmlElement(name = "Brrwr", required = true)
    protected PartyIdentification92Choice brrwr;

    /**
     * Gets the value of the stockLndgDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getStockLndgDdln() {
        return stockLndgDdln;
    }

    /**
     * Sets the value of the stockLndgDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public BorrowerLendingDeadline3 setStockLndgDdln(DateFormat43Choice value) {
        this.stockLndgDdln = value;
        return this;
    }

    /**
     * Gets the value of the brrwr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification92Choice }
     *     
     */
    public PartyIdentification92Choice getBrrwr() {
        return brrwr;
    }

    /**
     * Sets the value of the brrwr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification92Choice }
     *     
     */
    public BorrowerLendingDeadline3 setBrrwr(PartyIdentification92Choice value) {
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
