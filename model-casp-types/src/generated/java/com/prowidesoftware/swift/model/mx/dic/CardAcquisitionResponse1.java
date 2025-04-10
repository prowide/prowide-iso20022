
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
 * Content of the Card Acquisition Response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAcquisitionResponse1", propOrder = {
    "poiTxId",
    "pmtBrnd",
    "cstmrLang",
    "lltyAcct",
    "cstmrOrdr"
})
public class CardAcquisitionResponse1 {

    @XmlElement(name = "POITxId", required = true)
    protected TransactionIdentifier1 poiTxId;
    @XmlElement(name = "PmtBrnd")
    protected List<String> pmtBrnd;
    @XmlElement(name = "CstmrLang")
    protected String cstmrLang;
    @XmlElement(name = "LltyAcct")
    protected List<LoyaltyAccount1> lltyAcct;
    @XmlElement(name = "CstmrOrdr")
    protected List<CustomerOrder1> cstmrOrdr;

    /**
     * Gets the value of the poiTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getPOITxId() {
        return poiTxId;
    }

    /**
     * Sets the value of the poiTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public CardAcquisitionResponse1 setPOITxId(TransactionIdentifier1 value) {
        this.poiTxId = value;
        return this;
    }

    /**
     * Gets the value of the pmtBrnd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtBrnd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtBrnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the pmtBrnd property.
     */
    public List<String> getPmtBrnd() {
        if (pmtBrnd == null) {
            pmtBrnd = new ArrayList<>();
        }
        return this.pmtBrnd;
    }

    /**
     * Gets the value of the cstmrLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrLang() {
        return cstmrLang;
    }

    /**
     * Sets the value of the cstmrLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAcquisitionResponse1 setCstmrLang(String value) {
        this.cstmrLang = value;
        return this;
    }

    /**
     * Gets the value of the lltyAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lltyAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyAccount1 }
     * 
     * 
     * @return
     *     The value of the lltyAcct property.
     */
    public List<LoyaltyAccount1> getLltyAcct() {
        if (lltyAcct == null) {
            lltyAcct = new ArrayList<>();
        }
        return this.lltyAcct;
    }

    /**
     * Gets the value of the cstmrOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cstmrOrdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstmrOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrder1 }
     * 
     * 
     * @return
     *     The value of the cstmrOrdr property.
     */
    public List<CustomerOrder1> getCstmrOrdr() {
        if (cstmrOrdr == null) {
            cstmrOrdr = new ArrayList<>();
        }
        return this.cstmrOrdr;
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
     * Adds a new item to the pmtBrnd list.
     * @see #getPmtBrnd()
     * 
     */
    public CardAcquisitionResponse1 addPmtBrnd(String pmtBrnd) {
        getPmtBrnd().add(pmtBrnd);
        return this;
    }

    /**
     * Adds a new item to the lltyAcct list.
     * @see #getLltyAcct()
     * 
     */
    public CardAcquisitionResponse1 addLltyAcct(LoyaltyAccount1 lltyAcct) {
        getLltyAcct().add(lltyAcct);
        return this;
    }

    /**
     * Adds a new item to the cstmrOrdr list.
     * @see #getCstmrOrdr()
     * 
     */
    public CardAcquisitionResponse1 addCstmrOrdr(CustomerOrder1 cstmrOrdr) {
        getCstmrOrdr().add(cstmrOrdr);
        return this;
    }

}
