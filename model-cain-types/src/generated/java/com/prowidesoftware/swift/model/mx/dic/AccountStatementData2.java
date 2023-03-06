
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Statement information of an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatementData2", propOrder = {
    "stmtDt",
    "stmtTm",
    "acctStmt"
})
public class AccountStatementData2 {

    @XmlElement(name = "StmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar stmtDt;
    @XmlElement(name = "StmtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar stmtTm;
    @XmlElement(name = "AcctStmt")
    protected List<AccountStatementDetails2> acctStmt;

    /**
     * Gets the value of the stmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getStmtDt() {
        return stmtDt;
    }

    /**
     * Sets the value of the stmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountStatementData2 setStmtDt(XMLGregorianCalendar value) {
        this.stmtDt = value;
        return this;
    }

    /**
     * Gets the value of the stmtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getStmtTm() {
        return stmtTm;
    }

    /**
     * Sets the value of the stmtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountStatementData2 setStmtTm(XMLGregorianCalendar value) {
        this.stmtTm = value;
        return this;
    }

    /**
     * Gets the value of the acctStmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctStmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctStmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountStatementDetails2 }
     * 
     * 
     */
    public List<AccountStatementDetails2> getAcctStmt() {
        if (acctStmt == null) {
            acctStmt = new ArrayList<AccountStatementDetails2>();
        }
        return this.acctStmt;
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
     * Adds a new item to the acctStmt list.
     * @see #getAcctStmt()
     * 
     */
    public AccountStatementData2 addAcctStmt(AccountStatementDetails2 acctStmt) {
        getAcctStmt().add(acctStmt);
        return this;
    }

}
