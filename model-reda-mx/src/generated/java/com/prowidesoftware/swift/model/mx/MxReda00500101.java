
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
 * Class for reda.005.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqForInvstmtFndRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:reda.005.001.01")
public class MxReda00500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqForInvstmtFndRpt", required = true)
    protected RequestForInvestmentFundReportV01 reqForInvstmtFndRpt;
    public final static transient String BUSINESS_PROCESS = "reda";
    public final static transient int FUNCTIONALITY = 5;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification1 .class, AccountIdentification3 .class, AccountIdentificationAndPurpose.class, AccountIdentificationFormatChoice.class, AdditionalParameters1 .class, AdditionalReference3 .class, AddressType2Code.class, AlternateSecurityIdentification3 .class, BreakdownByParty2 .class, BreakdownByUserDefinedParameter2 .class, CashForecastMessage1Code.class, DataFormat2Choice.class, DateAndDateTimeChoice.class, DatePeriodDetails.class, DistributionPolicy1Code.class, EventFrequency1Code.class, FinancialInstrument17 .class, FormOfSecurity1Code.class, FrequencyCodeAndDSSCode1Choice.class, FundCashForecastParameters1 .class, FundCashForecastParameters2 .class, FundParameters1Choice.class, FundParameters2 .class, FundParameters2Choice.class, FundParameters3 .class, GenericIdentification1 .class, GenericIdentification7 .class, GenericReportParameters.class, MessageIdentification1 .class, MxReda00500101 .class, NameAndAddress5 .class, NoCriteria1Code.class, PartyIdentification2Choice.class, PostalAddress1 .class, ReportParameters.class, RequestForInvestmentFundReportV01 .class, RequestParameters.class, SecuritiesAccountPurposeType1Code.class, SecurityIdentification7 .class, SimpleIdentificationInformation.class, StatementAndFinancialInstrumentDetails.class, StatementBasis1Code.class, StatementBasisCodeAndDSSCodeChoice.class, StatementDetails.class, StatementType1Code.class, StatementUpdateTypeCode.class, StatementUpdateTypeCodeAndDSSCodeChoice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:reda.005.001.01";

    public MxReda00500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxReda00500101(final String xml) {
        this();
        MxReda00500101 tmp = parse(xml);
        reqForInvstmtFndRpt = tmp.getReqForInvstmtFndRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxReda00500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqForInvstmtFndRpt property.
     * 
     * @return
     *     possible object is
     *     {@link RequestForInvestmentFundReportV01 }
     *     
     */
    public RequestForInvestmentFundReportV01 getReqForInvstmtFndRpt() {
        return reqForInvstmtFndRpt;
    }

    /**
     * Sets the value of the reqForInvstmtFndRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestForInvestmentFundReportV01 }
     *     
     */
    public MxReda00500101 setReqForInvstmtFndRpt(RequestForInvestmentFundReportV01 value) {
        this.reqForInvstmtFndRpt = value;
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
    public static MxReda00500101 parse(String xml) {
        return ((MxReda00500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda00500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxReda00500101 parse(String xml, MxReadConfiguration conf) {
        return ((MxReda00500101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxReda00500101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxReda00500101 parse(String xml, MxRead parserImpl) {
        return ((MxReda00500101) parserImpl.read(MxReda00500101 .class, xml, _classes));
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
     * Creates an MxReda00500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxReda00500101 message
     * @return
     *     a new instance of MxReda00500101
     */
    public final static MxReda00500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxReda00500101 .class);
    }

}
