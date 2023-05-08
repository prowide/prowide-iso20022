
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Reports on transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transactions2", propOrder = {
    "pmtCmonInf",
    "txRpt"
})
public class Transactions2 {

    @XmlElement(name = "PmtCmonInf")
    protected PaymentCommonDetails2 pmtCmonInf;
    @XmlElement(name = "TxRpt", required = true)
    protected List<TransactionReportDetails3> txRpt;

    /**
     * Gets the value of the pmtCmonInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCommonDetails2 }
     *     
     */
    public PaymentCommonDetails2 getPmtCmonInf() {
        return pmtCmonInf;
    }

    /**
     * Sets the value of the pmtCmonInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCommonDetails2 }
     *     
     */
    public Transactions2 setPmtCmonInf(PaymentCommonDetails2 value) {
        this.pmtCmonInf = value;
        return this;
    }

    /**
     * Gets the value of the txRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionReportDetails3 }
     * 
     * 
     * @return
     *     The value of the txRpt property.
     */
    public List<TransactionReportDetails3> getTxRpt() {
        if (txRpt == null) {
            txRpt = new ArrayList<>();
        }
        return this.txRpt;
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

    /**
     * Adds a new item to the txRpt list.
     * @see #getTxRpt()
     * 
     */
    public Transactions2 addTxRpt(TransactionReportDetails3 txRpt) {
        getTxRpt().add(txRpt);
        return this;
    }

}
