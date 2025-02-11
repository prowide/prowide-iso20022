
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
 * Variables used to quantify the different calculations for position sets and currency position sets reports.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetTotal2", propOrder = {
    "nbOfTrds",
    "postvVal",
    "negVal",
    "ntnl",
    "othrPmtAmt"
})
public class PositionSetTotal2 {

    @XmlElement(name = "NbOfTrds")
    protected BigDecimal nbOfTrds;
    @XmlElement(name = "PostvVal")
    protected ActiveOrHistoricCurrencyAnd19DecimalAmount postvVal;
    @XmlElement(name = "NegVal")
    protected ActiveOrHistoricCurrencyAnd19DecimalAmount negVal;
    @XmlElement(name = "Ntnl")
    protected NotionalAmountLegs6 ntnl;
    @XmlElement(name = "OthrPmtAmt")
    protected List<ActiveOrHistoricCurrencyAnd19DecimalAmount> othrPmtAmt;

    /**
     * Gets the value of the nbOfTrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfTrds() {
        return nbOfTrds;
    }

    /**
     * Sets the value of the nbOfTrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PositionSetTotal2 setNbOfTrds(BigDecimal value) {
        this.nbOfTrds = value;
        return this;
    }

    /**
     * Gets the value of the postvVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd19DecimalAmount getPostvVal() {
        return postvVal;
    }

    /**
     * Sets the value of the postvVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public PositionSetTotal2 setPostvVal(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
        this.postvVal = value;
        return this;
    }

    /**
     * Gets the value of the negVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd19DecimalAmount getNegVal() {
        return negVal;
    }

    /**
     * Sets the value of the negVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public PositionSetTotal2 setNegVal(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
        this.negVal = value;
        return this;
    }

    /**
     * Gets the value of the ntnl property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAmountLegs6 }
     *     
     */
    public NotionalAmountLegs6 getNtnl() {
        return ntnl;
    }

    /**
     * Sets the value of the ntnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAmountLegs6 }
     *     
     */
    public PositionSetTotal2 setNtnl(NotionalAmountLegs6 value) {
        this.ntnl = value;
        return this;
    }

    /**
     * Gets the value of the othrPmtAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrPmtAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPmtAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     * 
     * 
     * @return
     *     The value of the othrPmtAmt property.
     */
    public List<ActiveOrHistoricCurrencyAnd19DecimalAmount> getOthrPmtAmt() {
        if (othrPmtAmt == null) {
            othrPmtAmt = new ArrayList<>();
        }
        return this.othrPmtAmt;
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
     * Adds a new item to the othrPmtAmt list.
     * @see #getOthrPmtAmt()
     * 
     */
    public PositionSetTotal2 addOthrPmtAmt(ActiveOrHistoricCurrencyAnd19DecimalAmount othrPmtAmt) {
        getOthrPmtAmt().add(othrPmtAmt);
        return this;
    }

}
