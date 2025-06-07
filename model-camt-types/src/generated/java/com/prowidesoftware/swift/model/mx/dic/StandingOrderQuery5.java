
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
 * Specification of the query criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderQuery5", propOrder = {
    "qryTp",
    "stgOrdrCrit"
})
public class StandingOrderQuery5 {

    @XmlElement(name = "QryTp")
    @XmlSchemaType(name = "string")
    protected QueryType2Code qryTp;
    @XmlElement(name = "StgOrdrCrit")
    protected StandingOrderCriteria5Choice stgOrdrCrit;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType2Code }
     *     
     */
    public QueryType2Code getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType2Code }
     *     
     */
    public StandingOrderQuery5 setQryTp(QueryType2Code value) {
        this.qryTp = value;
        return this;
    }

    /**
     * Gets the value of the stgOrdrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderCriteria5Choice }
     *     
     */
    public StandingOrderCriteria5Choice getStgOrdrCrit() {
        return stgOrdrCrit;
    }

    /**
     * Sets the value of the stgOrdrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderCriteria5Choice }
     *     
     */
    public StandingOrderQuery5 setStgOrdrCrit(StandingOrderCriteria5Choice value) {
        this.stgOrdrCrit = value;
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
