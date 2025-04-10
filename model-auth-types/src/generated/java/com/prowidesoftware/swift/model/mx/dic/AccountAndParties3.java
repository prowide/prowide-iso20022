
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
 * Identifies the account as the search criteria for the financial institution to do the investigation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountAndParties3", propOrder = {
    "id",
    "invstgtdPties",
    "authrtyReqTp"
})
public class AccountAndParties3 {

    @XmlElement(name = "Id", required = true)
    protected CashAccount43 id;
    @XmlElement(name = "InvstgtdPties", required = true)
    protected InvestigatedParties1Choice invstgtdPties;
    @XmlElement(name = "AuthrtyReqTp", required = true)
    protected List<AuthorityRequestType1> authrtyReqTp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount43 }
     *     
     */
    public CashAccount43 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount43 }
     *     
     */
    public AccountAndParties3 setId(CashAccount43 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the invstgtdPties property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public InvestigatedParties1Choice getInvstgtdPties() {
        return invstgtdPties;
    }

    /**
     * Sets the value of the invstgtdPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public AccountAndParties3 setInvstgtdPties(InvestigatedParties1Choice value) {
        this.invstgtdPties = value;
        return this;
    }

    /**
     * Gets the value of the authrtyReqTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authrtyReqTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthrtyReqTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorityRequestType1 }
     * 
     * 
     * @return
     *     The value of the authrtyReqTp property.
     */
    public List<AuthorityRequestType1> getAuthrtyReqTp() {
        if (authrtyReqTp == null) {
            authrtyReqTp = new ArrayList<>();
        }
        return this.authrtyReqTp;
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
     * Adds a new item to the authrtyReqTp list.
     * @see #getAuthrtyReqTp()
     * 
     */
    public AccountAndParties3 addAuthrtyReqTp(AuthorityRequestType1 authrtyReqTp) {
        getAuthrtyReqTp().add(authrtyReqTp);
        return this;
    }

}
