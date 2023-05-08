
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
 * The FundReferenceDataReport message is sent by a report provider, for example, a fund promoter, fund management company, transfer agent, or market data provider to the report recipient, for example, a professional investor, investment fund distributor, market data provider, regulator or other interested party, to provide the key reference data for financial instruments to facilitate trading. The message may also include reporting data concerning product governance, such as target market data, and a breakdown of the costs and fees.
 * Usage
 * A FundReferenceDataReport message should be prepared for each class of unit/share (for which an individual ISIN should have been allocated), in respect of its "home" market. Each time the fund data changes, the ‘product provider’ must provide the data to a product user, for example, the distributors, by sending a new funds reference data report. A single message may contain more than one report. When the FundReferenceDataReport message is sent to provide updated reference data, the message overwrites the previously sent data.
 * The FundReferenceDataReport message may be used in various models or environments:
 * -	in a standalone environment, for example, initiated by the Report Provider (fund promoter, fund manager and / or reference data vendors) sent on a regular frequency, or when changes are needed.
 * -	in a request / response environment, with the InvestmentFundReportRequest, for example, initiated by report users (data vendors, professional investors, regulators or investment fund distributors) in enabling the user to control the flow and updates of information.
 * -	in a reference data vendor environment, for example, market infrastructure and reference data providers may collate and store all fund reference data information centrally for access via database or regular distribution information. A reference data vendor may assume the role of both report provider and report user.
 * The FundReferenceDataReport message may be used to provide data concerning product governance, such as target market data, and a breakdown of the costs and fees in the context of MiFID II, with respect to the European MiFID Template (EMT) version 3.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundReferenceDataReportV05", propOrder = {
    "msgId",
    "prvsRef",
    "rltdRef",
    "fndRefDataRptId",
    "rpt"
})
public class FundReferenceDataReportV05 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrvsRef")
    protected List<AdditionalReference10> prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference10 rltdRef;
    @XmlElement(name = "FndRefDataRptId")
    protected String fndRefDataRptId;
    @XmlElement(name = "Rpt", required = true)
    protected List<FundReferenceDataReport3> rpt;

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
    public FundReferenceDataReportV05 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
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
     * {@link AdditionalReference10 }
     * 
     * 
     * @return
     *     The value of the prvsRef property.
     */
    public List<AdditionalReference10> getPrvsRef() {
        if (prvsRef == null) {
            prvsRef = new ArrayList<>();
        }
        return this.prvsRef;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public FundReferenceDataReportV05 setRltdRef(AdditionalReference10 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the fndRefDataRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFndRefDataRptId() {
        return fndRefDataRptId;
    }

    /**
     * Sets the value of the fndRefDataRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundReferenceDataReportV05 setFndRefDataRptId(String value) {
        this.fndRefDataRptId = value;
        return this;
    }

    /**
     * Gets the value of the rpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundReferenceDataReport3 }
     * 
     * 
     * @return
     *     The value of the rpt property.
     */
    public List<FundReferenceDataReport3> getRpt() {
        if (rpt == null) {
            rpt = new ArrayList<>();
        }
        return this.rpt;
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
    public FundReferenceDataReportV05 addPrvsRef(AdditionalReference10 prvsRef) {
        getPrvsRef().add(prvsRef);
        return this;
    }

    /**
     * Adds a new item to the rpt list.
     * @see #getRpt()
     * 
     */
    public FundReferenceDataReportV05 addRpt(FundReferenceDataReport3 rpt) {
        getRpt().add(rpt);
        return this;
    }

}
