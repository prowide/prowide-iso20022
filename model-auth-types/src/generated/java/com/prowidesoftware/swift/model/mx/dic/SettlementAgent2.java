
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
 * Bank used by a central counterparty to allow for the convenient settlement of obligations between a central counterparty and a clearing member, typically in commercial bank money. Gross credits and gross debits included.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementAgent2", propOrder = {
    "id",
    "acct"
})
public class SettlementAgent2 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Acct", required = true)
    protected List<PaymentAccount4> acct;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementAgent2 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentAccount4 }
     * 
     * 
     */
    public List<PaymentAccount4> getAcct() {
        if (acct == null) {
            acct = new ArrayList<PaymentAccount4>();
        }
        return this.acct;
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
     * Adds a new item to the acct list.
     * @see #getAcct()
     * 
     */
    public SettlementAgent2 addAcct(PaymentAccount4 acct) {
        getAcct().add(acct);
        return this;
    }

}
