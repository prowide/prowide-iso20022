
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
@XmlType(name = "CurrencyQueryDefinition", propOrder = {
    "qryTp",
    "ccyCrit"
})
public class CurrencyQueryDefinition {

    @XmlElement(name = "QryTp")
    @XmlSchemaType(name = "string")
    protected QueryType1Code qryTp;
    @XmlElement(name = "CcyCrit")
    protected CurrencyCriteriaDefinitionChoice ccyCrit;

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
    public CurrencyQueryDefinition setQryTp(QueryType1Code value) {
        this.qryTp = value;
        return this;
    }

    /**
     * Gets the value of the ccyCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCriteriaDefinitionChoice }
     *     
     */
    public CurrencyCriteriaDefinitionChoice getCcyCrit() {
        return ccyCrit;
    }

    /**
     * Sets the value of the ccyCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCriteriaDefinitionChoice }
     *     
     */
    public CurrencyQueryDefinition setCcyCrit(CurrencyCriteriaDefinitionChoice value) {
        this.ccyCrit = value;
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
