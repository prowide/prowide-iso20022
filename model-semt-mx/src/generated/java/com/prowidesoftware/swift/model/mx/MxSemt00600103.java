
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for semt.006.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "stmtOfInvstmtFndTxs"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.006.001.03")
public class MxSemt00600103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "StmtOfInvstmtFndTxs", required = true)
    protected StatementOfInvestmentFundTransactionsV03 stmtOfInvstmtFndTxs;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account7 .class, AccountIdentification1 .class, AccountIdentification3 .class, AccountIdentificationAndPurpose.class, AccountIdentificationFormatChoice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalReference2 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, ClosingBalance3Choice.class, CorporateAction1Choice.class, CorporateActionEventType1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DatePeriodDetails.class, DistributionPolicy1Code.class, EventFrequency1Code.class, Extension1 .class, FinancialInstrumentQuantity1 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, GenericIdentification47 .class, Intermediary27 .class, InvestmentAccount43 .class, InvestmentFundRole2Code.class, InvestmentFundTransaction4 .class, InvestmentFundTransactionsByFund3 .class, LongPostalAddress1Choice.class, MessageIdentification1 .class, MxSemt00600103 .class, NameAndAddress2 .class, NameAndAddress5 .class, OpeningBalance3Choice.class, Pagination.class, PaginationBalance2 .class, PartyIdentification1Choice.class, PartyIdentification2Choice.class, PostalAddress1 .class, PriceMethod1Code.class, PriceValue1 .class, ReversalCode.class, Role4Choice.class, SecuritiesAccountPurposeType1Code.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, Statement8 .class, StatementOfInvestmentFundTransactionsV03 .class, StatementUpdateTypeCode.class, StructuredLongPostalAddress1 .class, SubAccountIdentification36 .class, TransactionStatus1Code.class, TransactionType1Choice.class, TransactionType2Choice.class, TransactionType2Code.class, TypeOfPrice10Code.class, UnitPrice20 .class, UnitPriceType2Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.006.001.03";

    public MxSemt00600103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00600103(final String xml) {
        this();
        MxSemt00600103 tmp = parse(xml);
        stmtOfInvstmtFndTxs = tmp.getStmtOfInvstmtFndTxs();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00600103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the stmtOfInvstmtFndTxs property.
     * 
     * @return
     *     possible object is
     *     {@link StatementOfInvestmentFundTransactionsV03 }
     *     
     */
    public StatementOfInvestmentFundTransactionsV03 getStmtOfInvstmtFndTxs() {
        return stmtOfInvstmtFndTxs;
    }

    /**
     * Sets the value of the stmtOfInvstmtFndTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementOfInvestmentFundTransactionsV03 }
     *     
     */
    public MxSemt00600103 setStmtOfInvstmtFndTxs(StatementOfInvestmentFundTransactionsV03 value) {
        this.stmtOfInvstmtFndTxs = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSemt00600103 parse(String xml) {
        return ((MxSemt00600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt00600103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt00600103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00600103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00600103 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00600103) parserImpl.read(MxSemt00600103 .class, xml, _classes));
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
     * Creates an MxSemt00600103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00600103 message
     * @return
     *     a new instance of MxSemt00600103
     */
    public final static MxSemt00600103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt00600103 .class);
    }

}
