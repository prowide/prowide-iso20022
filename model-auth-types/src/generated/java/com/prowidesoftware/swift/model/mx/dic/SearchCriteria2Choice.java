
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
 * Choice of search criteria for the financial investigation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCriteria2Choice", propOrder = {
    "acct",
    "cstmrId",
    "pmtInstrm",
    "orgnlTxNb"
})
public class SearchCriteria2Choice {

    @XmlElement(name = "Acct")
    protected AccountAndParties3 acct;
    @XmlElement(name = "CstmrId")
    protected CustomerIdentification2 cstmrId;
    @XmlElement(name = "PmtInstrm")
    protected PaymentInstrumentType1 pmtInstrm;
    @XmlElement(name = "OrgnlTxNb")
    protected List<RequestType1> orgnlTxNb;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountAndParties3 }
     *     
     */
    public AccountAndParties3 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountAndParties3 }
     *     
     */
    public SearchCriteria2Choice setAcct(AccountAndParties3 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the cstmrId property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentification2 }
     *     
     */
    public CustomerIdentification2 getCstmrId() {
        return cstmrId;
    }

    /**
     * Sets the value of the cstmrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentification2 }
     *     
     */
    public SearchCriteria2Choice setCstmrId(CustomerIdentification2 value) {
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
    public SearchCriteria2Choice setPmtInstrm(PaymentInstrumentType1 value) {
        this.pmtInstrm = value;
        return this;
    }

    /**
     * Gets the value of the orgnlTxNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgnlTxNb property.
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
     */
    public List<RequestType1> getOrgnlTxNb() {
        if (orgnlTxNb == null) {
            orgnlTxNb = new ArrayList<RequestType1>();
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
    public SearchCriteria2Choice addOrgnlTxNb(RequestType1 orgnlTxNb) {
        getOrgnlTxNb().add(orgnlTxNb);
        return this;
    }

}
