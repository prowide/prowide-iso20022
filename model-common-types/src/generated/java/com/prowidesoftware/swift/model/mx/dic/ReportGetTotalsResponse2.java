
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
 * Content of the Get Totals Response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportGetTotalsResponse2", propOrder = {
    "poiRcncltnId",
    "txTtlsSet"
})
public class ReportGetTotalsResponse2 {

    @XmlElement(name = "POIRcncltnId", required = true)
    protected String poiRcncltnId;
    @XmlElement(name = "TxTtlsSet")
    protected List<TransactionTotalsSet2> txTtlsSet;

    /**
     * Gets the value of the poiRcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIRcncltnId() {
        return poiRcncltnId;
    }

    /**
     * Sets the value of the poiRcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportGetTotalsResponse2 setPOIRcncltnId(String value) {
        this.poiRcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the txTtlsSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txTtlsSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxTtlsSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionTotalsSet2 }
     * 
     * 
     */
    public List<TransactionTotalsSet2> getTxTtlsSet() {
        if (txTtlsSet == null) {
            txTtlsSet = new ArrayList<TransactionTotalsSet2>();
        }
        return this.txTtlsSet;
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
     * Adds a new item to the txTtlsSet list.
     * @see #getTxTtlsSet()
     * 
     */
    public ReportGetTotalsResponse2 addTxTtlsSet(TransactionTotalsSet2 txTtlsSet) {
        getTxTtlsSet().add(txTtlsSet);
        return this;
    }

}
