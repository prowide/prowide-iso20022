
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Content of the Reconciliation Response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationResponseData1", propOrder = {
    "rcncltnTp",
    "poiRcncltnId",
    "txTtls"
})
public class ReconciliationResponseData1 {

    @XmlElement(name = "RcncltnTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReconciliationType1Code rcncltnTp;
    @XmlElement(name = "POIRcncltnId")
    protected String poiRcncltnId;
    @XmlElement(name = "TxTtls")
    protected List<TransactionTotalsSet1> txTtls;

    /**
     * Gets the value of the rcncltnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationType1Code }
     *     
     */
    public ReconciliationType1Code getRcncltnTp() {
        return rcncltnTp;
    }

    /**
     * Sets the value of the rcncltnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationType1Code }
     *     
     */
    public ReconciliationResponseData1 setRcncltnTp(ReconciliationType1Code value) {
        this.rcncltnTp = value;
        return this;
    }

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
    public ReconciliationResponseData1 setPOIRcncltnId(String value) {
        this.poiRcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the txTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionTotalsSet1 }
     * 
     * 
     */
    public List<TransactionTotalsSet1> getTxTtls() {
        if (txTtls == null) {
            txTtls = new ArrayList<TransactionTotalsSet1>();
        }
        return this.txTtls;
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
     * Adds a new item to the txTtls list.
     * @see #getTxTtls()
     * 
     */
    public ReconciliationResponseData1 addTxTtls(TransactionTotalsSet1 txTtls) {
        getTxTtls().add(txTtls);
        return this;
    }

}
