
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
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
 * Class for camt.091.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cshSttlmInitnReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT2camt.091.001.01")
public class MxCamt09100101
    extends AbstractMX
{

    @XmlElement(name = "CshSttlmInitnReq", required = true)
    protected CashSettlementInitiationRequestV01Draft2 cshSttlmInitnReq;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 91;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AmountAndDirection52 .class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CashAccount38 .class, CashAccount39 .class, CashAccountType2Choice.class, CashSettlementInitiation2 .class, CashSettlementInitiationHeader1 .class, CashSettlementInitiationRequestV01Draft2 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, CreditDebitCode.class, DateAndDateTime1Choice.class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DateType3Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, FinancialInstrumentQuantity1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, IdentificationSource3Choice.class, MarketIdentification1Choice.class, MarketIdentification84 .class, MarketType2Code.class, MarketType8Choice.class, MxCamt09100101 .class, NameAndAddress5 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, OtherIdentification1 .class, Party38Choice.class, PartyIdentification120Choice.class, PartyIdentification122Choice.class, PartyIdentification135 .class, PartyIdentification136 .class, PartyIdentification148 .class, PartyIdentificationAndAccount170 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PlaceOfClearingIdentification2 .class, PlaceOfTradeIdentification1 .class, PostalAddress1 .class, PostalAddress24 .class, PreferredContactMethod1Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, SafeKeepingPlace3 .class, SafekeepingPlace1Code.class, SafekeepingPlace3Code.class, SafekeepingPlaceFormat29Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText8 .class, SecuritiesAccount19 .class, SecuritiesTransaction2 .class, SecuritiesTransactionType27Code.class, SecuritiesTransactionType48Choice.class, SecurityIdentification19 .class, SettlementParties78 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeDate8Choice.class, TradeDateCode3Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT2camt.091.001.01";

    public MxCamt09100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt09100101(final String xml) {
        this();
        MxCamt09100101 tmp = parse(xml);
        cshSttlmInitnReq = tmp.getCshSttlmInitnReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt09100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cshSttlmInitnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CashSettlementInitiationRequestV01Draft2 }
     *     
     */
    public CashSettlementInitiationRequestV01Draft2 getCshSttlmInitnReq() {
        return cshSttlmInitnReq;
    }

    /**
     * Sets the value of the cshSttlmInitnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSettlementInitiationRequestV01Draft2 }
     *     
     */
    public MxCamt09100101 setCshSttlmInitnReq(CashSettlementInitiationRequestV01Draft2 value) {
        this.cshSttlmInitnReq = value;
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
    public static MxCamt09100101 parse(String xml) {
        return ((MxCamt09100101) MxReadImpl.parse(MxCamt09100101 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt09100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt09100101) MxReadImpl.parse(MxCamt09100101 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt09100101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt09100101) parserImpl.read(MxCamt09100101 .class, xml, _classes));
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
     * Creates an MxCamt09100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt09100101 message
     * @return
     *     a new instance of MxCamt09100101
     */
    public static final MxCamt09100101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt09100101 .class);
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
