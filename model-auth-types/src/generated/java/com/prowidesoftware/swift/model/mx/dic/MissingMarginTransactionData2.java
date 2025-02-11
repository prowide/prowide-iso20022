
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Detailed information about the outstanding derivatives for which no margin or outdated margin information has been reported.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingMarginTransactionData2", propOrder = {
    "txId",
    "collTmStmp"
})
public class MissingMarginTransactionData2 {

    @XmlElement(name = "TxId", required = true)
    protected TradeTransactionIdentification24 txId;
    @XmlElement(name = "CollTmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime collTmStmp;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionIdentification24 }
     *     
     */
    public TradeTransactionIdentification24 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionIdentification24 }
     *     
     */
    public MissingMarginTransactionData2 setTxId(TradeTransactionIdentification24 value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the collTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getCollTmStmp() {
        return collTmStmp;
    }

    /**
     * Sets the value of the collTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MissingMarginTransactionData2 setCollTmStmp(OffsetDateTime value) {
        this.collTmStmp = value;
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
