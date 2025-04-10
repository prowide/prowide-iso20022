
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
 * Pricing component, such as a service, promotion, allowance or charge, for this line item.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineItemAllowanceCharge3", propOrder = {
    "chrgInd",
    "actlAmt",
    "bsisQty",
    "clctnPct",
    "seqNb",
    "rsn"
})
public class LineItemAllowanceCharge3 {

    @XmlElement(name = "ChrgInd")
    protected Boolean chrgInd;
    @XmlElement(name = "ActlAmt")
    protected List<CurrencyAndAmount> actlAmt;
    @XmlElement(name = "BsisQty")
    protected Quantity16 bsisQty;
    @XmlElement(name = "ClctnPct")
    protected BigDecimal clctnPct;
    @XmlElement(name = "SeqNb")
    protected BigDecimal seqNb;
    @XmlElement(name = "Rsn")
    protected DiscountOrChargeType1Choice rsn;

    /**
     * Gets the value of the chrgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChrgInd() {
        return chrgInd;
    }

    /**
     * Sets the value of the chrgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LineItemAllowanceCharge3 setChrgInd(Boolean value) {
        this.chrgInd = value;
        return this;
    }

    /**
     * Gets the value of the actlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the actlAmt property.
     */
    public List<CurrencyAndAmount> getActlAmt() {
        if (actlAmt == null) {
            actlAmt = new ArrayList<>();
        }
        return this.actlAmt;
    }

    /**
     * Gets the value of the bsisQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity16 }
     *     
     */
    public Quantity16 getBsisQty() {
        return bsisQty;
    }

    /**
     * Sets the value of the bsisQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity16 }
     *     
     */
    public LineItemAllowanceCharge3 setBsisQty(Quantity16 value) {
        this.bsisQty = value;
        return this;
    }

    /**
     * Gets the value of the clctnPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClctnPct() {
        return clctnPct;
    }

    /**
     * Sets the value of the clctnPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LineItemAllowanceCharge3 setClctnPct(BigDecimal value) {
        this.clctnPct = value;
        return this;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LineItemAllowanceCharge3 setSeqNb(BigDecimal value) {
        this.seqNb = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountOrChargeType1Choice }
     *     
     */
    public DiscountOrChargeType1Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountOrChargeType1Choice }
     *     
     */
    public LineItemAllowanceCharge3 setRsn(DiscountOrChargeType1Choice value) {
        this.rsn = value;
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
     * Adds a new item to the actlAmt list.
     * @see #getActlAmt()
     * 
     */
    public LineItemAllowanceCharge3 addActlAmt(CurrencyAndAmount actlAmt) {
        getActlAmt().add(actlAmt);
        return this;
    }

}
