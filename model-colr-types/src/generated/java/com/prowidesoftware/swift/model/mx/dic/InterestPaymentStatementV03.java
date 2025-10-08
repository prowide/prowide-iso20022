
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
 * Scope
 * This message is sent by either the collateral giver or its collateral manager to the collateral taker or its collateral manager. It is used to report the interest amounts calculated based on the effective posted collateral amount, over a specific period of time agreed by both parties.
 * 
 * The message definition is intended for use with the ISO20022 Business Application Header.
 * 
 * Usage
 * The InterestPaymentStatement message is used for reporting the interest per period on collateral held.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestPaymentStatementV03", propOrder = {
    "txId",
    "agrmt",
    "oblgtn",
    "stmtParams",
    "pgntn",
    "intrstStmt",
    "splmtryData"
})
public class InterestPaymentStatementV03 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "Agrmt")
    protected Agreement2 agrmt;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation3 oblgtn;
    @XmlElement(name = "StmtParams", required = true)
    protected Statement32 stmtParams;
    @XmlElement(name = "Pgntn")
    protected Pagination pgntn;
    @XmlElement(name = "IntrstStmt", required = true)
    protected InterestStatement3 intrstStmt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestPaymentStatementV03 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the agrmt property.
     * 
     * @return
     *     possible object is
     *     {@link Agreement2 }
     *     
     */
    public Agreement2 getAgrmt() {
        return agrmt;
    }

    /**
     * Sets the value of the agrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agreement2 }
     *     
     */
    public InterestPaymentStatementV03 setAgrmt(Agreement2 value) {
        this.agrmt = value;
        return this;
    }

    /**
     * Gets the value of the oblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Obligation3 }
     *     
     */
    public Obligation3 getOblgtn() {
        return oblgtn;
    }

    /**
     * Sets the value of the oblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obligation3 }
     *     
     */
    public InterestPaymentStatementV03 setOblgtn(Obligation3 value) {
        this.oblgtn = value;
        return this;
    }

    /**
     * Gets the value of the stmtParams property.
     * 
     * @return
     *     possible object is
     *     {@link Statement32 }
     *     
     */
    public Statement32 getStmtParams() {
        return stmtParams;
    }

    /**
     * Sets the value of the stmtParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement32 }
     *     
     */
    public InterestPaymentStatementV03 setStmtParams(Statement32 value) {
        this.stmtParams = value;
        return this;
    }

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public InterestPaymentStatementV03 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the intrstStmt property.
     * 
     * @return
     *     possible object is
     *     {@link InterestStatement3 }
     *     
     */
    public InterestStatement3 getIntrstStmt() {
        return intrstStmt;
    }

    /**
     * Sets the value of the intrstStmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestStatement3 }
     *     
     */
    public InterestPaymentStatementV03 setIntrstStmt(InterestStatement3 value) {
        this.intrstStmt = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public InterestPaymentStatementV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
