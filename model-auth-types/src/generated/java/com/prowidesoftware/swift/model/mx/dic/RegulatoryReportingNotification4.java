
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
 * Provides details on the regulatory notification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryReportingNotification4", propOrder = {
    "txNtfctnId",
    "acctOwnr",
    "acctSvcr",
    "txCert"
})
public class RegulatoryReportingNotification4 {

    @XmlElement(name = "TxNtfctnId", required = true)
    protected String txNtfctnId;
    @XmlElement(name = "AcctOwnr", required = true)
    protected PartyIdentification272 acctOwnr;
    @XmlElement(name = "AcctSvcr", required = true)
    protected BranchAndFinancialInstitutionIdentification8 acctSvcr;
    @XmlElement(name = "TxCert", required = true)
    protected List<TransactionCertificate4> txCert;

    /**
     * Gets the value of the txNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxNtfctnId() {
        return txNtfctnId;
    }

    /**
     * Sets the value of the txNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegulatoryReportingNotification4 setTxNtfctnId(String value) {
        this.txNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public RegulatoryReportingNotification4 setAcctOwnr(PartyIdentification272 value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public RegulatoryReportingNotification4 setAcctSvcr(BranchAndFinancialInstitutionIdentification8 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the txCert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txCert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionCertificate4 }
     * 
     * 
     * @return
     *     The value of the txCert property.
     */
    public List<TransactionCertificate4> getTxCert() {
        if (txCert == null) {
            txCert = new ArrayList<>();
        }
        return this.txCert;
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
     * Adds a new item to the txCert list.
     * @see #getTxCert()
     * 
     */
    public RegulatoryReportingNotification4 addTxCert(TransactionCertificate4 txCert) {
        getTxCert().add(txCert);
        return this;
    }

}
