
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides references to the submitted data set both for the matching application and for the user.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSetSubmissionReferences3", propOrder = {
    "txId",
    "purchsOrdrRef",
    "submitrTxRef",
    "forcdMtch"
})
public class DataSetSubmissionReferences3 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "PurchsOrdrRef", required = true)
    protected DocumentIdentification7 purchsOrdrRef;
    @XmlElement(name = "SubmitrTxRef")
    protected String submitrTxRef;
    @XmlElement(name = "ForcdMtch")
    protected boolean forcdMtch;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DataSetSubmissionReferences3 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the purchsOrdrRef property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public DocumentIdentification7 getPurchsOrdrRef() {
        return purchsOrdrRef;
    }

    /**
     * Sets the value of the purchsOrdrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification7 }
     *     
     */
    public DataSetSubmissionReferences3 setPurchsOrdrRef(DocumentIdentification7 value) {
        this.purchsOrdrRef = value;
        return this;
    }

    /**
     * Gets the value of the submitrTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitrTxRef() {
        return submitrTxRef;
    }

    /**
     * Sets the value of the submitrTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DataSetSubmissionReferences3 setSubmitrTxRef(String value) {
        this.submitrTxRef = value;
        return this;
    }

    /**
     * Gets the value of the forcdMtch property.
     * 
     */
    public boolean isForcdMtch() {
        return forcdMtch;
    }

    /**
     * Sets the value of the forcdMtch property.
     * 
     */
    public DataSetSubmissionReferences3 setForcdMtch(boolean value) {
        this.forcdMtch = value;
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
