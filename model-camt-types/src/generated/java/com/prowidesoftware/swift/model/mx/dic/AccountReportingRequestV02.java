
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
 * The AccountReportingRequest message is sent by the account owner, either directly or through a forwarding agent, to one of its account servicing institutions. It is used to ask the account servicing institution to send a report on the account owner's account in a BankToCustomerAccountReport (camt.052.001.02), a BankToCustomerStatement (camt.053.001.02) or a BankToCustomerDebitCreditNotification (camt.054.001.02).
 * Usage
 * The AccountReportingRequest message is used to advise the account servicing institution of funds that the account owner expects to have credited to its account. The message can be used in either a direct or a relay scenario.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountReportingRequestV02", propOrder = {
    "grpHdr",
    "rptgReq"
})
public class AccountReportingRequestV02 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader43 grpHdr;
    @XmlElement(name = "RptgReq", required = true)
    protected List<ReportingRequest2> rptgReq;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader43 }
     *     
     */
    public GroupHeader43 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader43 }
     *     
     */
    public AccountReportingRequestV02 setGrpHdr(GroupHeader43 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the rptgReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rptgReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptgReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportingRequest2 }
     * 
     * 
     */
    public List<ReportingRequest2> getRptgReq() {
        if (rptgReq == null) {
            rptgReq = new ArrayList<ReportingRequest2>();
        }
        return this.rptgReq;
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
     * Adds a new item to the rptgReq list.
     * @see #getRptgReq()
     * 
     */
    public AccountReportingRequestV02 addRptgReq(ReportingRequest2 rptgReq) {
        getRptgReq().add(rptgReq);
        return this;
    }

}
