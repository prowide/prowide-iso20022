
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
@XmlType(name = "TransactionQuery7", propOrder = {
    "qryTp",
    "txCrit"
})
public class TransactionQuery7 {

    @XmlElement(name = "QryTp")
    @XmlSchemaType(name = "string")
    protected QueryType2Code qryTp;
    @XmlElement(name = "TxCrit")
    protected TransactionCriteria7Choice txCrit;

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
    public TransactionQuery7 setQryTp(QueryType2Code value) {
        this.qryTp = value;
        return this;
    }

    /**
     * Gets the value of the txCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCriteria7Choice }
     *     
     */
    public TransactionCriteria7Choice getTxCrit() {
        return txCrit;
    }

    /**
     * Sets the value of the txCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCriteria7Choice }
     *     
     */
    public TransactionQuery7 setTxCrit(TransactionCriteria7Choice value) {
        this.txCrit = value;
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
