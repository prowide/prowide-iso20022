
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
 * A report provider, eg, a fund promoter, fund management company, transfer agent, or market data provider, sends the FundProcessingPassportReport message to the report recipient, eg, a professional investor, investment fund distributor, market data provider, regulator or other interested party to provide the key reference data for financial instruments to facilitate trading.
 * Usage
 * A unique FundProcessingPassportReport should be prepared for each class of unit/share (for which an individual ISIN should have been allocated), in respect of its "home" market.
 * The FundProcessingPassportReport may be used in various models or environments:
 * - stand alone environment, eg, initiated by the Report Provider (fund promoter, fund manager and / or reference data vendors) sent on a regular frequency, or when changes are needed.
 * - in a request / response environment, with the RequestForInvestmentFundReport eg, initiated by Report Users (data vendors, professional investors, regulators or investment fund distributors) in enabling the user to control the flow and updates of information.
 * - in a reference data vendor environment, eg, market infrastructure and reference data providers may collate and store all FPP information centrally for access via database or regular distribution information. A reference data vendor may assume the role of both Report Provider and Report User.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundProcessingPassportReportV01", propOrder = {
    "msgId",
    "updtdDt",
    "finInstrmDtls",
    "valtnDealgChrtcs",
    "instrmRstrctns",
    "fndMgmtCpny",
    "mainFndOrdrDsk",
    "lclMktAnx",
    "xtnsn"
})
public class FundProcessingPassportReportV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "UpdtdDt", required = true)
    protected UpdatedDate updtdDt;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument16 finInstrmDtls;
    @XmlElement(name = "ValtnDealgChrtcs", required = true)
    protected ValuationDealingProcessingCharacteristics valtnDealgChrtcs;
    @XmlElement(name = "InstrmRstrctns", required = true)
    protected InvestmentRestrictions instrmRstrctns;
    @XmlElement(name = "FndMgmtCpny", required = true)
    protected ContactDetails1 fndMgmtCpny;
    @XmlElement(name = "MainFndOrdrDsk", required = true)
    protected OrderDeskContactDetails mainFndOrdrDsk;
    @XmlElement(name = "LclMktAnx")
    protected List<LocalMarketAnnex> lclMktAnx;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public FundProcessingPassportReportV01 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the updtdDt property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatedDate }
     *     
     */
    public UpdatedDate getUpdtdDt() {
        return updtdDt;
    }

    /**
     * Sets the value of the updtdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatedDate }
     *     
     */
    public FundProcessingPassportReportV01 setUpdtdDt(UpdatedDate value) {
        this.updtdDt = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument16 }
     *     
     */
    public FinancialInstrument16 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument16 }
     *     
     */
    public FundProcessingPassportReportV01 setFinInstrmDtls(FinancialInstrument16 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the valtnDealgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationDealingProcessingCharacteristics }
     *     
     */
    public ValuationDealingProcessingCharacteristics getValtnDealgChrtcs() {
        return valtnDealgChrtcs;
    }

    /**
     * Sets the value of the valtnDealgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationDealingProcessingCharacteristics }
     *     
     */
    public FundProcessingPassportReportV01 setValtnDealgChrtcs(ValuationDealingProcessingCharacteristics value) {
        this.valtnDealgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the instrmRstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentRestrictions }
     *     
     */
    public InvestmentRestrictions getInstrmRstrctns() {
        return instrmRstrctns;
    }

    /**
     * Sets the value of the instrmRstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentRestrictions }
     *     
     */
    public FundProcessingPassportReportV01 setInstrmRstrctns(InvestmentRestrictions value) {
        this.instrmRstrctns = value;
        return this;
    }

    /**
     * Gets the value of the fndMgmtCpny property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails1 }
     *     
     */
    public ContactDetails1 getFndMgmtCpny() {
        return fndMgmtCpny;
    }

    /**
     * Sets the value of the fndMgmtCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails1 }
     *     
     */
    public FundProcessingPassportReportV01 setFndMgmtCpny(ContactDetails1 value) {
        this.fndMgmtCpny = value;
        return this;
    }

    /**
     * Gets the value of the mainFndOrdrDsk property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDeskContactDetails }
     *     
     */
    public OrderDeskContactDetails getMainFndOrdrDsk() {
        return mainFndOrdrDsk;
    }

    /**
     * Sets the value of the mainFndOrdrDsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDeskContactDetails }
     *     
     */
    public FundProcessingPassportReportV01 setMainFndOrdrDsk(OrderDeskContactDetails value) {
        this.mainFndOrdrDsk = value;
        return this;
    }

    /**
     * Gets the value of the lclMktAnx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lclMktAnx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLclMktAnx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalMarketAnnex }
     * 
     * 
     */
    public List<LocalMarketAnnex> getLclMktAnx() {
        if (lclMktAnx == null) {
            lclMktAnx = new ArrayList<LocalMarketAnnex>();
        }
        return this.lclMktAnx;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<Extension1>();
        }
        return this.xtnsn;
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
     * Adds a new item to the lclMktAnx list.
     * @see #getLclMktAnx()
     * 
     */
    public FundProcessingPassportReportV01 addLclMktAnx(LocalMarketAnnex lclMktAnx) {
        getLclMktAnx().add(lclMktAnx);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public FundProcessingPassportReportV01 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
