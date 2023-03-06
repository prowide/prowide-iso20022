
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
 * Specification of the request for report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestParameters", propOrder = {
    "prvsRef",
    "rltdRef",
    "fndCshFcstRpt",
    "fndPrcgPsptRpt",
    "pricRpt",
    "stmtByAcct",
    "stmtByAcctAndFinInstrm",
    "usrDfndRpt"
})
public class RequestParameters {

    @XmlElement(name = "PrvsRef", required = true)
    protected AdditionalReference3 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference3 rltdRef;
    @XmlElement(name = "FndCshFcstRpt")
    protected FundCashForecastParameters1 fndCshFcstRpt;
    @XmlElement(name = "FndPrcgPsptRpt")
    protected List<FundParameters1Choice> fndPrcgPsptRpt;
    @XmlElement(name = "PricRpt")
    protected FundParameters2Choice pricRpt;
    @XmlElement(name = "StmtByAcct")
    protected StatementDetails stmtByAcct;
    @XmlElement(name = "StmtByAcctAndFinInstrm")
    protected StatementAndFinancialInstrumentDetails stmtByAcctAndFinInstrm;
    @XmlElement(name = "UsrDfndRpt")
    protected GenericReportParameters usrDfndRpt;

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public RequestParameters setPrvsRef(AdditionalReference3 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public RequestParameters setRltdRef(AdditionalReference3 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the fndCshFcstRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FundCashForecastParameters1 }
     *     
     */
    public FundCashForecastParameters1 getFndCshFcstRpt() {
        return fndCshFcstRpt;
    }

    /**
     * Sets the value of the fndCshFcstRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundCashForecastParameters1 }
     *     
     */
    public RequestParameters setFndCshFcstRpt(FundCashForecastParameters1 value) {
        this.fndCshFcstRpt = value;
        return this;
    }

    /**
     * Gets the value of the fndPrcgPsptRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fndPrcgPsptRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndPrcgPsptRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundParameters1Choice }
     * 
     * 
     */
    public List<FundParameters1Choice> getFndPrcgPsptRpt() {
        if (fndPrcgPsptRpt == null) {
            fndPrcgPsptRpt = new ArrayList<FundParameters1Choice>();
        }
        return this.fndPrcgPsptRpt;
    }

    /**
     * Gets the value of the pricRpt property.
     * 
     * @return
     *     possible object is
     *     {@link FundParameters2Choice }
     *     
     */
    public FundParameters2Choice getPricRpt() {
        return pricRpt;
    }

    /**
     * Sets the value of the pricRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundParameters2Choice }
     *     
     */
    public RequestParameters setPricRpt(FundParameters2Choice value) {
        this.pricRpt = value;
        return this;
    }

    /**
     * Gets the value of the stmtByAcct property.
     * 
     * @return
     *     possible object is
     *     {@link StatementDetails }
     *     
     */
    public StatementDetails getStmtByAcct() {
        return stmtByAcct;
    }

    /**
     * Sets the value of the stmtByAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementDetails }
     *     
     */
    public RequestParameters setStmtByAcct(StatementDetails value) {
        this.stmtByAcct = value;
        return this;
    }

    /**
     * Gets the value of the stmtByAcctAndFinInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link StatementAndFinancialInstrumentDetails }
     *     
     */
    public StatementAndFinancialInstrumentDetails getStmtByAcctAndFinInstrm() {
        return stmtByAcctAndFinInstrm;
    }

    /**
     * Sets the value of the stmtByAcctAndFinInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementAndFinancialInstrumentDetails }
     *     
     */
    public RequestParameters setStmtByAcctAndFinInstrm(StatementAndFinancialInstrumentDetails value) {
        this.stmtByAcctAndFinInstrm = value;
        return this;
    }

    /**
     * Gets the value of the usrDfndRpt property.
     * 
     * @return
     *     possible object is
     *     {@link GenericReportParameters }
     *     
     */
    public GenericReportParameters getUsrDfndRpt() {
        return usrDfndRpt;
    }

    /**
     * Sets the value of the usrDfndRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericReportParameters }
     *     
     */
    public RequestParameters setUsrDfndRpt(GenericReportParameters value) {
        this.usrDfndRpt = value;
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
     * Adds a new item to the fndPrcgPsptRpt list.
     * @see #getFndPrcgPsptRpt()
     * 
     */
    public RequestParameters addFndPrcgPsptRpt(FundParameters1Choice fndPrcgPsptRpt) {
        getFndPrcgPsptRpt().add(fndPrcgPsptRpt);
        return this;
    }

}
