
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for semt.007.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "stmtOfInvstmtFndTxsCxlV02"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.007.001.02")
public class MxSemt00700102
    extends AbstractMX
{

    @XmlElement(name = "StmtOfInvstmtFndTxsCxlV02", required = true)
    protected StatementOfInvestmentFundTransactionsCancellationV02 stmtOfInvstmtFndTxsCxlV02;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account7 .class, AccountIdentification1 .class, AccountIdentification3 .class, AccountIdentificationAndPurpose.class, AccountIdentificationFormatChoice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalReference2 .class, AddressType2Code.class, AlternateSecurityIdentification1 .class, CorporateActionEventType1Code.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DatePeriodDetails.class, DistributionPolicy1Code.class, EventFrequency1Code.class, Extension1 .class, FinancialInstrumentQuantity1 .class, FormOfSecurity1Code.class, GenericIdentification1 .class, Intermediary11 .class, InvestmentAccount25 .class, InvestmentFundRole2Code.class, InvestmentFundTransaction3 .class, InvestmentFundTransactionsByFund2 .class, LongPostalAddress1Choice.class, MessageIdentification1 .class, MxSemt00700102 .class, NameAndAddress2 .class, NameAndAddress5 .class, Pagination.class, PaginationBalance1 .class, PartyIdentification1Choice.class, PartyIdentification2Choice.class, PostalAddress1 .class, PriceMethod1Code.class, PriceValue1 .class, ReversalCode.class, SecuritiesAccountPurposeType1Code.class, SecurityIdentification3Choice.class, SimpleIdentificationInformation.class, Statement8 .class, StatementOfInvestmentFundTransactions2 .class, StatementOfInvestmentFundTransactionsCancellationV02 .class, StatementUpdateTypeCode.class, StructuredLongPostalAddress1 .class, SubAccountIdentification6 .class, TransactionStatus1Code.class, TransactionType2Code.class, TypeOfPrice10Code.class, UnitPrice11 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.007.001.02";

    public MxSemt00700102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00700102(final String xml) {
        this();
        MxSemt00700102 tmp = parse(xml);
        stmtOfInvstmtFndTxsCxlV02 = tmp.getStmtOfInvstmtFndTxsCxlV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00700102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the stmtOfInvstmtFndTxsCxlV02 property.
     * 
     * @return
     *     possible object is
     *     {@link StatementOfInvestmentFundTransactionsCancellationV02 }
     *     
     */
    public StatementOfInvestmentFundTransactionsCancellationV02 getStmtOfInvstmtFndTxsCxlV02() {
        return stmtOfInvstmtFndTxsCxlV02;
    }

    /**
     * Sets the value of the stmtOfInvstmtFndTxsCxlV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementOfInvestmentFundTransactionsCancellationV02 }
     *     
     */
    public MxSemt00700102 setStmtOfInvstmtFndTxsCxlV02(StatementOfInvestmentFundTransactionsCancellationV02 value) {
        this.stmtOfInvstmtFndTxsCxlV02 = value;
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
    public static MxSemt00700102 parse(String xml) {
        return ((MxSemt00700102) MxReadImpl.parse(MxSemt00700102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00700102 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00700102) parserImpl.read(MxSemt00700102 .class, xml, _classes));
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
     * Creates an MxSemt00700102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00700102 message
     * @return
     *     a new instance of MxSemt00700102
     */
    public final static MxSemt00700102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSemt00700102 .class);
    }

}
