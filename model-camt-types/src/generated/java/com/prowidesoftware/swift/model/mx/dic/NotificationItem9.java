
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides further means of referencing a payment transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationItem9", propOrder = {
    "id",
    "endToEndId",
    "uetr",
    "acct",
    "acctOwnr",
    "acctSvcr",
    "rltdAcct",
    "amt",
    "xpctdValDt",
    "dbtr",
    "dbtrAgt",
    "intrmyAgt",
    "purp",
    "rltdRmtInf",
    "rmtInf",
    "undrlygAllcn"
})
public class NotificationItem9 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "EndToEndId")
    protected String endToEndId;
    @XmlElement(name = "UETR")
    protected String uetr;
    @XmlElement(name = "Acct")
    protected CashAccount40 acct;
    @XmlElement(name = "AcctOwnr")
    protected Party50Choice acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected BranchAndFinancialInstitutionIdentification8 acctSvcr;
    @XmlElement(name = "RltdAcct")
    protected CashAccount40 rltdAcct;
    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "XpctdValDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate xpctdValDt;
    @XmlElement(name = "Dbtr")
    protected Party50Choice dbtr;
    @XmlElement(name = "DbtrAgt")
    protected BranchAndFinancialInstitutionIdentification8 dbtrAgt;
    @XmlElement(name = "IntrmyAgt")
    protected BranchAndFinancialInstitutionIdentification8 intrmyAgt;
    @XmlElement(name = "Purp")
    protected Purpose2Choice purp;
    @XmlElement(name = "RltdRmtInf")
    protected RemittanceLocation8 rltdRmtInf;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation22 rmtInf;
    @XmlElement(name = "UndrlygAllcn")
    protected List<TransactionAllocation1> undrlygAllcn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NotificationItem9 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the endToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndToEndId() {
        return endToEndId;
    }

    /**
     * Sets the value of the endToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NotificationItem9 setEndToEndId(String value) {
        this.endToEndId = value;
        return this;
    }

    /**
     * Gets the value of the uetr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUETR() {
        return uetr;
    }

    /**
     * Sets the value of the uetr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NotificationItem9 setUETR(String value) {
        this.uetr = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public NotificationItem9 setAcct(CashAccount40 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link Party50Choice }
     *     
     */
    public Party50Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party50Choice }
     *     
     */
    public NotificationItem9 setAcctOwnr(Party50Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public NotificationItem9 setAcctSvcr(BranchAndFinancialInstitutionIdentification8 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the rltdAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getRltdAcct() {
        return rltdAcct;
    }

    /**
     * Sets the value of the rltdAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public NotificationItem9 setRltdAcct(CashAccount40 value) {
        this.rltdAcct = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public NotificationItem9 setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the xpctdValDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getXpctdValDt() {
        return xpctdValDt;
    }

    /**
     * Sets the value of the xpctdValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NotificationItem9 setXpctdValDt(LocalDate value) {
        this.xpctdValDt = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link Party50Choice }
     *     
     */
    public Party50Choice getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party50Choice }
     *     
     */
    public NotificationItem9 setDbtr(Party50Choice value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public NotificationItem9 setDbtrAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getIntrmyAgt() {
        return intrmyAgt;
    }

    /**
     * Sets the value of the intrmyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public NotificationItem9 setIntrmyAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.intrmyAgt = value;
        return this;
    }

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link Purpose2Choice }
     *     
     */
    public Purpose2Choice getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purpose2Choice }
     *     
     */
    public NotificationItem9 setPurp(Purpose2Choice value) {
        this.purp = value;
        return this;
    }

    /**
     * Gets the value of the rltdRmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceLocation8 }
     *     
     */
    public RemittanceLocation8 getRltdRmtInf() {
        return rltdRmtInf;
    }

    /**
     * Sets the value of the rltdRmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceLocation8 }
     *     
     */
    public NotificationItem9 setRltdRmtInf(RemittanceLocation8 value) {
        this.rltdRmtInf = value;
        return this;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation22 }
     *     
     */
    public RemittanceInformation22 getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation22 }
     *     
     */
    public NotificationItem9 setRmtInf(RemittanceInformation22 value) {
        this.rmtInf = value;
        return this;
    }

    /**
     * Gets the value of the undrlygAllcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygAllcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygAllcn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionAllocation1 }
     * 
     * 
     * @return
     *     The value of the undrlygAllcn property.
     */
    public List<TransactionAllocation1> getUndrlygAllcn() {
        if (undrlygAllcn == null) {
            undrlygAllcn = new ArrayList<>();
        }
        return this.undrlygAllcn;
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
     * Adds a new item to the undrlygAllcn list.
     * @see #getUndrlygAllcn()
     * 
     */
    public NotificationItem9 addUndrlygAllcn(TransactionAllocation1 undrlygAllcn) {
        getUndrlygAllcn().add(undrlygAllcn);
        return this;
    }

}
