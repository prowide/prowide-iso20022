
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
 * Choice between the intra-position movement or the settlement transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementOrIntraPosition3Choice__1", propOrder = {
    "intraPosMvmnt",
    "sttlmTx"
})
public class SettlementOrIntraPosition3Choice1 {

    @XmlElement(name = "IntraPosMvmnt")
    protected IntraPosition61 intraPosMvmnt;
    @XmlElement(name = "SttlmTx")
    protected TransactionDetails1261 sttlmTx;

    /**
     * Gets the value of the intraPosMvmnt property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPosition61 }
     *     
     */
    public IntraPosition61 getIntraPosMvmnt() {
        return intraPosMvmnt;
    }

    /**
     * Sets the value of the intraPosMvmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPosition61 }
     *     
     */
    public SettlementOrIntraPosition3Choice1 setIntraPosMvmnt(IntraPosition61 value) {
        this.intraPosMvmnt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTx property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetails1261 }
     *     
     */
    public TransactionDetails1261 getSttlmTx() {
        return sttlmTx;
    }

    /**
     * Sets the value of the sttlmTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetails1261 }
     *     
     */
    public SettlementOrIntraPosition3Choice1 setSttlmTx(TransactionDetails1261 value) {
        this.sttlmTx = value;
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
