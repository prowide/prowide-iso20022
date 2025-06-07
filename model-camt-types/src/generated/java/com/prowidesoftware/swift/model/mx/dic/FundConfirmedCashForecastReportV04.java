
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
 * A report provider, such as a transfer agent, sends the FundConfirmedCashForecastReport message to the report user, such as an investment manager or pricing agent, to report the confirmed cash incomings and outgoings of one or more share classes of an investment fund on one or more trade dates.
 * The cash movements may result from, for example, redemption, subscription, switch transactions or reinvestment of dividends.
 * Usage
 * The FundConfirmedCashForecastReport is used to report definitive cash movements, that is it is sent after the cut-off time and/or the price valuation of the fund.
 * This message contains incoming and outgoing cash flows that are confirmed, that is, the price has been applied. If the price is not yet definitive, then the FundEstimatedCashForecastReport message must be used.
 * The message structure allows for the following uses:
 * -	to provide cash in and cash out amounts for a fund/sub fund (a FundOrSubFundDetails sequence is used),
 * -	to provide cash in and cash out amounts for a fund/sub fund and one or more share classes (FundOrSubFundDetails sequence and one or more FundCashForecastDetails sequences are used),
 * -	to provide cash in and cash out amounts for one or more share classes (one or more FundCashForecastDetails sequences are used).
 * -	to provide cash in and cash out amounts for more than one fund/sub fund, and more than one share classes (two or more FundOrSubFundDetails sequences and two or more FundCashForecastDetails sequences and used); however, it should be noted that, in this usage, there is no way to determine which share class belongs to which fund/sub fund from the message content itself, which may not be desirable and the use of this kind of combination should be bilaterally agreed.
 * This message allows the report provider to report cash movements in or out of a fund, but does not allow the Sender to categorise these movements, for example by country, or to give details of the underlying orders, commission or charges.
 * If the report provider wishes to give detailed information related to cash movements, then the FundDetailedConfirmedCashForecastReport message must be used.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundConfirmedCashForecastReportV04", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "rltdRef",
    "msgPgntn",
    "fndOrSubFndDtls",
    "fndCshFcstDtls",
    "cnsltdNetCshFcst",
    "xtnsn"
})
public class FundConfirmedCashForecastReportV04 {

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
    @XmlElement(name = "FndOrSubFndDtls")
    protected List<Fund2> fndOrSubFndDtls;
    @XmlElement(name = "FndCshFcstDtls")
    protected List<FundCashForecast7> fndCshFcstDtls;
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
    public FundConfirmedCashForecastReportV04 setMsgId(MessageIdentification1 value) {
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
    public FundConfirmedCashForecastReportV04 setPoolRef(AdditionalReference3 value) {
        this.poolRef = value;
        return this;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prvsRef property.
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
     */
    public List<AdditionalReference3> getPrvsRef() {
        if (prvsRef == null) {
            prvsRef = new ArrayList<AdditionalReference3>();
        }
        return this.prvsRef;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdRef property.
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
     */
    public List<AdditionalReference3> getRltdRef() {
        if (rltdRef == null) {
            rltdRef = new ArrayList<AdditionalReference3>();
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
    public FundConfirmedCashForecastReportV04 setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
        return this;
    }

    /**
     * Gets the value of the fndOrSubFndDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fndOrSubFndDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndOrSubFndDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fund2 }
     * 
     * 
     */
    public List<Fund2> getFndOrSubFndDtls() {
        if (fndOrSubFndDtls == null) {
            fndOrSubFndDtls = new ArrayList<Fund2>();
        }
        return this.fndOrSubFndDtls;
    }

    /**
     * Gets the value of the fndCshFcstDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fndCshFcstDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndCshFcstDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundCashForecast7 }
     * 
     * 
     */
    public List<FundCashForecast7> getFndCshFcstDtls() {
        if (fndCshFcstDtls == null) {
            fndCshFcstDtls = new ArrayList<FundCashForecast7>();
        }
        return this.fndCshFcstDtls;
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
    public FundConfirmedCashForecastReportV04 setCnsltdNetCshFcst(NetCashForecast3 value) {
        this.cnsltdNetCshFcst = value;
        return this;
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
     * Adds a new item to the prvsRef list.
     * @see #getPrvsRef()
     * 
     */
    public FundConfirmedCashForecastReportV04 addPrvsRef(AdditionalReference3 prvsRef) {
        getPrvsRef().add(prvsRef);
        return this;
    }

    /**
     * Adds a new item to the rltdRef list.
     * @see #getRltdRef()
     * 
     */
    public FundConfirmedCashForecastReportV04 addRltdRef(AdditionalReference3 rltdRef) {
        getRltdRef().add(rltdRef);
        return this;
    }

    /**
     * Adds a new item to the fndOrSubFndDtls list.
     * @see #getFndOrSubFndDtls()
     * 
     */
    public FundConfirmedCashForecastReportV04 addFndOrSubFndDtls(Fund2 fndOrSubFndDtls) {
        getFndOrSubFndDtls().add(fndOrSubFndDtls);
        return this;
    }

    /**
     * Adds a new item to the fndCshFcstDtls list.
     * @see #getFndCshFcstDtls()
     * 
     */
    public FundConfirmedCashForecastReportV04 addFndCshFcstDtls(FundCashForecast7 fndCshFcstDtls) {
        getFndCshFcstDtls().add(fndCshFcstDtls);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public FundConfirmedCashForecastReportV04 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
