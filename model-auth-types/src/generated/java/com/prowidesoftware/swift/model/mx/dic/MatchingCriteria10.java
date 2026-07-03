
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "MatchingCriteria10", propOrder = {
    "ctrPtyMtchgCrit",
    "lnMtchgCrit",
    "collMtchgCrit"
})
public class MatchingCriteria10 {

    @XmlElement(name = "CtrPtyMtchgCrit")
    protected CounterpartyMatchingCriteria4 ctrPtyMtchgCrit;
    @XmlElement(name = "LnMtchgCrit")
    protected LoanMatchingCriteria9 lnMtchgCrit;
    @XmlElement(name = "CollMtchgCrit")
    protected CollateralMatchingCriteria6 collMtchgCrit;

    /**
     * Gets the value of the ctrPtyMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyMatchingCriteria4 }
     *     
     */
    public CounterpartyMatchingCriteria4 getCtrPtyMtchgCrit() {
        return ctrPtyMtchgCrit;
    }

    /**
     * Sets the value of the ctrPtyMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyMatchingCriteria4 }
     *     
     */
    public MatchingCriteria10 setCtrPtyMtchgCrit(CounterpartyMatchingCriteria4 value) {
        this.ctrPtyMtchgCrit = value;
        return this;
    }

    /**
     * Gets the value of the lnMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link LoanMatchingCriteria9 }
     *     
     */
    public LoanMatchingCriteria9 getLnMtchgCrit() {
        return lnMtchgCrit;
    }

    /**
     * Sets the value of the lnMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanMatchingCriteria9 }
     *     
     */
    public MatchingCriteria10 setLnMtchgCrit(LoanMatchingCriteria9 value) {
        this.lnMtchgCrit = value;
        return this;
    }

    /**
     * Gets the value of the collMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMatchingCriteria6 }
     *     
     */
    public CollateralMatchingCriteria6 getCollMtchgCrit() {
        return collMtchgCrit;
    }

    /**
     * Sets the value of the collMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMatchingCriteria6 }
     *     
     */
    public MatchingCriteria10 setCollMtchgCrit(CollateralMatchingCriteria6 value) {
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
