
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
 * Scope
 * A trading party, eg, a broker, sends the Quote message to another trading party, eg, an investment manager, to notify price details of a financial instrument. It can also be used to notify quotes for multiple securities to support the mass quoting of an option series.
 * The Quote message is used to respond to a QuoteRequest and QuoteResponse message. It may also be used to send quotes on an unsollicited basis.
 * Usage
 * The Quote message may also be sent in a tradeable and restricted tradeable quoting market.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quote", propOrder = {
    "id",
    "refs",
    "qtDtls"
})
public class Quote {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "Refs")
    protected Reference3 refs;
    @XmlElement(name = "QtDtls", required = true)
    protected List<Quote2> qtDtls;

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
    public Quote setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link Reference3 }
     *     
     */
    public Reference3 getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference3 }
     *     
     */
    public Quote setRefs(Reference3 value) {
        this.refs = value;
        return this;
    }

    /**
     * Gets the value of the qtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Quote2 }
     * 
     * 
     */
    public List<Quote2> getQtDtls() {
        if (qtDtls == null) {
            qtDtls = new ArrayList<Quote2>();
        }
        return this.qtDtls;
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
     * Adds a new item to the qtDtls list.
     * @see #getQtDtls()
     * 
     */
    public Quote addQtDtls(Quote2 qtDtls) {
        getQtDtls().add(qtDtls);
        return this;
    }

}
