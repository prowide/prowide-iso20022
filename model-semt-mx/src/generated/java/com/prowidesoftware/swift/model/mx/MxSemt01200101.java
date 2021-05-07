
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
 * Class for semt.012.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "altrntvFndsAcctgStmtOfHldgs"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.012.001.01")
public class MxSemt01200101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AltrntvFndsAcctgStmtOfHldgs", required = true)
    protected AlternativeFundsAccountingStatementOfHoldingsV01 altrntvFndsAcctgStmtOfHldgs;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 12;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account7 .class, AccountIdentification1 .class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAnd13DecimalAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AdditionalBalanceInformation3 .class, AdditionalReference4 .class, AddressType2Code.class, AggregateBalanceInformation5 .class, AlternateSecurityIdentification3 .class, AlternativeFundsAccountingStatementOfHoldingsV01 .class, BalanceQuantity1Choice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, Equalisation2 .class, EventFrequency1Code.class, Extension1 .class, FinancialInstrument18 .class, FinancialInstrumentQuantityChoice.class, ForeignExchangeTerms6 .class, FrequencyCodeAndDSSCode1Choice.class, GenericIdentification1 .class, GenericIdentification13 .class, GenericIdentification5 .class, GenericIdentification6 .class, GenericIdentification7 .class, Intermediary17 .class, IntermediaryRoleChoice1 .class, InvestmentAccount30 .class, InvestmentFundRole4Code.class, MessageIdentification1 .class, MxSemt01200101 .class, NameAndAddress5 .class, Pagination.class, PartyIdentification2Choice.class, PostalAddress1 .class, PriceInformation3 .class, PriceRateOrAmountOrUnknownChoice.class, PriceSource.class, PriceSource1Code.class, PriceSourceFormatChoice.class, QuantityAndAvailability.class, SecuritiesAccount5 .class, SecuritiesBalanceType3Code.class, SecuritiesBalanceType4Code.class, SecurityIdentification10Choice.class, SecurityIdentification9 .class, SimpleIdentificationInformation.class, Statement10 .class, StatementBasis1Code.class, StatementBasisCodeAndDSSCodeChoice.class, StatementUpdateTypeCode.class, StatementUpdateTypeCodeAndDSSCodeChoice.class, SubAccount3 .class, SubBalanceInformation3 .class, SubBalanceQuantity1Choice.class, SubBalanceType1Choice.class, SubBalanceType2Choice.class, TotalValueInPageAndStatement.class, TypeOfPrice13Code.class, UnitPriceType1Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:semt.012.001.01";

    public MxSemt01200101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt01200101(final String xml) {
        this();
        MxSemt01200101 tmp = parse(xml);
        altrntvFndsAcctgStmtOfHldgs = tmp.getAltrntvFndsAcctgStmtOfHldgs();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt01200101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the altrntvFndsAcctgStmtOfHldgs property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeFundsAccountingStatementOfHoldingsV01 }
     *     
     */
    public AlternativeFundsAccountingStatementOfHoldingsV01 getAltrntvFndsAcctgStmtOfHldgs() {
        return altrntvFndsAcctgStmtOfHldgs;
    }

    /**
     * Sets the value of the altrntvFndsAcctgStmtOfHldgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeFundsAccountingStatementOfHoldingsV01 }
     *     
     */
    public MxSemt01200101 setAltrntvFndsAcctgStmtOfHldgs(AlternativeFundsAccountingStatementOfHoldingsV01 value) {
        this.altrntvFndsAcctgStmtOfHldgs = value;
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
    public static MxSemt01200101 parse(String xml) {
        return ((MxSemt01200101) MxReadImpl.parse(MxSemt01200101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt01200101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt01200101) parserImpl.read(MxSemt01200101 .class, xml, _classes));
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
     * Creates an MxSemt01200101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt01200101 message
     * @return
     *     a new instance of MxSemt01200101
     */
    public final static MxSemt01200101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt01200101 .class);
    }

}
