
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
 * Identifies a customer identification as the search criteria for the financial institution to do the investigation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerIdentification2", propOrder = {
    "pty",
    "authrtyReq"
})
public class CustomerIdentification2 {

    @XmlElement(name = "Pty", required = true)
    protected PartyIdentification272 pty;
    @XmlElement(name = "AuthrtyReq", required = true)
    protected List<AuthorityInvestigation2> authrtyReq;

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public CustomerIdentification2 setPty(PartyIdentification272 value) {
        this.pty = value;
        return this;
    }

    /**
     * Gets the value of the authrtyReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authrtyReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthrtyReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorityInvestigation2 }
     * 
     * 
     * @return
     *     The value of the authrtyReq property.
     */
    public List<AuthorityInvestigation2> getAuthrtyReq() {
        if (authrtyReq == null) {
            authrtyReq = new ArrayList<>();
        }
        return this.authrtyReq;
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
     * Adds a new item to the authrtyReq list.
     * @see #getAuthrtyReq()
     * 
     */
    public CustomerIdentification2 addAuthrtyReq(AuthorityInvestigation2 authrtyReq) {
        getAuthrtyReq().add(authrtyReq);
        return this;
    }

}
