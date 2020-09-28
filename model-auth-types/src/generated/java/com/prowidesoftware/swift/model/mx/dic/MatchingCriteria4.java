
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
@XmlType(name = "MatchingCriteria4", propOrder = {
    "lnMtchgCrit",
    "collMtchgCrit"
})
public class MatchingCriteria4 {

    @XmlElement(name = "LnMtchgCrit")
    protected LoanMatchingCriteria3 lnMtchgCrit;
    @XmlElement(name = "CollMtchgCrit")
    protected CollateralMatchingCriteria2 collMtchgCrit;

    /**
     * Gets the value of the lnMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link LoanMatchingCriteria3 }
     *     
     */
    public LoanMatchingCriteria3 getLnMtchgCrit() {
        return lnMtchgCrit;
    }

    /**
     * Sets the value of the lnMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanMatchingCriteria3 }
     *     
     */
    public MatchingCriteria4 setLnMtchgCrit(LoanMatchingCriteria3 value) {
        this.lnMtchgCrit = value;
        return this;
    }

    /**
     * Gets the value of the collMtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMatchingCriteria2 }
     *     
     */
    public CollateralMatchingCriteria2 getCollMtchgCrit() {
        return collMtchgCrit;
    }

    /**
     * Sets the value of the collMtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMatchingCriteria2 }
     *     
     */
    public MatchingCriteria4 setCollMtchgCrit(CollateralMatchingCriteria2 value) {
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
