
package com.prowidesoftware.swift.model.mx.dic;

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
 * Target market criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetMarket1", propOrder = {
    "invstrTp",
    "knwldgAndOrExprnc",
    "abltyToBearLosses",
    "rskTlrnce",
    "clntObjctvsAndNeeds",
    "othr"
})
public class TargetMarket1 {

    @XmlElement(name = "InvstrTp")
    protected InvestorType1 invstrTp;
    @XmlElement(name = "KnwldgAndOrExprnc")
    protected InvestorKnowledge1 knwldgAndOrExprnc;
    @XmlElement(name = "AbltyToBearLosses")
    protected LossBearing1 abltyToBearLosses;
    @XmlElement(name = "RskTlrnce")
    protected RiskTolerance1 rskTlrnce;
    @XmlElement(name = "ClntObjctvsAndNeeds")
    protected InvestorRequirements1 clntObjctvsAndNeeds;
    @XmlElement(name = "Othr")
    protected List<OtherTargetMarket1> othr;

    /**
     * Gets the value of the invstrTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorType1 }
     *     
     */
    public InvestorType1 getInvstrTp() {
        return invstrTp;
    }

    /**
     * Sets the value of the invstrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorType1 }
     *     
     */
    public TargetMarket1 setInvstrTp(InvestorType1 value) {
        this.invstrTp = value;
        return this;
    }

    /**
     * Gets the value of the knwldgAndOrExprnc property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorKnowledge1 }
     *     
     */
    public InvestorKnowledge1 getKnwldgAndOrExprnc() {
        return knwldgAndOrExprnc;
    }

    /**
     * Sets the value of the knwldgAndOrExprnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorKnowledge1 }
     *     
     */
    public TargetMarket1 setKnwldgAndOrExprnc(InvestorKnowledge1 value) {
        this.knwldgAndOrExprnc = value;
        return this;
    }

    /**
     * Gets the value of the abltyToBearLosses property.
     * 
     * @return
     *     possible object is
     *     {@link LossBearing1 }
     *     
     */
    public LossBearing1 getAbltyToBearLosses() {
        return abltyToBearLosses;
    }

    /**
     * Sets the value of the abltyToBearLosses property.
     * 
     * @param value
     *     allowed object is
     *     {@link LossBearing1 }
     *     
     */
    public TargetMarket1 setAbltyToBearLosses(LossBearing1 value) {
        this.abltyToBearLosses = value;
        return this;
    }

    /**
     * Gets the value of the rskTlrnce property.
     * 
     * @return
     *     possible object is
     *     {@link RiskTolerance1 }
     *     
     */
    public RiskTolerance1 getRskTlrnce() {
        return rskTlrnce;
    }

    /**
     * Sets the value of the rskTlrnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskTolerance1 }
     *     
     */
    public TargetMarket1 setRskTlrnce(RiskTolerance1 value) {
        this.rskTlrnce = value;
        return this;
    }

    /**
     * Gets the value of the clntObjctvsAndNeeds property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorRequirements1 }
     *     
     */
    public InvestorRequirements1 getClntObjctvsAndNeeds() {
        return clntObjctvsAndNeeds;
    }

    /**
     * Sets the value of the clntObjctvsAndNeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorRequirements1 }
     *     
     */
    public TargetMarket1 setClntObjctvsAndNeeds(InvestorRequirements1 value) {
        this.clntObjctvsAndNeeds = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherTargetMarket1 }
     * 
     * 
     * @return
     *     The value of the othr property.
     */
    public List<OtherTargetMarket1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<>();
        }
        return this.othr;
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
     * Adds a new item to the othr list.
     * @see #getOthr()
     * 
     */
    public TargetMarket1 addOthr(OtherTargetMarket1 othr) {
        getOthr().add(othr);
        return this;
    }

}
