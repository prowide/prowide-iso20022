
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.019.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctHldgInfReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.019.001.07")
public class MxSese01900107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctHldgInfReq", required = true)
    protected AccountHoldingInformationRequestV07 acctHldgInfReq;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 19;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {Account28 .class, AccountHoldingInformationRequestV07 .class, AccountOwnershipType6Code.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalInformation15 .class, AdditionalReference10 .class, AdditionalReference11 .class, AddressType2Code.class, AlternatePartyIdentification7 .class, AlternateSecurityIdentification7 .class, BusinessFlowDirectionType1Code.class, CashAsset2 .class, CashAssetType1Choice.class, CashAssetType1Code.class, ClassificationType32Choice.class, ClearingSystemMemberIdentification2Choice.class, DateAndAmount2 .class, DateAndDateTime2Choice.class, Extension1 .class, FinancialInstrument61Choice.class, FinancialInstrument84 .class, FinancialInstrumentIdentification2 .class, FundPortfolio4Choice.class, FundSettlementParameters18 .class, GenderCode.class, GeneralInvestment2 .class, GeneralInvestmentAccountType2Choice.class, GeneralInvestmentAccountType2Code.class, GenericIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, HolderType1Code.class, IdentificationSource1Choice.class, IdentificationType42Choice.class, IndividualPerson8 .class, InvestmentAccount69 .class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxSese01900107 .class, NameAndAddress5 .class, NamePrefix1Code.class, Organisation36 .class, OtherAsset2 .class, OtherAsset2Choice.class, OtherAsset2Code.class, PartyIdentification122Choice.class, PartyIdentification123Choice.class, PartyIdentification125Choice.class, PartyIdentification126Choice.class, PartyIdentification132 .class, PartyIdentification139 .class, PartyIdentification140 .class, PartyIdentification141 .class, PartyIdentificationAndAccount194 .class, PartyTextInformation1 .class, PartyTextInformation6 .class, Pension4 .class, PensionPolicy1 .class, PensionSchemeType2Choice.class, PensionSchemeType2Code.class, PensionTransferScope1Choice.class, PensionTransferScope1Code.class, PersonIdentificationType7Code.class, PortfolioTransfer6 .class, PostalAddress1 .class, PreviousYear2Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecuritiesAccount19 .class, SecurityIdentification25Choice.class, SettlementParties94 .class, SettlementTransactionCondition11Code.class, SettlementTransactionCondition30Choice.class, SubAccount5 .class, TaxEfficientProduct4 .class, TaxEfficientProductType2Choice.class, TaxEfficientProductType2Code.class, TaxReference1 .class, TaxReferenceParty1Choice.class, TaxReferenceType1Choice.class, TradeTransactionCondition5Code.class, TradeTransactionCondition8Choice.class, TypeOfIdentification1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.019.001.07";

    public MxSese01900107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese01900107(final String xml) {
        this();
        MxSese01900107 tmp = parse(xml);
        acctHldgInfReq = tmp.getAcctHldgInfReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese01900107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctHldgInfReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountHoldingInformationRequestV07 }
     *     
     */
    public AccountHoldingInformationRequestV07 getAcctHldgInfReq() {
        return acctHldgInfReq;
    }

    /**
     * Sets the value of the acctHldgInfReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountHoldingInformationRequestV07 }
     *     
     */
    public MxSese01900107 setAcctHldgInfReq(AccountHoldingInformationRequestV07 value) {
        this.acctHldgInfReq = value;
        return this;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSese01900107 parse(String xml) {
        return ((MxSese01900107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01900107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese01900107 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese01900107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese01900107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese01900107 parse(String xml, MxRead parserImpl) {
        return ((MxSese01900107) parserImpl.read(MxSese01900107 .class, xml, _classes));
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
     * Creates an MxSese01900107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese01900107 message
     * @return
     *     a new instance of MxSese01900107
     */
    public static final MxSese01900107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese01900107 .class);
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

}
