
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
 * Defines the query criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationQueryDefinition1", propOrder = {
    "qryTp",
    "rsvatnCrit"
})
public class ReservationQueryDefinition1 {

    @XmlElement(name = "QryTp")
    @XmlSchemaType(name = "string")
    protected QueryType1Code qryTp;
    @XmlElement(name = "RsvatnCrit")
    protected ReservationCriteriaDefinition1Choice rsvatnCrit;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType1Code }
     *     
     */
    public QueryType1Code getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType1Code }
     *     
     */
    public ReservationQueryDefinition1 setQryTp(QueryType1Code value) {
        this.qryTp = value;
        return this;
    }

    /**
     * Gets the value of the rsvatnCrit property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationCriteriaDefinition1Choice }
     *     
     */
    public ReservationCriteriaDefinition1Choice getRsvatnCrit() {
        return rsvatnCrit;
    }

    /**
     * Sets the value of the rsvatnCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationCriteriaDefinition1Choice }
     *     
     */
    public ReservationQueryDefinition1 setRsvatnCrit(ReservationCriteriaDefinition1Choice value) {
        this.rsvatnCrit = value;
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
