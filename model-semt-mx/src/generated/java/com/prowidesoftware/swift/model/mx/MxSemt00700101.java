
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for semt.007.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "semt00700101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:semt.007.001.01")
public class MxSemt00700101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "semt.007.001.01", required = true)
    protected Semt00700101 semt00700101;
    public final static transient String BUSINESS_PROCESS = "semt";
    public final static transient int FUNCTIONALITY = 7;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Account1 .class, AccountIdentification1 .class, AccountIdentification3 .class, AccountIdentificationAndPurpose.class, AccountIdentificationFormatChoice.class, ActiveCurrencyAnd13DecimalAmount.class, ActiveCurrencyAndAmount.class, AdditionalReference2 .class, AlternateSecurityIdentification1 .class, CorporateActionEventType1Code.class, CorporateActionEventType1CodeChoice.class, CreditDebitCode.class, DateAndDateTimeChoice.class, DatePeriodDetails.class, DistributionPolicy1Code.class, Extension1 .class, FinancialInstrumentQuantity1 .class, FormOfSecurity1Code.class, Frequency1Code.class, GenericIdentification1 .class, Intermediary1 .class, InvestmentAccount12 .class, InvestmentFundTransaction2 .class, InvestmentFundTransactionsByFund1 .class, LongPostalAddress1Choice.class, MxSemt00700101 .class, NameAndAddress2 .class, Pagination.class, PaginationBalance1 .class, PartyIdentification1Choice.class, PriceMethod1Code.class, PriceValue1 .class, ReversalCode.class, SecuritiesAccountPurposeType1Code.class, SecurityIdentification1Choice.class, Semt00700101 .class, SimpleIdentificationInformation.class, Statement5 .class, StatementOfInvestmentFundTransactions1 .class, StatementUpdateTypeCode.class, StructuredLongPostalAddress1 .class, SubAccountIdentification4 .class, TransactionStatus1Code.class, TransactionType1CodeChoice.class, TransactionType2Code.class, TypeOfPrice2Code.class, UnitPrice1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:semt.007.001.01";

    public MxSemt00700101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt00700101(final String xml) {
        this();
        MxSemt00700101 tmp = parse(xml);
        semt00700101 = tmp.getSemt00700101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt00700101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the semt00700101 property.
     * 
     * @return
     *     possible object is
     *     {@link Semt00700101 }
     *     
     */
    public Semt00700101 getSemt00700101() {
        return semt00700101;
    }

    /**
     * Sets the value of the semt00700101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Semt00700101 }
     *     
     */
    public MxSemt00700101 setSemt00700101(Semt00700101 value) {
        this.semt00700101 = value;
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
    public static MxSemt00700101 parse(String xml) {
        return ((MxSemt00700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt00700101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt00700101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt00700101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt00700101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt00700101) parserImpl.read(MxSemt00700101 .class, xml, _classes));
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
     * Creates an MxSemt00700101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt00700101 message
     * @return
     *     a new instance of MxSemt00700101
     */
    public final static MxSemt00700101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt00700101 .class);
    }

}
