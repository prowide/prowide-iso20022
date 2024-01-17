
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details on loan and collateral matching criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchingCriteria7", propOrder = {
    "ctrPtyMtchgCrit",
    "lnMtchgCrit",
    "collMtchgCrit"
})
public class MatchingCriteria7 {

    @XmlElement(name = "CtrPtyMtchgCrit")
    protected CounterpartyMatchingCriteria1 ctrPtyMtchgCrit;
    @XmlElement(name = "LnMtchgCrit")
    protected LoanMatchingCriteria6 lnMtchgCrit;
    @XmlElement(name = "CollMtchgCrit")
    protected CollateralMatchingCriteria3 collMtchgCrit;

    /**
     * Gets the value of the ctrPtyMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyMatchingCriteria1 }
     *     
     */
    public CounterpartyMatchingCriteria1 getCtrPtyMtchgCrit() {
        return ctrPtyMtchgCrit;
    }

    /**
     * Sets the value of the ctrPtyMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyMatchingCriteria1 }
     *     
     */
    public MatchingCriteria7 setCtrPtyMtchgCrit(CounterpartyMatchingCriteria1 value) {
        this.ctrPtyMtchgCrit = value;
        return this;
    }

    /**
     * Gets the value of the lnMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link LoanMatchingCriteria6 }
     *     
     */
    public LoanMatchingCriteria6 getLnMtchgCrit() {
        return lnMtchgCrit;
    }

    /**
     * Sets the value of the lnMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanMatchingCriteria6 }
     *     
     */
    public MatchingCriteria7 setLnMtchgCrit(LoanMatchingCriteria6 value) {
        this.lnMtchgCrit = value;
        return this;
    }

    /**
     * Gets the value of the collMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMatchingCriteria3 }
     *     
     */
    public CollateralMatchingCriteria3 getCollMtchgCrit() {
        return collMtchgCrit;
    }

    /**
     * Sets the value of the collMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMatchingCriteria3 }
     *     
     */
    public MatchingCriteria7 setCollMtchgCrit(CollateralMatchingCriteria3 value) {
        this.collMtchgCrit = value;
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
