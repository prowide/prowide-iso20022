
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
 * Number of crystallised units.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Crystallisation2", propOrder = {
    "trchId",
    "crstllsdUnitsNb",
    "ucrstllsdUnitsNb",
    "crstllsdAmt",
    "ucrstllsdAmt",
    "addtlInf"
})
public class Crystallisation2 {

    @XmlElement(name = "TrchId", required = true)
    protected String trchId;
    @XmlElement(name = "CrstllsdUnitsNb")
    protected BigDecimal crstllsdUnitsNb;
    @XmlElement(name = "UcrstllsdUnitsNb")
    protected BigDecimal ucrstllsdUnitsNb;
    @XmlElement(name = "CrstllsdAmt")
    protected ActiveCurrencyAnd13DecimalAmount crstllsdAmt;
    @XmlElement(name = "UcrstllsdAmt")
    protected ActiveCurrencyAnd13DecimalAmount ucrstllsdAmt;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the trchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrchId() {
        return trchId;
    }

    /**
     * Sets the value of the trchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Crystallisation2 setTrchId(String value) {
        this.trchId = value;
        return this;
    }

    /**
     * Gets the value of the crstllsdUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrstllsdUnitsNb() {
        return crstllsdUnitsNb;
    }

    /**
     * Sets the value of the crstllsdUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Crystallisation2 setCrstllsdUnitsNb(BigDecimal value) {
        this.crstllsdUnitsNb = value;
        return this;
    }

    /**
     * Gets the value of the ucrstllsdUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUcrstllsdUnitsNb() {
        return ucrstllsdUnitsNb;
    }

    /**
     * Sets the value of the ucrstllsdUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Crystallisation2 setUcrstllsdUnitsNb(BigDecimal value) {
        this.ucrstllsdUnitsNb = value;
        return this;
    }

    /**
     * Gets the value of the crstllsdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getCrstllsdAmt() {
        return crstllsdAmt;
    }

    /**
     * Sets the value of the crstllsdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public Crystallisation2 setCrstllsdAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.crstllsdAmt = value;
        return this;
    }

    /**
     * Gets the value of the ucrstllsdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getUcrstllsdAmt() {
        return ucrstllsdAmt;
    }

    /**
     * Sets the value of the ucrstllsdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public Crystallisation2 setUcrstllsdAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.ucrstllsdAmt = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<AdditionalInformation15>();
        }
        return this.addtlInf;
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public Crystallisation2 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
