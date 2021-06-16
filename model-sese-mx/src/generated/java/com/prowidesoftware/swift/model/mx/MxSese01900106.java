
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.019.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctHldgInfReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.019.001.06")
public class MxSese01900106
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctHldgInfReq", required = true)
    protected AccountHoldingInformationRequestV06 acctHldgInfReq;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 19;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account28 .class, AccountHoldingInformationRequestV06 .class, ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalInformation15 .class, AdditionalReference10 .class, AdditionalReference11 .class, AddressType2Code.class, AllOtherCash1Code.class, AlternatePartyIdentification7 .class, AlternateSecurityIdentification7 .class, BusinessFlowDirectionType1Code.class, CashAll1Code.class, CashAsset1 .class, CashAssetType1Choice.class, CashAssetType1Code.class, ClearingSystemMemberIdentification2Choice.class, DateAndAmount2 .class, DateAndDateTime2Choice.class, Extension1 .class, FinancialInstrument1Choice.class, FinancialInstrument67 .class, FinancialInstrumentIdentification1 .class, FundPortfolio1Choice.class, FundSettlementParameters13 .class, GenderCode.class, GeneralInvestment1 .class, GeneralInvestmentAccountType1Choice.class, GeneralInvestmentAccountType1Code.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, HolderType1Code.class, IdentificationSource1Choice.class, IdentificationType42Choice.class, IndividualPerson8 .class, InvestmentAccount69 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01900106 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation36 .class, OtherAsset1 .class, OtherAsset1Choice.class, OtherAsset1Code.class, PartyIdentification122Choice.class, PartyIdentification123Choice.class, PartyIdentification125Choice.class, PartyIdentification126Choice.class, PartyIdentification132 .class, PartyIdentification139 .class, PartyIdentification140 .class, PartyIdentification141 .class, PartyIdentificationAndAccount161 .class, PartyTextInformation1 .class, Pension1 .class, PensionPolicy1 .class, PensionSchemeType1Choice.class, PensionSchemeType1Code.class, PensionTransferScope1Choice.class, PensionTransferScope1Code.class, PersonIdentificationType7Code.class, PortfolioTransfer1 .class, PostalAddress1 .class, PreviousYear2Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecuritiesAccount19 .class, SecurityIdentification25Choice.class, SettlementParties74 .class, SettlementTransactionCondition11Code.class, SettlementTransactionCondition30Choice.class, SubAccount5 .class, TaxEfficientProduct1 .class, TaxEfficientProductType1Choice.class, TaxEfficientProductType1Code.class, TaxReference1 .class, TaxReferenceParty1Choice.class, TaxReferenceType1Choice.class, TradeTransactionCondition5Code.class, TradeTransactionCondition8Choice.class, TypeOfIdentification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.019.001.06";

    public MxSese01900106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01900106(final String xml) {
        this();
        MxSese01900106 tmp = parse(xml);
        acctHldgInfReq = tmp.getAcctHldgInfReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01900106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctHldgInfReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHoldingInformationRequestV06 }
     *     
     */
    public AccountHoldingInformationRequestV06 getAcctHldgInfReq() {
        return acctHldgInfReq;
    }

    /**
     * Sets the value of the acctHldgInfReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHoldingInformationRequestV06 }
     *     
     */
    public MxSese01900106 setAcctHldgInfReq(AccountHoldingInformationRequestV06 value) {
        this.acctHldgInfReq = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSese01900106 parse(String xml) {
        return ((MxSese01900106) MxReadImpl.parse(MxSese01900106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01900106 parse(String xml, MxRead parserImpl) {
        return ((MxSese01900106) parserImpl.read(MxSese01900106 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxSese01900106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01900106 message
     * @return
     *     a new instance of MxSese01900106
     */
    public final static MxSese01900106 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01900106 .class);
    }

}
