
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
 * Scope
 * A report provider, such as a transfer agent, sends the FundDetailedEstimatedCashForecastReport message to the report user, such as an investment manager, to report the estimated cash incomings and outgoings, sorted by country, institution name or other criteria defined by the user of one or more investment funds on one or more trade dates.
 * The cash movements may result from, for example, redemption, subscription, switch transactions or reinvestment of dividends.
 * Usage
 * The FundDetailedEstimatedCashForecastReport is used to provide estimated cash movements, i.e., it is sent prior to the cut-off time and/or the price valuation of the fund. If the price is definitive, then the FundDetailedConfirmedCashForecastReport message must be used.
 * The FundDetailedEstimatedCashForecastReport message is used to report cash movements in or out of a fund, organised by party, such as fund management company, country, currency or by some other criteria defined by the report provider. If the report is used to give the cash-in and cash-out for a party, then additional criteria, such as currency and country, can be specified.
 * In addition, the underlying transaction type for the cash-in or cash-out movement can be specified, as well as information about the cash movement's underlying orders, such as commission and charges.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundDetailedEstimatedCashForecastReportV03", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "rltdRef",
    "msgPgntn",
    "estmtdFndCshFcstDtls",
    "cnsltdNetCshFcst",
    "xtnsn"
})
public class FundDetailedEstimatedCashForecastReportV03 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference3 poolRef;
    @XmlElement(name = "PrvsRef")
    protected List<AdditionalReference3> prvsRef;
    @XmlElement(name = "RltdRef")
    protected List<AdditionalReference3> rltdRef;
    @XmlElement(name = "MsgPgntn", required = true)
    protected Pagination msgPgntn;
    @XmlElement(name = "EstmtdFndCshFcstDtls", required = true)
    protected List<EstimatedFundCashForecast4> estmtdFndCshFcstDtls;
    @XmlElement(name = "CnsltdNetCshFcst")
    protected NetCashForecast3 cnsltdNetCshFcst;
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
    public FundDetailedEstimatedCashForecastReportV03 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public FundDetailedEstimatedCashForecastReportV03 setPoolRef(AdditionalReference3 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvsRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvsRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReference3 }
     * 
     * 
     * @return
     *     The value of the prvsRef property.
     */
    public List<AdditionalReference3> getPrvsRef() {
        if (prvsRef == null) {
            prvsRef = new ArrayList<>();
        }
        return this.prvsRef;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalReference3 }
     * 
     * 
     * @return
     *     The value of the rltdRef property.
     */
    public List<AdditionalReference3> getRltdRef() {
        if (rltdRef == null) {
            rltdRef = new ArrayList<>();
        }
        return this.rltdRef;
    }

    /**
     * Gets the value of the msgPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Sets the value of the msgPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public FundDetailedEstimatedCashForecastReportV03 setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
        return this;
    }

    /**
     * Gets the value of the estmtdFndCshFcstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the estmtdFndCshFcstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstmtdFndCshFcstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatedFundCashForecast4 }
     * 
     * 
     * @return
     *     The value of the estmtdFndCshFcstDtls property.
     */
    public List<EstimatedFundCashForecast4> getEstmtdFndCshFcstDtls() {
        if (estmtdFndCshFcstDtls == null) {
            estmtdFndCshFcstDtls = new ArrayList<>();
        }
        return this.estmtdFndCshFcstDtls;
    }

    /**
     * Gets the value of the cnsltdNetCshFcst property.
     * 
     * @return
     *     possible object is
     *     {@link NetCashForecast3 }
     *     
     */
    public NetCashForecast3 getCnsltdNetCshFcst() {
        return cnsltdNetCshFcst;
    }

    /**
     * Sets the value of the cnsltdNetCshFcst property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetCashForecast3 }
     *     
     */
    public FundDetailedEstimatedCashForecastReportV03 setCnsltdNetCshFcst(NetCashForecast3 value) {
        this.cnsltdNetCshFcst = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
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
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
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
     * Adds a new item to the prvsRef list.
     * @see #getPrvsRef()
     * 
     */
    public FundDetailedEstimatedCashForecastReportV03 addPrvsRef(AdditionalReference3 prvsRef) {
        getPrvsRef().add(prvsRef);
        return this;
    }

    /**
     * Adds a new item to the rltdRef list.
     * @see #getRltdRef()
     * 
     */
    public FundDetailedEstimatedCashForecastReportV03 addRltdRef(AdditionalReference3 rltdRef) {
        getRltdRef().add(rltdRef);
        return this;
    }

    /**
     * Adds a new item to the estmtdFndCshFcstDtls list.
     * @see #getEstmtdFndCshFcstDtls()
     * 
     */
    public FundDetailedEstimatedCashForecastReportV03 addEstmtdFndCshFcstDtls(EstimatedFundCashForecast4 estmtdFndCshFcstDtls) {
        getEstmtdFndCshFcstDtls().add(estmtdFndCshFcstDtls);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public FundDetailedEstimatedCashForecastReportV03 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
