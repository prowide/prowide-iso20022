
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
 * The ContractRegistrationStatementRequest message is sent by the reporting party to the registration agent to request for a statement of the operations related to the registered contract subject to currency control.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractRegistrationStatementRequestV01", propOrder = {
    "grpHdr",
    "stmtReq",
    "splmtryData"
})
public class ContractRegistrationStatementRequestV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected CurrencyControlHeader1 grpHdr;
    @XmlElement(name = "StmtReq", required = true)
    protected List<ContractRegistrationStatementRequest1> stmtReq;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyControlHeader1 }
     *     
     */
    public CurrencyControlHeader1 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyControlHeader1 }
     *     
     */
    public ContractRegistrationStatementRequestV01 setGrpHdr(CurrencyControlHeader1 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the stmtReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stmtReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStmtReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractRegistrationStatementRequest1 }
     * 
     * 
     */
    public List<ContractRegistrationStatementRequest1> getStmtReq() {
        if (stmtReq == null) {
            stmtReq = new ArrayList<ContractRegistrationStatementRequest1>();
        }
        return this.stmtReq;
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
     * Adds a new item to the stmtReq list.
     * @see #getStmtReq()
     * 
     */
    public ContractRegistrationStatementRequestV01 addStmtReq(ContractRegistrationStatementRequest1 stmtReq) {
        getStmtReq().add(stmtReq);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public ContractRegistrationStatementRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
