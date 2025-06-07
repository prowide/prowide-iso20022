
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Network management transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransaction11", propOrder = {
    "ntwkMgmtTp",
    "nbOfMsgs",
    "maxNbOfMsgs",
    "initrDtTm",
    "txRspn"
})
public class CardTransaction11 {

    @XmlElement(name = "NtwkMgmtTp", required = true)
    @XmlSchemaType(name = "string")
    protected CardServiceType2Code ntwkMgmtTp;
    @XmlElement(name = "NbOfMsgs")
    protected BigDecimal nbOfMsgs;
    @XmlElement(name = "MaxNbOfMsgs")
    protected BigDecimal maxNbOfMsgs;
    @XmlElement(name = "InitrDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initrDtTm;
    @XmlElement(name = "TxRspn")
    protected ResponseType2 txRspn;

    /**
     * Gets the value of the ntwkMgmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardServiceType2Code }
     *     
     */
    public CardServiceType2Code getNtwkMgmtTp() {
        return ntwkMgmtTp;
    }

    /**
     * Sets the value of the ntwkMgmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardServiceType2Code }
     *     
     */
    public CardTransaction11 setNtwkMgmtTp(CardServiceType2Code value) {
        this.ntwkMgmtTp = value;
        return this;
    }

    /**
     * Gets the value of the nbOfMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfMsgs() {
        return nbOfMsgs;
    }

    /**
     * Sets the value of the nbOfMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardTransaction11 setNbOfMsgs(BigDecimal value) {
        this.nbOfMsgs = value;
        return this;
    }

    /**
     * Gets the value of the maxNbOfMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxNbOfMsgs() {
        return maxNbOfMsgs;
    }

    /**
     * Sets the value of the maxNbOfMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardTransaction11 setMaxNbOfMsgs(BigDecimal value) {
        this.maxNbOfMsgs = value;
        return this;
    }

    /**
     * Gets the value of the initrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getInitrDtTm() {
        return initrDtTm;
    }

    /**
     * Sets the value of the initrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardTransaction11 setInitrDtTm(XMLGregorianCalendar value) {
        this.initrDtTm = value;
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
    public CardTransaction11 setTxRspn(ResponseType2 value) {
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
