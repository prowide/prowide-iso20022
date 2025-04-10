
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Card transaction for which the authorisation has been requested.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransaction10", propOrder = {
    "rcncltn",
    "intrBkSttlmDt",
    "initrTxDtTm",
    "initrTxId",
    "txLifeCyclId",
    "rcncltnTtls",
    "amtNetRcncltn",
    "txRspn"
})
public class CardTransaction10 {

    @XmlElement(name = "Rcncltn")
    protected TransactionIdentifier2 rcncltn;
    @XmlElement(name = "IntrBkSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intrBkSttlmDt;
    @XmlElement(name = "InitrTxDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initrTxDtTm;
    @XmlElement(name = "InitrTxId", required = true)
    protected String initrTxId;
    @XmlElement(name = "TxLifeCyclId")
    protected String txLifeCyclId;
    @XmlElement(name = "RcncltnTtls")
    protected TransactionTotals4 rcncltnTtls;
    @XmlElement(name = "AmtNetRcncltn")
    protected AmountAndDirection41 amtNetRcncltn;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType2 txRspn;

    /**
     * Gets the value of the rcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier2 }
     *     
     */
    public TransactionIdentifier2 getRcncltn() {
        return rcncltn;
    }

    /**
     * Sets the value of the rcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier2 }
     *     
     */
    public CardTransaction10 setRcncltn(TransactionIdentifier2 value) {
        this.rcncltn = value;
        return this;
    }

    /**
     * Gets the value of the intrBkSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    /**
     * Sets the value of the intrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransaction10 setIntrBkSttlmDt(XMLGregorianCalendar value) {
        this.intrBkSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the initrTxDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getInitrTxDtTm() {
        return initrTxDtTm;
    }

    /**
     * Sets the value of the initrTxDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransaction10 setInitrTxDtTm(XMLGregorianCalendar value) {
        this.initrTxDtTm = value;
        return this;
    }

    /**
     * Gets the value of the initrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitrTxId() {
        return initrTxId;
    }

    /**
     * Sets the value of the initrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransaction10 setInitrTxId(String value) {
        this.initrTxId = value;
        return this;
    }

    /**
     * Gets the value of the txLifeCyclId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxLifeCyclId() {
        return txLifeCyclId;
    }

    /**
     * Sets the value of the txLifeCyclId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransaction10 setTxLifeCyclId(String value) {
        this.txLifeCyclId = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnTtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionTotals4 }
     *     
     */
    public TransactionTotals4 getRcncltnTtls() {
        return rcncltnTtls;
    }

    /**
     * Sets the value of the rcncltnTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTotals4 }
     *     
     */
    public CardTransaction10 setRcncltnTtls(TransactionTotals4 value) {
        this.rcncltnTtls = value;
        return this;
    }

    /**
     * Gets the value of the amtNetRcncltn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection41 }
     *     
     */
    public AmountAndDirection41 getAmtNetRcncltn() {
        return amtNetRcncltn;
    }

    /**
     * Sets the value of the amtNetRcncltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection41 }
     *     
     */
    public CardTransaction10 setAmtNetRcncltn(AmountAndDirection41 value) {
        this.amtNetRcncltn = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType2 }
     *     
     */
    public ResponseType2 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType2 }
     *     
     */
    public CardTransaction10 setTxRspn(ResponseType2 value) {
        this.txRspn = value;
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
