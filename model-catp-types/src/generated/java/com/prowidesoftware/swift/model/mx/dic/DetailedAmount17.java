
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
 * Details of the transfer transaction amounts.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedAmount17", propOrder = {
    "amtToTrf",
    "ccy",
    "fees",
    "dontn"
})
public class DetailedAmount17 {

    @XmlElement(name = "AmtToTrf", required = true)
    protected BigDecimal amtToTrf;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Fees")
    protected List<DetailedAmount18> fees;
    @XmlElement(name = "Dontn")
    protected List<DetailedAmount18> dontn;

    /**
     * Gets the value of the amtToTrf property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtToTrf() {
        return amtToTrf;
    }

    /**
     * Sets the value of the amtToTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedAmount17 setAmtToTrf(BigDecimal value) {
        this.amtToTrf = value;
        return this;
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
    public DetailedAmount17 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the fees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount18 }
     * 
     * 
     */
    public List<DetailedAmount18> getFees() {
        if (fees == null) {
            fees = new ArrayList<DetailedAmount18>();
        }
        return this.fees;
    }

    /**
     * Gets the value of the dontn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dontn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDontn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount18 }
     * 
     * 
     */
    public List<DetailedAmount18> getDontn() {
        if (dontn == null) {
            dontn = new ArrayList<DetailedAmount18>();
        }
        return this.dontn;
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
     * Adds a new item to the fees list.
     * @see #getFees()
     * 
     */
    public DetailedAmount17 addFees(DetailedAmount18 fees) {
        getFees().add(fees);
        return this;
    }

    /**
     * Adds a new item to the dontn list.
     * @see #getDontn()
     * 
     */
    public DetailedAmount17 addDontn(DetailedAmount18 dontn) {
        getDontn().add(dontn);
        return this;
    }

}
