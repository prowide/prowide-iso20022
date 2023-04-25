
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
 * Scope
 * A trading party, eg, a broker, sends the QuoteRequestReject message to another trading party, eg, an investment manager to reject a previously received QuoteRequest message.
 * Usage
 * The QuoteRequestReject message may also be used in a tradeable and restricted tradeable quoting market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteRequestReject", propOrder = {
    "id",
    "refs",
    "qtReqDtls",
    "ordr",
    "sttlm",
    "qtReqRjctnDtls"
})
public class QuoteRequestReject {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "Refs", required = true)
    protected Reference2 refs;
    @XmlElement(name = "QtReqDtls", required = true)
    protected List<QuoteRequest1> qtReqDtls;
    @XmlElement(name = "Ordr")
    protected List<Order2> ordr;
    @XmlElement(name = "Sttlm")
    protected List<SecuritiesSettlement1> sttlm;
    @XmlElement(name = "QtReqRjctnDtls", required = true)
    protected List<RejectionReason4> qtReqRjctnDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public QuoteRequestReject setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link Reference2 }
     *     
     */
    public Reference2 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference2 }
     *     
     */
    public QuoteRequestReject setRefs(Reference2 value) {
        this.refs = value;
        return this;
    }

    /**
     * Gets the value of the qtReqDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qtReqDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtReqDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteRequest1 }
     * 
     * 
     * @return
     *     The value of the qtReqDtls property.
     */
    public List<QuoteRequest1> getQtReqDtls() {
        if (qtReqDtls == null) {
            qtReqDtls = new ArrayList<>();
        }
        return this.qtReqDtls;
    }

    /**
     * Gets the value of the ordr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ordr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Order2 }
     * 
     * 
     * @return
     *     The value of the ordr property.
     */
    public List<Order2> getOrdr() {
        if (ordr == null) {
            ordr = new ArrayList<>();
        }
        return this.ordr;
    }

    /**
     * Gets the value of the sttlm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesSettlement1 }
     * 
     * 
     * @return
     *     The value of the sttlm property.
     */
    public List<SecuritiesSettlement1> getSttlm() {
        if (sttlm == null) {
            sttlm = new ArrayList<>();
        }
        return this.sttlm;
    }

    /**
     * Gets the value of the qtReqRjctnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qtReqRjctnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtReqRjctnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectionReason4 }
     * 
     * 
     * @return
     *     The value of the qtReqRjctnDtls property.
     */
    public List<RejectionReason4> getQtReqRjctnDtls() {
        if (qtReqRjctnDtls == null) {
            qtReqRjctnDtls = new ArrayList<>();
        }
        return this.qtReqRjctnDtls;
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
     * Adds a new item to the qtReqDtls list.
     * @see #getQtReqDtls()
     * 
     */
    public QuoteRequestReject addQtReqDtls(QuoteRequest1 qtReqDtls) {
        getQtReqDtls().add(qtReqDtls);
        return this;
    }

    /**
     * Adds a new item to the ordr list.
     * @see #getOrdr()
     * 
     */
    public QuoteRequestReject addOrdr(Order2 ordr) {
        getOrdr().add(ordr);
        return this;
    }

    /**
     * Adds a new item to the sttlm list.
     * @see #getSttlm()
     * 
     */
    public QuoteRequestReject addSttlm(SecuritiesSettlement1 sttlm) {
        getSttlm().add(sttlm);
        return this;
    }

    /**
     * Adds a new item to the qtReqRjctnDtls list.
     * @see #getQtReqRjctnDtls()
     * 
     */
    public QuoteRequestReject addQtReqRjctnDtls(RejectionReason4 qtReqRjctnDtls) {
        getQtReqRjctnDtls().add(qtReqRjctnDtls);
        return this;
    }

}
