
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
 * Provides the intra-balance movements in the report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceMovements4", propOrder = {
    "cshAcct",
    "cshAcctOwnr",
    "cshAcctSvcr",
    "stsAndRsn",
    "mvmnt"
})
public class IntraBalanceMovements4 {

    @XmlElement(name = "CshAcct")
    protected CashAccount40 cshAcct;
    @XmlElement(name = "CshAcctOwnr")
    protected SystemPartyIdentification8 cshAcctOwnr;
    @XmlElement(name = "CshAcctSvcr")
    protected BranchAndFinancialInstitutionIdentification8 cshAcctSvcr;
    @XmlElement(name = "StsAndRsn")
    protected IntraBalanceStatusAndReason2 stsAndRsn;
    @XmlElement(name = "Mvmnt", required = true)
    protected List<IntraBalanceMovement7> mvmnt;

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
    public IntraBalanceMovements4 setCshAcct(CashAccount40 value) {
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
    public IntraBalanceMovements4 setCshAcctOwnr(SystemPartyIdentification8 value) {
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
    public IntraBalanceMovements4 setCshAcctSvcr(BranchAndFinancialInstitutionIdentification8 value) {
        this.cshAcctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the stsAndRsn property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceStatusAndReason2 }
     *     
     */
    public IntraBalanceStatusAndReason2 getStsAndRsn() {
        return stsAndRsn;
    }

    /**
     * Sets the value of the stsAndRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceStatusAndReason2 }
     *     
     */
    public IntraBalanceMovements4 setStsAndRsn(IntraBalanceStatusAndReason2 value) {
        this.stsAndRsn = value;
        return this;
    }

    /**
     * Gets the value of the mvmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mvmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMvmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntraBalanceMovement7 }
     * 
     * 
     */
    public List<IntraBalanceMovement7> getMvmnt() {
        if (mvmnt == null) {
            mvmnt = new ArrayList<IntraBalanceMovement7>();
        }
        return this.mvmnt;
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
     * Adds a new item to the mvmnt list.
     * @see #getMvmnt()
     * 
     */
    public IntraBalanceMovements4 addMvmnt(IntraBalanceMovement7 mvmnt) {
        getMvmnt().add(mvmnt);
        return this;
    }

}
