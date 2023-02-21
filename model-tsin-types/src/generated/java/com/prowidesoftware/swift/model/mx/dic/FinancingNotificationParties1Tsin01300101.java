
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identifies a party that notifies a financial document, the party to be notified, and whether notified party must send an acknowledgement and to whom.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingNotificationParties1", propOrder = {
    "ntifngPty",
    "ntfctnRcvr",
    "ackRcvr"
})
public class FinancingNotificationParties1Tsin01300101 {

    @XmlElement(name = "NtifngPty", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object ntifngPty;
    @XmlElement(name = "NtfctnRcvr", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object ntfctnRcvr;
    @XmlElementRef(name = "AckRcvr", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> ackRcvr;

    /**
     * Gets the value of the ntifngPty property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNtifngPty() {
        return ntifngPty;
    }

    /**
     * Sets the value of the ntifngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FinancingNotificationParties1Tsin01300101 setNtifngPty(Object value) {
        this.ntifngPty = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnRcvr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNtfctnRcvr() {
        return ntfctnRcvr;
    }

    /**
     * Sets the value of the ntfctnRcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public FinancingNotificationParties1Tsin01300101 setNtfctnRcvr(Object value) {
        this.ntfctnRcvr = value;
        return this;
    }

    /**
     * Gets the value of the ackRcvr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ackRcvr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAckRcvr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getAckRcvr() {
        if (ackRcvr == null) {
            ackRcvr = new ArrayList<JAXBElement<Object>>();
        }
        return this.ackRcvr;
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
     * Adds a new item to the ackRcvr list.
     * @see #getAckRcvr()
     * 
     */
    public FinancingNotificationParties1Tsin01300101 addAckRcvr(JAXBElement<Object> ackRcvr) {
        getAckRcvr().add(ackRcvr);
        return this;
    }

}
