
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
 * Search for a system and a member of a system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemSearch4", propOrder = {
    "sysId",
    "mmbId",
    "ctry",
    "acctId"
})
public class SystemSearch4 {

    @XmlElement(name = "SysId")
    protected List<ClearingSystemIdentification3Choice> sysId;
    @XmlElement(name = "MmbId")
    protected List<BranchAndFinancialInstitutionIdentification6> mmbId;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "AcctId")
    protected AccountIdentification4Choice acctId;

    /**
     * Gets the value of the sysId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sysId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSysId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClearingSystemIdentification3Choice }
     * 
     * 
     * @return
     *     The value of the sysId property.
     */
    public List<ClearingSystemIdentification3Choice> getSysId() {
        if (sysId == null) {
            sysId = new ArrayList<>();
        }
        return this.sysId;
    }

    /**
     * Gets the value of the mmbId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mmbId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMmbId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchAndFinancialInstitutionIdentification6 }
     * 
     * 
     * @return
     *     The value of the mmbId property.
     */
    public List<BranchAndFinancialInstitutionIdentification6> getMmbId() {
        if (mmbId == null) {
            mmbId = new ArrayList<>();
        }
        return this.mmbId;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemSearch4 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public SystemSearch4 setAcctId(AccountIdentification4Choice value) {
        this.acctId = value;
        return this;
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
     * Adds a new item to the sysId list.
     * @see #getSysId()
     * 
     */
    public SystemSearch4 addSysId(ClearingSystemIdentification3Choice sysId) {
        getSysId().add(sysId);
        return this;
    }

    /**
     * Adds a new item to the mmbId list.
     * @see #getMmbId()
     * 
     */
    public SystemSearch4 addMmbId(BranchAndFinancialInstitutionIdentification6 mmbId) {
        getMmbId().add(mmbId);
        return this;
    }

}
