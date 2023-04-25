
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
 * A trading party, eg, an investment manager, sends the QuoteRequest message to another trading party, eg, a broker to request quote details of a financial instrument prior to the placement of an order.
 * Usage
 * The QuoteRequest message may also be sent in a tradeable and restricted tradeable quoting market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteRequest", propOrder = {
    "id",
    "refs",
    "qtReqDtls",
    "ordr",
    "sttlm"
})
public class QuoteRequest {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "Refs", required = true)
    protected Reference1 refs;
    @XmlElement(name = "QtReqDtls", required = true)
    protected List<QuoteRequest1> qtReqDtls;
    @XmlElement(name = "Ordr")
    protected List<Order2> ordr;
    @XmlElement(name = "Sttlm")
    protected List<SecuritiesSettlement1> sttlm;

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
    public QuoteRequest setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link Reference1 }
     *     
     */
    public Reference1 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference1 }
     *     
     */
    public QuoteRequest setRefs(Reference1 value) {
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
    public QuoteRequest addQtReqDtls(QuoteRequest1 qtReqDtls) {
        getQtReqDtls().add(qtReqDtls);
        return this;
    }

    /**
     * Adds a new item to the ordr list.
     * @see #getOrdr()
     * 
     */
    public QuoteRequest addOrdr(Order2 ordr) {
        getOrdr().add(ordr);
        return this;
    }

    /**
     * Adds a new item to the sttlm list.
     * @see #getSttlm()
     * 
     */
    public QuoteRequest addSttlm(SecuritiesSettlement1 sttlm) {
        getSttlm().add(sttlm);
        return this;
    }

}
