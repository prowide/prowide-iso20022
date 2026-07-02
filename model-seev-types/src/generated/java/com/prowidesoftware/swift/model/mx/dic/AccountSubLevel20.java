
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
 * Provides shareholdings information at account sub level.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSubLevel20", propOrder = {
    "sfkpgAcct",
    "acctHldr",
    "shrhldgBal"
})
public class AccountSubLevel20 {

    @XmlElement(name = "SfkpgAcct")
    protected String sfkpgAcct;
    @XmlElement(name = "AcctHldr", required = true)
    protected PartyIdentification196Choice acctHldr;
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
    public AccountSubLevel20 setSfkpgAcct(String value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the acctHldr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification196Choice }
     *     
     */
    public PartyIdentification196Choice getAcctHldr() {
        return acctHldr;
    }

    /**
     * Sets the value of the acctHldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification196Choice }
     *     
     */
    public AccountSubLevel20 setAcctHldr(PartyIdentification196Choice value) {
        this.acctHldr = value;
        return this;
    }

    /**
     * Gets the value of the shrhldgBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shrhldgBal property.
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
     */
    public List<ShareholdingBalance1> getShrhldgBal() {
        if (shrhldgBal == null) {
            shrhldgBal = new ArrayList<ShareholdingBalance1>();
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
    public AccountSubLevel20 addShrhldgBal(ShareholdingBalance1 shrhldgBal) {
        getShrhldgBal().add(shrhldgBal);
        return this;
    }

}
