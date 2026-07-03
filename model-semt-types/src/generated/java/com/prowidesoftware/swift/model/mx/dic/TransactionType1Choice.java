
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
 * Choice of transaction type or corporation action event type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionType1Choice", propOrder = {
    "txTp",
    "corpActnTp"
})
public class TransactionType1Choice {

    @XmlElement(name = "TxTp")
    protected TransactionType2Choice txTp;
    @XmlElement(name = "CorpActnTp")
    protected CorporateAction1Choice corpActnTp;

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType2Choice }
     *     
     */
    public TransactionType2Choice getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType2Choice }
     *     
     */
    public TransactionType1Choice setTxTp(TransactionType2Choice value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the corpActnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateAction1Choice }
     *     
     */
    public CorporateAction1Choice getCorpActnTp() {
        return corpActnTp;
    }

    /**
     * Sets the value of the corpActnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateAction1Choice }
     *     
     */
    public TransactionType1Choice setCorpActnTp(CorporateAction1Choice value) {
        this.corpActnTp = value;
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
