
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "LimitQuery4", propOrder = {
    "qryTp",
    "lmtCrit"
})
public class LimitQuery4 {

    @XmlElement(name = "QryTp")
    @XmlSchemaType(name = "string")
    protected QueryType2Code qryTp;
    @XmlElement(name = "LmtCrit")
    protected LimitCriteria6Choice lmtCrit;

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
    public LimitQuery4 setQryTp(QueryType2Code value) {
        this.qryTp = value;
        return this;
    }

    /**
     * Gets the value of the lmtCrit property.
     * 
     * @return
     *     possible object is
     *     {@link LimitCriteria6Choice }
     *     
     */
    public LimitCriteria6Choice getLmtCrit() {
        return lmtCrit;
    }

    /**
     * Sets the value of the lmtCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitCriteria6Choice }
     *     
     */
    public LimitQuery4 setLmtCrit(LimitCriteria6Choice value) {
        this.lmtCrit = value;
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
