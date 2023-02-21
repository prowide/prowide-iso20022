
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
 * Statistical data related to the price change of a security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuationStatistics3", propOrder = {
    "ccy",
    "pricTpChngBsis",
    "pricChng",
    "yld",
    "byPrdfndTmPrds",
    "byUsrDfndTmPrd"
})
public class ValuationStatistics3 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "PricTpChngBsis", required = true)
    protected PriceType2 pricTpChngBsis;
    @XmlElement(name = "PricChng", required = true)
    protected PriceValueChange1 pricChng;
    @XmlElement(name = "Yld")
    protected BigDecimal yld;
    @XmlElement(name = "ByPrdfndTmPrds")
    protected StatisticsByPredefinedTimePeriods2 byPrdfndTmPrds;
    @XmlElement(name = "ByUsrDfndTmPrd")
    protected List<StatisticsByUserDefinedTimePeriod2> byUsrDfndTmPrd;

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
    public ValuationStatistics3 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the pricTpChngBsis property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType2 }
     *     
     */
    public PriceType2 getPricTpChngBsis() {
        return pricTpChngBsis;
    }

    /**
     * Sets the value of the pricTpChngBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType2 }
     *     
     */
    public ValuationStatistics3 setPricTpChngBsis(PriceType2 value) {
        this.pricTpChngBsis = value;
        return this;
    }

    /**
     * Gets the value of the pricChng property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueChange1 }
     *     
     */
    public PriceValueChange1 getPricChng() {
        return pricChng;
    }

    /**
     * Sets the value of the pricChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueChange1 }
     *     
     */
    public ValuationStatistics3 setPricChng(PriceValueChange1 value) {
        this.pricChng = value;
        return this;
    }

    /**
     * Gets the value of the yld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYld() {
        return yld;
    }

    /**
     * Sets the value of the yld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ValuationStatistics3 setYld(BigDecimal value) {
        this.yld = value;
        return this;
    }

    /**
     * Gets the value of the byPrdfndTmPrds property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsByPredefinedTimePeriods2 }
     *     
     */
    public StatisticsByPredefinedTimePeriods2 getByPrdfndTmPrds() {
        return byPrdfndTmPrds;
    }

    /**
     * Sets the value of the byPrdfndTmPrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsByPredefinedTimePeriods2 }
     *     
     */
    public ValuationStatistics3 setByPrdfndTmPrds(StatisticsByPredefinedTimePeriods2 value) {
        this.byPrdfndTmPrds = value;
        return this;
    }

    /**
     * Gets the value of the byUsrDfndTmPrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the byUsrDfndTmPrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getByUsrDfndTmPrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatisticsByUserDefinedTimePeriod2 }
     * 
     * 
     */
    public List<StatisticsByUserDefinedTimePeriod2> getByUsrDfndTmPrd() {
        if (byUsrDfndTmPrd == null) {
            byUsrDfndTmPrd = new ArrayList<StatisticsByUserDefinedTimePeriod2>();
        }
        return this.byUsrDfndTmPrd;
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
     * Adds a new item to the byUsrDfndTmPrd list.
     * @see #getByUsrDfndTmPrd()
     * 
     */
    public ValuationStatistics3 addByUsrDfndTmPrd(StatisticsByUserDefinedTimePeriod2 byUsrDfndTmPrd) {
        getByUsrDfndTmPrd().add(byUsrDfndTmPrd);
        return this;
    }

}
