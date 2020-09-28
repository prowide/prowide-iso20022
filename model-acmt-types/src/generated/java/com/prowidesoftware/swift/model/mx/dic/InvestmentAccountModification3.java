
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
 * Information about the modification of an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccountModification3", propOrder = {
    "modRsn",
    "acctApplId",
    "clntRef",
    "ctrPtyRef",
    "exstgAcctId"
})
public class InvestmentAccountModification3 {

    @XmlElement(name = "ModRsn")
    protected String modRsn;
    @XmlElement(name = "AcctApplId")
    protected String acctApplId;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "CtrPtyRef")
    protected AdditionalReference6 ctrPtyRef;
    @XmlElement(name = "ExstgAcctId")
    protected List<Account23> exstgAcctId;

    /**
     * Gets the value of the modRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModRsn() {
        return modRsn;
    }

    /**
     * Sets the value of the modRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccountModification3 setModRsn(String value) {
        this.modRsn = value;
        return this;
    }

    /**
     * Gets the value of the acctApplId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctApplId() {
        return acctApplId;
    }

    /**
     * Sets the value of the acctApplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccountModification3 setAcctApplId(String value) {
        this.acctApplId = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccountModification3 setClntRef(String value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference6 }
     *     
     */
    public AdditionalReference6 getCtrPtyRef() {
        return ctrPtyRef;
    }

    /**
     * Sets the value of the ctrPtyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference6 }
     *     
     */
    public InvestmentAccountModification3 setCtrPtyRef(AdditionalReference6 value) {
        this.ctrPtyRef = value;
        return this;
    }

    /**
     * Gets the value of the exstgAcctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exstgAcctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExstgAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account23 }
     * 
     * 
     */
    public List<Account23> getExstgAcctId() {
        if (exstgAcctId == null) {
            exstgAcctId = new ArrayList<Account23>();
        }
        return this.exstgAcctId;
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
     * Adds a new item to the exstgAcctId list.
     * @see #getExstgAcctId()
     * 
     */
    public InvestmentAccountModification3 addExstgAcctId(Account23 exstgAcctId) {
        getExstgAcctId().add(exstgAcctId);
        return this;
    }

}
