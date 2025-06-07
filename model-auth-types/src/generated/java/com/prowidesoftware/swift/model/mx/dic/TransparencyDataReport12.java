
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides for reporting calculation results of equity instruments as part of transparency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransparencyDataReport12", propOrder = {
    "techRcrdId",
    "id",
    "fullNm",
    "tradgVn",
    "rptgPrd",
    "lqdty",
    "mthdlgy",
    "sttstcs",
    "rlvntMkt"
})
public class TransparencyDataReport12 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "FullNm")
    protected String fullNm;
    @XmlElement(name = "TradgVn")
    protected String tradgVn;
    @XmlElement(name = "RptgPrd")
    protected Period4Choice rptgPrd;
    @XmlElement(name = "Lqdty")
    protected Boolean lqdty;
    @XmlElement(name = "Mthdlgy")
    @XmlSchemaType(name = "string")
    protected TransparencyMethodology2Code mthdlgy;
    @XmlElement(name = "Sttstcs")
    protected StatisticsTransparency3 sttstcs;
    @XmlElement(name = "RlvntMkt")
    protected MarketDetail2 rlvntMkt;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransparencyDataReport12 setTechRcrdId(String value) {
        this.techRcrdId = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransparencyDataReport12 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the fullNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNm() {
        return fullNm;
    }

    /**
     * Sets the value of the fullNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransparencyDataReport12 setFullNm(String value) {
        this.fullNm = value;
        return this;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransparencyDataReport12 setTradgVn(String value) {
        this.tradgVn = value;
        return this;
    }

    /**
     * Gets the value of the rptgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Sets the value of the rptgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public TransparencyDataReport12 setRptgPrd(Period4Choice value) {
        this.rptgPrd = value;
        return this;
    }

    /**
     * Gets the value of the lqdty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLqdty() {
        return lqdty;
    }

    /**
     * Sets the value of the lqdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TransparencyDataReport12 setLqdty(Boolean value) {
        this.lqdty = value;
        return this;
    }

    /**
     * Gets the value of the mthdlgy property.
     * 
     * @return
     *     possible object is
     *     {@link TransparencyMethodology2Code }
     *     
     */
    public TransparencyMethodology2Code getMthdlgy() {
        return mthdlgy;
    }

    /**
     * Sets the value of the mthdlgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransparencyMethodology2Code }
     *     
     */
    public TransparencyDataReport12 setMthdlgy(TransparencyMethodology2Code value) {
        this.mthdlgy = value;
        return this;
    }

    /**
     * Gets the value of the sttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link StatisticsTransparency3 }
     *     
     */
    public StatisticsTransparency3 getSttstcs() {
        return sttstcs;
    }

    /**
     * Sets the value of the sttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatisticsTransparency3 }
     *     
     */
    public TransparencyDataReport12 setSttstcs(StatisticsTransparency3 value) {
        this.sttstcs = value;
        return this;
    }

    /**
     * Gets the value of the rlvntMkt property.
     * 
     * @return
     *     possible object is
     *     {@link MarketDetail2 }
     *     
     */
    public MarketDetail2 getRlvntMkt() {
        return rlvntMkt;
    }

    /**
     * Sets the value of the rlvntMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketDetail2 }
     *     
     */
    public TransparencyDataReport12 setRlvntMkt(MarketDetail2 value) {
        this.rlvntMkt = value;
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
