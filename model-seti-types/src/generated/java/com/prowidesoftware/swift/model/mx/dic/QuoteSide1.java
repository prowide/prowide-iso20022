
package com.prowidesoftware.swift.model.mx.dic;

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
 * Indicates whether the quote details are indicated as an offer, a bid or a mid of a security, commodity, currency (the latter being an average of the offer and the bid).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteSide1", propOrder = {
    "pric",
    "mktPric",
    "minQty",
    "qty",
    "maxQty",
    "srcOfQt"
})
public class QuoteSide1 {

    @XmlElement(name = "Pric", required = true)
    protected Price1 pric;
    @XmlElement(name = "MktPric")
    protected List<Price1> mktPric;
    @XmlElement(name = "MinQty")
    protected List<FinancialInstrumentQuantityChoice> minQty;
    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantityChoice qty;
    @XmlElement(name = "MaxQty")
    protected FinancialInstrumentQuantityChoice maxQty;
    @XmlElement(name = "SrcOfQt")
    protected PartyIdentification25Choice srcOfQt;

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public QuoteSide1 setPric(Price1 value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the mktPric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mktPric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMktPric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Price1 }
     * 
     * 
     */
    public List<Price1> getMktPric() {
        if (mktPric == null) {
            mktPric = new ArrayList<Price1>();
        }
        return this.mktPric;
    }

    /**
     * Gets the value of the minQty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minQty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinQty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentQuantityChoice }
     * 
     * 
     */
    public List<FinancialInstrumentQuantityChoice> getMinQty() {
        if (minQty == null) {
            minQty = new ArrayList<FinancialInstrumentQuantityChoice>();
        }
        return this.minQty;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public QuoteSide1 setQty(FinancialInstrumentQuantityChoice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the maxQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getMaxQty() {
        return maxQty;
    }

    /**
     * Sets the value of the maxQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public QuoteSide1 setMaxQty(FinancialInstrumentQuantityChoice value) {
        this.maxQty = value;
        return this;
    }

    /**
     * Gets the value of the srcOfQt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification25Choice }
     *     
     */
    public PartyIdentification25Choice getSrcOfQt() {
        return srcOfQt;
    }

    /**
     * Sets the value of the srcOfQt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification25Choice }
     *     
     */
    public QuoteSide1 setSrcOfQt(PartyIdentification25Choice value) {
        this.srcOfQt = value;
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
     * Adds a new item to the mktPric list.
     * @see #getMktPric()
     * 
     */
    public QuoteSide1 addMktPric(Price1 mktPric) {
        getMktPric().add(mktPric);
        return this;
    }

    /**
     * Adds a new item to the minQty list.
     * @see #getMinQty()
     * 
     */
    public QuoteSide1 addMinQty(FinancialInstrumentQuantityChoice minQty) {
        getMinQty().add(minQty);
        return this;
    }

}
