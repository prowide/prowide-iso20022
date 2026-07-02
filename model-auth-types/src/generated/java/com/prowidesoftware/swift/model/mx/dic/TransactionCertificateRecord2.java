
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
 * Certificate record in which all currency control transactions are registered.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCertificateRecord2", propOrder = {
    "certRcrdId",
    "docSubmitgPrcdr",
    "tx",
    "ctrct",
    "attchmnt"
})
public class TransactionCertificateRecord2 {

    @XmlElement(name = "CertRcrdId", required = true)
    protected String certRcrdId;
    @XmlElement(name = "DocSubmitgPrcdr")
    protected String docSubmitgPrcdr;
    @XmlElement(name = "Tx", required = true)
    protected TransactionCertificate5 tx;
    @XmlElement(name = "Ctrct")
    protected TransactionCertificateContract2 ctrct;
    @XmlElement(name = "Attchmnt")
    protected List<DocumentGeneralInformation5> attchmnt;

    /**
     * Gets the value of the certRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertRcrdId() {
        return certRcrdId;
    }

    /**
     * Sets the value of the certRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionCertificateRecord2 setCertRcrdId(String value) {
        this.certRcrdId = value;
        return this;
    }

    /**
     * Gets the value of the docSubmitgPrcdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocSubmitgPrcdr() {
        return docSubmitgPrcdr;
    }

    /**
     * Sets the value of the docSubmitgPrcdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionCertificateRecord2 setDocSubmitgPrcdr(String value) {
        this.docSubmitgPrcdr = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCertificate5 }
     *     
     */
    public TransactionCertificate5 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCertificate5 }
     *     
     */
    public TransactionCertificateRecord2 setTx(TransactionCertificate5 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the ctrct property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCertificateContract2 }
     *     
     */
    public TransactionCertificateContract2 getCtrct() {
        return ctrct;
    }

    /**
     * Sets the value of the ctrct property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCertificateContract2 }
     *     
     */
    public TransactionCertificateRecord2 setCtrct(TransactionCertificateContract2 value) {
        this.ctrct = value;
        return this;
    }

    /**
     * Gets the value of the attchmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attchmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGeneralInformation5 }
     * 
     * 
     */
    public List<DocumentGeneralInformation5> getAttchmnt() {
        if (attchmnt == null) {
            attchmnt = new ArrayList<DocumentGeneralInformation5>();
        }
        return this.attchmnt;
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
     * Adds a new item to the attchmnt list.
     * @see #getAttchmnt()
     * 
     */
    public TransactionCertificateRecord2 addAttchmnt(DocumentGeneralInformation5 attchmnt) {
        getAttchmnt().add(attchmnt);
        return this;
    }

}
