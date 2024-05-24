
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
 * A report provider, for example, a fund promoter, fund management company, transfer agent, or market data provider, sends the FundProcessingPassportReport message to the report recipient, for, a professional investor, investment fund distributor, market data provider, regulator or other interested party to provide the key reference data for financial instruments to facilitate trading.
 * Usage
 * A unique FundProcessingPassportReport should be prepared for each class of unit/share (for which an individual ISIN should have been allocated), in respect of its "home" market.
 * The FundProcessingPassportReport may be used in various models or environments:
 * - stand alone environment, for example, initiated by the Report Provider (fund promoter, fund manager and / or reference data vendors) sent on a regular frequency, or when changes are needed.
 * - in a request / response environment, with the InvestmentFundReportRequest, for example, initiated by report users (data vendors, professional investors, regulators or investment fund distributors) in enabling the user to control the flow and updates of information.
 * - in a reference data vendor environment, for example, market infrastructure and reference data providers may collate and store all fund processing passport information centrally for access via database or regular distribution information. A reference data vendor may assume the role of both report provider and report user.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundProcessingPassportReportV02", propOrder = {
    "msgId",
    "fpp"
})
public class FundProcessingPassportReportV02 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "FPP", required = true)
    protected List<FundProcessingPassport1> fpp;

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
    public FundProcessingPassportReportV02 setMsgId(MessageIdentification1 value) {
        this.msgId = value;
        return this;
    }

    /**
     * Gets the value of the fpp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fpp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFPP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundProcessingPassport1 }
     * 
     * 
     * @return
     *     The value of the fpp property.
     */
    public List<FundProcessingPassport1> getFPP() {
        if (fpp == null) {
            fpp = new ArrayList<>();
        }
        return this.fpp;
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
     * Adds a new item to the fPP list.
     * @see #getFPP()
     * 
     */
    public FundProcessingPassportReportV02 addFPP(FundProcessingPassport1 fPP) {
        getFPP().add(fPP);
        return this;
    }

}
