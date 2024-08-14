
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
 * Definition of the collateral value query criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValueCriteriaDefinition4Choice", propOrder = {
    "qryNm",
    "newCrit"
})
public class CollateralValueCriteriaDefinition4Choice {

    @XmlElement(name = "QryNm")
    protected String qryNm;
    @XmlElement(name = "NewCrit")
    protected CollateralValueCriteria4 newCrit;

    /**
     * Gets the value of the qryNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryNm() {
        return qryNm;
    }

    /**
     * Sets the value of the qryNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralValueCriteriaDefinition4Choice setQryNm(String value) {
        this.qryNm = value;
        return this;
    }

    /**
     * Gets the value of the newCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralValueCriteria4 }
     *     
     */
    public CollateralValueCriteria4 getNewCrit() {
        return newCrit;
    }

    /**
     * Sets the value of the newCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralValueCriteria4 }
     *     
     */
    public CollateralValueCriteriaDefinition4Choice setNewCrit(CollateralValueCriteria4 value) {
        this.newCrit = value;
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
