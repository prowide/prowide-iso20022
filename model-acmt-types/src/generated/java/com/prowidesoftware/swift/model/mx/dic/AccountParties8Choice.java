
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
 * Information about a party's account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountParties8Choice", propOrder = {
    "pmryOwnr",
    "trstee",
    "nmnee",
    "jntOwnr"
})
public class AccountParties8Choice {

    @XmlElement(name = "PmryOwnr")
    protected InvestmentAccountOwnershipInformation12 pmryOwnr;
    @XmlElement(name = "Trstee")
    protected List<InvestmentAccountOwnershipInformation12> trstee;
    @XmlElement(name = "Nmnee")
    protected InvestmentAccountOwnershipInformation12 nmnee;
    @XmlElement(name = "JntOwnr")
    protected List<InvestmentAccountOwnershipInformation12> jntOwnr;

    /**
     * Gets the value of the pmryOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation12 }
     *     
     */
    public InvestmentAccountOwnershipInformation12 getPmryOwnr() {
        return pmryOwnr;
    }

    /**
     * Sets the value of the pmryOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation12 }
     *     
     */
    public AccountParties8Choice setPmryOwnr(InvestmentAccountOwnershipInformation12 value) {
        this.pmryOwnr = value;
        return this;
    }

    /**
     * Gets the value of the trstee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trstee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrstee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation12 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation12> getTrstee() {
        if (trstee == null) {
            trstee = new ArrayList<InvestmentAccountOwnershipInformation12>();
        }
        return this.trstee;
    }

    /**
     * Gets the value of the nmnee property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation12 }
     *     
     */
    public InvestmentAccountOwnershipInformation12 getNmnee() {
        return nmnee;
    }

    /**
     * Sets the value of the nmnee property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation12 }
     *     
     */
    public AccountParties8Choice setNmnee(InvestmentAccountOwnershipInformation12 value) {
        this.nmnee = value;
        return this;
    }

    /**
     * Gets the value of the jntOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jntOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJntOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation12 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation12> getJntOwnr() {
        if (jntOwnr == null) {
            jntOwnr = new ArrayList<InvestmentAccountOwnershipInformation12>();
        }
        return this.jntOwnr;
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
     * Adds a new item to the trstee list.
     * @see #getTrstee()
     * 
     */
    public AccountParties8Choice addTrstee(InvestmentAccountOwnershipInformation12 trstee) {
        getTrstee().add(trstee);
        return this;
    }

    /**
     * Adds a new item to the jntOwnr list.
     * @see #getJntOwnr()
     * 
     */
    public AccountParties8Choice addJntOwnr(InvestmentAccountOwnershipInformation12 jntOwnr) {
        getJntOwnr().add(jntOwnr);
        return this;
    }

}
