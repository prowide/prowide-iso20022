
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
 * Information about a party's account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountParties7Choice", propOrder = {
    "pmryOwnr",
    "trstee",
    "ctdnForMnr",
    "nmnee",
    "jntOwnr"
})
public class AccountParties7Choice {

    @XmlElement(name = "PmryOwnr")
    protected InvestmentAccountOwnershipInformation10 pmryOwnr;
    @XmlElement(name = "Trstee")
    protected List<InvestmentAccountOwnershipInformation10> trstee;
    @XmlElement(name = "CtdnForMnr")
    protected InvestmentAccountOwnershipInformation10 ctdnForMnr;
    @XmlElement(name = "Nmnee")
    protected InvestmentAccountOwnershipInformation10 nmnee;
    @XmlElement(name = "JntOwnr")
    protected List<InvestmentAccountOwnershipInformation9> jntOwnr;

    /**
     * Gets the value of the pmryOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation10 }
     *     
     */
    public InvestmentAccountOwnershipInformation10 getPmryOwnr() {
        return pmryOwnr;
    }

    /**
     * Sets the value of the pmryOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation10 }
     *     
     */
    public AccountParties7Choice setPmryOwnr(InvestmentAccountOwnershipInformation10 value) {
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
     * {@link InvestmentAccountOwnershipInformation10 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation10> getTrstee() {
        if (trstee == null) {
            trstee = new ArrayList<InvestmentAccountOwnershipInformation10>();
        }
        return this.trstee;
    }

    /**
     * Gets the value of the ctdnForMnr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation10 }
     *     
     */
    public InvestmentAccountOwnershipInformation10 getCtdnForMnr() {
        return ctdnForMnr;
    }

    /**
     * Sets the value of the ctdnForMnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation10 }
     *     
     */
    public AccountParties7Choice setCtdnForMnr(InvestmentAccountOwnershipInformation10 value) {
        this.ctdnForMnr = value;
        return this;
    }

    /**
     * Gets the value of the nmnee property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation10 }
     *     
     */
    public InvestmentAccountOwnershipInformation10 getNmnee() {
        return nmnee;
    }

    /**
     * Sets the value of the nmnee property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation10 }
     *     
     */
    public AccountParties7Choice setNmnee(InvestmentAccountOwnershipInformation10 value) {
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
     * {@link InvestmentAccountOwnershipInformation9 }
     * 
     * 
     */
    public List<InvestmentAccountOwnershipInformation9> getJntOwnr() {
        if (jntOwnr == null) {
            jntOwnr = new ArrayList<InvestmentAccountOwnershipInformation9>();
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
    public AccountParties7Choice addTrstee(InvestmentAccountOwnershipInformation10 trstee) {
        getTrstee().add(trstee);
        return this;
    }

    /**
     * Adds a new item to the jntOwnr list.
     * @see #getJntOwnr()
     * 
     */
    public AccountParties7Choice addJntOwnr(InvestmentAccountOwnershipInformation9 jntOwnr) {
        getJntOwnr().add(jntOwnr);
        return this;
    }

}
