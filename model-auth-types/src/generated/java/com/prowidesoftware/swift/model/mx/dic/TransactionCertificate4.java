
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
 * Certificate against which all currency control transactions are registered.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCertificate4", propOrder = {
    "txId",
    "cert",
    "acct",
    "bkAcctDmcltnCtry",
    "amdmnt",
    "certRcrd",
    "splmtryData"
})
public class TransactionCertificate4 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "Cert", required = true)
    protected DocumentIdentification28 cert;
    @XmlElement(name = "Acct")
    protected CashAccount40 acct;
    @XmlElement(name = "BkAcctDmcltnCtry")
    protected String bkAcctDmcltnCtry;
    @XmlElement(name = "Amdmnt")
    protected DocumentAmendment1 amdmnt;
    @XmlElement(name = "CertRcrd", required = true)
    protected List<TransactionCertificateRecord2> certRcrd;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

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
    public TransactionCertificate4 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the cert property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public DocumentIdentification28 getCert() {
        return cert;
    }

    /**
     * Sets the value of the cert property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification28 }
     *     
     */
    public TransactionCertificate4 setCert(DocumentIdentification28 value) {
        this.cert = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public TransactionCertificate4 setAcct(CashAccount40 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the bkAcctDmcltnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkAcctDmcltnCtry() {
        return bkAcctDmcltnCtry;
    }

    /**
     * Sets the value of the bkAcctDmcltnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionCertificate4 setBkAcctDmcltnCtry(String value) {
        this.bkAcctDmcltnCtry = value;
        return this;
    }

    /**
     * Gets the value of the amdmnt property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentAmendment1 }
     *     
     */
    public DocumentAmendment1 getAmdmnt() {
        return amdmnt;
    }

    /**
     * Sets the value of the amdmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentAmendment1 }
     *     
     */
    public TransactionCertificate4 setAmdmnt(DocumentAmendment1 value) {
        this.amdmnt = value;
        return this;
    }

    /**
     * Gets the value of the certRcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certRcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionCertificateRecord2 }
     * 
     * 
     */
    public List<TransactionCertificateRecord2> getCertRcrd() {
        if (certRcrd == null) {
            certRcrd = new ArrayList<TransactionCertificateRecord2>();
        }
        return this.certRcrd;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the certRcrd list.
     * @see #getCertRcrd()
     * 
     */
    public TransactionCertificate4 addCertRcrd(TransactionCertificateRecord2 certRcrd) {
        getCertRcrd().add(certRcrd);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public TransactionCertificate4 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
