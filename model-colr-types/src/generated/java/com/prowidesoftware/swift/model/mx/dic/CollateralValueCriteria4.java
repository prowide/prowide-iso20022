
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
 * Defines the criteria which are used to search for an account and to report on the account. A name may be given to the new query.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValueCriteria4", propOrder = {
    "qryNm",
    "schCrit",
    "rtrCrit"
})
public class CollateralValueCriteria4 {

    @XmlElement(name = "QryNm")
    protected String qryNm;
    @XmlElement(name = "SchCrit")
    protected CollateralValueSearchCriteria4 schCrit;
    @XmlElement(name = "RtrCrit")
    protected CollateralValueReturnCriteria1 rtrCrit;

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
    public CollateralValueCriteria4 setQryNm(String value) {
        this.qryNm = value;
        return this;
    }

    /**
     * Gets the value of the schCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralValueSearchCriteria4 }
     *     
     */
    public CollateralValueSearchCriteria4 getSchCrit() {
        return schCrit;
    }

    /**
     * Sets the value of the schCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralValueSearchCriteria4 }
     *     
     */
    public CollateralValueCriteria4 setSchCrit(CollateralValueSearchCriteria4 value) {
        this.schCrit = value;
        return this;
    }

    /**
     * Gets the value of the rtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralValueReturnCriteria1 }
     *     
     */
    public CollateralValueReturnCriteria1 getRtrCrit() {
        return rtrCrit;
    }

    /**
     * Sets the value of the rtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralValueReturnCriteria1 }
     *     
     */
    public CollateralValueCriteria4 setRtrCrit(CollateralValueReturnCriteria1 value) {
        this.rtrCrit = value;
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
