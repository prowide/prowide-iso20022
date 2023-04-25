
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines the criteria which are used to search for a transaction and to report on the transaction. A name may be given to the new query.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCriteria8", propOrder = {
    "newQryNm",
    "schCrit",
    "stmtRpt",
    "rtrCrit"
})
public class TransactionCriteria8 {

    @XmlElement(name = "NewQryNm")
    protected String newQryNm;
    @XmlElement(name = "SchCrit")
    protected List<TransactionSearchCriteria8> schCrit;
    @XmlElement(name = "StmtRpt")
    @XmlSchemaType(name = "string")
    protected ReportIndicator1Code stmtRpt;
    @XmlElement(name = "RtrCrit")
    protected TransactionReturnCriteria5 rtrCrit;

    /**
     * Gets the value of the newQryNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewQryNm() {
        return newQryNm;
    }

    /**
     * Sets the value of the newQryNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionCriteria8 setNewQryNm(String value) {
        this.newQryNm = value;
        return this;
    }

    /**
     * Gets the value of the schCrit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the schCrit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchCrit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionSearchCriteria8 }
     * 
     * 
     * @return
     *     The value of the schCrit property.
     */
    public List<TransactionSearchCriteria8> getSchCrit() {
        if (schCrit == null) {
            schCrit = new ArrayList<>();
        }
        return this.schCrit;
    }

    /**
     * Gets the value of the stmtRpt property.
     * 
     * @return
     *     possible object is
     *     {@link ReportIndicator1Code }
     *     
     */
    public ReportIndicator1Code getStmtRpt() {
        return stmtRpt;
    }

    /**
     * Sets the value of the stmtRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportIndicator1Code }
     *     
     */
    public TransactionCriteria8 setStmtRpt(ReportIndicator1Code value) {
        this.stmtRpt = value;
        return this;
    }

    /**
     * Gets the value of the rtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReturnCriteria5 }
     *     
     */
    public TransactionReturnCriteria5 getRtrCrit() {
        return rtrCrit;
    }

    /**
     * Sets the value of the rtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReturnCriteria5 }
     *     
     */
    public TransactionCriteria8 setRtrCrit(TransactionReturnCriteria5 value) {
        this.rtrCrit = value;
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
     * Adds a new item to the schCrit list.
     * @see #getSchCrit()
     * 
     */
    public TransactionCriteria8 addSchCrit(TransactionSearchCriteria8 schCrit) {
        getSchCrit().add(schCrit);
        return this;
    }

}
