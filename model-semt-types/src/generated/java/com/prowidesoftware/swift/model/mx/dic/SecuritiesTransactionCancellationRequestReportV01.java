
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
 * The SecuritiesTransactionCancellationRequestReport message is sent from a settlement infrastructure to an account owner/requestor to provide full details or current status values of settlement or the intra-position movement cancellation request(s), as defined within the query.
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
@XmlType(name = "SecuritiesTransactionCancellationRequestReportV01", propOrder = {
    "pgntn",
    "rptGnlDtls",
    "cxls"
})
public class SecuritiesTransactionCancellationRequestReportV01 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination pgntn;
    @XmlElement(name = "RptGnlDtls", required = true)
    protected IntraPositionReport61 rptGnlDtls;
    @XmlElement(name = "Cxls")
    protected List<IntraPositionCancellation31> cxls;

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
    public SecuritiesTransactionCancellationRequestReportV01 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the rptGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionReport61 }
     *     
     */
    public IntraPositionReport61 getRptGnlDtls() {
        return rptGnlDtls;
    }

    /**
     * Sets the value of the rptGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionReport61 }
     *     
     */
    public SecuritiesTransactionCancellationRequestReportV01 setRptGnlDtls(IntraPositionReport61 value) {
        this.rptGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the cxls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cxls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntraPositionCancellation31 }
     * 
     * 
     * @return
     *     The value of the cxls property.
     */
    public List<IntraPositionCancellation31> getCxls() {
        if (cxls == null) {
            cxls = new ArrayList<>();
        }
        return this.cxls;
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
     * Adds a new item to the cxls list.
     * @see #getCxls()
     * 
     */
    public SecuritiesTransactionCancellationRequestReportV01 addCxls(IntraPositionCancellation31 cxls) {
        getCxls().add(cxls);
        return this;
    }

}
