
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
 * Provides shareholdings information at account sub level.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSubLevel25", propOrder = {
    "sfkpgAcct",
    "acctHldr",
    "shrhldgBal"
})
public class AccountSubLevel25 {

    @XmlElement(name = "SfkpgAcct")
    protected String sfkpgAcct;
    @XmlElement(name = "AcctHldr", required = true)
    protected PartyIdentification276 acctHldr;
    @XmlElement(name = "ShrhldgBal", required = true)
    protected List<ShareholdingBalance1> shrhldgBal;

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountSubLevel25 setSfkpgAcct(String value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the acctHldr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification276 }
     *     
     */
    public PartyIdentification276 getAcctHldr() {
        return acctHldr;
    }

    /**
     * Sets the value of the acctHldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification276 }
     *     
     */
    public AccountSubLevel25 setAcctHldr(PartyIdentification276 value) {
        this.acctHldr = value;
        return this;
    }

    /**
     * Gets the value of the shrhldgBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the shrhldgBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShrhldgBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShareholdingBalance1 }
     * 
     * 
     * @return
     *     The value of the shrhldgBal property.
     */
    public List<ShareholdingBalance1> getShrhldgBal() {
        if (shrhldgBal == null) {
            shrhldgBal = new ArrayList<>();
        }
        return this.shrhldgBal;
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
     * Adds a new item to the shrhldgBal list.
     * @see #getShrhldgBal()
     * 
     */
    public AccountSubLevel25 addShrhldgBal(ShareholdingBalance1 shrhldgBal) {
        getShrhldgBal().add(shrhldgBal);
        return this;
    }

}
