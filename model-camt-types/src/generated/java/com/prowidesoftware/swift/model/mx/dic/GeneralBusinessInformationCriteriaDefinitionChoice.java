
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
 * Defines the information that is searched either implicitly by recalling a previous query or explicitly by defining the criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralBusinessInformationCriteriaDefinitionChoice", propOrder = {
    "qryNm",
    "newCrit"
})
public class GeneralBusinessInformationCriteriaDefinitionChoice {

    @XmlElement(name = "QryNm")
    protected String qryNm;
    @XmlElement(name = "NewCrit")
    protected BusinessInformationCriteria newCrit;

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
    public GeneralBusinessInformationCriteriaDefinitionChoice setQryNm(String value) {
        this.qryNm = value;
        return this;
    }

    /**
     * Gets the value of the newCrit property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessInformationCriteria }
     *     
     */
    public BusinessInformationCriteria getNewCrit() {
        return newCrit;
    }

    /**
     * Sets the value of the newCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessInformationCriteria }
     *     
     */
    public GeneralBusinessInformationCriteriaDefinitionChoice setNewCrit(BusinessInformationCriteria value) {
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
