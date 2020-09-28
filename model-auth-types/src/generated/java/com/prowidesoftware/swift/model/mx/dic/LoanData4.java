
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the loan data details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanData4", propOrder = {
    "evtDt",
    "txLnData"
})
public class LoanData4 {

    @XmlElement(name = "EvtDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evtDt;
    @XmlElement(name = "TxLnData", required = true)
    protected TransactionLoanData4Choice txLnData;

    /**
     * Gets the value of the evtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvtDt() {
        return evtDt;
    }

    /**
     * Sets the value of the evtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public LoanData4 setEvtDt(XMLGregorianCalendar value) {
        this.evtDt = value;
        return this;
    }

    /**
     * Gets the value of the txLnData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionLoanData4Choice }
     *     
     */
    public TransactionLoanData4Choice getTxLnData() {
        return txLnData;
    }

    /**
     * Sets the value of the txLnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionLoanData4Choice }
     *     
     */
    public LoanData4 setTxLnData(TransactionLoanData4Choice value) {
        this.txLnData = value;
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
