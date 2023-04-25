
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
 * Choice of search criteria for the financial investigation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteria1Choice", propOrder = {
    "acct",
    "cstmrId",
    "pmtInstrm",
    "orgnlTxNb"
})
public class SearchCriteria1Choice {

    @XmlElement(name = "Acct")
    protected AccountAndParties1 acct;
    @XmlElement(name = "CstmrId")
    protected CustomerIdentification1 cstmrId;
    @XmlElement(name = "PmtInstrm")
    protected PaymentInstrumentType1 pmtInstrm;
    @XmlElement(name = "OrgnlTxNb")
    protected List<RequestType1> orgnlTxNb;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountAndParties1 }
     *     
     */
    public AccountAndParties1 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountAndParties1 }
     *     
     */
    public SearchCriteria1Choice setAcct(AccountAndParties1 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the cstmrId property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentification1 }
     *     
     */
    public CustomerIdentification1 getCstmrId() {
        return cstmrId;
    }

    /**
     * Sets the value of the cstmrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentification1 }
     *     
     */
    public SearchCriteria1Choice setCstmrId(CustomerIdentification1 value) {
        this.cstmrId = value;
        return this;
    }

    /**
     * Gets the value of the pmtInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrumentType1 }
     *     
     */
    public PaymentInstrumentType1 getPmtInstrm() {
        return pmtInstrm;
    }

    /**
     * Sets the value of the pmtInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrumentType1 }
     *     
     */
    public SearchCriteria1Choice setPmtInstrm(PaymentInstrumentType1 value) {
        this.pmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the orgnlTxNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orgnlTxNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlTxNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestType1 }
     * 
     * 
     * @return
     *     The value of the orgnlTxNb property.
     */
    public List<RequestType1> getOrgnlTxNb() {
        if (orgnlTxNb == null) {
            orgnlTxNb = new ArrayList<>();
        }
        return this.orgnlTxNb;
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
     * Adds a new item to the orgnlTxNb list.
     * @see #getOrgnlTxNb()
     * 
     */
    public SearchCriteria1Choice addOrgnlTxNb(RequestType1 orgnlTxNb) {
        getOrgnlTxNb().add(orgnlTxNb);
        return this;
    }

}
