
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Number of individual reports or transactions received / sent, detailed per validation rule.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfTransactionsPerValidationRule3", propOrder = {
    "dtldNb",
    "txSts"
})
public class NumberOfTransactionsPerValidationRule3 {

    @XmlElement(name = "DtldNb", required = true)
    protected String dtldNb;
    @XmlElement(name = "TxSts", required = true)
    protected List<RejectionReason43> txSts;

    /**
     * Gets the value of the dtldNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtldNb() {
        return dtldNb;
    }

    /**
     * Sets the value of the dtldNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NumberOfTransactionsPerValidationRule3 setDtldNb(String value) {
        this.dtldNb = value;
        return this;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectionReason43 }
     * 
     * 
     */
    public List<RejectionReason43> getTxSts() {
        if (txSts == null) {
            txSts = new ArrayList<RejectionReason43>();
        }
        return this.txSts;
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
     * Adds a new item to the txSts list.
     * @see #getTxSts()
     * 
     */
    public NumberOfTransactionsPerValidationRule3 addTxSts(RejectionReason43 txSts) {
        getTxSts().add(txSts);
        return this;
    }

}
