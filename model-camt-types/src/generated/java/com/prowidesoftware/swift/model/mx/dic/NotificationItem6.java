
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "NotificationItem6", propOrder = {
    "id",
    "endToEndId",
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
    "rmtInf"
})
public class NotificationItem6 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "EndToEndId")
    protected String endToEndId;
    @XmlElement(name = "Acct")
    protected CashAccount24 acct;
    @XmlElement(name = "AcctOwnr")
    protected Party12Choice acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected BranchAndFinancialInstitutionIdentification5 acctSvcr;
    @XmlElement(name = "RltdAcct")
    protected CashAccount24 rltdAcct;
    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "XpctdValDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdValDt;
    @XmlElement(name = "Dbtr")
    protected Party12Choice dbtr;
    @XmlElement(name = "DbtrAgt")
    protected BranchAndFinancialInstitutionIdentification5 dbtrAgt;
    @XmlElement(name = "IntrmyAgt")
    protected BranchAndFinancialInstitutionIdentification5 intrmyAgt;
    @XmlElement(name = "Purp")
    protected Purpose2Choice purp;
    @XmlElement(name = "RltdRmtInf")
    protected RemittanceLocation4 rltdRmtInf;
    @XmlElement(name = "RmtInf")
    protected RemittanceInformation11 rmtInf;

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
    public NotificationItem6 setId(String value) {
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
    public NotificationItem6 setEndToEndId(String value) {
        this.endToEndId = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public NotificationItem6 setAcct(CashAccount24 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link Party12Choice }
     *     
     */
    public Party12Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party12Choice }
     *     
     */
    public NotificationItem6 setAcctOwnr(Party12Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public NotificationItem6 setAcctSvcr(BranchAndFinancialInstitutionIdentification5 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the rltdAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount24 }
     *     
     */
    public CashAccount24 getRltdAcct() {
        return rltdAcct;
    }

    /**
     * Sets the value of the rltdAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount24 }
     *     
     */
    public NotificationItem6 setRltdAcct(CashAccount24 value) {
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
    public NotificationItem6 setAmt(ActiveOrHistoricCurrencyAndAmount value) {
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
    public XMLGregorianCalendar getXpctdValDt() {
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
    public NotificationItem6 setXpctdValDt(XMLGregorianCalendar value) {
        this.xpctdValDt = value;
        return this;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link Party12Choice }
     *     
     */
    public Party12Choice getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party12Choice }
     *     
     */
    public NotificationItem6 setDbtr(Party12Choice value) {
        this.dbtr = value;
        return this;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public NotificationItem6 setDbtrAgt(BranchAndFinancialInstitutionIdentification5 value) {
        this.dbtrAgt = value;
        return this;
    }

    /**
     * Gets the value of the intrmyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getIntrmyAgt() {
        return intrmyAgt;
    }

    /**
     * Sets the value of the intrmyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public NotificationItem6 setIntrmyAgt(BranchAndFinancialInstitutionIdentification5 value) {
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
    public NotificationItem6 setPurp(Purpose2Choice value) {
        this.purp = value;
        return this;
    }

    /**
     * Gets the value of the rltdRmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceLocation4 }
     *     
     */
    public RemittanceLocation4 getRltdRmtInf() {
        return rltdRmtInf;
    }

    /**
     * Sets the value of the rltdRmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceLocation4 }
     *     
     */
    public NotificationItem6 setRltdRmtInf(RemittanceLocation4 value) {
        this.rltdRmtInf = value;
        return this;
    }

    /**
     * Gets the value of the rmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceInformation11 }
     *     
     */
    public RemittanceInformation11 getRmtInf() {
        return rmtInf;
    }

    /**
     * Sets the value of the rmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceInformation11 }
     *     
     */
    public NotificationItem6 setRmtInf(RemittanceInformation11 value) {
        this.rmtInf = value;
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

}
