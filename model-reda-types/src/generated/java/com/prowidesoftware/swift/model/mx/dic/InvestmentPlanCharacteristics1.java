
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Characteristics of an investment plan.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentPlanCharacteristics1", propOrder = {
    "planTp",
    "frqcy",
    "ttlNbOfInstlmts",
    "qty",
    "planConttn",
    "addtlSbcpt",
    "addtlSbcptFctn",
    "addtlInf"
})
public class InvestmentPlanCharacteristics1 {

    @XmlElement(name = "PlanTp", required = true)
    protected InvestmentFundPlanType1Choice planTp;
    @XmlElement(name = "Frqcy")
    protected Frequency20Choice frqcy;
    @XmlElement(name = "TtlNbOfInstlmts")
    protected BigDecimal ttlNbOfInstlmts;
    @XmlElement(name = "Qty")
    protected UnitsOrAmount1Choice qty;
    @XmlElement(name = "PlanConttn")
    protected Boolean planConttn;
    @XmlElement(name = "AddtlSbcpt")
    protected Boolean addtlSbcpt;
    @XmlElement(name = "AddtlSbcptFctn")
    protected Boolean addtlSbcptFctn;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the planTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundPlanType1Choice }
     *     
     */
    public InvestmentFundPlanType1Choice getPlanTp() {
        return planTp;
    }

    /**
     * Sets the value of the planTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundPlanType1Choice }
     *     
     */
    public InvestmentPlanCharacteristics1 setPlanTp(InvestmentFundPlanType1Choice value) {
        this.planTp = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency20Choice }
     *     
     */
    public Frequency20Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency20Choice }
     *     
     */
    public InvestmentPlanCharacteristics1 setFrqcy(Frequency20Choice value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfInstlmts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfInstlmts() {
        return ttlNbOfInstlmts;
    }

    /**
     * Sets the value of the ttlNbOfInstlmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentPlanCharacteristics1 setTtlNbOfInstlmts(BigDecimal value) {
        this.ttlNbOfInstlmts = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsOrAmount1Choice }
     *     
     */
    public UnitsOrAmount1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsOrAmount1Choice }
     *     
     */
    public InvestmentPlanCharacteristics1 setQty(UnitsOrAmount1Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the planConttn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanConttn() {
        return planConttn;
    }

    /**
     * Sets the value of the planConttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvestmentPlanCharacteristics1 setPlanConttn(Boolean value) {
        this.planConttn = value;
        return this;
    }

    /**
     * Gets the value of the addtlSbcpt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddtlSbcpt() {
        return addtlSbcpt;
    }

    /**
     * Sets the value of the addtlSbcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvestmentPlanCharacteristics1 setAddtlSbcpt(Boolean value) {
        this.addtlSbcpt = value;
        return this;
    }

    /**
     * Gets the value of the addtlSbcptFctn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddtlSbcptFctn() {
        return addtlSbcptFctn;
    }

    /**
     * Sets the value of the addtlSbcptFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvestmentPlanCharacteristics1 setAddtlSbcptFctn(Boolean value) {
        this.addtlSbcptFctn = value;
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
    public InvestmentPlanCharacteristics1 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
