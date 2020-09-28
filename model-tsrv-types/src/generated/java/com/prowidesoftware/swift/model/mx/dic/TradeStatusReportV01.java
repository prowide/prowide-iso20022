
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
 * The TradeStatusReport message is exchanged between parties involved in the trade finance domain to report the transaction level status of a transaction previously received. It informs the sender about the positive or negative status of the referenced transaction, such as acceptance or rejection resulting from technical validation performed by the parser and/or front-office applications. It can be used, for example, to acknowledge receipt of a transaction, to report a syntactical error, to report an unrecognised digital signature, to indicate that further processing is pending, and to indicate that a transaction has been technically accepted for processing by the back-office application. Multiple TradeStatusReport messages may be progressively sent in response to the incremental processing of a single transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeStatusReportV01", propOrder = {
    "tradStsAdvcDtls",
    "dgtlSgntr"
})
public class TradeStatusReportV01 {

    @XmlElement(name = "TradStsAdvcDtls", required = true)
    protected TradeStatusReport1 tradStsAdvcDtls;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the tradStsAdvcDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TradeStatusReport1 }
     *     
     */
    public TradeStatusReport1 getTradStsAdvcDtls() {
        return tradStsAdvcDtls;
    }

    /**
     * Sets the value of the tradStsAdvcDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeStatusReport1 }
     *     
     */
    public TradeStatusReportV01 setTradStsAdvcDtls(TradeStatusReport1 value) {
        this.tradStsAdvcDtls = value;
        return this;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public PartyAndSignature2 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Sets the value of the dgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public TradeStatusReportV01 setDgtlSgntr(PartyAndSignature2 value) {
        this.dgtlSgntr = value;
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
