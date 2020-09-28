
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
 * Information on collateral used in the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralData7", propOrder = {
    "txCollData"
})
public class CollateralData7 {

    @XmlElement(name = "TxCollData", required = true)
    protected TransactionCollateralData1Choice txCollData;

    /**
     * Gets the value of the txCollData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCollateralData1Choice }
     *     
     */
    public TransactionCollateralData1Choice getTxCollData() {
        return txCollData;
    }

    /**
     * Sets the value of the txCollData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCollateralData1Choice }
     *     
     */
    public CollateralData7 setTxCollData(TransactionCollateralData1Choice value) {
        this.txCollData = value;
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
