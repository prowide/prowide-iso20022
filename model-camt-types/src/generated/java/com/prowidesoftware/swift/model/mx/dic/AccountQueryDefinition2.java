
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
 * Specification of the query criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountQueryDefinition2", propOrder = {
    "qryTp",
    "acctCrit"
})
public class AccountQueryDefinition2 {

    @XmlElement(name = "QryTp")
    @XmlSchemaType(name = "string")
    protected QueryType1Code qryTp;
    @XmlElement(name = "AcctCrit")
    protected AccountCriteriaDefinition2Choice acctCrit;

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
    public AccountQueryDefinition2 setQryTp(QueryType1Code value) {
        this.qryTp = value;
        return this;
    }

    /**
     * Gets the value of the acctCrit property.
     * 
     * @return
     *     possible object is
     *     {@link AccountCriteriaDefinition2Choice }
     *     
     */
    public AccountCriteriaDefinition2Choice getAcctCrit() {
        return acctCrit;
    }

    /**
     * Sets the value of the acctCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountCriteriaDefinition2Choice }
     *     
     */
    public AccountQueryDefinition2 setAcctCrit(AccountCriteriaDefinition2Choice value) {
        this.acctCrit = value;
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
