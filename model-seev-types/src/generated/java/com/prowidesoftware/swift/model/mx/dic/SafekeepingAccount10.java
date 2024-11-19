
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
 * Identification and information about a securities account and balance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingAccount10", propOrder = {
    "acctId",
    "acctOwnr",
    "subAcctId",
    "instdBal",
    "rghtsHldr"
})
public class SafekeepingAccount10 {

    @XmlElement(name = "AcctId", required = true)
    protected String acctId;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification231Choice acctOwnr;
    @XmlElement(name = "SubAcctId")
    protected String subAcctId;
    @XmlElement(name = "InstdBal", required = true)
    protected List<HoldingBalance10> instdBal;
    @XmlElement(name = "RghtsHldr")
    protected List<PartyIdentification233Choice> rghtsHldr;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SafekeepingAccount10 setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification231Choice }
     *     
     */
    public PartyIdentification231Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification231Choice }
     *     
     */
    public SafekeepingAccount10 setAcctOwnr(PartyIdentification231Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the subAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAcctId() {
        return subAcctId;
    }

    /**
     * Sets the value of the subAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SafekeepingAccount10 setSubAcctId(String value) {
        this.subAcctId = value;
        return this;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instdBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstdBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoldingBalance10 }
     * 
     * 
     * @return
     *     The value of the instdBal property.
     */
    public List<HoldingBalance10> getInstdBal() {
        if (instdBal == null) {
            instdBal = new ArrayList<>();
        }
        return this.instdBal;
    }

    /**
     * Gets the value of the rghtsHldr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rghtsHldr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRghtsHldr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification233Choice }
     * 
     * 
     * @return
     *     The value of the rghtsHldr property.
     */
    public List<PartyIdentification233Choice> getRghtsHldr() {
        if (rghtsHldr == null) {
            rghtsHldr = new ArrayList<>();
        }
        return this.rghtsHldr;
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
     * Adds a new item to the instdBal list.
     * @see #getInstdBal()
     * 
     */
    public SafekeepingAccount10 addInstdBal(HoldingBalance10 instdBal) {
        getInstdBal().add(instdBal);
        return this;
    }

    /**
     * Adds a new item to the rghtsHldr list.
     * @see #getRghtsHldr()
     * 
     */
    public SafekeepingAccount10 addRghtsHldr(PartyIdentification233Choice rghtsHldr) {
        getRghtsHldr().add(rghtsHldr);
        return this;
    }

}
