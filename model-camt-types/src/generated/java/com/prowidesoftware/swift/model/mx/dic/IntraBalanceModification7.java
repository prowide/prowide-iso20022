
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
 * Provides the modification requests data in the report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceModification7", propOrder = {
    "cshAcct",
    "cshAcctOwnr",
    "cshAcctSvcr",
    "prcgSts",
    "mod"
})
public class IntraBalanceModification7 {

    @XmlElement(name = "CshAcct")
    protected CashAccount40 cshAcct;
    @XmlElement(name = "CshAcctOwnr")
    protected SystemPartyIdentification8 cshAcctOwnr;
    @XmlElement(name = "CshAcctSvcr")
    protected BranchAndFinancialInstitutionIdentification8 cshAcctSvcr;
    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus71Choice prcgSts;
    @XmlElement(name = "Mod", required = true)
    protected List<IntraBalanceModification8> mod;

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public IntraBalanceModification7 setCshAcct(CashAccount40 value) {
        this.cshAcct = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getCshAcctOwnr() {
        return cshAcctOwnr;
    }

    /**
     * Sets the value of the cshAcctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public IntraBalanceModification7 setCshAcctOwnr(SystemPartyIdentification8 value) {
        this.cshAcctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getCshAcctSvcr() {
        return cshAcctSvcr;
    }

    /**
     * Sets the value of the cshAcctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public IntraBalanceModification7 setCshAcctSvcr(BranchAndFinancialInstitutionIdentification8 value) {
        this.cshAcctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus71Choice }
     *     
     */
    public ProcessingStatus71Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus71Choice }
     *     
     */
    public IntraBalanceModification7 setPrcgSts(ProcessingStatus71Choice value) {
        this.prcgSts = value;
        return this;
    }

    /**
     * Gets the value of the mod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntraBalanceModification8 }
     * 
     * 
     * @return
     *     The value of the mod property.
     */
    public List<IntraBalanceModification8> getMod() {
        if (mod == null) {
            mod = new ArrayList<>();
        }
        return this.mod;
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
     * Adds a new item to the mod list.
     * @see #getMod()
     * 
     */
    public IntraBalanceModification7 addMod(IntraBalanceModification8 mod) {
        getMod().add(mod);
        return this;
    }

}
