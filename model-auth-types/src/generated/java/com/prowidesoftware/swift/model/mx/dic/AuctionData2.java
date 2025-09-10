
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
 * Trading phase and indicative auction price and volume.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuctionData2", propOrder = {
    "tradgPhs",
    "indctvAuctnPric",
    "indctvAuctnVol"
})
public class AuctionData2 {

    @XmlElement(name = "TradgPhs")
    protected String tradgPhs;
    @XmlElement(name = "IndctvAuctnPric")
    protected SecuritiesTransactionPrice21Choice indctvAuctnPric;
    @XmlElement(name = "IndctvAuctnVol")
    protected FinancialInstrumentQuantity25Choice indctvAuctnVol;

    /**
     * Gets the value of the tradgPhs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgPhs() {
        return tradgPhs;
    }

    /**
     * Sets the value of the tradgPhs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AuctionData2 setTradgPhs(String value) {
        this.tradgPhs = value;
        return this;
    }

    /**
     * Gets the value of the indctvAuctnPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice21Choice }
     *     
     */
    public SecuritiesTransactionPrice21Choice getIndctvAuctnPric() {
        return indctvAuctnPric;
    }

    /**
     * Sets the value of the indctvAuctnPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice21Choice }
     *     
     */
    public AuctionData2 setIndctvAuctnPric(SecuritiesTransactionPrice21Choice value) {
        this.indctvAuctnPric = value;
        return this;
    }

    /**
     * Gets the value of the indctvAuctnVol property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public FinancialInstrumentQuantity25Choice getIndctvAuctnVol() {
        return indctvAuctnVol;
    }

    /**
     * Sets the value of the indctvAuctnVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public AuctionData2 setIndctvAuctnVol(FinancialInstrumentQuantity25Choice value) {
        this.indctvAuctnVol = value;
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
