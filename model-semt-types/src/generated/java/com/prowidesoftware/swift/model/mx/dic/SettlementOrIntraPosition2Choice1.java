
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "SettlementOrIntraPosition2Choice__1", propOrder = {
    "intraPosMvmnt",
    "sttlmTx"
})
public class SettlementOrIntraPosition2Choice1 {

    @XmlElement(name = "IntraPosMvmnt")
    protected IntraPosition51 intraPosMvmnt;
    @XmlElement(name = "SttlmTx")
    protected TransactionDetails941 sttlmTx;

    /**
     * Gets the value of the intraPosMvmnt property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPosition51 }
     *     
     */
    public IntraPosition51 getIntraPosMvmnt() {
        return intraPosMvmnt;
    }

    /**
     * Sets the value of the intraPosMvmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPosition51 }
     *     
     */
    public SettlementOrIntraPosition2Choice1 setIntraPosMvmnt(IntraPosition51 value) {
        this.intraPosMvmnt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmTx property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetails941 }
     *     
     */
    public TransactionDetails941 getSttlmTx() {
        return sttlmTx;
    }

    /**
     * Sets the value of the sttlmTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetails941 }
     *     
     */
    public SettlementOrIntraPosition2Choice1 setSttlmTx(TransactionDetails941 value) {
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
