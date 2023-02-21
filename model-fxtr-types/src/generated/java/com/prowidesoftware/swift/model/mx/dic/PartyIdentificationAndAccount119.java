
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
 * Party and account information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount119", propOrder = {
    "ptyId",
    "acctId"
})
public class PartyIdentificationAndAccount119 {

    @XmlElement(name = "PtyId", required = true)
    protected List<PartyIdentification90> ptyId;
    @XmlElement(name = "AcctId", required = true)
    protected List<AccountIdentification30> acctId;

    /**
     * Gets the value of the ptyId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptyId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtyId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification90 }
     * 
     * 
     */
    public List<PartyIdentification90> getPtyId() {
        if (ptyId == null) {
            ptyId = new ArrayList<PartyIdentification90>();
        }
        return this.ptyId;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentification30 }
     * 
     * 
     */
    public List<AccountIdentification30> getAcctId() {
        if (acctId == null) {
            acctId = new ArrayList<AccountIdentification30>();
        }
        return this.acctId;
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
     * Adds a new item to the ptyId list.
     * @see #getPtyId()
     * 
     */
    public PartyIdentificationAndAccount119 addPtyId(PartyIdentification90 ptyId) {
        getPtyId().add(ptyId);
        return this;
    }

    /**
     * Adds a new item to the acctId list.
     * @see #getAcctId()
     * 
     */
    public PartyIdentificationAndAccount119 addAcctId(AccountIdentification30 acctId) {
        getAcctId().add(acctId);
        return this;
    }

}
