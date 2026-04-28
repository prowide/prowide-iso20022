
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
 * The SecuritiesTransactionPenaltiesReport V01 message is sent by the Executing/Servicing Party to the instructing party to inform about the cash penalties: 
 * - Newly computed cash penalties. For example, in case of a CSD, the information shall include the cash penalties that are either imposed or credited to all of its participants and the CSD itself; in case of a CSD participant, the information shall include the cash penalties that are either imposed or credited to the CSD participant itself.
 * - Modified penalties: to inform about the modifications occurred in existing cash penalties since the previous reporting.
 * - Aggregated amounts of cash penalties: to inform about the aggregated amounts of the cash penalties computed for the business days of a given period, for example the previous month.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPenaltiesReportV01", propOrder = {
    "rptPgntn",
    "rptGnlDtls",
    "acctSvcr",
    "pnlty"
})
public class SecuritiesTransactionPenaltiesReportV01 {

    @XmlElement(name = "RptPgntn", required = true)
    protected Pagination1 rptPgntn;
    @XmlElement(name = "RptGnlDtls", required = true)
    protected PenaltyReport11 rptGnlDtls;
    @XmlElement(name = "AcctSvcr", required = true)
    protected PartyIdentification1361 acctSvcr;
    @XmlElement(name = "Pnlty")
    protected List<Penalty21> pnlty;

    /**
     * Gets the value of the rptPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getRptPgntn() {
        return rptPgntn;
    }

    /**
     * Sets the value of the rptPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public SecuritiesTransactionPenaltiesReportV01 setRptPgntn(Pagination1 value) {
        this.rptPgntn = value;
        return this;
    }

    /**
     * Gets the value of the rptGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyReport11 }
     *     
     */
    public PenaltyReport11 getRptGnlDtls() {
        return rptGnlDtls;
    }

    /**
     * Sets the value of the rptGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyReport11 }
     *     
     */
    public SecuritiesTransactionPenaltiesReportV01 setRptGnlDtls(PenaltyReport11 value) {
        this.rptGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1361 }
     *     
     */
    public PartyIdentification1361 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1361 }
     *     
     */
    public SecuritiesTransactionPenaltiesReportV01 setAcctSvcr(PartyIdentification1361 value) {
        this.acctSvcr = value;
        return this;
    }

    /**
     * Gets the value of the pnlty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pnlty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnlty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Penalty21 }
     * 
     * 
     * @return
     *     The value of the pnlty property.
     */
    public List<Penalty21> getPnlty() {
        if (pnlty == null) {
            pnlty = new ArrayList<>();
        }
        return this.pnlty;
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
     * Adds a new item to the pnlty list.
     * @see #getPnlty()
     * 
     */
    public SecuritiesTransactionPenaltiesReportV01 addPnlty(Penalty21 pnlty) {
        getPnlty().add(pnlty);
        return this;
    }

}
