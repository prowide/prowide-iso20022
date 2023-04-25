
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
 * The UndertakingIssuance message is sent (and is thus issued) by the party issuing the undertaking to the beneficiary. The message may be sent either to the beneficiary directly or via an advising party. The undertaking could be a demand guarantee, standby letter of credit, or counter-undertaking (counter-guarantee or counter-standby). It contains details on the applicable rules, expiry date, the amount, required documents, and terms and conditions of the undertaking. The message constitutes an operative financial instrument.
 * Under the United Nations Convention on Independent Guarantees and Stand-by Letters of Credit (http://www.uncitral.org), 1996, Article 2, "an undertaking is an independent commitment, known in international practice as an independent guarantee or as a standby letter of credit, given by a bank or other institution or person ('guarantor/issuer') to pay to the beneficiary a certain or determinable amount upon simple demand or upon demand accompanied by other documents, in conformity with the terms and any documentary conditions of the undertaking, indicating, or from which it is to be inferred, that payment is due because of a default in the performance of an obligation, or because of another contingency, or for money borrowed or advanced, or on account of any mature indebtedness undertaken by the principal/applicant or another person".
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingIssuanceV01", propOrder = {
    "udrtkgIssncDtls",
    "bkToBnfcryInf",
    "bkToBkInf",
    "dgtlSgntr"
})
public class UndertakingIssuanceV01 {

    @XmlElement(name = "UdrtkgIssncDtls", required = true)
    protected Undertaking3 udrtkgIssncDtls;
    @XmlElement(name = "BkToBnfcryInf")
    protected List<String> bkToBnfcryInf;
    @XmlElement(name = "BkToBkInf")
    protected List<String> bkToBkInf;
    @XmlElement(name = "DgtlSgntr")
    protected List<PartyAndSignature2> dgtlSgntr;

    /**
     * Gets the value of the udrtkgIssncDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking3 }
     *     
     */
    public Undertaking3 getUdrtkgIssncDtls() {
        return udrtkgIssncDtls;
    }

    /**
     * Sets the value of the udrtkgIssncDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking3 }
     *     
     */
    public UndertakingIssuanceV01 setUdrtkgIssncDtls(Undertaking3 value) {
        this.udrtkgIssncDtls = value;
        return this;
    }

    /**
     * Gets the value of the bkToBnfcryInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bkToBnfcryInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBkToBnfcryInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the bkToBnfcryInf property.
     */
    public List<String> getBkToBnfcryInf() {
        if (bkToBnfcryInf == null) {
            bkToBnfcryInf = new ArrayList<>();
        }
        return this.bkToBnfcryInf;
    }

    /**
     * Gets the value of the bkToBkInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bkToBkInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBkToBkInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the bkToBkInf property.
     */
    public List<String> getBkToBkInf() {
        if (bkToBkInf == null) {
            bkToBkInf = new ArrayList<>();
        }
        return this.bkToBkInf;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dgtlSgntr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgtlSgntr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAndSignature2 }
     * 
     * 
     * @return
     *     The value of the dgtlSgntr property.
     */
    public List<PartyAndSignature2> getDgtlSgntr() {
        if (dgtlSgntr == null) {
            dgtlSgntr = new ArrayList<>();
        }
        return this.dgtlSgntr;
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
     * Adds a new item to the bkToBnfcryInf list.
     * @see #getBkToBnfcryInf()
     * 
     */
    public UndertakingIssuanceV01 addBkToBnfcryInf(String bkToBnfcryInf) {
        getBkToBnfcryInf().add(bkToBnfcryInf);
        return this;
    }

    /**
     * Adds a new item to the bkToBkInf list.
     * @see #getBkToBkInf()
     * 
     */
    public UndertakingIssuanceV01 addBkToBkInf(String bkToBkInf) {
        getBkToBkInf().add(bkToBkInf);
        return this;
    }

    /**
     * Adds a new item to the dgtlSgntr list.
     * @see #getDgtlSgntr()
     * 
     */
    public UndertakingIssuanceV01 addDgtlSgntr(PartyAndSignature2 dgtlSgntr) {
        getDgtlSgntr().add(dgtlSgntr);
        return this;
    }

}
