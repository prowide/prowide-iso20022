
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
 * The IntraBalanceMovementCancellationReport message is sent from a settlement infrastructure to an account owner/requestor to provide full details or current status values of the intra-balance movement cancellation request(s), as defined within the query.
 * 
 * The message may also be used to: 
 * - re-send a message previously sent (the sub-function of the message is "Duplicate") 
 * - provide a third party with a copy of a message for information (the sub-function of the message is "Copy") 
 * - re-send to a third party a copy of a message for information (the sub-function of the message is "Copy Duplicate").
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceMovementCancellationReportV02", propOrder = {
    "id",
    "pgntn",
    "rptGnlDtls",
    "rptOrErr",
    "splmtryData"
})
public class IntraBalanceMovementCancellationReportV02 {

    @XmlElement(name = "Id")
    protected DocumentIdentification51 id;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "RptGnlDtls", required = true)
    protected IntraBalanceReport5 rptGnlDtls;
    @XmlElement(name = "RptOrErr")
    protected IntraBalanceOrOperationalError10Choice rptOrErr;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification51 }
     *     
     */
    public DocumentIdentification51 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification51 }
     *     
     */
    public IntraBalanceMovementCancellationReportV02 setId(DocumentIdentification51 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public IntraBalanceMovementCancellationReportV02 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the rptGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceReport5 }
     *     
     */
    public IntraBalanceReport5 getRptGnlDtls() {
        return rptGnlDtls;
    }

    /**
     * Sets the value of the rptGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceReport5 }
     *     
     */
    public IntraBalanceMovementCancellationReportV02 setRptGnlDtls(IntraBalanceReport5 value) {
        this.rptGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the rptOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceOrOperationalError10Choice }
     *     
     */
    public IntraBalanceOrOperationalError10Choice getRptOrErr() {
        return rptOrErr;
    }

    /**
     * Sets the value of the rptOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceOrOperationalError10Choice }
     *     
     */
    public IntraBalanceMovementCancellationReportV02 setRptOrErr(IntraBalanceOrOperationalError10Choice value) {
        this.rptOrErr = value;
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
    public IntraBalanceMovementCancellationReportV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
