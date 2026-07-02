
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * Specifies the valuation details per counterparty aggregation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyAggregation3", propOrder = {
    "optnTp",
    "termntnOptn",
    "bsktIdAndElgbltySetPrfl",
    "collPties",
    "valtnAmts",
    "mrgnRate",
    "gblCtrPtySts"
})
public class CounterpartyAggregation3 {

    @XmlElement(name = "OptnTp")
    protected OptionType6Choice optnTp;
    @XmlElement(name = "TermntnOptn")
    @XmlSchemaType(name = "string")
    protected RepoTerminationOption1Code termntnOptn;
    @XmlElement(name = "BsktIdAndElgbltySetPrfl")
    protected BasketIdentificationAndEligibilitySetProfile1 bsktIdAndElgbltySetPrfl;
    @XmlElement(name = "CollPties", required = true)
    protected CollateralParties11 collPties;
    @XmlElement(name = "ValtnAmts", required = true)
    protected List<CollateralAmount16> valtnAmts;
    @XmlElement(name = "MrgnRate")
    protected BigDecimal mrgnRate;
    @XmlElement(name = "GblCtrPtySts")
    @XmlSchemaType(name = "string")
    protected CollateralStatus1Code gblCtrPtySts;

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType6Choice }
     *     
     */
    public OptionType6Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType6Choice }
     *     
     */
    public CounterpartyAggregation3 setOptnTp(OptionType6Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the termntnOptn property.
     * 
     * @return
     *     possible object is
     *     {@link RepoTerminationOption1Code }
     *     
     */
    public RepoTerminationOption1Code getTermntnOptn() {
        return termntnOptn;
    }

    /**
     * Sets the value of the termntnOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepoTerminationOption1Code }
     *     
     */
    public CounterpartyAggregation3 setTermntnOptn(RepoTerminationOption1Code value) {
        this.termntnOptn = value;
        return this;
    }

    /**
     * Gets the value of the bsktIdAndElgbltySetPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link BasketIdentificationAndEligibilitySetProfile1 }
     *     
     */
    public BasketIdentificationAndEligibilitySetProfile1 getBsktIdAndElgbltySetPrfl() {
        return bsktIdAndElgbltySetPrfl;
    }

    /**
     * Sets the value of the bsktIdAndElgbltySetPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketIdentificationAndEligibilitySetProfile1 }
     *     
     */
    public CounterpartyAggregation3 setBsktIdAndElgbltySetPrfl(BasketIdentificationAndEligibilitySetProfile1 value) {
        this.bsktIdAndElgbltySetPrfl = value;
        return this;
    }

    /**
     * Gets the value of the collPties property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParties11 }
     *     
     */
    public CollateralParties11 getCollPties() {
        return collPties;
    }

    /**
     * Sets the value of the collPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParties11 }
     *     
     */
    public CounterpartyAggregation3 setCollPties(CollateralParties11 value) {
        this.collPties = value;
        return this;
    }

    /**
     * Gets the value of the valtnAmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valtnAmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValtnAmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralAmount16 }
     * 
     * 
     */
    public List<CollateralAmount16> getValtnAmts() {
        if (valtnAmts == null) {
            valtnAmts = new ArrayList<CollateralAmount16>();
        }
        return this.valtnAmts;
    }

    /**
     * Gets the value of the mrgnRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMrgnRate() {
        return mrgnRate;
    }

    /**
     * Sets the value of the mrgnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CounterpartyAggregation3 setMrgnRate(BigDecimal value) {
        this.mrgnRate = value;
        return this;
    }

    /**
     * Gets the value of the gblCtrPtySts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralStatus1Code }
     *     
     */
    public CollateralStatus1Code getGblCtrPtySts() {
        return gblCtrPtySts;
    }

    /**
     * Sets the value of the gblCtrPtySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralStatus1Code }
     *     
     */
    public CounterpartyAggregation3 setGblCtrPtySts(CollateralStatus1Code value) {
        this.gblCtrPtySts = value;
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
     * Adds a new item to the valtnAmts list.
     * @see #getValtnAmts()
     * 
     */
    public CounterpartyAggregation3 addValtnAmts(CollateralAmount16 valtnAmts) {
        getValtnAmts().add(valtnAmts);
        return this;
    }

}
